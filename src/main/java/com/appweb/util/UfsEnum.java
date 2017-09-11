package com.appweb.util;

public enum UfsEnum {

	AC("Acre"),  
    AL("Alagoas"),  
    AM("Amazonas"),  
    AP("Amap�"),  
    BA("Bahia"),  
    CE("Cear�"),  
    DF("Distrito Federal"),  
    ES("Espirito Santo"),  
    GO("Goias"),  
    MA("Maranh�o"),  
    MG("Minas Gerais"),  
    MS("Mato Grosso do Sul"),  
    MT("Mato Grosso"),  
    PA("Par�"),  
    PB("Paraiba"),  
    PE("Pernanbuco"),  
    PI("Piaui"),  
    PR("Parana"),  
    RJ("Rio de Janeiro"),  
    RN("Rio Grande do Norte"),  
    RO("Rond�nia"),  
    RR("Roraima"),  
    RS("Rio Grande do Sul"),  
    SC("Santa Catarina"),  
    SE("Sergipe"),  
    SP("S�o Paulo"),  
    TO("Tocantins");
	
    private String estado;  
    
    UfsEnum(String estado) {      	
        this.estado = estado;         
    }  
    
    public String getEstado() {  
        return estado;  
    }  
    
    @Override  
    public String toString() {  
        return estado;  
    }  
}
	

