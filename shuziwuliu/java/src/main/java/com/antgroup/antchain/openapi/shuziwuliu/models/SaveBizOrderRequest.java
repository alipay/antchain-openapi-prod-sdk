// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizOrderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 提单要求
    @NameInMap("bl_request")
    public String blRequest;

    // 订舱单号
    @NameInMap("booking_no")
    public String bookingNo;

    // 船公司
    @NameInMap("carrier")
    public String carrier;

    // 客户did  业务必填
    @NameInMap("client_did")
    public String clientDid;

    // 收货人
    @NameInMap("consignee")
    public String consignee;

    // 约号
    @NameInMap("contract")
    public String contract;

    // 报关
    @NameInMap("customs_clearance")
    public String customsClearance;

    // 目的地 业务必填	
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

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 运费
    @NameInMap("freight")
    public String freight;

    // 保险
    @NameInMap("insurance")
    public String insurance;

    // 放单地点
    @NameInMap("issue_place")
    public String issuePlace;

    // 起运港. 业务必填	
    // 
    @NameInMap("loading_port")
    public String loadingPort;

    // 裝卸方式
    @NameInMap("movement")
    public String movement;

    // 通知方
    @NameInMap("notify_party")
    public String notifyParty;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 付费方式 业务必填	
    // 
    @NameInMap("payment_terms")
    public String paymentTerms;

    // 拖车
    @NameInMap("pick_up")
    public String pickUp;

    // 收货地点
    @NameInMap("receipt_place")
    public String receiptPlace;

    // 备注
    @NameInMap("remark")
    public String remark;

    // 发货人
    @NameInMap("shipper")
    public String shipper;

    // 任务单号
    @NameInMap("task_order")
    public String taskOrder;

    // 运输方式
    @NameInMap("transportation")
    public String transportation;

    // 船名
    @NameInMap("vessel")
    public String vessel;

    // 航次
    @NameInMap("voyage")
    public String voyage;

    public static SaveBizOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizOrderRequest self = new SaveBizOrderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizOrderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizOrderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizOrderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizOrderRequest setBlRequest(String blRequest) {
        this.blRequest = blRequest;
        return this;
    }
    public String getBlRequest() {
        return this.blRequest;
    }

    public SaveBizOrderRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBizOrderRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBizOrderRequest setClientDid(String clientDid) {
        this.clientDid = clientDid;
        return this;
    }
    public String getClientDid() {
        return this.clientDid;
    }

    public SaveBizOrderRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveBizOrderRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public SaveBizOrderRequest setCustomsClearance(String customsClearance) {
        this.customsClearance = customsClearance;
        return this;
    }
    public String getCustomsClearance() {
        return this.customsClearance;
    }

    public SaveBizOrderRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public SaveBizOrderRequest setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }
    public String getDeliveryTerms() {
        return this.deliveryTerms;
    }

    public SaveBizOrderRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBizOrderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizOrderRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public SaveBizOrderRequest setInsurance(String insurance) {
        this.insurance = insurance;
        return this;
    }
    public String getInsurance() {
        return this.insurance;
    }

    public SaveBizOrderRequest setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }
    public String getIssuePlace() {
        return this.issuePlace;
    }

    public SaveBizOrderRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBizOrderRequest setMovement(String movement) {
        this.movement = movement;
        return this;
    }
    public String getMovement() {
        return this.movement;
    }

    public SaveBizOrderRequest setNotifyParty(String notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }
    public String getNotifyParty() {
        return this.notifyParty;
    }

    public SaveBizOrderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizOrderRequest setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }
    public String getPaymentTerms() {
        return this.paymentTerms;
    }

    public SaveBizOrderRequest setPickUp(String pickUp) {
        this.pickUp = pickUp;
        return this;
    }
    public String getPickUp() {
        return this.pickUp;
    }

    public SaveBizOrderRequest setReceiptPlace(String receiptPlace) {
        this.receiptPlace = receiptPlace;
        return this;
    }
    public String getReceiptPlace() {
        return this.receiptPlace;
    }

    public SaveBizOrderRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBizOrderRequest setShipper(String shipper) {
        this.shipper = shipper;
        return this;
    }
    public String getShipper() {
        return this.shipper;
    }

    public SaveBizOrderRequest setTaskOrder(String taskOrder) {
        this.taskOrder = taskOrder;
        return this;
    }
    public String getTaskOrder() {
        return this.taskOrder;
    }

    public SaveBizOrderRequest setTransportation(String transportation) {
        this.transportation = transportation;
        return this;
    }
    public String getTransportation() {
        return this.transportation;
    }

    public SaveBizOrderRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBizOrderRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
