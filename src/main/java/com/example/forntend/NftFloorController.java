package com.example.forntend;//package com.example.forntend;

import com.example.backend.CrawlData.NftFloor.OpenSea.OpenSeaJsonReader;
import com.example.backend.CrawlData.NftFloor.OpenSea.OpenSeaNft;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;

public class NftFloorController implements Initializable {
    @FXML
    private Button Exit;

//    @FXML
//    private Button Exit1;

    @FXML
    private Label Menu;

    @FXML
    private Label MenuBack;

    @FXML
    private Pane slider;
    @FXML
    private TableView<OpenSeaNft> view;
    @FXML
    private TableColumn<OpenSeaNft, String> floorPricecol;

    @FXML
    private TableColumn<OpenSeaNft, String> idcol;

    @FXML
    private TableColumn<OpenSeaNft, String> namecol;

    @FXML
    private TableColumn<OpenSeaNft, String> numOfSalescol;

    @FXML
    private TableColumn<OpenSeaNft, String> numOwnerscol;
    @FXML
    private TableColumn<OpenSeaNft, String> urlcol;
    @FXML
    private TableColumn<OpenSeaNft, String> totalSupplycol;
    @FXML
    private TableColumn<OpenSeaNft, String> volumecol;
    @FXML
    private TableColumn<OpenSeaNft, String> volumeChangecol;
    private Stack<Scene> sceneStack = new Stack<>();
    OpenSeaJsonReader op = new OpenSeaJsonReader();
    List<OpenSeaNft> nftList = op.readOpenSeaJson("D:/forntend/src/main/java/com/example/backend/CrawlData/NftFloor/OpenSea/OpenSea.json");
    ObservableList<OpenSeaNft> list = FXCollections.observableList(nftList);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Exit.setOnMouseClicked(event -> {
            System.exit(0);
        });


//        Exit1.setOnMouseClicked(event -> {
//            System.exit(0);
//        });

        slider.setTranslateX(-176);
        Menu.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(0);
            slide.play();

            slider.setTranslateX(-176);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(false);
                MenuBack.setVisible(true);
            });
        });

        MenuBack.setOnMouseClicked(event -> {
            TranslateTransition slide = new TranslateTransition();
            slide.setDuration(Duration.seconds(0.4));
            slide.setNode(slider);

            slide.setToX(-176);
            slide.play();

            slider.setTranslateX(0);

            slide.setOnFinished((ActionEvent e)-> {
                Menu.setVisible(true);
                MenuBack.setVisible(false);
            });
        });
//        initializeTableView();
    }
    private Stage stage;
    private Scene scene;

    public void switchToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBlog(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blog.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToTwitter(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Twitter.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNFT(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("NFT-page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void initializeTableView() {
        namecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("name"));
        idcol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("id"));
        urlcol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("url"));
        numOwnerscol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("numOwners"));
        totalSupplycol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("totalSupply"));
        volumecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("volume"));
        floorPricecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("floorPrice"));
        numOfSalescol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("numOfSales"));
        volumeChangecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("volumeChange"));
        view.setItems(list);
    }
}

