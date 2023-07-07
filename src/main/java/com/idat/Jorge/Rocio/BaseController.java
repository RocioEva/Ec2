package com.idat.Jorge.Rocio;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @RequestMapping("/")
    public ResponseEntity<Object> index() {
        UserInfo userInfo = new UserInfo();
        userInfo.setCodigo("SL10129147");
        userInfo.setNombre("Jorge Montalvo Rocio Eva");
        return ResponseEntity.ok().body(userInfo);
    }

    @RequestMapping("/idat/codigo")
    public ResponseEntity<Object> code() {
        UserInfo userInfo = new UserInfo();
        userInfo.setCodigo("SL10129147");
        return ResponseEntity.ok().body(userInfo);
    }

    @RequestMapping("/idat/nombre-completo")
    public ResponseEntity<Object> name() {
        UserInfo userInfo = new UserInfo();
        userInfo.setCodigo("SL10129147");
        userInfo.setNombre("Jorge Montalvo Rocio Eva");
        return ResponseEntity.ok().body(userInfo);
    }
}

class UserInfo {
    private String codigo;
    private String nombre;



    public UserInfo() {
    }

    public UserInfo(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
