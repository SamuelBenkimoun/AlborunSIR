package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.InputDataRecord;
import fr.ocelet.datafacer.OutputDataRecord;
import fr.ocelet.datafacer.ocltypes.Shapefile;
import fr.ocelet.model.alborun.Parcelle;
import fr.ocelet.runtime.entity.Entity;
import fr.ocelet.runtime.ocltypes.List;
import java.util.HashMap;

@SuppressWarnings("all")
public class ShpOutAllDates extends Shapefile {
  public ShpOutAllDates() {
    super("output/REUNION_serietemporelle.shp","EPSG:2975");
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
    _entity.setProperty("ah",readDouble("adultes_re"));
    _entity.setProperty("a1h",readDouble("a1h"));
    _entity.setProperty("a1gS",readDouble("a1gS"));
    _entity.setProperty("a1gE",readDouble("a1gE"));
    _entity.setProperty("a1gI",readDouble("a1gI"));
    _entity.setProperty("a1oS",readDouble("a1oS"));
    _entity.setProperty("a1oE",readDouble("a1oE"));
    _entity.setProperty("a1oI",readDouble("a1oI"));
    _entity.setProperty("a2hS",readDouble("a2hS"));
    _entity.setProperty("a2hE",readDouble("a2hE"));
    _entity.setProperty("a2hI",readDouble("a2hI"));
    _entity.setProperty("a2gS",readDouble("a2gS"));
    _entity.setProperty("a2gE",readDouble("a2gE"));
    _entity.setProperty("a2gI",readDouble("a2gI"));
    _entity.setProperty("a2oS",readDouble("a2oS"));
    _entity.setProperty("a2oE",readDouble("a2oE"));
    _entity.setProperty("a2oI",readDouble("a2oI"));
    _entity.setProperty("atot",readDouble("adultes_to"));
    _entity.setProperty("larvae2",readDouble("larves2"));
    _entity.setProperty("pop",readDouble("population"));
    _entity.setProperty("popS",readDouble("pop_S"));
    _entity.setProperty("popE",readDouble("pop_E"));
    _entity.setProperty("popI",readDouble("pop_I"));
    _entity.setProperty("popR",readDouble("pop_R"));
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
    hm.put("adultes_re","java.lang.Double");
    hm.put("a1h","java.lang.Double");
    hm.put("a1gS","java.lang.Double");
    hm.put("a1gE","java.lang.Double");
    hm.put("a1gI","java.lang.Double");
    hm.put("a1oS","java.lang.Double");
    hm.put("a1oE","java.lang.Double");
    hm.put("a1oI","java.lang.Double");
    hm.put("a2hS","java.lang.Double");
    hm.put("a2hE","java.lang.Double");
    hm.put("a2hI","java.lang.Double");
    hm.put("a2gS","java.lang.Double");
    hm.put("a2gE","java.lang.Double");
    hm.put("a2gI","java.lang.Double");
    hm.put("a2oS","java.lang.Double");
    hm.put("a2oE","java.lang.Double");
    hm.put("a2oI","java.lang.Double");
    hm.put("adultes_to","java.lang.Double");
    hm.put("larves2","java.lang.Double");
    hm.put("population","java.lang.Double");
    hm.put("pop_S","java.lang.Double");
    hm.put("pop_E","java.lang.Double");
    hm.put("pop_I","java.lang.Double");
    hm.put("pop_R","java.lang.Double");
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
                       odr.setAttribute("adultes_re",((Parcelle) ety).getAh());
                       odr.setAttribute("a1h",((Parcelle) ety).getA1h());
                       odr.setAttribute("a1gS",((Parcelle) ety).getA1gS());
                       odr.setAttribute("a1gE",((Parcelle) ety).getA1gE());
                       odr.setAttribute("a1gI",((Parcelle) ety).getA1gI());
                       odr.setAttribute("a1oS",((Parcelle) ety).getA1oS());
                       odr.setAttribute("a1oE",((Parcelle) ety).getA1oE());
                       odr.setAttribute("a1oI",((Parcelle) ety).getA1oI());
                       odr.setAttribute("a2hS",((Parcelle) ety).getA2hS());
                       odr.setAttribute("a2hE",((Parcelle) ety).getA2hE());
                       odr.setAttribute("a2hI",((Parcelle) ety).getA2hI());
                       odr.setAttribute("a2gS",((Parcelle) ety).getA2gS());
                       odr.setAttribute("a2gE",((Parcelle) ety).getA2gE());
                       odr.setAttribute("a2gI",((Parcelle) ety).getA2gI());
                       odr.setAttribute("a2oS",((Parcelle) ety).getA2oS());
                       odr.setAttribute("a2oE",((Parcelle) ety).getA2oE());
                       odr.setAttribute("a2oI",((Parcelle) ety).getA2oI());
                       odr.setAttribute("adultes_to",((Parcelle) ety).getAtot());
                       odr.setAttribute("larves2",((Parcelle) ety).getLarvae2());
                       odr.setAttribute("population",((Parcelle) ety).getPop());
                       odr.setAttribute("pop_S",((Parcelle) ety).getPopS());
                       odr.setAttribute("pop_E",((Parcelle) ety).getPopE());
                       odr.setAttribute("pop_I",((Parcelle) ety).getPopI());
                       odr.setAttribute("pop_R",((Parcelle) ety).getPopR());
    }
    return odr;
  }
}
