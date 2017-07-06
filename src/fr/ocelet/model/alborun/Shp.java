package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.alborun.Parcelle;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class Shp extends Shapefile {
  public Shp() {
    super("data/REFERENCE/SHAPEFILE/ZONESALIZES/Export_Output_Test.shp","EPSG:2975");
  }
  
  public List<Parcelle> readAllParcelle() {
    List<Parcelle> _elist = new List<Parcelle>();
    for (InputDataRecord _record : this) {
      _elist.add(createParcelleFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<Parcelle> readAll() {
    return readAllParcelle();
  }
  
  public Parcelle createParcelleFromRecord(final InputDataRecord _rec) {
                      	    Parcelle _entity = new Parcelle();
    _entity.setProperty("arrond",readString("ARROND"));
    _entity.setProperty("commune",readString("COMMUNE"));
    _entity.setProperty("id",readInteger("NUM_Z"));
    _entity.setProperty("nom",readString("NOM"));
    _entity.setProperty("kl",readInteger("KL"));
    _entity.setProperty("pop",readDouble("pop_h"));
    _entity.setProperty("geom",readMultiPolygon("geom"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("ARROND","java.lang.String");
    hm.put("COMMUNE","java.lang.String");
    hm.put("NUM_Z","java.lang.Integer");
    hm.put("NOM","java.lang.String");
    hm.put("KL","java.lang.Integer");
    hm.put("pop_h","java.lang.Double");
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.MultiPolygon");
    return hm;
  }
  
  public List<Parcelle> readFilteredParcelle(final String _filt) {
    setFilter(_filt);
    return readAllParcelle();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
                       odr.setAttribute("ARROND",((Parcelle) ety).getArrond());
                       odr.setAttribute("COMMUNE",((Parcelle) ety).getCommune());
                       odr.setAttribute("NUM_Z",((Parcelle) ety).getId());
                       odr.setAttribute("NOM",((Parcelle) ety).getNom());
                       odr.setAttribute("KL",((Parcelle) ety).getKl());
                       odr.setAttribute("pop_h",((Parcelle) ety).getPop());
                       odr.setAttribute("geom",((Parcelle) ety).getGeom());
    }
    return odr;
  }
}
