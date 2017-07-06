package fr.ocelet.model.alborun;

import com.google.common.base.Objects;
import fr.ocelet.model.alborun.CsvData;
import fr.ocelet.model.alborun.CsvModel;
import fr.ocelet.model.alborun.DataStation;
import fr.ocelet.model.alborun.KmlOut;
import fr.ocelet.model.alborun.LocStation;
import fr.ocelet.model.alborun.Parcelle;
import fr.ocelet.model.alborun.Shp;
import fr.ocelet.model.alborun.ShpOut1Date;
import fr.ocelet.model.alborun.ShpOutAllDates;
import fr.ocelet.model.alborun.ShpStation;
import fr.ocelet.model.alborun.TableModel;
import fr.ocelet.runtime.Miscutils;
import fr.ocelet.runtime.TextFileWriter;
import fr.ocelet.runtime.geom.ocltypes.MultiPolygon;
import fr.ocelet.runtime.geom.ocltypes.Point;
import fr.ocelet.runtime.model.AbstractModel;
import fr.ocelet.runtime.model.Parameter;
import fr.ocelet.runtime.model.ParameterImpl;
import fr.ocelet.runtime.model.SimulationListener;
import fr.ocelet.runtime.ocltypes.Color;
import fr.ocelet.runtime.ocltypes.Date;
import fr.ocelet.runtime.ocltypes.KeyMap;
import fr.ocelet.runtime.ocltypes.List;
import java.io.File;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.InputOutput;

/**
 * Définition des paramètres à fournir au modèle
 * Chaque paramètre défini ici est vu comme une variable
 * pré-initialisée dans le scénario principal.
 * 
 * Si le programme qui pilote notre modèle a fournit des valeurs
 * elle ont été placées dans ces variables. Sinon ce sont les valeurs
 * par défaut qui sont présentes.
 */
@SuppressWarnings("all")
public class ALBORUN extends AbstractModel {
  public ALBORUN() {
    super("ALBORUN");
    Parameter<String> par_region = new ParameterImpl<String>("region","",true,"REUNION",null);
    addParameter(par_region);
    region = "REUNION";
    Parameter<Boolean> par_replaceMeteoFiles = new ParameterImpl<Boolean>("replaceMeteoFiles","",true,false,null);
    addParameter(par_replaceMeteoFiles);
    replaceMeteoFiles = false;
    Parameter<String> par_inputDirNew = new ParameterImpl<String>("inputDirNew","",true,"data/ENTREES",null);
    addParameter(par_inputDirNew);
    inputDirNew = "data/ENTREES";
    Parameter<String> par_inputDirWork = new ParameterImpl<String>("inputDirWork","",true,"data/TRAVAIL",null);
    addParameter(par_inputDirWork);
    inputDirWork = "data/TRAVAIL";
    Parameter<String> par_date_debut = new ParameterImpl<String>("date_debut","",true,"01/01/2011",null);
    addParameter(par_date_debut);
    date_debut = "01/01/2011";
    Parameter<String> par_date_fin = new ParameterImpl<String>("date_fin","",true,"31/12/2014",null);
    addParameter(par_date_fin);
    date_fin = "31/12/2014";
    Parameter<Boolean> par_outputAllDates = new ParameterImpl<Boolean>("outputAllDates","",true,true,null);
    addParameter(par_outputAllDates);
    outputAllDates = true;
    Parameter<Boolean> par_outputLastDate = new ParameterImpl<Boolean>("outputLastDate","",true,true,null);
    addParameter(par_outputLastDate);
    outputLastDate = true;
    Parameter<Boolean> par_exportSHP = new ParameterImpl<Boolean>("exportSHP","",true,false,null);
    addParameter(par_exportSHP);
    exportSHP = false;
    Parameter<String> par_outputDir = new ParameterImpl<String>("outputDir","",true,"output",null);
    addParameter(par_outputDir);
    outputDir = "output";
    Parameter<Boolean> par_exportKML = new ParameterImpl<Boolean>("exportKML","",true,false,null);
    addParameter(par_exportKML);
    exportKML = false;
  }
  
  public static void main(final String[] args) {
    ALBORUN model_ALBORUN = new ALBORUN();
    model_ALBORUN.run_ALBORUN();
  }
  
