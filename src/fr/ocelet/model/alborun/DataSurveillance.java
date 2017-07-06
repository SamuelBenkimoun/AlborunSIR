package fr.ocelet.model.alborun;

import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;

@SuppressWarnings("all")
public class DataSurveillance extends AbstractEntity {
  public void setNme(final Double nme) {
    setProperty("nme",nme);
  }
  
  public Double getNme() {
    return getProperty("nme");
  }
  
  public void setNmtot(final Double nmtot) {
    setProperty("nmtot",nmtot);
  }
  
  public Double getNmtot() {
    return getProperty("nmtot");
  }
  
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setDateTXT(final String dateTXT) {
    setProperty("dateTXT",dateTXT);
  }
  
  public String getDateTXT() {
    return getProperty("dateTXT");
  }
  
  public DataSurveillance() {
    super();
    defProperty("nme",new Hproperty<Double>());
    setNme(new Double("0"));
    defProperty("nmtot",new Hproperty<Double>());
    setNmtot(new Double("0"));
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("dateTXT",new Hproperty<String>());
    setDateTXT(new String());
  }
}
