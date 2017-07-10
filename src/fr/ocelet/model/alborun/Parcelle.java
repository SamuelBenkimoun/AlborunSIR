package fr.ocelet.model.alborun;

import com.google.common.base.Objects;
import fr.ocelet.datafacer.ocltypes.KmlExport;
import fr.ocelet.model.alborun.TableModel;
import fr.ocelet.runtime.Miscutils;
import fr.ocelet.runtime.entity.AbstractEntity;
import fr.ocelet.runtime.entity.Hproperty;
import fr.ocelet.runtime.geom.ocltypes.MultiPolygon;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.List;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IntegerRange;

@SuppressWarnings("all")
public class Parcelle extends AbstractEntity {
  public void setArrond(final String arrond) {
    setProperty("arrond",arrond);
  }
  
  public String getArrond() {
    return getProperty("arrond");
  }
  
  public void setCommune(final String commune) {
    setProperty("commune",commune);
  }
  
  public String getCommune() {
    return getProperty("commune");
  }
  
  public void setId(final Integer id) {
    setProperty("id",id);
  }
  
  public Integer getId() {
    return getProperty("id");
  }
  
  public void setNom(final String nom) {
    setProperty("nom",nom);
  }
  
  public String getNom() {
    return getProperty("nom");
  }
  
  public void setKl(final Integer kl) {
    setProperty("kl",kl);
  }
  
  public Integer getKl() {
    return getProperty("kl");
  }
  
  public void setPop(final Double pop) {
    setProperty("pop",pop);
  }
  
  public Double getPop() {
    return getProperty("pop");
  }
  
  public void setGeom(final MultiPolygon geom) {
    setProperty("geom",geom);
  }
  
  public MultiPolygon getGeom() {
    return getProperty("geom");
  }
  
  public void setDate_begin(final String date_begin) {
    setProperty("date_begin",date_begin);
  }
  
  public String getDate_begin() {
    return getProperty("date_begin");
  }
  
  public void setDate_end(final String date_end) {
    setProperty("date_end",date_end);
  }
  
  public String getDate_end() {
    return getProperty("date_end");
  }
  
  public void setNom_station(final String nom_station) {
    setProperty("nom_station",nom_station);
  }
  
  public String getNom_station() {
    return getProperty("nom_station");
  }
  
  public void setDist_station(final Double dist_station) {
    setProperty("dist_station",dist_station);
  }
  
  public Double getDist_station() {
    return getProperty("dist_station");
  }
  
  public void setId_station(final Integer id_station) {
    setProperty("id_station",id_station);
  }
  
  public Integer getId_station() {
    return getProperty("id_station");
  }
  
  public void setNum_station(final Long num_station) {
    setProperty("num_station",num_station);
  }
  
  public Long getNum_station() {
    return getProperty("num_station");
  }
  
  public void setR0(final Double r0) {
    setProperty("r0",r0);
  }
  
  public Double getR0() {
    return getProperty("r0");
  }
  
  public void setIndex_visite(final Integer index_visite) {
    setProperty("index_visite",index_visite);
  }
  
  public Integer getIndex_visite() {
    return getProperty("index_visite");
  }
  
  public void setPopS(final Double popS) {
    setProperty("popS",popS);
  }
  
  public Double getPopS() {
    return getProperty("popS");
  }
  
  public void setPopE(final Double popE) {
    setProperty("popE",popE);
  }
  
  public Double getPopE() {
    return getProperty("popE");
  }
  
  public void setPopI(final Double popI) {
    setProperty("popI",popI);
  }
  
  public Double getPopI() {
    return getProperty("popI");
  }
  
  public void setPopR(final Double popR) {
    setProperty("popR",popR);
  }
  
  public Double getPopR() {
    return getProperty("popR");
  }
  
  public void setComp_hum(final Double comp_hum) {
    setProperty("comp_hum",comp_hum);
  }
  
  public Double getComp_hum() {
    return getProperty("comp_hum");
  }
  
  public void setEgg(final Double egg) {
    setProperty("egg",egg);
  }
  
  public Double getEgg() {
    return getProperty("egg");
  }
  
  public void setLarvae(final Double larvae) {
    setProperty("larvae",larvae);
  }
  
  public Double getLarvae() {
    return getProperty("larvae");
  }
  
  public void setPupae(final Double pupae) {
    setProperty("pupae",pupae);
  }
  
  public Double getPupae() {
    return getProperty("pupae");
  }
  
  public void setAem(final Double aem) {
    setProperty("aem",aem);
  }
  
  public Double getAem() {
    return getProperty("aem");
  }
  
  public void setA1h(final Double a1h) {
    setProperty("a1h",a1h);
  }
  
  public Double getA1h() {
    return getProperty("a1h");
  }
  
  public void setA1g(final Double a1g) {
    setProperty("a1g",a1g);
  }
  
  public Double getA1g() {
    return getProperty("a1g");
  }
  
  public void setA1gS(final Double a1gS) {
    setProperty("a1gS",a1gS);
  }
  
  public Double getA1gS() {
    return getProperty("a1gS");
  }
  
  public void setA1gE(final Double a1gE) {
    setProperty("a1gE",a1gE);
  }
  
  public Double getA1gE() {
    return getProperty("a1gE");
  }
  
  public void setA1gI(final Double a1gI) {
    setProperty("a1gI",a1gI);
  }
  
  public Double getA1gI() {
    return getProperty("a1gI");
  }
  
  public void setA1o(final Double a1o) {
    setProperty("a1o",a1o);
  }
  
  public Double getA1o() {
    return getProperty("a1o");
  }
  
  public void setA1oS(final Double a1oS) {
    setProperty("a1oS",a1oS);
  }
  
  public Double getA1oS() {
    return getProperty("a1oS");
  }
  
  public void setA1oE(final Double a1oE) {
    setProperty("a1oE",a1oE);
  }
  
  public Double getA1oE() {
    return getProperty("a1oE");
  }
  
  public void setA1oI(final Double a1oI) {
    setProperty("a1oI",a1oI);
  }
  
  public Double getA1oI() {
    return getProperty("a1oI");
  }
  
  public void setA2h(final Double a2h) {
    setProperty("a2h",a2h);
  }
  
  public Double getA2h() {
    return getProperty("a2h");
  }
  
  public void setA2hS(final Double a2hS) {
    setProperty("a2hS",a2hS);
  }
  
  public Double getA2hS() {
    return getProperty("a2hS");
  }
  
  public void setA2hE(final Double a2hE) {
    setProperty("a2hE",a2hE);
  }
  
  public Double getA2hE() {
    return getProperty("a2hE");
  }
  
  public void setA2hI(final Double a2hI) {
    setProperty("a2hI",a2hI);
  }
  
  public Double getA2hI() {
    return getProperty("a2hI");
  }
  
  public void setA2g(final Double a2g) {
    setProperty("a2g",a2g);
  }
  
  public Double getA2g() {
    return getProperty("a2g");
  }
  
  public void setA2gS(final Double a2gS) {
    setProperty("a2gS",a2gS);
  }
  
  public Double getA2gS() {
    return getProperty("a2gS");
  }
  
  public void setA2gE(final Double a2gE) {
    setProperty("a2gE",a2gE);
  }
  
  public Double getA2gE() {
    return getProperty("a2gE");
  }
  
  public void setA2gI(final Double a2gI) {
    setProperty("a2gI",a2gI);
  }
  
  public Double getA2gI() {
    return getProperty("a2gI");
  }
  
  public void setA2o(final Double a2o) {
    setProperty("a2o",a2o);
  }
  
  public Double getA2o() {
    return getProperty("a2o");
  }
  
  public void setA2oS(final Double a2oS) {
    setProperty("a2oS",a2oS);
  }
  
  public Double getA2oS() {
    return getProperty("a2oS");
  }
  