  public void run_ALBORUN() {
    InputOutput.<String>println("Model ALBORUN ready to run");
    Date debutCalcul = new Date();
    final int frequencedisplay = 1;
    final double dt = 0.1;
    Date bdateuser = Date.fromString("dd/MM/yyyy", this.date_debut);
    Date edateuser = Date.fromString("dd/MM/yyyy", this.date_fin);
    InputOutput.<String>println("Lecture datafacers...");
    Shp shp = new Shp();
    String nomDeFichier = (this.inputDirWork + "/SHAPEFILE/ALIZES/Export_Output_Test.shp");
    shp.setFileName(nomDeFichier);
    ShpStation shpStation = new ShpStation();
    nomDeFichier = (this.inputDirWork + "/SHAPEFILE/STATIONS/Stations_meteo.shp");
    shpStation.setFileName(nomDeFichier);
    CsvData csvData = new CsvData();
    nomDeFichier = (this.inputDirWork + "/CSVDATA/METEO/97401540.csv");
    csvData.setFileName(nomDeFichier);
    CsvModel csvModel = new CsvModel();
    nomDeFichier = (this.inputDirWork + "/CSVDATA/MODELE/Reunion_modele_complet_res.csv");
    csvModel.setFileName(nomDeFichier);
    CsvData csvDataNew = new CsvData();
    nomDeFichier = (this.inputDirNew + "/97401540.csv");
    csvDataNew.setFileName(nomDeFichier);
    CsvData csvDataOut = new CsvData();
    nomDeFichier = (this.outputDir + "/historique_simulations.csv");
    csvDataOut.setFileName(nomDeFichier);
    KmlOut kmlout = new KmlOut();
    nomDeFichier = (((this.outputDir + "/") + this.region) + "_serietemporelle.kml");
    kmlout.setFileName(nomDeFichier);
    ShpOutAllDates shpout = new ShpOutAllDates();
    ShpOut1Date shpout2 = new ShpOut1Date();
    InputOutput.<String>println("Datafacers lus...");
    List<Parcelle> lparceltot = shp.readAllParcelle();
    InputOutput.<List<Parcelle>>println(lparceltot);
    InputOutput.<String>println("lparceltot instanci\u00E9e...");
    List<Parcelle> lparcel = new List<Parcelle>();
    boolean _notEquals = (!Objects.equal(this.region, "REUNION"));
    if (_notEquals) {
      for (final Parcelle parc : lparceltot) {
        String _arrond = parc.getArrond();
        boolean _equals = Objects.equal(_arrond, this.region);
        if (_equals) {
          lparcel.add(parc);
        }
      }
    } else {
      lparcel = lparceltot;
    }
    InputOutput.<String>println("lparcel instanci\u00E9e...");
    List<LocStation> lstation = shpStation.readAllLocStation();
    final KeyMap<Integer, List<DataStation>> allMeteoData = new KeyMap<Integer, List<DataStation>>();
    int i = 0;
    for (final LocStation s : lstation) {
      {
        Long _numero = s.getNumero();
        String _plus = ((this.inputDirWork + "/CSVDATA/METEO/") + _numero);
        String nomDeFichierCsv = (_plus + ".csv");
        csvData.setFileName(nomDeFichierCsv);
        if (((this.replaceMeteoFiles).booleanValue() == true)) {
          Long _numero_1 = s.getNumero();
          String _plus_1 = ((this.inputDirNew + "/") + _numero_1);
          String nomDeFichierCsvNew = (_plus_1 + ".csv");
          csvDataNew.setFileName(nomDeFichierCsvNew);
          List<DataStation> DataMeteoNew = csvDataNew.readAll();
          for (final DataStation j : DataMeteoNew) {
            {
              Integer _numero_2 = j.getNumero();
              String ligneDeTexte = _numero_2.toString();
              String _dateTXT = j.getDateTXT();
              String _plus_2 = (";" + _dateTXT);
              String _plus_3 = (_plus_2 + ";");
              Double _rainMM = j.getRainMM();
              String _string = _rainMM.toString();
              String _plus_4 = (_plus_3 + _string);
              String _plus_5 = (_plus_4 + ";");
              Double _tempMin = j.getTempMin();
              String _string_1 = _tempMin.toString();
              String _plus_6 = (_plus_5 + _string_1);
              String _plus_7 = (_plus_6 + ";");
              Double _tempMax = j.getTempMax();
              String _string_2 = _tempMax.toString();
              String _plus_8 = (_plus_7 + _string_2);
              String _concat = ligneDeTexte.concat(_plus_8);
              ligneDeTexte = _concat;
              TextFileWriter.printToFile(nomDeFichierCsv, ligneDeTexte);
            }
          }
        }
        List<DataStation> DataMeteo = csvData.readAll();
        allMeteoData.put(Integer.valueOf(i), DataMeteo);
        i = (i + 1);
      }
    }
    List<TableModel> tableModel = csvModel.readAll();
    List<Color> plt = this.colorRange(6, "gyr");
    kmlout.defStyleRange("R0_", Double.valueOf(1.0), plt, Double.valueOf((-0.2)));
    List<DataStation> _get = allMeteoData.get(Integer.valueOf(0));
    DataStation _get_1 = _get.get(0);
    String _dateTXT = _get_1.getDateTXT();
    final Date bdate = Date.fromString("yyyy-MM-dd", _dateTXT);
    List<DataStation> _get_2 = allMeteoData.get(Integer.valueOf(0));
    DataStation _get_3 = _get_2.get(0);
    String _dateTXT_1 = _get_3.getDateTXT();
    Date bdate1 = Date.fromString("yyyy-MM-dd", _dateTXT_1);
    bdate1.addYears(1);
    boolean _isBefore = bdateuser.isBefore(bdate1);
    boolean _equals_1 = (_isBefore == true);
    if (_equals_1) {
      bdateuser = bdate1;
    }
    List<DataStation> _get_4 = allMeteoData.get(Integer.valueOf(0));
    DataStation _get_5 = _get_4.get(0);
    String _dateTXT_2 = _get_5.getDateTXT();
    Date edate = Date.fromString("yyyy-MM-dd", _dateTXT_2);
    List<DataStation> _get_6 = allMeteoData.get(Integer.valueOf(0));
    int _size = _get_6.size();
    int _minus = (_size - 1);
    edate.addDays(_minus);
    boolean _isAfter = edateuser.isAfter(edate);
    boolean _equals_2 = (_isAfter == true);
    if (_equals_2) {
      edateuser = edate;
    }
    int _year = bdateuser.getYear();
    String _plus = ((((this.outputDir + "/") + this.region) + "_") + Integer.valueOf(_year));
    int _month = bdateuser.getMonth();
    String _format = Miscutils.format(Integer.valueOf(_month), "00");
    String _plus_1 = (_plus + _format);
    int _dayOfMonth = bdateuser.getDayOfMonth();
    String _format_1 = Miscutils.format(Integer.valueOf(_dayOfMonth), "00");
    String _plus_2 = (_plus_1 + _format_1);
    String _plus_3 = (_plus_2 + "_");
    int _year_1 = edateuser.getYear();
    String _plus_4 = (_plus_3 + Integer.valueOf(_year_1));
    int _month_1 = edateuser.getMonth();
    String _format_2 = Miscutils.format(Integer.valueOf(_month_1), "00");
    String _plus_5 = (_plus_4 + _format_2);
    int _dayOfMonth_1 = edateuser.getDayOfMonth();
    String _format_3 = Miscutils.format(Integer.valueOf(_dayOfMonth_1), "00");
    String _plus_6 = (_plus_5 + _format_3);
    String nomDeFichierShpAll = (_plus_6 + ".shp");
    shpout.setFileName(nomDeFichierShpAll);
    if (((this.outputAllDates).booleanValue() == true)) {
      shpout.remove();
    }
    int _year_2 = edateuser.getYear();
    String _plus_7 = ((((this.outputDir + "/") + this.region) + "_") + Integer.valueOf(_year_2));
    int _month_2 = edateuser.getMonth();
    String _format_4 = Miscutils.format(Integer.valueOf(_month_2), "00");
    String _plus_8 = (_plus_7 + _format_4);
    int _dayOfMonth_2 = edateuser.getDayOfMonth();
    String _format_5 = Miscutils.format(Integer.valueOf(_dayOfMonth_2), "00");
    String _plus_9 = (_plus_8 + _format_5);
    String nomDeFichierShp1Date = (_plus_9 + ".shp");
    shpout2.setFileName(nomDeFichierShp1Date);
    if (((this.outputLastDate).booleanValue() == true)) {
      shpout2.remove();
    }
    Date now = bdate.clone();
    double test_display = 0.0;
    Date fin = now.clone();
    for (final Parcelle parc_1 : lparcel) {
      {
        parc_1.setEgg(Double.valueOf(1000.0));
        parc_1.setLarvae(Double.valueOf(0.0));
        parc_1.setPupae(Double.valueOf(0.0));
        parc_1.setAem(Double.valueOf(0.0));
        parc_1.setA1h(Double.valueOf(0.0));
        parc_1.setA1g(Double.valueOf(0.0));
        parc_1.setA1gS(Double.valueOf(0.0));
        parc_1.setA1gE(Double.valueOf(0.0));
        parc_1.setA1gI(Double.valueOf(0.0));
        parc_1.setA1o(Double.valueOf(0.0));
        parc_1.setA1oS(Double.valueOf(0.0));
        parc_1.setA1oE(Double.valueOf(0.0));
        parc_1.setA1oI(Double.valueOf(0.0));
        parc_1.setA2h(Double.valueOf(0.0));
        parc_1.setA2hS(Double.valueOf(0.0));
        parc_1.setA2hE(Double.valueOf(0.0));
        parc_1.setA2hI(Double.valueOf(0.0));
        parc_1.setA2g(Double.valueOf(0.0));
        parc_1.setA2gS(Double.valueOf(0.0));
        parc_1.setA2gE(Double.valueOf(0.0));
        parc_1.setA2gI(Double.valueOf(0.0));
        parc_1.setA2o(Double.valueOf(0.0));
        parc_1.setA2oS(Double.valueOf(0.0));
        parc_1.setA2oE(Double.valueOf(0.0));
        parc_1.setA2oI(Double.valueOf(0.0));
        Double _pop = parc_1.getPop();
        parc_1.setPopS(_pop);
        parc_1.setPopE(Double.valueOf(0.0));
        parc_1.setPopI(Double.valueOf(0.0));
        parc_1.setPopR(Double.valueOf(0.0));
        parc_1.setRain7(Double.valueOf(0.0));
        parc_1.setRaincumul7(Double.valueOf(0.0));
        parc_1.setRainday7(Integer.valueOf(0));
        parc_1.setRaincumul35(Double.valueOf(0.0));
        parc_1.setDist_station(Double.valueOf(1000000.0));
        i = 0;
        for (final LocStation s_1 : lstation) {
          {
            MultiPolygon _geom = parc_1.getGeom();
            Point _geom_1 = s_1.getGeom();
            double dist = _geom.distance(_geom_1);
            Double _dist_station = parc_1.getDist_station();
            boolean _lessThan = (dist < (_dist_station).doubleValue());
            if (_lessThan) {
              parc_1.setDist_station(Double.valueOf(dist));
              Long _numero = s_1.getNumero();
              parc_1.setNum_station(_numero);
              parc_1.setId_station(Integer.valueOf(i));
            }
            i = (i + 1);
          }
        }
      }
    }
    this.printOut(("R\u00E9gion : " + this.region));
    this.printOut(("D\u00E9but de simulation : " + this.date_debut));
    this.printOut(("Fin de simulation : " + this.date_fin));
    this.printOut(("Dossier de donn\u00E9es : " + this.inputDirWork));
    if (((this.replaceMeteoFiles).booleanValue() == true)) {
      this.printOut(("Dossier de mise \u00E0 jour : " + this.inputDirNew));
    }
    this.printOut(("Dossier de r\u00E9sultats : " + this.outputDir));
    this.printOut("Simulation ... ");
    int day = 0;
    while ((now.isBefore(edateuser.addDays(1)) == true)) {
      {
        String _string = now.toString("dd/MM/yyyy");
        String _plus_10 = ("date en cours : " + _string);
        this.printOut(_plus_10);
        edateuser.addDays((-1));
        boolean _isAfter_1 = now.isAfter(bdateuser);
        boolean _equals_3 = (_isAfter_1 == true);
        if (_equals_3) {
          double _IEEEremainder = Math.IEEEremainder(day, frequencedisplay);
          test_display = _IEEEremainder;
          Date _clone = now.clone();
          fin = _clone;
          fin.addDays(frequencedisplay);
        }
        int j = 0;
        for (final Parcelle p : lparcel) {
          {
            Integer _id_station = p.getId_station();
            i = (_id_station).intValue();
            if ((day == 1173)) {
              Double _popS = p.getPopS();
              double _minus_1 = ((_popS).doubleValue() - 1);
              p.setPopS(Double.valueOf(_minus_1));
              Double _popI = p.getPopI();
              double _plus_11 = ((_popI).doubleValue() + 1);
              p.setPopI(Double.valueOf(_plus_11));
            }
            List<DataStation> _get_7 = allMeteoData.get(Integer.valueOf(i));
            DataStation _get_8 = _get_7.get(day);
            Double _tempMin = _get_8.getTempMin();
            p.setTmin(_tempMin);
            List<DataStation> _get_9 = allMeteoData.get(Integer.valueOf(i));
            DataStation _get_10 = _get_9.get(day);
            Double _tempMax = _get_10.getTempMax();
            p.setTmax(_tempMax);
            if ((day >= 42)) {
              List<DataStation> _get_11 = allMeteoData.get(Integer.valueOf(i));
              DataStation _get_12 = _get_11.get((day - 42));
              Double _tempMin_1 = _get_12.getTempMin();
              p.setTn42(_tempMin_1);
            }
            List<DataStation> _get_13 = allMeteoData.get(Integer.valueOf(i));
            DataStation _get_14 = _get_13.get(day);
            Double _rainMM = _get_14.getRainMM();
            p.setRain(_rainMM);
            if ((day >= 7)) {
              List<DataStation> _get_15 = allMeteoData.get(Integer.valueOf(i));
              DataStation _get_16 = _get_15.get((day - 7));
              Double _rainMM_1 = _get_16.getRainMM();
              p.setRain7(_rainMM_1);
            }
            if ((day >= 35)) {
              List<DataStation> _get_17 = allMeteoData.get(Integer.valueOf(i));
              DataStation _get_18 = _get_17.get((day - 35));
              Double _rainMM_2 = _get_18.getRainMM();
              p.setRain35(_rainMM_2);
            }
            p.updateVariablesRain();
            p.updateVariablesTemp();
            p.calculAh();
            Double _temperature = p.getTemperature();
            Double _rain = p.getRain();
            p.updateFunctions(_temperature, _rain);
            p.dynpop(Double.valueOf(dt));
            Double _fao = p.getFao();
            String _plus_12 = ("fao : " + _fao);
            InputOutput.<String>println(_plus_12);
            Double _a2oI = p.getA2oI();
            boolean _lessThan = ((_a2oI).doubleValue() < 0);
            if (_lessThan) {
              p.setA2oI(Double.valueOf(0.0));
            }
            boolean _or = false;
            if (((this.outputAllDates).booleanValue() == true)) {
              _or = true;
            } else {
              boolean _and = false;
              boolean _isAfter_2 = now.isAfter(edateuser);
              boolean _equals_4 = (_isAfter_2 == false);
              if (!_equals_4) {
                _and = false;
              } else {
                boolean _isBefore_1 = now.isBefore(edateuser);
                boolean _equals_5 = (_isBefore_1 == false);
                _and = _equals_5;
              }
              _or = _and;
            }
            if (_or) {
              p.calculModel2(tableModel);
            }
            if (((this.exportKML).booleanValue() == true)) {
              p.classify();
            }
            boolean _isAfter_3 = now.isAfter(bdateuser);
            boolean _equals_6 = (_isAfter_3 == true);
            if (_equals_6) {
              if ((test_display == 0)) {
                if (((this.exportKML).booleanValue() == true)) {
                  p.outputKml(Integer.valueOf(day), now, Integer.valueOf(frequencedisplay), kmlout);
                }
                String _string_1 = now.toString("yyyy-MM-dd");
                p.setDate_begin(_string_1);
                String _string_2 = fin.toString("yyyy-MM-dd");
                p.setDate_end(_string_2);
              }
            }
            j = (j + 1);
          }
        }
        Parcelle _get_7 = lparcel.get(0);
        Double _popI = _get_7.getPopI();
        InputOutput.<Double>println(_popI);
        boolean _isAfter_2 = now.isAfter(bdateuser);
        boolean _equals_4 = (_isAfter_2 == true);
        if (_equals_4) {
          if ((test_display == 0)) {
            if (((this.outputAllDates).booleanValue() == true)) {
              shpout.append(lparcel);
            }
          }
        }
        day = (day + 1);
        now.addDays(1);
      }
    }
    InputOutput.<String>println(".");
    InputOutput.<String>println("Saving kml file...");
    kmlout.saveAsKml();
    if (((this.outputLastDate).booleanValue() == true)) {
      shpout2.append(lparcel);
    }
    this.writeOutputTXT(bdate, csvDataOut, nomDeFichierShpAll, nomDeFichierShp1Date);
    this.printOut((("Dur\u00E9e totale de simulation : " + Integer.valueOf(day)) + " jours"));
    if (((this.outputLastDate).booleanValue() == true)) {
      this.printOut(("Fichier de sortie (une date) : " + nomDeFichierShp1Date));
    }
    if (((this.outputAllDates).booleanValue() == true)) {
      this.printOut(("Fichier de sortie (multidate) : " + nomDeFichierShpAll));
    }
    this.printOut("Simulation termin\u00E9e :-) \n");
    Date finCalcul = new Date();
    long _timeAsMilliseconds = finCalcul.getTimeAsMilliseconds();
    long _timeAsMilliseconds_1 = debutCalcul.getTimeAsMilliseconds();
    long duree_ms = (_timeAsMilliseconds - _timeAsMilliseconds_1);
  }
  
