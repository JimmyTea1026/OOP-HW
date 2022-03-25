package model;

import java.util.ArrayList;
import utility.nodeType;
import utility.nodeType.type;

public class node {
    public node parentNode;
    public ArrayList<node> childList;
    public nodeType.type type;
    public basicObject content;

    public node(nodeType.type t){
        type = t;
    }

    public void setContent(basicObject b){
        this.content = b;
    }

    public node getRoot(){
        if(this.type != nodeType.type.ROOT){
            return this.parentNode.getRoot();
        }
        else{
            return this;
        }
    }

    public ArrayList<basicObject> traverse(){
        ArrayList<basicObject> ret = new ArrayList<basicObject>();
        if (childList == null){
            ret.add(this.content);
            return ret;
        }
        else{
            for(int i = 0; i < this.childList.size(); i++){
                ret.addAll(childList.get(i).traverse());
            }
            return ret;
        }

    }

    public basicObject getContent(){
        return this.content;
    }

    public node composition(ArrayList<node> nodeList){
        return null;
    }
    
    public node decomposition(node curNode){
        return null;
    }


}