  public void setA2oE(final Double a2oE) {
    setProperty("a2oE",a2oE);
  }
  
  public Double getA2oE() {
    return getProperty("a2oE");
  }
  
  public void setA2oI(final Double a2oI) {
    setProperty("a2oI",a2oI);
  }
  
  public Double getA2oI() {
    return getProperty("a2oI");
  }
  
  public void setAh(final Double ah) {
    setProperty("ah",ah);
  }
  
  public Double getAh() {
    return getProperty("ah");
  }
  
  public void setAtot(final Double atot) {
    setProperty("atot",atot);
  }
  
  public Double getAtot() {
    return getProperty("atot");
  }
  
  public void setFegg(final Double fegg) {
    setProperty("fegg",fegg);
  }
  
  public Double getFegg() {
    return getProperty("fegg");
  }
  
  public void setFlarvae(final Double flarvae) {
    setProperty("flarvae",flarvae);
  }
  
  public Double getFlarvae() {
    return getProperty("flarvae");
  }
  
  public void setFpupae(final Double fpupae) {
    setProperty("fpupae",fpupae);
  }
  
  public Double getFpupae() {
    return getProperty("fpupae");
  }
  
  public void setFag(final Double fag) {
    setProperty("fag",fag);
  }
  
  public Double getFag() {
    return getProperty("fag");
  }
  
  public void setFao(final Double fao) {
    setProperty("fao",fao);
  }
  
  public Double getFao() {
    return getProperty("fao");
  }
  
  public void setFSE(final Double fSE) {
    setProperty("fSE",fSE);
  }
  
  public Double getFSE() {
    return getProperty("fSE");
  }
  
  public void setFEI(final Double fEI) {
    setProperty("fEI",fEI);
  }
  
  public Double getFEI() {
    return getProperty("fEI");
  }
  
  public void setFme(final Double fme) {
    setProperty("fme",fme);
  }
  
  public Double getFme() {
    return getProperty("fme");
  }
  
  public void setFml(final Double fml) {
    setProperty("fml",fml);
  }
  
  public Double getFml() {
    return getProperty("fml");
  }
  
  public void setFmp(final Double fmp) {
    setProperty("fmp",fmp);
  }
  
  public Double getFmp() {
    return getProperty("fmp");
  }
  
  public void setFma(final Double fma) {
    setProperty("fma",fma);
  }
  
  public Double getFma() {
    return getProperty("fma");
  }
  
  public void setFmaE(final Double fmaE) {
    setProperty("fmaE",fmaE);
  }
  
  public Double getFmaE() {
    return getProperty("fmaE");
  }
  
  public void setFmaI(final Double fmaI) {
    setProperty("fmaI",fmaI);
  }
  
  public Double getFmaI() {
    return getProperty("fmaI");
  }
  
  public void setFmurma(final Double fmurma) {
    setProperty("fmurma",fmurma);
  }
  
  public Double getFmurma() {
    return getProperty("fmurma");
  }
  
  public void setFmurmaE(final Double fmurmaE) {
    setProperty("fmurmaE",fmurmaE);
  }
  
  public Double getFmurmaE() {
    return getProperty("fmurmaE");
  }
  
  public void setFmurmaI(final Double fmurmaI) {
    setProperty("fmurmaI",fmurmaI);
  }
  
  public Double getFmurmaI() {
    return getProperty("fmurmaI");
  }
  
  public void setFkl(final Double fkl) {
    setProperty("fkl",fkl);
  }
  
  public Double getFkl() {
    return getProperty("fkl");
  }
  
  public void setFkp(final Double fkp) {
    setProperty("fkp",fkp);
  }
  
  public Double getFkp() {
    return getProperty("fkp");
  }
  
  public void setComp_vect(final Double comp_vect) {
    setProperty("comp_vect",comp_vect);
  }
  
  public Double getComp_vect() {
    return getProperty("comp_vect");
  }
  
  public void setIncub_extr(final Double incub_extr) {
    setProperty("incub_extr",incub_extr);
  }
  
  public Double getIncub_extr() {
    return getProperty("incub_extr");
  }
  
  public void setClassR0(final Integer classR0) {
    setProperty("classR0",classR0);
  }
  
  public Integer getClassR0() {
    return getProperty("classR0");
  }
  
  public void setLarvae2(final Double larvae2) {
    setProperty("larvae2",larvae2);
  }
  
  public Double getLarvae2() {
    return getProperty("larvae2");
  }
  
  public void setTemperature(final Double temperature) {
    setProperty("temperature",temperature);
  }
  
  public Double getTemperature() {
    return getProperty("temperature");
  }
  
  public void setRain(final Double rain) {
    setProperty("rain",rain);
  }
  
  public Double getRain() {
    return getProperty("rain");
  }
  
  public void setRain7(final Double rain7) {
    setProperty("rain7",rain7);
  }
  
  public Double getRain7() {
    return getProperty("rain7");
  }
  
  public void setRaincumul7(final Double raincumul7) {
    setProperty("raincumul7",raincumul7);
  }
  
  public Double getRaincumul7() {
    return getProperty("raincumul7");
  }
  
  public void setRainday7(final Integer rainday7) {
    setProperty("rainday7",rainday7);
  }
  
  public Integer getRainday7() {
    return getProperty("rainday7");
  }
  
  public void setRaincumul35(final Double raincumul35) {
    setProperty("raincumul35",raincumul35);
  }
  
  public Double getRaincumul35() {
    return getProperty("raincumul35");
  }
  
  public void setRrlogcumul35(final String rrlogcumul35) {
    setProperty("rrlogcumul35",rrlogcumul35);
  }
  
  public String getRrlogcumul35() {
    return getProperty("rrlogcumul35");
  }
  
  public void setTnmoy42(final String tnmoy42) {
    setProperty("tnmoy42",tnmoy42);
  }
  
  public String getTnmoy42() {
    return getProperty("tnmoy42");
  }
  
  public void setRain35(final Double rain35) {
    setProperty("rain35",rain35);
  }
  
  public Double getRain35() {
    return getProperty("rain35");
  }
  
  public void setTn42(final Double tn42) {
    setProperty("tn42",tn42);
  }
  
  public Double getTn42() {
    return getProperty("tn42");
  }
  
  public void setTmincumul42(final Double tmincumul42) {
    setProperty("tmincumul42",tmincumul42);
  }
  
  public Double getTmincumul42() {
    return getProperty("tmincumul42");
  }
  
  public void setTmin(final Double tmin) {
    setProperty("tmin",tmin);
  }
  
  public Double getTmin() {
    return getProperty("tmin");
  }
  
  public void setTmax(final Double tmax) {
    setProperty("tmax",tmax);
  }
  
  public Double getTmax() {
    return getProperty("tmax");
  }
  
  public void updateVariablesRain() {
    Double _raincumul7 = this.getRaincumul7();
    Double _rain = this.getRain();
    double _plus = DoubleExtensions.operator_plus(_raincumul7, _rain);
    Double _rain7 = this.getRain7();
    double _minus = (_plus - (_rain7).doubleValue());
    this.setRaincumul7(Double.valueOf(_minus));
    Double _raincumul35 = this.getRaincumul35();
    Double _rain_1 = this.getRain();
    double _plus_1 = DoubleExtensions.operator_plus(_raincumul35, _rain_1);
    Double _rain35 = this.getRain35();
    double _minus_1 = (_plus_1 - (_rain35).doubleValue());
    this.setRaincumul35(Double.valueOf(_minus_1));
    Double _raincumul35_1 = this.getRaincumul35();
    double _log = Math.log((_raincumul35_1).doubleValue());
    String _format = Miscutils.format(Double.valueOf(_log), "#.#");
    this.setRrlogcumul35(_format);
    Double _rain_2 = this.getRain();
    boolean _greaterThan = ((_rain_2).doubleValue() > 10);
    if (_greaterThan) {
      Integer _rainday7 = this.getRainday7();
      int _plus_2 = ((_rainday7).intValue() + 1);
      this.setRainday7(Integer.valueOf(_plus_2));
    }
    Double _rain7_1 = this.getRain7();
    boolean _greaterThan_1 = ((_rain7_1).doubleValue() > 10);
    if (_greaterThan_1) {
      Integer _rainday7_1 = this.getRainday7();
      int _minus_2 = ((_rainday7_1).intValue() - 1);
      this.setRainday7(Integer.valueOf(_minus_2));
    }
  }
  