  public void simulate(final HashMap<String, Object> in_params) {
    String val_region = (String) in_params.get("region");
    if (val_region != null) region = val_region;
    Boolean val_replaceMeteoFiles = (Boolean) in_params.get("replaceMeteoFiles");
    if (val_replaceMeteoFiles != null) replaceMeteoFiles = val_replaceMeteoFiles;
    String val_inputDirNew = (String) in_params.get("inputDirNew");
    if (val_inputDirNew != null) inputDirNew = val_inputDirNew;
    String val_inputDirWork = (String) in_params.get("inputDirWork");
    if (val_inputDirWork != null) inputDirWork = val_inputDirWork;
    String val_date_debut = (String) in_params.get("date_debut");
    if (val_date_debut != null) date_debut = val_date_debut;
    String val_date_fin = (String) in_params.get("date_fin");
    if (val_date_fin != null) date_fin = val_date_fin;
    Boolean val_outputAllDates = (Boolean) in_params.get("outputAllDates");
    if (val_outputAllDates != null) outputAllDates = val_outputAllDates;
    Boolean val_outputLastDate = (Boolean) in_params.get("outputLastDate");
    if (val_outputLastDate != null) outputLastDate = val_outputLastDate;
    Boolean val_exportSHP = (Boolean) in_params.get("exportSHP");
    if (val_exportSHP != null) exportSHP = val_exportSHP;
    String val_outputDir = (String) in_params.get("outputDir");
    if (val_outputDir != null) outputDir = val_outputDir;
    Boolean val_exportKML = (Boolean) in_params.get("exportKML");
    if (val_exportKML != null) exportKML = val_exportKML;
    run_ALBORUN();
  }
  
