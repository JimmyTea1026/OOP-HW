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
        if (this.type == nodeType.type.LEAF){
            this.content = b;
        }
    }

    public ArrayList<basicObject> traverse(){
        ArrayList<basicObject> ret = new ArrayList<basicObject>();
        if(this.type == nodeType.type.ROOT){

        }
        else if(this.type == nodeType.type.LEAF){
            ret.add(this.content);
            return ret;
        }
        
        return null;
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