  public void updateVariablesTemp() {
    Double _tmin = this.getTmin();
    Double _tmax = this.getTmax();
    double _plus = DoubleExtensions.operator_plus(_tmin, _tmax);
    double _divide = (_plus / 2);
    this.setTemperature(Double.valueOf(_divide));
    Double _tmincumul42 = this.getTmincumul42();
    Double _tmin_1 = this.getTmin();
    double _plus_1 = DoubleExtensions.operator_plus(_tmincumul42, _tmin_1);
    Double _tn42 = this.getTn42();
    double _minus = (_plus_1 - (_tn42).doubleValue());
    this.setTmincumul42(Double.valueOf(_minus));
    Double _tmincumul42_1 = this.getTmincumul42();
    double _divide_1 = ((_tmincumul42_1).doubleValue() / 42);
    String _format = Miscutils.format(Double.valueOf(_divide_1), "#.#");
    this.setTnmoy42(_format);
  }
  
  public void updateFunctions(final Double temperature, final Double rain) {
    int TE = 10;
    int TDDE = 110;
    if (((temperature).doubleValue() > TE)) {
      double fegg1 = ((temperature).doubleValue() - TE);
      this.setFegg(Double.valueOf((fegg1 / TDDE)));
    }
    Double _fegg = this.getFegg();
    boolean _lessThan = ((_fegg).doubleValue() < 0);
    if (_lessThan) {
      this.setFegg(Double.valueOf(0.0));
    }
    double q1 = (-0.0007);
    double q2 = 0.0392;
    double q3 = (-0.3911);
    double flarvae1 = ((q1 * (temperature).doubleValue()) * (temperature).doubleValue());
    double flarvae2 = ((q2 * (temperature).doubleValue()) + q3);
    this.setFlarvae(Double.valueOf((flarvae1 + flarvae2)));
    Double _flarvae = this.getFlarvae();
    boolean _lessThan_1 = ((_flarvae).doubleValue() < 0);
    if (_lessThan_1) {
      this.setFlarvae(Double.valueOf(0.0));
    }
    q1 = 0.0008;
    q2 = (-0.0051);
    q3 = 0.0319;
    double fpupae1 = ((q1 * (temperature).doubleValue()) * (temperature).doubleValue());
    double fpupae2 = ((q2 * (temperature).doubleValue()) + q3);
    this.setFpupae(Double.valueOf((fpupae1 + fpupae2)));
    Double _fpupae = this.getFpupae();
    boolean _lessThan_2 = ((_fpupae).doubleValue() < 0);
    if (_lessThan_2) {
      this.setFpupae(Double.valueOf(0.0));
    }
    int TAg = 10;
    int TDDAg = 77;
    if (((temperature).doubleValue() > TAg)) {
      double fag1 = ((temperature).doubleValue() - TAg);
      this.setFag(Double.valueOf((fag1 / TDDAg)));
    }
    Double _raincumul7 = this.getRaincumul7();
    double _plus = ((_raincumul7).doubleValue() + 1);
    double _multiply = (0.28 * _plus);
    double _divide = (_multiply / 50);
    this.setFao(Double.valueOf(_divide));
    Double _fao = this.getFao();
    boolean _greaterThan = ((_fao).doubleValue() > 0.28);
    if (_greaterThan) {
      this.setFao(Double.valueOf(0.28));
    }
    this.setFme(Double.valueOf(0.05));
    Integer _rainday7 = this.getRainday7();
    boolean _greaterThan_1 = ((_rainday7).intValue() > 2);
    if (_greaterThan_1) {
      this.setFme(Double.valueOf(0.2));
    }
    double fml1 = Math.exp((((temperature).doubleValue() - 10) * 0.1838));
    this.setFml(Double.valueOf(((0.0007 * fml1) + 0.02)));
    double fmp1 = Math.exp((((temperature).doubleValue() - 10) * 0.2228));
    this.setFmp(Double.valueOf(((0.0003 * fmp1) + 0.02)));
    if (((rain).doubleValue() > 80)) {
      Double _fme = this.getFme();
      double _plus_1 = ((_fme).doubleValue() + 0.1);
      this.setFme(Double.valueOf(_plus_1));
      Double _fml = this.getFml();
      double _plus_2 = ((_fml).doubleValue() + 0.5);
      this.setFml(Double.valueOf(_plus_2));
      Double _fmp = this.getFmp();
      double _plus_3 = ((_fmp).doubleValue() + 0.5);
      this.setFmp(Double.valueOf(_plus_3));
    }
    double fma1 = Math.exp((((temperature).doubleValue() - 10) * 0.1745));
    this.setFma(Double.valueOf(((0.0003 * fma1) + 0.025)));
    Double _fma = this.getFma();
    boolean _lessThan_3 = ((_fma).doubleValue() < 0.025);
    if (_lessThan_3) {
      this.setFma(Double.valueOf(0.025));
    }
    Double _fma_1 = this.getFma();
    double _multiply_1 = ((_fma_1).doubleValue() * 2);
    this.setFmaE(Double.valueOf(_multiply_1));
    Double _fma_2 = this.getFma();
    double _multiply_2 = ((_fma_2).doubleValue() * 2);
    this.setFmaI(Double.valueOf(_multiply_2));
    double mur = 0.08;
    Double _fma_3 = this.getFma();
    double _plus_4 = ((_fma_3).doubleValue() + mur);
    this.setFmurma(Double.valueOf(_plus_4));
    Double _fmaE = this.getFmaE();
    double _plus_5 = ((_fmaE).doubleValue() + mur);
    this.setFmurmaE(Double.valueOf(_plus_5));
    Double _fmaI = this.getFmaI();
    double _plus_6 = ((_fmaI).doubleValue() + mur);
    this.setFmurmaI(Double.valueOf(_plus_6));
    Integer _kl = this.getKl();
    Double _raincumul7_1 = this.getRaincumul7();
    double _divide_1 = ((_raincumul7_1).doubleValue() / 100);
    double _plus_7 = (1 + _divide_1);
    double _multiply_3 = ((_kl).intValue() * _plus_7);
    Integer _kl_1 = this.getKl();
    int _multiply_4 = (2 * (_kl_1).intValue());
    double _min = Math.min(_multiply_3, _multiply_4);
    this.setFkl(Double.valueOf(_min));
    Integer _kl_2 = this.getKl();
    Double _raincumul7_2 = this.getRaincumul7();
    double _divide_2 = ((_raincumul7_2).doubleValue() / 100);
    double _plus_8 = (1 + _divide_2);
    double _multiply_5 = ((_kl_2).intValue() * _plus_8);
    Integer _kl_3 = this.getKl();
    int _multiply_6 = (2 * (_kl_3).intValue());
    double _min_1 = Math.min(_multiply_5, _multiply_6);
    this.setFkp(Double.valueOf(_min_1));
    double _multiply_7 = DoubleExtensions.operator_multiply(temperature, temperature);
    double _multiply_8 = ((-0.0043) * _multiply_7);
    double _plus_9 = (_multiply_8 + (0.2593 * (temperature).doubleValue()));
    double _minus = (_plus_9 - 3.2705);
    this.setComp_vect(Double.valueOf(_minus));
    double _multiply_9 = DoubleExtensions.operator_multiply(temperature, temperature);
    double _multiply_10 = (0.11 * _multiply_9);
    double _minus_1 = (_multiply_10 - (7.13 * (temperature).doubleValue()));
    double _plus_10 = (_minus_1 + 121.17);
    this.setIncub_extr(Double.valueOf(_plus_10));
    this.setComp_hum(Double.valueOf(0.75));
  }
  