  public void writeOutputTXT(final Date bdate, final CsvData csvDataOut, final String nomDeFichierShpAll, final String nomDeFichierShp1Date) {
    Date now = new Date();
    String _string = now.toString("YYYYMMddHHmmss");
    String _plus = ((this.outputDir + "/") + _string);
    String nomDeFichierCsvOut = (_plus + ".txt");
    this.printOut(("Fichier param\u00E8tres de la simulation : " + nomDeFichierCsvOut));
    csvDataOut.setFileName(nomDeFichierCsvOut);
    String _string_1 = now.toString();
    String texte = ("Date/heure de la simulation : " + _string_1);
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    texte = " ";
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    texte = "Parametres";
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    String _string_2 = this.date_debut.toString();
    String _plus_1 = ("Date debut : " + _string_2);
    texte = _plus_1;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    String _string_3 = this.date_fin.toString();
    String _plus_2 = ("Date fin : " + _string_3);
    texte = _plus_2;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    File f = new File(this.inputDirNew);
    String _absolutePath = f.getAbsolutePath();
    String _plus_3 = ("Dossier Entrees : " + _absolutePath);
    texte = _plus_3;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    File _file = new File(this.inputDirWork);
    f = _file;
    String _absolutePath_1 = f.getAbsolutePath();
    String _plus_4 = ("Dossier Travail : " + _absolutePath_1);
    texte = _plus_4;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    File _file_1 = new File(this.outputDir);
    f = _file_1;
    String _absolutePath_2 = f.getAbsolutePath();
    String _plus_5 = ("Dossier Sorties : " + _absolutePath_2);
    texte = _plus_5;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    String _string_4 = this.outputAllDates.toString();
    String _plus_6 = ("Sortie toutes les dates : " + _string_4);
    texte = _plus_6;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    String _string_5 = this.outputLastDate.toString();
    String _plus_7 = ("Sortie derniere date : " + _string_5);
    texte = _plus_7;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    String _string_6 = this.replaceMeteoFiles.toString();
    String _plus_8 = ("Remplacement des fichiers avec les donnees Meteo : " + _string_6);
    texte = _plus_8;
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    texte = ("Region : " + this.region);
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    texte = " ";
    TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    if (((((this.outputAllDates).booleanValue() == true) || ((this.outputLastDate).booleanValue() == true)) || ((this.exportKML).booleanValue() == true))) {
      texte = "Fichiers en sortie";
      TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    }
    if (((this.outputAllDates).booleanValue() == true)) {
      texte = nomDeFichierShpAll;
      TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    }
    if (((this.outputLastDate).booleanValue() == true)) {
      texte = nomDeFichierShp1Date;
      TextFileWriter.printToFile(nomDeFichierCsvOut, texte);
    }
  }
  
