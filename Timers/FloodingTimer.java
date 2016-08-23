package projects.Flooding.Timers;

import jsensor.nodes.Node;
import jsensor.nodes.events.TimerEvent;
import jsensor.runtime.Jsensor;
import jsensor.utils.GenerateFilesOmnet;
import projects.Flooding.CustomPositionsSets.PositionSets;
import projects.Flooding.Messages.FloodingMessage;


/**
 * @author Danniel & Matheus
 */
public class FloodingTimer extends TimerEvent {

    @Override
    public void fire() {

        Node destination = Jsensor.getNodeByID(PositionSets.getMainLab());

        FloodingMessage message = new FloodingMessage(this.node, destination, 0, "" + this.node.getID(), this.node.getChunk());

        String messagetext = "Created by the sensor: " + Integer.toString(this.node.getID()) + " Path: ";

        message.setMsg(messagetext);
        Jsensor.log("time: " + Jsensor.currentTime + "\t sensorID: " + this.node.getID() + "\t sendTo: " + destination.getID());

        GenerateFilesOmnet.addStartNode(this.node.getID(), destination.getID(), Jsensor.currentTime);
        this.node.multicast(message);
    }
}
