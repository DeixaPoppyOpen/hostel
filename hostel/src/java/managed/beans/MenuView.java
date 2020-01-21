package managed.beans;


import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.*;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.MenuModel;




@Named("menuview")
@RequestScoped

public class MenuView {
 
    private MenuModel model;
 
    @PostConstruct
    public void init() {
        model = new DefaultMenuModel();
    }
 
    public MenuModel getModel() {
        return model;
    }
}