  public void printOut(final String msg) {
    InputOutput.<String>println(("-->  " + msg));
    for (final SimulationListener sl : this.simlisteners) {
      sl.consoleEvent((msg + "\n"));
    }
  }
  
  private String region;
  
  public void setRegion(final String region) {
    this.region = region;
  }
  
  public String getRegion() {
    return this.region;
  }
  
  private Boolean replaceMeteoFiles;
  
  public void setReplaceMeteoFiles(final Boolean replaceMeteoFiles) {
    this.replaceMeteoFiles = replaceMeteoFiles;
  }
  
  public Boolean getReplaceMeteoFiles() {
    return this.replaceMeteoFiles;
  }
  
  private String inputDirNew;
  
  public void setInputDirNew(final String inputDirNew) {
    this.inputDirNew = inputDirNew;
  }
  
  public String getInputDirNew() {
    return this.inputDirNew;
  }
  
  private String inputDirWork;
  
  public void setInputDirWork(final String inputDirWork) {
    this.inputDirWork = inputDirWork;
  }
  
  public String getInputDirWork() {
    return this.inputDirWork;
  }
  
  private String date_debut;
  
  public void setDate_debut(final String date_debut) {
    this.date_debut = date_debut;
  }
  
  public String getDate_debut() {
    return this.date_debut;
  }
  
