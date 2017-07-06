package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.ocltypes.Csvfile;
import fr.ocelet.model.alborun.TableModel;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class CsvModel extends Csvfile {
  public CsvModel() {
    super("data/TRAVAIL/CSVDATA/MODELE/Reunion_modele_complet_res.csv");
  }
  
  public List<TableModel> readAllTableModel() {
    List<TableModel> _elist = new List<TableModel>();
    for (InputDataRecord _record : this) {
      _elist.add(createTableModelFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<TableModel> readAll() {
    return readAllTableModel();
  }
  
  public TableModel createTableModelFromRecord(final InputDataRecord _rec) {
                      	    TableModel _entity = new TableModel();
    _entity.setProperty("tnmoy42",readString("TN_moy_42"));
    _entity.setProperty("rrlogcumulrain35",readString("RR_log_cumul_35"));
    _entity.setProperty("model",readDouble("Aedes_moy"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("TN_moy_42","java.lang.String");
    hm.put("RR_log_cumul_35","java.lang.String");
    hm.put("Aedes_moy","java.lang.Double");
    return hm;
  }
  
  public String headerString() {
      StringBuffer sb = new StringBuffer();
    sb.append("TN_moy_42");
    sb.append(separator);                     
    sb.append("RR_log_cumul_35");
    sb.append(separator);                     
    sb.append("Aedes_moy");
    return sb.toString();
  }
  
  public String propsString(final Entity _entity) {
      StringBuffer sb = new StringBuffer();
    sb.append(_entity.getProperty("tnmoy42"));
    sb.append(separator);                     
    sb.append(_entity.getProperty("rrlogcumulrain35"));
    sb.append(separator);                     
    sb.append(_entity.getProperty("model"));
    return sb.toString();
  }
}