  public void dynpop(final Double dt) {
    int b1 = 60;
    int b2 = 80;
    double sexr = 0.5;
    double muPem = 0.1;
    double devAh = 0.2;
    double devAhI = (2 * devAh);
    Double _comp_vect = this.getComp_vect();
    String _plus = ("comp_vect : " + _comp_vect);
    String _plus_1 = (_plus + ";");
    InputOutput.<String>println(_plus_1);
    Double _egg = this.getEgg();
    String _plus_2 = ("egg : " + _egg);
    String _plus_3 = (_plus_2 + ";");
    InputOutput.<String>println(_plus_3);
    Double _larvae = this.getLarvae();
    String _plus_4 = ("larvae : " + _larvae);
    String _plus_5 = (_plus_4 + ";");
    InputOutput.<String>println(_plus_5);
    double devAem = (1 / 2.5);
    Double _comp_vect_1 = this.getComp_vect();
    double _multiply = ((_comp_vect_1).doubleValue() * devAh);
    Double _popI = this.getPopI();
    double _multiply_1 = (_multiply * (_popI).doubleValue());
    Double _pop = this.getPop();
    double fSE = (_multiply_1 / (_pop).doubleValue());
    Double _incub_extr = this.getIncub_extr();
    double fEI = (1 / (_incub_extr).doubleValue());
    InputOutput.<String>println((("fse : " + Double.valueOf(fSE)) + ";"));
    InputOutput.<String>println((("fei :" + Double.valueOf(fEI)) + ";"));
    Double _fma = this.getFma();
    String _plus_6 = ("fma :" + _fma);
    String _plus_7 = (_plus_6 + ";");
    InputOutput.<String>println(_plus_7);
    Double _fmurmaE = this.getFmurmaE();
    String _plus_8 = ("fmurmaE :" + _fmurmaE);
    String _plus_9 = (_plus_8 + ";");
    InputOutput.<String>println(_plus_9);
    Double _fmurmaI = this.getFmurmaI();
    String _plus_10 = ("fmurmaI :" + _fmurmaI);
    String _plus_11 = (_plus_10 + ";");
    InputOutput.<String>println(_plus_11);
    Double _fmaE = this.getFmaE();
    String _plus_12 = ("fmaE :" + _fmaE);
    String _plus_13 = (_plus_12 + ";");
    InputOutput.<String>println(_plus_13);
    Double _fmaI = this.getFmaI();
    String _plus_14 = ("fmaI :" + _fmaI);
    String _plus_15 = (_plus_14 + ";");
    InputOutput.<String>println(_plus_15);
    Double _comp_hum = this.getComp_hum();
    String _plus_16 = ("comp_hum : " + _comp_hum);
    String _plus_17 = (_plus_16 + ";");
    InputOutput.<String>println(_plus_17);
    InputOutput.<String>println((("devAh : " + Double.valueOf(devAh)) + ";"));
    InputOutput.<String>println((("devAhI : " + Double.valueOf(devAhI)) + ";"));
    Double _a2hI = this.getA2hI();
    String _plus_18 = ("a2hI : " + _a2hI);
    String _plus_19 = (_plus_18 + ";");
    InputOutput.<String>println(_plus_19);
    Double _pop_1 = this.getPop();
    String _plus_20 = ("pop : " + _pop_1);
    String _plus_21 = (_plus_20 + ";");
    InputOutput.<String>println(_plus_21);
    Double _popI_1 = this.getPopI();
    String _plus_22 = ("pop infect\u00E9e :" + _popI_1);
    String _plus_23 = (_plus_22 + ";");
    InputOutput.<String>println(_plus_23);
    Double _ah = this.getAh();
    String _plus_24 = ("ah: " + _ah);
    String _plus_25 = (_plus_24 + ";");
    InputOutput.<String>println(_plus_25);
    Double _ah_1 = this.getAh();
    boolean _equals = ((_ah_1).doubleValue() == 0.0);
    if (_equals) {
      this.setAh(Double.valueOf(0.0000000000000000001));
    }
    Double _comp_hum_1 = this.getComp_hum();
    double _multiply_2 = ((_comp_hum_1).doubleValue() * devAhI);
    Double _a2hI_1 = this.getA2hI();
    double _multiply_3 = (_multiply_2 * (_a2hI_1).doubleValue());
    Double _ah_2 = this.getAh();
    Double popdevSE = Double.valueOf((_multiply_3 / (_ah_2).doubleValue()));
    InputOutput.<String>println((("popdevSE :" + popdevSE) + ";"));
    final Double popdevEI = Double.valueOf((1.0 / 6.0));
    InputOutput.<String>println((("popdevEI :" + popdevEI) + ";"));
    final Double popdevIR = Double.valueOf((1.0 / 5.0));
    long _round = Math.round((1 / (dt).doubleValue()));
    int npastemps = Long.valueOf(_round).intValue();
    Double x1 = this.getEgg();
    Double x2 = this.getLarvae();
    Double x3 = this.getPupae();
    Double x4 = this.getAem();
    Double x5 = this.getA1h();
    Double x6S = this.getA1gS();
    Double x6E = this.getA1gE();
    Double x6I = this.getA1gI();
    Double x7S = this.getA1oS();
    Double x7E = this.getA1oE();
    Double x7I = this.getA1oI();
    Double x8S = this.getA2hS();
    Double x8E = this.getA2hE();
    Double x8I = this.getA2hI();
    Double x9S = this.getA2gS();
    Double x9E = this.getA2gE();
    Double x9I = this.getA2gI();
    Double x10S = this.getA2oS();
    Double x10E = this.getA2oE();
    Double x10I = this.getA2oI();
    Double x11S = this.getPopS();
    Double x11E = this.getPopE();
    Double x11I = this.getPopI();
    Double x11R = this.getPopR();
    double k1 = 0.0;
    double l1 = 0.0;
    double m1 = 0.0;
    double n1 = 0.0;
    double o1 = 0.0;
    double p1 = 0.0;
    double p2 = 0.0;
    double p3 = 0.0;
    double q1 = 0.0;
    double q2 = 0.0;
    double q3 = 0.0;
    double r1 = 0.0;
    double r2 = 0.0;
    double r3 = 0.0;
    double s1 = 0.0;
    double s2 = 0.0;
    double s3 = 0.0;
    double t1 = 0.0;
    double t2 = 0.0;
    double t3 = 0.0;
    double u1 = 0.0;
    double u2 = 0.0;
    double u3 = 0.0;
    double u4 = 0.0;
    IntegerRange _upTo = new IntegerRange(1, npastemps);
    for (final Integer y : _upTo) {
      {
        Double _fao = this.getFao();
        double _plus_26 = DoubleExtensions.operator_plus(x7S, x7E);
        double _plus_27 = (_plus_26 + (x7I).doubleValue());
        long _round_1 = Math.round(_plus_27);
        long _multiply_4 = (b1 * _round_1);
        double _plus_28 = DoubleExtensions.operator_plus(x10S, x10E);
        double _plus_29 = (_plus_28 + (x10I).doubleValue());
        long _round_2 = Math.round(_plus_29);
        long _multiply_5 = (b2 * _round_2);
        long _plus_30 = (_multiply_4 + _multiply_5);
        double _multiply_6 = ((_fao).doubleValue() * _plus_30);
        Double _fme = this.getFme();
        Double _fegg = this.getFegg();
        double _plus_31 = DoubleExtensions.operator_plus(_fme, _fegg);
        double _multiply_7 = ((x1).doubleValue() * _plus_31);
        double _minus = (_multiply_6 - _multiply_7);
        k1 = _minus;
        Double _fml = this.getFml();
        Double _fkl = this.getFkl();
        double _divide = DoubleExtensions.operator_divide(x2, _fkl);
        double _plus_32 = (1.0 + _divide);
        double _multiply_8 = ((_fml).doubleValue() * _plus_32);
        Double _flarvae = this.getFlarvae();
        double l1b = (_multiply_8 + (_flarvae).doubleValue());
        Double _fegg_1 = this.getFegg();
        double _multiply_9 = DoubleExtensions.operator_multiply(_fegg_1, x1);
        double _minus_1 = (_multiply_9 - ((x2).doubleValue() * l1b));
        l1 = _minus_1;
        Double _flarvae_1 = this.getFlarvae();
        double _multiply_10 = DoubleExtensions.operator_multiply(_flarvae_1, x2);
        Double _fmp = this.getFmp();
        Double _fpupae = this.getFpupae();
        double _plus_33 = DoubleExtensions.operator_plus(_fmp, _fpupae);
        double _multiply_11 = ((x3).doubleValue() * _plus_33);
        double _minus_2 = (_multiply_10 - _multiply_11);
        m1 = _minus_2;
        Double _fkp = this.getFkp();
        double _divide_1 = DoubleExtensions.operator_divide(x3, _fkp);
        double _plus_34 = (1 + _divide_1);
        double _multiply_12 = ((-muPem) * _plus_34);
        double n1a = Math.exp(_multiply_12);
        Double _fpupae_1 = this.getFpupae();
        double _multiply_13 = ((_fpupae_1).doubleValue() * sexr);
        double _multiply_14 = (_multiply_13 * (x3).doubleValue());
        double _multiply_15 = (_multiply_14 * n1a);
        Double _fma_1 = this.getFma();
        double _plus_35 = ((_fma_1).doubleValue() + devAem);
        double _multiply_16 = ((x4).doubleValue() * _plus_35);
        double _minus_3 = (_multiply_15 - _multiply_16);
        n1 = _minus_3;
        Double _fmurma = this.getFmurma();
        double _plus_36 = ((_fmurma).doubleValue() + devAh);
        double _multiply_17 = ((x5).doubleValue() * _plus_36);
        double _minus_4 = ((devAem * (x4).doubleValue()) - _multiply_17);
        o1 = _minus_4;
        Double _fma_2 = this.getFma();
        Double _fag = this.getFag();
        double _plus_37 = DoubleExtensions.operator_plus(_fma_2, _fag);
        double _plus_38 = (_plus_37 + fSE);
        double _multiply_18 = ((x6S).doubleValue() * _plus_38);
        double _minus_5 = ((devAh * (x5).doubleValue()) - _multiply_18);
        p1 = _minus_5;
        Double _fmaE_1 = this.getFmaE();
        Double _fag_1 = this.getFag();
        double _plus_39 = DoubleExtensions.operator_plus(_fmaE_1, _fag_1);
        double _plus_40 = (_plus_39 + fEI);
        double _multiply_19 = ((x6E).doubleValue() * _plus_40);
        double _minus_6 = ((fSE * (x6S).doubleValue()) - _multiply_19);
        p2 = _minus_6;
        Double _fmaI_1 = this.getFmaI();
        Double _fag_2 = this.getFag();
        double _plus_41 = DoubleExtensions.operator_plus(_fmaI_1, _fag_2);
        double _multiply_20 = ((x6I).doubleValue() * _plus_41);
        double _minus_7 = ((fEI * (x6E).doubleValue()) - _multiply_20);
        p3 = _minus_7;
        Double _fag_3 = this.getFag();
        double _multiply_21 = DoubleExtensions.operator_multiply(_fag_3, x6S);
        Double _fmurma_1 = this.getFmurma();
        Double _fao_1 = this.getFao();
        double _plus_42 = DoubleExtensions.operator_plus(_fmurma_1, _fao_1);
        double _multiply_22 = ((x7S).doubleValue() * _plus_42);
        double _minus_8 = (_multiply_21 - _multiply_22);
        q1 = _minus_8;
        Double _fag_4 = this.getFag();
        double _multiply_23 = DoubleExtensions.operator_multiply(_fag_4, x6E);
        Double _fmurmaE_1 = this.getFmurmaE();
        Double _fao_2 = this.getFao();
        double _plus_43 = DoubleExtensions.operator_plus(_fmurmaE_1, _fao_2);
        double _plus_44 = (_plus_43 + fEI);
        double _multiply_24 = ((x7E).doubleValue() * _plus_44);
        double _minus_9 = (_multiply_23 - _multiply_24);
        q2 = _minus_9;
        Double _fag_5 = this.getFag();
        double _multiply_25 = DoubleExtensions.operator_multiply(_fag_5, x6I);
        double _plus_45 = ((fEI * (x7E).doubleValue()) + _multiply_25);
        Double _fmurmaI_1 = this.getFmurmaI();
        Double _fao_3 = this.getFao();
        double _plus_46 = DoubleExtensions.operator_plus(_fmurmaI_1, _fao_3);
        double _multiply_26 = ((x7I).doubleValue() * _plus_46);
        double _minus_10 = (_plus_45 - _multiply_26);
        q3 = _minus_10;
        Double _fao_4 = this.getFao();
        double _plus_47 = DoubleExtensions.operator_plus(x7S, x10S);
        double _multiply_27 = ((_fao_4).doubleValue() * _plus_47);
        Double _fmurma_2 = this.getFmurma();
        double _plus_48 = ((_fmurma_2).doubleValue() + devAh);
        double _multiply_28 = ((x8S).doubleValue() * _plus_48);
        double _minus_11 = (_multiply_27 - _multiply_28);
        r1 = _minus_11;
        Double _fao_5 = this.getFao();
        double _plus_49 = DoubleExtensions.operator_plus(x7E, x10E);
        double _multiply_29 = ((_fao_5).doubleValue() * _plus_49);
        Double _fmurmaE_2 = this.getFmurmaE();
        double _plus_50 = ((_fmurmaE_2).doubleValue() + devAh);
        double _multiply_30 = ((x8E).doubleValue() * _plus_50);
        double _minus_12 = (_multiply_29 - _multiply_30);
        r2 = _minus_12;
        Double _fao_6 = this.getFao();
        double _plus_51 = DoubleExtensions.operator_plus(x7I, x10I);
        double _multiply_31 = ((_fao_6).doubleValue() * _plus_51);
        double _plus_52 = ((fEI * (x8E).doubleValue()) + _multiply_31);
        Double _fmurmaI_2 = this.getFmurmaI();
        double _plus_53 = ((_fmurmaI_2).doubleValue() + devAhI);
        double _multiply_32 = ((x8I).doubleValue() * _plus_53);
        double _minus_13 = (_plus_52 - _multiply_32);
        r3 = _minus_13;
        Double _fma_3 = this.getFma();
        Double _fag_6 = this.getFag();
        double _plus_54 = DoubleExtensions.operator_plus(_fma_3, _fag_6);
        double _plus_55 = (_plus_54 + fSE);
        double _multiply_33 = ((x9S).doubleValue() * _plus_55);
        double _minus_14 = ((devAh * (x8S).doubleValue()) - _multiply_33);
        s1 = _minus_14;
        Double _fmaE_2 = this.getFmaE();
        Double _fag_7 = this.getFag();
        double _plus_56 = DoubleExtensions.operator_plus(_fmaE_2, _fag_7);
        double _plus_57 = (_plus_56 + fEI);
        double _multiply_34 = ((x9E).doubleValue() * _plus_57);
        double _minus_15 = (((fSE * (x9S).doubleValue()) + (devAh * (x8E).doubleValue())) - _multiply_34);
        s2 = _minus_15;
        Double _fmaI_2 = this.getFmaI();
        Double _fag_8 = this.getFag();
        double _plus_58 = DoubleExtensions.operator_plus(_fmaI_2, _fag_8);
        double _multiply_35 = ((x9I).doubleValue() * _plus_58);
        double _minus_16 = (((fEI * (x9E).doubleValue()) + (devAhI * (x8I).doubleValue())) - _multiply_35);
        s3 = _minus_16;
        Double _fag_9 = this.getFag();
        double _multiply_36 = DoubleExtensions.operator_multiply(_fag_9, x9S);
        Double _fmurma_3 = this.getFmurma();
        Double _fao_7 = this.getFao();
        double _plus_59 = DoubleExtensions.operator_plus(_fmurma_3, _fao_7);
        double _multiply_37 = ((x10S).doubleValue() * _plus_59);
        double _minus_17 = (_multiply_36 - _multiply_37);
        t1 = _minus_17;
        Double _fag_10 = this.getFag();
        double _multiply_38 = DoubleExtensions.operator_multiply(_fag_10, x9E);
        Double _fmurmaE_3 = this.getFmurmaE();
        Double _fag_11 = this.getFag();
        double _plus_60 = DoubleExtensions.operator_plus(_fmurmaE_3, _fag_11);
        double _plus_61 = (_plus_60 + fEI);
        double _multiply_39 = ((x10E).doubleValue() * _plus_61);
        double _minus_18 = (_multiply_38 - _multiply_39);
        t2 = _minus_18;
        Double _fag_12 = this.getFag();
        double _multiply_40 = DoubleExtensions.operator_multiply(_fag_12, x9I);
        double _plus_62 = ((fEI * (x10E).doubleValue()) + _multiply_40);
        Double _fmurmaI_3 = this.getFmurmaI();
        Double _fag_13 = this.getFag();
        double _plus_63 = DoubleExtensions.operator_plus(_fmurmaI_3, _fag_13);
        double _multiply_41 = ((x9I).doubleValue() * _plus_63);
        double _minus_19 = (_plus_62 - _multiply_41);
        t3 = _minus_19;
        double _minus_20 = DoubleExtensions.operator_minus(x11S);
        double _multiply_42 = (_minus_20 * (popdevSE).doubleValue());
        u1 = _multiply_42;
        double _multiply_43 = DoubleExtensions.operator_multiply(x11S, popdevSE);
        double _multiply_44 = DoubleExtensions.operator_multiply(x11E, popdevEI);
        double _minus_21 = (_multiply_43 - _multiply_44);
        u2 = _minus_21;
        double _multiply_45 = DoubleExtensions.operator_multiply(x11E, popdevEI);
        double _multiply_46 = DoubleExtensions.operator_multiply(x11I, popdevIR);
        double _minus_22 = (_multiply_45 - _multiply_46);
        u3 = _minus_22;
        double _multiply_47 = DoubleExtensions.operator_multiply(x11I, popdevIR);
        u4 = _multiply_47;
        double k = ((x1).doubleValue() + ((dt).doubleValue() * k1));
        double l = ((x2).doubleValue() + ((dt).doubleValue() * l1));
        double m = ((x3).doubleValue() + ((dt).doubleValue() * m1));
        double n = ((x4).doubleValue() + ((dt).doubleValue() * n1));
        double o = ((x5).doubleValue() + ((dt).doubleValue() * o1));
        double p1b = ((x6S).doubleValue() + ((dt).doubleValue() * p1));
        double p2b = ((x6E).doubleValue() + ((dt).doubleValue() * p2));
        double p3b = ((x6I).doubleValue() + ((dt).doubleValue() * p3));
        double q1b = ((x7S).doubleValue() + ((dt).doubleValue() * q1));
        double q2b = ((x7E).doubleValue() + ((dt).doubleValue() * q2));
        double q3b = ((x7I).doubleValue() + ((dt).doubleValue() * q3));
        double r1b = ((x8S).doubleValue() + ((dt).doubleValue() * r1));
        double r2b = ((x9E).doubleValue() + ((dt).doubleValue() * r2));
        double r3b = ((x9I).doubleValue() + ((dt).doubleValue() * r3));
        double s1b = ((x9S).doubleValue() + ((dt).doubleValue() * s1));
        double s2b = ((x9E).doubleValue() + ((dt).doubleValue() * s2));
        double s3b = ((x9I).doubleValue() + ((dt).doubleValue() * s3));
        double t1b = ((x10S).doubleValue() + ((dt).doubleValue() * t1));
        double t2b = ((x10E).doubleValue() + ((dt).doubleValue() * t2));
        double t3b = ((x10I).doubleValue() + ((dt).doubleValue() * t3));
        double u1b = ((x11S).doubleValue() + ((dt).doubleValue() * u1));
        double u2b = ((x11E).doubleValue() + ((dt).doubleValue() * u2));
        double u3b = ((x11I).doubleValue() + ((dt).doubleValue() * u3));
        double u4b = ((x11R).doubleValue() + ((dt).doubleValue() * u4));
        x1 = Double.valueOf(k);
        x2 = Double.valueOf(l);
        x3 = Double.valueOf(m);
        x4 = Double.valueOf(n);
        x5 = Double.valueOf(o);
        x6S = Double.valueOf(p1b);
        x6E = Double.valueOf(p2b);
        x6I = Double.valueOf(p3b);
        x7S = Double.valueOf(q1b);
        x7E = Double.valueOf(q2b);
        x7I = Double.valueOf(q3b);
        x8S = Double.valueOf(r1b);
        x8E = Double.valueOf(r2b);
        x8I = Double.valueOf(r3b);
        x9S = Double.valueOf(s1b);
        x9E = Double.valueOf(s2b);
        x9I = Double.valueOf(s3b);
        x10S = Double.valueOf(t1b);
        x10E = Double.valueOf(t2b);
        x10I = Double.valueOf(t3b);
        x11S = Double.valueOf(u1b);
        x11E = Double.valueOf(u2b);
        x11I = Double.valueOf(u3b);
        x11R = Double.valueOf(u4b);
      }
    }
    this.setEgg(x1);
    this.setLarvae(x2);
    this.setPupae(x3);
    this.setAem(x4);
    this.setA1h(x5);
    this.setA1gS(x6S);
    this.setA1gE(x6E);
    this.setA1gI(x6I);
    this.setA1oS(x7S);
    this.setA1oE(x7E);
    this.setA1oI(x7I);
    this.setA2hS(x8S);
    this.setA2hE(x8E);
    this.setA2hI(x8I);
    this.setA2gS(x9S);
    this.setA2gE(x9E);
    this.setA2gI(x9I);
    this.setA2oS(x10S);
    this.setA2oE(x10E);
    this.setA2oI(x10I);
    this.setPopS(x11S);
    this.setPopE(x11E);
    this.setPopI(x11I);
    this.setPopR(x11R);
  }
  
