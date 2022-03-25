package model;

import java.util.ArrayList;
import utility.nodeType;

public class node {
    private node parentNode;
    private ArrayList<node> childList = new ArrayList<node>();
    private nodeType.type type;
    private basicObject content;

    public node(nodeType.type t){
        this.type = t;
    }

    public void setContent(basicObject b){
        this.content = b;
    }

    public void setParentNode(node n){
        this.parentNode = n;
    }

    public void setType(nodeType.type t){
        this.type = t;
    }

    public nodeType.type getType(){
        return this.type;
    }

    public node getRoot(){
        if(this.type != nodeType.type.ROOT && this.parentNode != null){
            return this.parentNode.getRoot();
        }
        else{
            return this;
        }
    }

    public void addChild(node n){
        this.childList.add(n);
    }

    public ArrayList<basicObject> getAllObj(){
        ArrayList<basicObject> ret = new ArrayList<basicObject>();
        this.traverse(ret);
        return ret;
    }

    public void traverse(ArrayList<basicObject> ret){
        if (this.type == nodeType.type.LEAF){
            ret.add(this.content);
            return;
        }
        else{
            for(int i = 0; i < this.childList.size(); i++){
                node n = this.childList.get(i);
                n.traverse(ret);
            }
            return;
        }
    }

    public basicObject getContent(){
        return this.content;
    }

    public node group(ArrayList<node> selectList){
        node root = new node(nodeType.type.ROOT);
        node n;
        for(int i = 0; i < selectList.size(); i++){
            n = selectList.get(i);
            if(n.type == nodeType.type.ROOT){
                n.setType(nodeType.type.STEM);
            }
            root.addChild(n);
            n.setParentNode(root);
        }
        return root;
    }
    
    public void ungroup(){
        for(int i = 0; i < this.childList.size(); i++){
            node n = this.childList.get(i);
            if(n.getType() == nodeType.type.STEM){
                n.setType(nodeType.type.ROOT);
            }
            n.setParentNode(null);
        }
    }
}
