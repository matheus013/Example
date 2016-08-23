package projects.Flooding.DistributionModels;

import jsensor.nodes.Node;
import jsensor.nodes.models.DistributionModelNode;
import jsensor.utils.Position;
import projects.Flooding.CustomPositionsSets.PositionSets;

/**
 * Created by matheus on 22/08/16.
 */
public class CustomDistribution extends DistributionModelNode {

    @Override
    public Position getPosition(Node node) {
        if (PositionSets.getSets().isEmpty())
            PositionSets.init();
        if (PositionSets.getSets().peek().toString().equals("Pos X: 1355 PosY: 330")){
            PositionSets.setMainLab(node.getID());
//            System.out.println(node.getID());
        }

        return PositionSets.getSets().pop();
    }
}
