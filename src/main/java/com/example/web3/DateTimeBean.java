package com.example.web3;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@ManagedBean(name = "datetime", eager = true)
@ApplicationScoped
public class DateTimeBean implements Serializable {
        public String getDateTime() {
            return Instant.now().atZone(ZoneId.of("Europe/Moscow")).format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        }
}
