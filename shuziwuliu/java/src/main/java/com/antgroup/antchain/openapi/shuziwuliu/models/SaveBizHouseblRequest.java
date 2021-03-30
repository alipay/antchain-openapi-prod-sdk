// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizHouseblRequest extends TeaModel {
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
    public java.util.List<HouseBlBookingParam> blBookingParams;

    // 提单签发单位
    @NameInMap("bl_issuing_agency")
    public String blIssuingAgency;

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
    public java.util.List<HouseBlContainerParam> containerParams;

    // 约号
    @NameInMap("contract")
    public String contract;

    // 目的地  业务必填	
    // 
    @NameInMap("delivery_place")
    public String deliveryPlace;

    // 运输条款
    @NameInMap("delivery_terms")
    public String deliveryTerms;

    // 卸货港 业务必填	
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

    // 货物列表 业务必填	
    // 
    @NameInMap("goods_params")
    public java.util.List<HouseBlGoodsParam> goodsParams;

    // house提单号
    @NameInMap("house_bl_no")
    @Validation(required = true)
    public String houseBlNo;

    // 出单日期 
    @NameInMap("issue_date")
    public Long issueDate;

    // 放单地点
    @NameInMap("issue_place")
    public String issuePlace;

    // 起运港 业务必填	
    // 
    @NameInMap("loading_port")
    public String loadingPort;

    // master提单号
    @NameInMap("master_bl_no")
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

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 付费方式 业务必填	
    // 
    @NameInMap("payment_terms")
    public String paymentTerms;

    // 其他
    @NameInMap("remark")
    public String remark;

    // 发货人 业务必填	
    // 
    @NameInMap("shipper")
    public String shipper;

    // 运输方式
    @NameInMap("transportation")
    public String transportation;

    // 航名 业务必填
    @NameInMap("vessel")
    public String vessel;

    // 航次 业务必填
    @NameInMap("voyage")
    public String voyage;

    public static SaveBizHouseblRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizHouseblRequest self = new SaveBizHouseblRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizHouseblRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizHouseblRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizHouseblRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizHouseblRequest setBlBookingParams(java.util.List<HouseBlBookingParam> blBookingParams) {
        this.blBookingParams = blBookingParams;
        return this;
    }
    public java.util.List<HouseBlBookingParam> getBlBookingParams() {
        return this.blBookingParams;
    }

    public SaveBizHouseblRequest setBlIssuingAgency(String blIssuingAgency) {
        this.blIssuingAgency = blIssuingAgency;
        return this;
    }
    public String getBlIssuingAgency() {
        return this.blIssuingAgency;
    }

    public SaveBizHouseblRequest setBlRequest(String blRequest) {
        this.blRequest = blRequest;
        return this;
    }
    public String getBlRequest() {
        return this.blRequest;
    }

    public SaveBizHouseblRequest setBlType(String blType) {
        this.blType = blType;
        return this;
    }
    public String getBlType() {
        return this.blType;
    }

    public SaveBizHouseblRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBizHouseblRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveBizHouseblRequest setContainerParams(java.util.List<HouseBlContainerParam> containerParams) {
        this.containerParams = containerParams;
        return this;
    }
    public java.util.List<HouseBlContainerParam> getContainerParams() {
        return this.containerParams;
    }

    public SaveBizHouseblRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public SaveBizHouseblRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public SaveBizHouseblRequest setDeliveryTerms(String deliveryTerms) {
        this.deliveryTerms = deliveryTerms;
        return this;
    }
    public String getDeliveryTerms() {
        return this.deliveryTerms;
    }

    public SaveBizHouseblRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBizHouseblRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizHouseblRequest setFreight(String freight) {
        this.freight = freight;
        return this;
    }
    public String getFreight() {
        return this.freight;
    }

    public SaveBizHouseblRequest setGoodsParams(java.util.List<HouseBlGoodsParam> goodsParams) {
        this.goodsParams = goodsParams;
        return this;
    }
    public java.util.List<HouseBlGoodsParam> getGoodsParams() {
        return this.goodsParams;
    }

    public SaveBizHouseblRequest setHouseBlNo(String houseBlNo) {
        this.houseBlNo = houseBlNo;
        return this;
    }
    public String getHouseBlNo() {
        return this.houseBlNo;
    }

    public SaveBizHouseblRequest setIssueDate(Long issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public Long getIssueDate() {
        return this.issueDate;
    }

    public SaveBizHouseblRequest setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
        return this;
    }
    public String getIssuePlace() {
        return this.issuePlace;
    }

    public SaveBizHouseblRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBizHouseblRequest setMasterBlNo(String masterBlNo) {
        this.masterBlNo = masterBlNo;
        return this;
    }
    public String getMasterBlNo() {
        return this.masterBlNo;
    }

    public SaveBizHouseblRequest setMovement(String movement) {
        this.movement = movement;
        return this;
    }
    public String getMovement() {
        return this.movement;
    }

    public SaveBizHouseblRequest setNotifyParty(String notifyParty) {
        this.notifyParty = notifyParty;
        return this;
    }
    public String getNotifyParty() {
        return this.notifyParty;
    }

    public SaveBizHouseblRequest setOnBoardDate(Long onBoardDate) {
        this.onBoardDate = onBoardDate;
        return this;
    }
    public Long getOnBoardDate() {
        return this.onBoardDate;
    }

    public SaveBizHouseblRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizHouseblRequest setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
        return this;
    }
    public String getPaymentTerms() {
        return this.paymentTerms;
    }

    public SaveBizHouseblRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public SaveBizHouseblRequest setShipper(String shipper) {
        this.shipper = shipper;
        return this;
    }
    public String getShipper() {
        return this.shipper;
    }

    public SaveBizHouseblRequest setTransportation(String transportation) {
        this.transportation = transportation;
        return this;
    }
    public String getTransportation() {
        return this.transportation;
    }

    public SaveBizHouseblRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBizHouseblRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
