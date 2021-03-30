// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizMasterblRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 订舱单
    @NameInMap("bl_booking_params")
    public java.util.List<MasterBlBookingParam> blBookingParams;

    // 提单要求 
    @NameInMap("bl_request")
    public String blRequest;

    // 提单类型
    @NameInMap("bl_type")
    public String blType;

    // 船公司 业务必填
    @NameInMap("carrier")
    public String carrier;

    // 收货人 业务必填	
    // 
    @NameInMap("consignee")
    public String consignee;

    // 集装箱列表 业务必填	
    // 
    @NameInMap("container_params")
    public java.util.List<MasterBlContainerParam> containerParams;

    // 约号
    @NameInMap("contract")
    public String contract;

    // 目的地. 业务必填	
    // 
    @NameInMap("delivery_place")
    public String deliveryPlace;

    // 运输条款
    @NameInMap("delivery_terms")
    public String deliveryTerms;

    // 卸货港. 业务必填	
    // 
    @NameInMap("discharge_port")
    public String dischargePort;

    // 	
    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 运费/约号
    @NameInMap("freight")
    public String freight;

    // 货物列表. 业务必填	
    // 
    @NameInMap("goods_params")
    public java.util.List<MasterBlGoodsParam> goodsParams;

    // 出单日期
    @NameInMap("issue_date")
    public Long issueDate;

    // 放单地点
    @NameInMap("issue_place")
    public String issuePlace;

    // 起运港  业务必填	
    // 
    @NameInMap("loading_port")
    public String loadingPort;

    // master提单号
    @NameInMap("master_bl_no")
    @Validation(required = true)
    public String masterBlNo;

    // 裝卸方式
    @NameInMap("movement")
    public String movement;

    // 通知方 
    @NameInMap("notify_party")
    public String notifyParty;

    // 开船日期
    @NameInMap("on_board_date")
    public Long onBoardDate;

    // 船状态
    @NameInMap("on_board_status")
    public String onBoardStatus;

    // 	
    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 付费方式  业务必填	
    // 
    @NameInMap("payment_terms")
    public String paymentTerms;

    // 前程运输
    @NameInMap("pr_carriage")
    public String prCarriage;

    // 其他
    @NameInMap("remark")
    public String remark;

    //  发货人. 业务必填	
    // 
    @NameInMap("shipper")
    public String shipper;

    // 特殊字段无要求非必填
    @NameInMap("source")
    public String source;

    // 运输方式
    @NameInMap("transportation")
    public String transportation;

    // 航名 业务必填
    @NameInMap("vessel")
    public String vessel;

    // 航次 业务必填
    @NameInMap("voyage")
    public String voyage;

    public static SaveBizMasterblRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizMasterblRequest self = new SaveBizMasterblRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizMasterblRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizMasterblRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizMasterblRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizMasterblRequest setBlBookingParams(java.util.List<MasterBlBookingParam> blBookingParams) {
        this.blBookingParams = blBookingParams;
        return this;
    }
    public java.util.List<MasterBlBookingParam> getBlBookingParams() {
        return this.blBookingParams;
    }

    public SaveBizMasterblRequest setBlRequest(String blRequest) {
        this.blRequest = blRequest;
        return this;
    }
    public String getBlRequest() {
        return this.blRequest;
    }

    public SaveBizMasterblRequest setBlType(String blType) {
        this.blType = blType;
        return this;
    }
    public String getBlType() {
        return this.blType;
    }

    public SaveBizMasterblRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBizMasterblRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveBizMasterblRequest setContainerParams(java.util.List<MasterBlContainerParam> containerParams) {
        this.containerParams = containerParams;
        return this;
    }
    public java.util.List<MasterBlContainerParam> getContainerParams() {
        return this.containerParams;
    }

    public SaveBizMasterblRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public SaveBizMasterblRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public SaveBizMasterblRequest setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }
    public String getDeliveryTerms() {
        return this.deliveryTerms;
    }

    public SaveBizMasterblRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBizMasterblRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizMasterblRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public SaveBizMasterblRequest setGoodsParams(java.util.List<MasterBlGoodsParam> goodsParams) {
        this.goodsParams = goodsParams;
        return this;
    }
    public java.util.List<MasterBlGoodsParam> getGoodsParams() {
        return this.goodsParams;
    }

    public SaveBizMasterblRequest setIssueDate(Long issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public Long getIssueDate() {
        return this.issueDate;
    }

    public SaveBizMasterblRequest setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }
    public String getIssuePlace() {
        return this.issuePlace;
    }

    public SaveBizMasterblRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBizMasterblRequest setMasterBlNo(String masterBlNo) {
        this.masterBlNo = masterBlNo;
        return this;
    }
    public String getMasterBlNo() {
        return this.masterBlNo;
    }

    public SaveBizMasterblRequest setMovement(String movement) {
        this.movement = movement;
        return this;
    }
    public String getMovement() {
        return this.movement;
    }

    public SaveBizMasterblRequest setNotifyParty(String notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }
    public String getNotifyParty() {
        return this.notifyParty;
    }

    public SaveBizMasterblRequest setOnBoardDate(Long onBoardDate) {
        this.onBoardDate = onBoardDate;
        return this;
    }
    public Long getOnBoardDate() {
        return this.onBoardDate;
    }

    public SaveBizMasterblRequest setOnBoardStatus(String onBoardStatus) {
        this.onBoardStatus = onBoardStatus;
        return this;
    }
    public String getOnBoardStatus() {
        return this.onBoardStatus;
    }

    public SaveBizMasterblRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizMasterblRequest setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }
    public String getPaymentTerms() {
        return this.paymentTerms;
    }

    public SaveBizMasterblRequest setPrCarriage(String prCarriage) {
        this.prCarriage = prCarriage;
        return this;
    }
    public String getPrCarriage() {
        return this.prCarriage;
    }

    public SaveBizMasterblRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBizMasterblRequest setShipper(String shipper) {
        this.shipper = shipper;
        return this;
    }
    public String getShipper() {
        return this.shipper;
    }

    public SaveBizMasterblRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SaveBizMasterblRequest setTransportation(String transportation) {
        this.transportation = transportation;
        return this;
    }
    public String getTransportation() {
        return this.transportation;
    }

    public SaveBizMasterblRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBizMasterblRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
