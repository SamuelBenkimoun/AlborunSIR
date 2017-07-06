package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.alborun.LocStation;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpStation extends Shapefile {
  public ShpStation() {
    super("data/TRAVAIL/SHAPEFILE/STATIONS/Stations_meteo.shp","EPSG:2975");
  }
  
  public List<LocStation> readAllLocStation() {
    List<LocStation> _elist = new List<LocStation>();
    for (InputDataRecord _record : this) {
      _elist.add(createLocStationFromRecord(_record));
     }
    resetIterator();
    return _elist;
  }
  
  public List<LocStation> readAll() {
    return readAllLocStation();
  }
  
  public LocStation createLocStationFromRecord(final InputDataRecord _rec) {
                      	    LocStation _entity = new LocStation();
    _entity.setProperty("name",readString("NomStation"));
    _entity.setProperty("numero",readLong("Numero"));
    _entity.setProperty("geom",readPoint("geom"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("NomStation","java.lang.String");
    hm.put("Numero","java.lang.Long");
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.Point");
    return hm;
  }
  
  public List<LocStation> readFilteredLocStation(final String _filt) {
    setFilter(_filt);
    return readAllLocStation();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
                       odr.setAttribute("NomStation",((LocStation) ety).getName());
                       odr.setAttribute("Numero",((LocStation) ety).getNumero());
                       odr.setAttribute("geom",((LocStation) ety).getGeom());
    }
    return odr;
  }
}
