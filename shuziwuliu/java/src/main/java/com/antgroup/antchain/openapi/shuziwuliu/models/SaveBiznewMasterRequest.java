// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewMasterRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 托运订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // master提单号或House提单号
    @NameInMap("master_bl_no")
    @Validation(required = true)
    public String masterBlNo;

    // 提单类型  master/house  
    // 
    // 
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 提单签发单位 [业务必填]
    // 
    // 
    @NameInMap("sign_unit_name")
    public String signUnitName;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 发货人 [业务必填]
    @NameInMap("shipper")
    public String shipper;

    // 出口人 [业务必填]
    // 
    // 
    @NameInMap("consignee")
    public String consignee;

    // 船公司 [业务必填]
    @NameInMap("carrier")
    public String carrier;

    // 船名 [业务必填]
    @NameInMap("vessel")
    public String vessel;

    // 航次 [业务必填]
    @NameInMap("voyage")
    public String voyage;

    // 起运港 [业务必填]
    @NameInMap("loading_port")
    public String loadingPort;

    // 卸货港 [业务必填]
    @NameInMap("discharge_port")
    public String dischargePort;

    // 目的地 [业务必填]
    @NameInMap("delivery_place")
    public String deliveryPlace;

    // 开船时间 (秒时间戳)
    @NameInMap("on_board_date")
    public Long onBoardDate;

    // 船状态 ATA （已到港） ，ATD （已离港 ），UNATD （未离港）
    @NameInMap("on_board_status")
    public String onBoardStatus;

    // 订舱单号列表 [业务必填]
    @NameInMap("booking_info_list")
    public java.util.List<BookingNoInfo> bookingInfoList;

    // 集装箱信息 [业务必填]
    @NameInMap("container_info_list")
    public java.util.List<ContainerInfo> containerInfoList;

    // 货物列表
    // 
    // 
    @NameInMap("goods_info_list")
    public java.util.List<GoodsInfo> goodsInfoList;

    public static SaveBiznewMasterRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewMasterRequest self = new SaveBiznewMasterRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewMasterRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewMasterRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewMasterRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBiznewMasterRequest setMasterBlNo(String masterBlNo) {
        this.masterBlNo = masterBlNo;
        return this;
    }
    public String getMasterBlNo() {
        return this.masterBlNo;
    }

    public SaveBiznewMasterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SaveBiznewMasterRequest setSignUnitName(String signUnitName) {
        this.signUnitName = signUnitName;
        return this;
    }
    public String getSignUnitName() {
        return this.signUnitName;
    }

    public SaveBiznewMasterRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewMasterRequest setShipper(String shipper) {
        this.shipper = shipper;
        return this;
    }
    public String getShipper() {
        return this.shipper;
    }

    public SaveBiznewMasterRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveBiznewMasterRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBiznewMasterRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBiznewMasterRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

    public SaveBiznewMasterRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBiznewMasterRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBiznewMasterRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public SaveBiznewMasterRequest setOnBoardDate(Long onBoardDate) {
        this.onBoardDate = onBoardDate;
        return this;
    }
    public Long getOnBoardDate() {
        return this.onBoardDate;
    }

    public SaveBiznewMasterRequest setOnBoardStatus(String onBoardStatus) {
        this.onBoardStatus = onBoardStatus;
        return this;
    }
    public String getOnBoardStatus() {
        return this.onBoardStatus;
    }

    public SaveBiznewMasterRequest setBookingInfoList(java.util.List<BookingNoInfo> bookingInfoList) {
        this.bookingInfoList = bookingInfoList;
        return this;
    }
    public java.util.List<BookingNoInfo> getBookingInfoList() {
        return this.bookingInfoList;
    }

    public SaveBiznewMasterRequest setContainerInfoList(java.util.List<ContainerInfo> containerInfoList) {
        this.containerInfoList = containerInfoList;
        return this;
    }
    public java.util.List<ContainerInfo> getContainerInfoList() {
        return this.containerInfoList;
    }

    public SaveBiznewMasterRequest setGoodsInfoList(java.util.List<GoodsInfo> goodsInfoList) {
        this.goodsInfoList = goodsInfoList;
        return this;
    }
    public java.util.List<GoodsInfo> getGoodsInfoList() {
        return this.goodsInfoList;
    }

}