  public void calculAtot() {
    Double _aem = this.getAem();
    Double _a1h = this.getA1h();
    double _plus = DoubleExtensions.operator_plus(_aem, _a1h);
    Double _a1g = this.getA1g();
    double _plus_1 = (_plus + (_a1g).doubleValue());
    Double _a1o = this.getA1o();
    double _plus_2 = (_plus_1 + (_a1o).doubleValue());
    Double _a2h = this.getA2h();
    double _plus_3 = (_plus_2 + (_a2h).doubleValue());
    Double _a2g = this.getA2g();
    double _plus_4 = (_plus_3 + (_a2g).doubleValue());
    Double _a2o = this.getA2o();
    double _plus_5 = (_plus_4 + (_a2o).doubleValue());
    this.setAtot(Double.valueOf(_plus_5));
  }
  
  public void calculAh() {
    Double _a1h = this.getA1h();
    Double _a2hS = this.getA2hS();
    double _plus = DoubleExtensions.operator_plus(_a1h, _a2hS);
    Double _a2hE = this.getA2hE();
    double _plus_1 = (_plus + (_a2hE).doubleValue());
    Double _a2hI = this.getA2hI();
    double _plus_2 = (_plus_1 + (_a2hI).doubleValue());
    this.setAh(Double.valueOf(_plus_2));
    Double _a1h_1 = this.getA1h();
    String _plus_3 = ("a1h: " + _a1h_1);
    String _plus_4 = (_plus_3 + " ");
    String _plus_5 = (_plus_4 + "a2hS: ");
    Double _a2hS_1 = this.getA2hS();
    String _plus_6 = (_plus_5 + _a2hS_1);
    String _plus_7 = (_plus_6 + " ");
    String _plus_8 = (_plus_7 + "a2hE: ");
    Double _a2hE_1 = this.getA2hE();
    String _plus_9 = (_plus_8 + _a2hE_1);
    String _plus_10 = (_plus_9 + " ");
    String _plus_11 = (_plus_10 + "a2hI: ");
    Double _a2hI_1 = this.getA2hI();
    String _plus_12 = (_plus_11 + _a2hI_1);
    InputOutput.<String>println(_plus_12);
  }
  
