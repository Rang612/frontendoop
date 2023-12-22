package com.example.backend.CrawlData.NftFloor.OpenSea;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class OpenSeaNft {
  private final SimpleStringProperty numOfSales;
   private final SimpleStringProperty floorPrice;
   private final SimpleStringProperty volume;
   private final SimpleStringProperty numOwners;
   private final SimpleStringProperty volumeChange;
   private final SimpleStringProperty totalSupply;
   private final SimpleStringProperty name;
   private final SimpleStringProperty id;
   private final SimpleStringProperty url;

   public OpenSeaNft(String numOfSales, String floorPrice,String volume,String numOwners,String volumeChange, String totalSupply,String name,String id, String url){
       super();
       this.id = new SimpleStringProperty(id);
       this.url=new SimpleStringProperty(url);
       this.name=new SimpleStringProperty(name);
       this.numOwners=new SimpleStringProperty(numOwners);
       this.totalSupply=new SimpleStringProperty(totalSupply);
       this.numOfSales=new SimpleStringProperty(numOfSales);
       this.floorPrice=new SimpleStringProperty(floorPrice);
       this.volume=new SimpleStringProperty(volume);
       this.volumeChange=new SimpleStringProperty(volumeChange);
   }

   // Getter và Setter cho numOfSales
   public String getNumOfSales() {
       return numOfSales.get();
   }

//   public void setNumOfSales(String numOfSales) {
//       this.numOfSales = numOfSales;
//   }

   // Getter và Setter cho floorPrice
   public String getFloorPrice() {
       return floorPrice.get();
   }

//   public void setFloorPrice(String floorPrice) {
//       this.floorPrice = floorPrice;
//   }

   // Getter và Setter cho volume
   public String getVolume() {
       return volume.get();
   }

//   public void setVolume(String volume) {
//       this.volume = volume;
//   }

   // Getter và Setter cho numOwners
   public String getNumOwners() {
       return numOwners.get();
   }

//   public void setNumOwners(String numOwners) {
//       this.numOwners = numOwners;
//   }

   // Getter và Setter cho volumeChange
   public String getVolumeChange() {
       return volumeChange.get();
   }

//   public void setVolumeChange(String volumeChange) {
//       this.volumeChange = volumeChange;
//   }

   // Getter và Setter cho totalSupply
   public String getTotalSupply() {
       return totalSupply.get();
   }

//   public void setTotalSupply(String totalSupply) {
//       this.totalSupply = totalSupply;
//   }

   // Getter và Setter cho name
   public String getName() {
       return name.get();
   }

//   public void setName(String name) {
//       this.name = name;
//   }

   // Getter và Setter cho id
   public String getId() {
       return id.get();
   }

//   public void setId(String id) {
//       this.id = id;
//   }

   // Getter và Setter cho url
   public String getUrl() {
       return url.get();
   }

//   public void setUrl(String url) {
//       this.url = url;
//   }
}

