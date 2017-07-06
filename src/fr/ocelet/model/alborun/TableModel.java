package fr.ocelet.model.alborun;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;

@SuppressWarnings("all")
public class TableModel extends AbstractEntity {
  public void setTnmoy42(final String tnmoy42) {
    setProperty("tnmoy42",tnmoy42);
  }
  
  public String getTnmoy42() {
    return getProperty("tnmoy42");
  }
  
  public void setRrlogcumulrain35(final String rrlogcumulrain35) {
    setProperty("rrlogcumulrain35",rrlogcumulrain35);
  }
  
  public String getRrlogcumulrain35() {
    return getProperty("rrlogcumulrain35");
  }
  
  public void setModel(final Double model) {
    setProperty("model",model);
  }
  
  public Double getModel() {
    return getProperty("model");
  }
  
  public TableModel() {
    super();
    defProperty("tnmoy42",new Hproperty<String>());
    setTnmoy42(new String());
    defProperty("rrlogcumulrain35",new Hproperty<String>());
    setRrlogcumulrain35(new String());
    defProperty("model",new Hproperty<Double>());
    setModel(new Double("0"));
  }
}
