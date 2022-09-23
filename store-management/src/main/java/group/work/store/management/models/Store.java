package group.work.store.management.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@NoArgsConstructor
@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String items;
    private String dataIn;
    private String dataOut;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDataIn() {
        return dataIn;
    }

    public void setDataIn(String dataIn) {
        this.dataIn = dataIn;
    }

    public String getDataOut() {
        return dataOut;
    }

    public void setDataOut(String dataOut) {
        this.dataOut = dataOut;
    }
}