  public void calculModel2(final List<TableModel> table) {
    boolean test = false;
    String tabletemp = " ";
    String tablerain = " ";
    int i = 0;
    while (((test == false) && (i < table.size()))) {
      {
        TableModel _get = table.get(i);
        String _tnmoy42 = _get.getTnmoy42();
        tabletemp = _tnmoy42;
        String _tnmoy42_1 = this.getTnmoy42();
        boolean _equals = Objects.equal(tabletemp, _tnmoy42_1);
        if (_equals) {
          TableModel _get_1 = table.get(i);
          String _rrlogcumulrain35 = _get_1.getRrlogcumulrain35();
          tablerain = _rrlogcumulrain35;
          String _rrlogcumul35 = this.getRrlogcumul35();
          boolean _equals_1 = Objects.equal(tablerain, _rrlogcumul35);
          if (_equals_1) {
            test = true;
            TableModel _get_2 = table.get(i);
            Double _model = _get_2.getModel();
            double _multiply = ((_model).doubleValue() * 1000);
            this.setLarvae2(Double.valueOf(_multiply));
          }
        }
        i = (i + 1);
      }
    }
  }
  
  public Double calculR0() {
    Double _atot = this.getAtot();
    Double _ah = this.getAh();
    double _minus = DoubleExtensions.operator_minus(_atot, _ah);
    Double _fma = this.getFma();
    double _multiply = (_minus * (_fma).doubleValue());
    Double _ah_1 = this.getAh();
    Double _fmurma = this.getFmurma();
    double _multiply_1 = DoubleExtensions.operator_multiply(_ah_1, _fmurma);
    double _plus = (_multiply + _multiply_1);
    Double _atot_1 = this.getAtot();
    double _divide = (_plus / (_atot_1).doubleValue());
    double taux_survie = (1 - _divide);
    Double _temperature = this.getTemperature();
    Double _temperature_1 = this.getTemperature();
    double _multiply_2 = DoubleExtensions.operator_multiply(_temperature, _temperature_1);
    double _multiply_3 = (0.11 * _multiply_2);
    Double _temperature_2 = this.getTemperature();
    double _multiply_4 = (7.13 * (_temperature_2).doubleValue());
    double _minus_1 = (_multiply_3 - _multiply_4);
    double incub_extr = (_minus_1 + 121.17);
    Double _temperature_3 = this.getTemperature();
    Double _temperature_4 = this.getTemperature();
    double _multiply_5 = DoubleExtensions.operator_multiply(_temperature_3, _temperature_4);
    double _multiply_6 = ((-0.0043) * _multiply_5);
    Double _temperature_5 = this.getTemperature();
    double _multiply_7 = (0.2593 * (_temperature_5).doubleValue());
    double _plus_1 = (_multiply_6 + _multiply_7);
    double comp_vect = (_plus_1 - 3.2705);
    double taux_guer = 0.2;
    double devAh = 0.2;
    Double _atot_2 = this.getAtot();
    Double _pop = this.getPop();
    double _divide_1 = DoubleExtensions.operator_divide(_atot_2, _pop);
    Double _ah_2 = this.getAh();
    double _multiply_8 = ((_ah_2).doubleValue() * devAh);
    Double _atot_3 = this.getAtot();
    double _divide_2 = (_multiply_8 / (_atot_3).doubleValue());
    double _pow = Math.pow(_divide_2, 2);
    double _multiply_9 = (_divide_1 * _pow);
    double _pow_1 = Math.pow(taux_survie, incub_extr);
    double _multiply_10 = (_multiply_9 * _pow_1);
    double _log = Math.log(taux_survie);
    double _minus_2 = (-_log);
    double capac_vect = (_multiply_10 / _minus_2);
    double r0 = ((comp_vect * capac_vect) / taux_guer);
    if ((r0 < 0)) {
      r0 = 0;
    }
    return Double.valueOf(r0);
  }
  
