
import Controller.Controller;
import Model.Model;
import View.ViewAbout;
import View.ViewEdit;
import View.ViewPinjam;
import View.ViewTampil;
import View.Viewlogin;
import View.ViewTampilanAwal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class MVC {
 // MODEL
    Model model = new Model ();
 //VIEW
    Viewlogin viewlogin = new Viewlogin ();
    ViewTampilanAwal viewtampilanawal = new ViewTampilanAwal();
    ViewPinjam viewpinjam = new ViewPinjam();
    ViewTampil viewtampil = new ViewTampil ();
    ViewAbout viewabout = new ViewAbout();
    ViewEdit viewedit = new ViewEdit();
 //CONTROLLER
    Controller controller = new Controller(model,viewlogin,viewtampilanawal,viewpinjam,viewtampil,viewabout,viewedit);
}
