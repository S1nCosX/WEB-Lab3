package com.example.web3;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name="navigate", eager=true)
@ApplicationScoped
public class NavigationBean implements Serializable {
    public String processPage() {
        return "success";
    }
}