  public void classify() {
    Double _r0 = this.getR0();
    boolean _lessThan = ((_r0).doubleValue() < 0.41);
    if (_lessThan) {
      this.setClassR0(Integer.valueOf(1));
    }
    boolean _and = false;
    Double _r0_1 = this.getR0();
    boolean _greaterEqualsThan = ((_r0_1).doubleValue() >= 0.41);
    if (!_greaterEqualsThan) {
      _and = false;
    } else {
      Double _r0_2 = this.getR0();
      boolean _lessThan_1 = ((_r0_2).doubleValue() < 0.82);
      _and = _lessThan_1;
    }
    if (_and) {
      this.setClassR0(Integer.valueOf(2));
    }
    boolean _and_1 = false;
    Double _r0_3 = this.getR0();
    boolean _greaterEqualsThan_1 = ((_r0_3).doubleValue() >= 0.82);
    if (!_greaterEqualsThan_1) {
      _and_1 = false;
    } else {
      Double _r0_4 = this.getR0();
      boolean _lessThan_2 = ((_r0_4).doubleValue() < 1.34);
      _and_1 = _lessThan_2;
    }
    if (_and_1) {
      this.setClassR0(Integer.valueOf(3));
    }
    boolean _and_2 = false;
    Double _r0_5 = this.getR0();
    boolean _greaterEqualsThan_2 = ((_r0_5).doubleValue() >= 1.34);
    if (!_greaterEqualsThan_2) {
      _and_2 = false;
    } else {
      Double _r0_6 = this.getR0();
      boolean _lessThan_3 = ((_r0_6).doubleValue() < 2.21);
      _and_2 = _lessThan_3;
    }
    if (_and_2) {
      this.setClassR0(Integer.valueOf(4));
    }
    boolean _and_3 = false;
    Double _r0_7 = this.getR0();
    boolean _greaterEqualsThan_3 = ((_r0_7).doubleValue() >= 2.21);
    if (!_greaterEqualsThan_3) {
      _and_3 = false;
    } else {
      Double _r0_8 = this.getR0();
      boolean _lessThan_4 = ((_r0_8).doubleValue() < 4.39);
      _and_3 = _lessThan_4;
    }
    if (_and_3) {
      this.setClassR0(Integer.valueOf(5));
    }
    Double _r0_9 = this.getR0();
    boolean _greaterEqualsThan_4 = ((_r0_9).doubleValue() >= 4.39);
    if (_greaterEqualsThan_4) {
      this.setClassR0(Integer.valueOf(6));
    }
  }
  
  public void outputKml(final Integer day, final Date now, final Integer frequencedisplay, final KmlExport kml) {
    Integer _id = this.getId();
    String _plus = ("Alize" + _id);
    String _plus_1 = (_plus + "_");
    String _string = now.toString("yyyy-MM-dd");
    String id = (_plus_1 + _string);
    Integer _classR0 = this.getClassR0();
    String style = ("R0_" + _classR0);
    Date deb = now;
    Date fin = now.clone();
    fin.addDays((frequencedisplay).intValue());
    MultiPolygon _geom = this.getGeom();
    kml.addGeometry(style, id, deb, fin, _geom, style, 0);
  }
  
