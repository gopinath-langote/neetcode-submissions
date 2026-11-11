/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> pChain = new HashSet<>();
        Node pTemp = p;
        while (pTemp != null) {
            pChain.add(pTemp);
            pTemp = pTemp.parent;
        }

        Node qNode = q;
        while (qNode != null) {
            if (pChain.contains(qNode)){
                return qNode;
            }
            qNode = qNode.parent;
        }

        return null;
    }
}