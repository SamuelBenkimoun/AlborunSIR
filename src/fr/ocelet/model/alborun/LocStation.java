package fr.ocelet.model.alborun;

import fr.ocelet.datafacer.ocltypes.KmlExport;
import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.geom.ocltypes.Point;
import fr.ocelet.runtime.ocltypes.Date;

@SuppressWarnings("all")
public class LocStation extends AbstractEntity {
  public void setName(final String name) {
    setProperty("name",name);
  }
  
  public String getName() {
    return getProperty("name");
  }
  
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setNumero(final Long numero) {
    setProperty("numero",numero);
  }
  
  public Long getNumero() {
    return getProperty("numero");
  }
  
  public void setGeom(final Point geom) {
    setProperty("geom",geom);
  }
  
  public Point getGeom() {
    return getProperty("geom");
  }
  
  public void outputKml(final Date begin, final Date end, final KmlExport kml) {
    String _name = this.getName();
    String id = ("Station " + _name);
    String style = "Station";
    Date deb = begin;
    Date fin = end;
    Point _geom = this.getGeom();
    kml.addGeometry(style, id, deb, fin, _geom, style, 0);
  }
  
  public LocStation() {
    super();
    defProperty("name",new Hproperty<String>());
    setName(new String());
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("numero",new Hproperty<Long>());
    setNumero(new Long("0"));
    defProperty("geom",new Hproperty<Point>());
    setGeom(new Point());
  }
}
