

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GF63-024
 */
public class mvc {
//       ViewForm form = new ViewForm();
    
       ViewData view = new ViewData();
       Model model = new Model();
       ViewForm form = new ViewForm();
       ViewUpdate update = new ViewUpdate();
       Controller controller = new Controller(model,view,form,update);
       
}
