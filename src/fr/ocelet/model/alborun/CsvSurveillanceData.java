package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.ocltypes.Csvfile;
import fr.ocelet.model.alborun.DataSurveillance;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class CsvSurveillanceData extends Csvfile {
  public CsvSurveillanceData() {
    super("data/TRAVAIL/CSVDATA/SURVEILLANCE/1.csv");
  }
  
  public List<DataSurveillance> readAllDataSurveillance() {
    List<DataSurveillance> _elist = new List<DataSurveillance>();
    for (InputDataRecord _record : this) {
      _elist.add(createDataSurveillanceFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<DataSurveillance> readAll() {
    return readAllDataSurveillance();
  }
  
  public DataSurveillance createDataSurveillanceFromRecord(final InputDataRecord _rec) {
                      	    DataSurveillance _entity = new DataSurveillance();
    _entity.setProperty("id",readInteger("num_z"));
    _entity.setProperty("dateTXT",readString("date"));
    _entity.setProperty("nme",readDouble("Me"));
    _entity.setProperty("nmtot",readDouble("Mtot"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("num_z","java.lang.Integer");
    hm.put("date","java.lang.String");
    hm.put("Me","java.lang.Double");
    hm.put("Mtot","java.lang.Double");
    return hm;
  }
  
  public String headerString() {
      StringBuffer sb = new StringBuffer();
    sb.append("num_z");
    sb.append(separator);                     
    sb.append("date");
    sb.append(separator);                     
    sb.append("Me");
    sb.append(separator);                     
    sb.append("Mtot");
    return sb.toString();
  }
  
  public String propsString(final Entity _entity) {
      StringBuffer sb = new StringBuffer();
    sb.append(_entity.getProperty("id"));
    sb.append(separator);                     
    sb.append(_entity.getProperty("dateTXT"));
    sb.append(separator);                     
    sb.append(_entity.getProperty("nme"));
    sb.append(separator);                     
    sb.append(_entity.getProperty("nmtot"));
    return sb.toString();
  }
}
