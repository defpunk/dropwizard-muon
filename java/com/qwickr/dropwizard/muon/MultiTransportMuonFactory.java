package com.qwickr.dropwizard.muon; 

import com.fasterxml.jackson.annotation.JsonProperty;
import io.muoncore.MultiTransportMuon;
import java.util.List;

public class MultiTransportMuonFactory {
    
   private String connectionUrl;
   private String serviceName;
   private List<String> tags;


 @JsonProperty
    public String getConnectionUrl() {
        return connectionUrl;
    }

 @JsonProperty
    public void setConnectionUrl(String url) {
        this.connectionUrl = url;
    }

 @JsonProperty
     public String getServiceName() {
        return serviceName;
    }

 @JsonProperty
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

 @JsonProperty
   public List<String> getTags(){
	return this.tags;
   }

 @JsonProperty
   public void setTags(List<String> tags){
   	this.tags = tags;
   }
   
}
