package lk.ijse.dep.app.controller;

public class SearchOrderFormController {

//    @FXML
//    private JFXTextField txtSearchOrder;
//    @FXML
//    private AnchorPane root;
//    @FXML
//    private TableView<OrderTM> tblOrders;
//
//    private ObservableList<OrderTM> olOrders;
//
//    private ManageOrdersBO manageOrdersBO = BOFactory.getInstance().getBO(BOFactory.BOTypes.MANAGE_ORDERS);

    public void initialize() {
//        tblOrders.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("orderId"));
//        tblOrders.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("orderDate"));
//        tblOrders.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("customerId"));
//        tblOrders.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("customerName"));
//        tblOrders.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("total"));
//
//        List<OrderDTO2> ordersDB = null;
//        try {
//            ordersDB = manageOrdersBO.getOrdersWithCustomerNamesAndTotals();
//        } catch (Exception e) {
//            Logger.getLogger("").log(Level.SEVERE, null, e);
//        }
//        olOrders = FXCollections.observableArrayList();
//        for (OrderDTO2 orderDTO : ordersDB) {
//            olOrders.add(new OrderTM(orderDTO.getOrderId(),
//                    orderDTO.getOrderDate(),
//                    orderDTO.getCustomerId(),
//                    orderDTO.getCustomerName(),
//                    orderDTO.getTotal()));
//        }
//
//        tblOrders.setItems(olOrders);
//    }
//
//    @FXML
//    private void txtOrderId_OnKeyReleased(KeyEvent keyEvent) {
//
//        ObservableList<OrderTM> tempList = FXCollections.observableArrayList();
////        System.out.println("TEST : " + olOrders);
//        for (OrderTM olOrder : olOrders) {
//            if (olOrder.getOrderId().startsWith(txtSearchOrder.getText())){
//                tempList.add(olOrder);
//            }
//        }
//
//        tblOrders.setItems(tempList);
//
//    }
//
//    @FXML
//    private void navigateToHome(MouseEvent mouseEvent) throws IOException {
//        AppInitializer.navigateToHome(root, (Stage) this.root.getScene().getWindow());
//    }
//
//    @FXML
//    private void tblOrders_OnClick(MouseEvent mouseEvent) throws IOException {
//        if (mouseEvent.getClickCount() == 2){
//
//            OrderTM selectedItem = tblOrders.getSelectionModel().getSelectedItem();
//
//            FXMLLoader fxmlLoader = new FXMLLoader(this.getClass().getResource("/lk/ijse/dep/app/view/ViewOrderForm.fxml"));
//            Parent root = (Parent) fxmlLoader.load();
//            ViewOrderFormController controller = fxmlLoader.getController();
//            controller.setInitData(selectedItem.getOrderId(), selectedItem.getTotal());
//            Scene scene = new Scene(root);
//            ((Stage)tblOrders.getScene().getWindow()).setScene(scene);
//        }
    }
}