  public Parcelle() {
    super();
    defProperty("arrond",new Hproperty<String>());
    setArrond(new String());
    defProperty("commune",new Hproperty<String>());
    setCommune(new String());
    defProperty("id",new Hproperty<Integer>());
    setId(new Integer("0"));
    defProperty("nom",new Hproperty<String>());
    setNom(new String());
    defProperty("kl",new Hproperty<Integer>());
    setKl(new Integer("0"));
    defProperty("pop",new Hproperty<Double>());
    setPop(new Double("0"));
    defProperty("geom",new Hproperty<MultiPolygon>());
    setGeom(new MultiPolygon());
    defProperty("date_begin",new Hproperty<String>());
    setDate_begin(new String());
    defProperty("date_end",new Hproperty<String>());
    setDate_end(new String());
    defProperty("nom_station",new Hproperty<String>());
    setNom_station(new String());
    defProperty("dist_station",new Hproperty<Double>());
    setDist_station(new Double("0"));
    defProperty("id_station",new Hproperty<Integer>());
    setId_station(new Integer("0"));
    defProperty("num_station",new Hproperty<Long>());
    setNum_station(new Long("0"));
    defProperty("r0",new Hproperty<Double>());
    setR0(new Double("0"));
    defProperty("index_visite",new Hproperty<Integer>());
    setIndex_visite(new Integer("0"));
    defProperty("popS",new Hproperty<Double>());
    setPopS(new Double("0"));
    defProperty("popE",new Hproperty<Double>());
    setPopE(new Double("0"));
    defProperty("popI",new Hproperty<Double>());
    setPopI(new Double("0"));
    defProperty("popR",new Hproperty<Double>());
    setPopR(new Double("0"));
    defProperty("comp_hum",new Hproperty<Double>());
    setComp_hum(new Double("0"));
    defProperty("egg",new Hproperty<Double>());
    setEgg(new Double("0"));
    defProperty("larvae",new Hproperty<Double>());
    setLarvae(new Double("0"));
    defProperty("pupae",new Hproperty<Double>());
    setPupae(new Double("0"));
    defProperty("aem",new Hproperty<Double>());
    setAem(new Double("0"));
    defProperty("a1h",new Hproperty<Double>());
    setA1h(new Double("0"));
    defProperty("a1g",new Hproperty<Double>());
    setA1g(new Double("0"));
    defProperty("a1gS",new Hproperty<Double>());
    setA1gS(new Double("0"));
    defProperty("a1gE",new Hproperty<Double>());
    setA1gE(new Double("0"));
    defProperty("a1gI",new Hproperty<Double>());
    setA1gI(new Double("0"));
    defProperty("a1o",new Hproperty<Double>());
    setA1o(new Double("0"));
    defProperty("a1oS",new Hproperty<Double>());
    setA1oS(new Double("0"));
    defProperty("a1oE",new Hproperty<Double>());
    setA1oE(new Double("0"));
    defProperty("a1oI",new Hproperty<Double>());
    setA1oI(new Double("0"));
    defProperty("a2h",new Hproperty<Double>());
    setA2h(new Double("0"));
    defProperty("a2hS",new Hproperty<Double>());
    setA2hS(new Double("0"));
    defProperty("a2hE",new Hproperty<Double>());
    setA2hE(new Double("0"));
    defProperty("a2hI",new Hproperty<Double>());
    setA2hI(new Double("0"));
    defProperty("a2g",new Hproperty<Double>());
    setA2g(new Double("0"));
    defProperty("a2gS",new Hproperty<Double>());
    setA2gS(new Double("0"));
    defProperty("a2gE",new Hproperty<Double>());
    setA2gE(new Double("0"));
    defProperty("a2gI",new Hproperty<Double>());
    setA2gI(new Double("0"));
    defProperty("a2o",new Hproperty<Double>());
    setA2o(new Double("0"));
    defProperty("a2oS",new Hproperty<Double>());
    setA2oS(new Double("0"));
    defProperty("a2oE",new Hproperty<Double>());
    setA2oE(new Double("0"));
    defProperty("a2oI",new Hproperty<Double>());
    setA2oI(new Double("0"));
    defProperty("ah",new Hproperty<Double>());
    setAh(new Double("0"));
    defProperty("atot",new Hproperty<Double>());
    setAtot(new Double("0"));
    defProperty("fegg",new Hproperty<Double>());
    setFegg(new Double("0"));
    defProperty("flarvae",new Hproperty<Double>());
    setFlarvae(new Double("0"));
    defProperty("fpupae",new Hproperty<Double>());
    setFpupae(new Double("0"));
    defProperty("fag",new Hproperty<Double>());
    setFag(new Double("0"));
    defProperty("fao",new Hproperty<Double>());
    setFao(new Double("0"));
    defProperty("fSE",new Hproperty<Double>());
    setFSE(new Double("0"));
    defProperty("fEI",new Hproperty<Double>());
    setFEI(new Double("0"));
    defProperty("fme",new Hproperty<Double>());
    setFme(new Double("0"));
    defProperty("fml",new Hproperty<Double>());
    setFml(new Double("0"));
    defProperty("fmp",new Hproperty<Double>());
    setFmp(new Double("0"));
    defProperty("fma",new Hproperty<Double>());
    setFma(new Double("0"));
    defProperty("fmaE",new Hproperty<Double>());
    setFmaE(new Double("0"));
    defProperty("fmaI",new Hproperty<Double>());
    setFmaI(new Double("0"));
    defProperty("fmurma",new Hproperty<Double>());
    setFmurma(new Double("0"));
    defProperty("fmurmaE",new Hproperty<Double>());
    setFmurmaE(new Double("0"));
    defProperty("fmurmaI",new Hproperty<Double>());
    setFmurmaI(new Double("0"));
    defProperty("fkl",new Hproperty<Double>());
    setFkl(new Double("0"));
    defProperty("fkp",new Hproperty<Double>());
    setFkp(new Double("0"));
    defProperty("comp_vect",new Hproperty<Double>());
    setComp_vect(new Double("0"));
    defProperty("incub_extr",new Hproperty<Double>());
    setIncub_extr(new Double("0"));
    defProperty("classR0",new Hproperty<Integer>());
    setClassR0(new Integer("0"));
    defProperty("larvae2",new Hproperty<Double>());
    setLarvae2(new Double("0"));
    defProperty("temperature",new Hproperty<Double>());
    setTemperature(new Double("0"));
    defProperty("rain",new Hproperty<Double>());
    setRain(new Double("0"));
    defProperty("rain7",new Hproperty<Double>());
    setRain7(new Double("0"));
    defProperty("raincumul7",new Hproperty<Double>());
    setRaincumul7(new Double("0"));
    defProperty("rainday7",new Hproperty<Integer>());
    setRainday7(new Integer("0"));
    defProperty("raincumul35",new Hproperty<Double>());
    setRaincumul35(new Double("0"));
    defProperty("rrlogcumul35",new Hproperty<String>());
    setRrlogcumul35(new String());
    defProperty("tnmoy42",new Hproperty<String>());
    setTnmoy42(new String());
    defProperty("rain35",new Hproperty<Double>());
    setRain35(new Double("0"));
    defProperty("tn42",new Hproperty<Double>());
    setTn42(new Double("0"));
    defProperty("tmincumul42",new Hproperty<Double>());
    setTmincumul42(new Double("0"));
    defProperty("tmin",new Hproperty<Double>());
    setTmin(new Double("0"));
    defProperty("tmax",new Hproperty<Double>());
    setTmax(new Double("0"));
  }
}