//import BE.datascraping.dataloader.NFTGenerator;
//import BE.datascraping.model.Entity;
//import BE.datascraping.model.nftcollection.NFTCollection;
//import javafx.animation.TranslateTransition;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.collections.transformation.FilteredList;
//import javafx.collections.transformation.SortedList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.image.Image;
//import javafx.scene.input.KeyCode;
//import javafx.scene.layout.Pane;
//import javafx.stage.Stage;
//import javafx.util.Duration;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.*;
//
//public class NftFloorController implements Initializable {
//
//
//    @FXML
//    private Button Exit;
//
//    @FXML
//    private Label Menu;
//
//    @FXML
//    private Label MenuBack;
//
//    @FXML
//    private Button backButton;
//
//    @FXML
//    private TableView<NFTCollection> tableView;
//    @FXML
//    private TableColumn<NFTCollection, Double> floorPricecol;
//
//    @FXML
//    private TableColumn<NFTCollection, String> idcol;
//
//    @FXML
//    private TableColumn<NFTCollection, String> namecol;
//
//    @FXML
//    private TableColumn<NFTCollection, Integer> numOfSalescol;
//
//    @FXML
//    private TableColumn<NFTCollection, Integer> numOwnerscol;
//
//    @FXML
//    private Pane slider;
//
//    @FXML
//    private TableColumn<NFTCollection, String> totalSupplycol;
//
//    @FXML
//    private TableColumn<NFTCollection, String> urlcol;
//
//    @FXML
//    private TableColumn<NFTCollection, Double> volumeChangecol;
//
//    @FXML
//    private TableColumn<NFTCollection, Double> volumecol;
//
//
//    private Stack<Scene> sceneStack = new Stack<>();
//    ObservableList<NFTCollection> list = FXCollections.observableArrayList();
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        Exit.setOnMouseClicked(event -> {
//            System.exit(0);
//        });
//
//
//        // Initialize the stack with the first scene
////        sceneStack.push(Menu.getScene());
//        slider.setTranslateX(-176);
//        Menu.setOnMouseClicked(event -> {
//            TranslateTransition slide = new TranslateTransition();
//            slide.setDuration(Duration.seconds(0.4));
//            slide.setNode(slider);
//
//            slide.setToX(0);
//            slide.play();
//
//            slider.setTranslateX(-176);
//
//            slide.setOnFinished((ActionEvent e)-> {
//                Menu.setVisible(false);
//                MenuBack.setVisible(true);
//            });
//        });
//
//        MenuBack.setOnMouseClicked(event -> {
//            TranslateTransition slide = new TranslateTransition();
//            slide.setDuration(Duration.seconds(0.4));
//            slide.setNode(slider);
//
//            slide.setToX(-176);
//            slide.play();
//
//            slider.setTranslateX(0);
//
//            slide.setOnFinished((ActionEvent e)-> {
//                Menu.setVisible(true);
//                MenuBack.setVisible(false);
//            });
//        });
//        ObservableList<NFTCollection> list = FXCollections.observableArrayList();
//        Map<String, Collection<Entity>> data = new NFTGenerator(0).generate();
//        Collection<Entity> twit = data.get("NFTCollection");
//        for(Entity e: twit){
//            list.add((NFTCollection) e);
//        }
//        initializeTableView();
////        setSearchText();
//        }
//    private void initializeTableView() {
//        namecol.setCellValueFactory(new PropertyValueFactory<NFTCollection, String>("name"));
//        idcol.setCellValueFactory(new PropertyValueFactory<NFTCollection, String>("id"));
//        urlcol.setCellValueFactory(new PropertyValueFactory<NFTCollection, String>("url"));
//
//        numOwnerscol.setCellValueFactory(new PropertyValueFactory<NFTCollection, Integer>("numOwners"));
//        totalSupplycol.setCellValueFactory(new PropertyValueFactory<NFTCollection, String>("totalSupply"));
//        volumecol.setCellValueFactory(new PropertyValueFactory<NFTCollection, Double>("volume"));
//        floorPricecol.setCellValueFactory(new PropertyValueFactory<NFTCollection, Double>("floorPrice"));
//        numOfSalescol.setCellValueFactory(new PropertyValueFactory<NFTCollection, Integer>("numOfSales"));
//        volumeChangecol.setCellValueFactory(new PropertyValueFactory<NFTCollection, Double>("volumeChange"));
//        tableView.setItems(list);
//    }
////    void setSearchText() {
////        tableView.setItems(list);
////
////        FilteredList<NFTCollection> filteredList = new FilteredList<>(list, b -> true);
////        searchText.textProperty().addListener((observable, oldValue, newValue) -> {
////            filteredList.setPredicate(nftCollection -> {
////                if (newValue.isEmpty() || newValue.isBlank() || newValue == null){
////                    return true;
////                }
////                String searchKeyword = newValue.toLowerCase();
////                if (nftCollection.getName().toLowerCase().indexOf(searchKeyword) > -1) {
////                    return true;
////                }
//////                else if (nftCollection.getVolume().contains(searchKeyword) > -1){
//////                    return true;
//////                }
////                else {
////                    return false;
////                }
////            });
////        });
////
////        SortedList<NFTCollection> sortedList = new SortedList<>(filteredList);
////
////        sortedList.comparatorProperty().bind(tableView.comparatorProperty());
////
////        tableView.setItems(sortedList);
////    }
//
//// Tạo TableView và các cột
////        TableView<OpenSeaNft> tableView = new TableView<>();
////        TableColumn<OpenSeaNft, String> idcol = new TableColumn<>("ID");
////        TableColumn<OpenSeaNft, String> namecol = new TableColumn<>("Name");
////        TableColumn<OpenSeaNft, String> urlcol = new TableColumn<>("URL");
////        TableColumn<OpenSeaNft, String> totalSupplycol = new TableColumn<>("Total Supply");
////        TableColumn<OpenSeaNft, String> volumeChangecol = new TableColumn<>("Volume Change");
////        TableColumn<OpenSeaNft, String> numOwnerscol = new TableColumn<>("Number of Owners");
////        TableColumn<OpenSeaNft, String> volumecol = new TableColumn<>("Volume");
////        TableColumn<OpenSeaNft, String> floorPricecol = new TableColumn<>("Floor Price");
////        TableColumn<OpenSeaNft, String> numOfSalescol = new TableColumn<>("Number of Sales");
//
////// Thiết lập cách giá trị của mỗi cột được liên kết với trường tương ứng trong lớp OpenSeaNft
////        idcol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("id"));
////        namecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("name"));
////        urlcol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("url"));
////        totalSupplycol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("totalSupply"));
////        volumeChangecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("volumeChange"));
////        numOwnerscol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("numOwners"));
////        volumecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("volume"));
////        floorPricecol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("floorPrice"));
////        numOfSalescol.setCellValueFactory(new PropertyValueFactory<OpenSeaNft, String>("numOfSales"));
////
////// Thêm các cột vào TableView
//////        view.getColumns().addAll(idcol, namecol, urlcol, totalSupplycol, volumeChangecol, numOwnerscol, volumecol, floorPricecol, numOfSalescol);
////
////// Đặt dữ liệu cho TableView
////        view.setItems(openSeaList);
//
//
//
////Chuyển giữa các trang
//
//private Stage stage;
//private Scene scene;
//
//public void switchToHome(ActionEvent event) throws IOException {
//    Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
//    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//    scene = new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//}
//public void switchToBlog(ActionEvent event) throws IOException {
//    Parent root = FXMLLoader.load(getClass().getResource("blog.fxml"));
//    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//    scene = new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//}
//
//public void switchToTwitter(ActionEvent event) throws IOException {
//    Parent root = FXMLLoader.load(getClass().getResource("Twitter.fxml"));
//    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//    scene = new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//}
//
//public void switchToNFT(ActionEvent event) throws IOException {
//    Parent root = FXMLLoader.load(getClass().getResource("NFT-page.fxml"));
//    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//    scene = new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//}
//}