package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.alborun.Parcelle;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpOut1Date extends Shapefile {
  public ShpOut1Date() {
    super("output/REUNION_01012013.shp","EPSG:2975");
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
    _entity.setProperty("geom",readMultiPolygon("geom"));
    _entity.setProperty("id",readInteger("NUM_Z"));
    _entity.setProperty("nom",readString("NOM"));
    _entity.setProperty("num_station",readLong("id_station"));
    _entity.setProperty("date_begin",readString("date_debut"));
    _entity.setProperty("date_end",readString("date_fin"));
    _entity.setProperty("egg",readDouble("oeufs"));
    _entity.setProperty("larvae",readDouble("larves"));
    _entity.setProperty("pupae",readDouble("nymphes"));
    _entity.setProperty("ah",readDouble("adultes_rech"));
    _entity.setProperty("atot",readDouble("adultes_tot"));
    _entity.setProperty("larvae2",readDouble("larves2"));
    _entity.setProperty("pop",readDouble("population"));
    _entity.setProperty("r0",readDouble("r0"));
    return _entity;
  }
  
  public HashMap<String, String> getMatchdef() {
    HashMap<String, String> hm = new HashMap<String, String>();
    hm.put("geom","fr.ocelet.runtime.geom.ocltypes.MultiPolygon");
    hm.put("NUM_Z","java.lang.Integer");
    hm.put("NOM","java.lang.String");
    hm.put("id_station","java.lang.Long");
    hm.put("date_debut","java.lang.String");
    hm.put("date_fin","java.lang.String");
    hm.put("oeufs","java.lang.Double");
    hm.put("larves","java.lang.Double");
    hm.put("nymphes","java.lang.Double");
    hm.put("adultes_rech","java.lang.Double");
    hm.put("adultes_tot","java.lang.Double");
    hm.put("larves2","java.lang.Double");
    hm.put("population","java.lang.Double");
    hm.put("r0","java.lang.Double");
    return hm;
  }
  
  public List<Parcelle> readFilteredParcelle(final String _filt) {
    setFilter(_filt);
    return readAllParcelle();
  }
  
  public OutputDataRecord createRecord(final Entity ety) throws IllegalArgumentException {
    OutputDataRecord odr = createOutputDataRec();
    if (odr != null) {
                       odr.setAttribute("geom",((Parcelle) ety).getGeom());
                       odr.setAttribute("NUM_Z",((Parcelle) ety).getId());
                       odr.setAttribute("NOM",((Parcelle) ety).getNom());
                       odr.setAttribute("id_station",((Parcelle) ety).getNum_station());
                       odr.setAttribute("date_debut",((Parcelle) ety).getDate_begin());
                       odr.setAttribute("date_fin",((Parcelle) ety).getDate_end());
                       odr.setAttribute("oeufs",((Parcelle) ety).getEgg());
                       odr.setAttribute("larves",((Parcelle) ety).getLarvae());
                       odr.setAttribute("nymphes",((Parcelle) ety).getPupae());
                       odr.setAttribute("adultes_rech",((Parcelle) ety).getAh());
                       odr.setAttribute("adultes_tot",((Parcelle) ety).getAtot());
                       odr.setAttribute("larves2",((Parcelle) ety).getLarvae2());
                       odr.setAttribute("population",((Parcelle) ety).getPop());
                       odr.setAttribute("r0",((Parcelle) ety).getR0());
    }
    return odr;
  }
}
