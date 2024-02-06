/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package priority;

/**
 *
 * @author dmoc2
 */
public class PQElem {
    
    int priorityKey;
    String data;

    public PQElem(int priorityKey, String data) {
        this.priorityKey = priorityKey;
        this.data = data;
    }
    
    

    public int getPriorityKey() {
        return priorityKey;
    }

    public void setPriorityKey(int priorityKey) {
        this.priorityKey = priorityKey;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
}