  private String date_fin;
  
  public void setDate_fin(final String date_fin) {
    this.date_fin = date_fin;
  }
  
  public String getDate_fin() {
    return this.date_fin;
  }
  
  private Boolean outputAllDates;
  
  public void setOutputAllDates(final Boolean outputAllDates) {
    this.outputAllDates = outputAllDates;
  }
  
  public Boolean getOutputAllDates() {
    return this.outputAllDates;
  }
  
  private Boolean outputLastDate;
  
  public void setOutputLastDate(final Boolean outputLastDate) {
    this.outputLastDate = outputLastDate;
  }
  
  public Boolean getOutputLastDate() {
    return this.outputLastDate;
  }
  
  private Boolean exportSHP;
  
  public void setExportSHP(final Boolean exportSHP) {
    this.exportSHP = exportSHP;
  }
  
  public Boolean getExportSHP() {
    return this.exportSHP;
  }
  
  private String outputDir;
  
  public void setOutputDir(final String outputDir) {
    this.outputDir = outputDir;
  }
  
  public String getOutputDir() {
    return this.outputDir;
  }
  
  private Boolean exportKML;
  
  public void setExportKML(final Boolean exportKML) {
    this.exportKML = exportKML;
  }
  
  public Boolean getExportKML() {
    return this.exportKML;
  }
}
