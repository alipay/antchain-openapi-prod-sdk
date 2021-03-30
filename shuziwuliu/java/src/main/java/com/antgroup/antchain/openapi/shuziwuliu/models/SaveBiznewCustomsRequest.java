// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewCustomsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 托运订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 报关单号
    // 
    // 
    @NameInMap("customs_code")
    @Validation(required = true)
    public String customsCode;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 报关代理
    // 
    // 
    @NameInMap("broker")
    public String broker;

    // 出口人
    @NameInMap("exporter")
    public String exporter;

    // 船名 [业务必填]
    @NameInMap("vessel")
    public String vessel;

    // 航次 [业务必填]
    @NameInMap("voyage")
    public String voyage;

    // 报关状态
    // APPROVED--通关，UNAPPROVED-未通关
    @NameInMap("status")
    public String status;

    // 集装箱唯一标识
    @NameInMap("container_id")
    public String containerId;

    // 箱号
    @NameInMap("container_no")
    public String containerNo;

    // 货物名称
    @NameInMap("goods")
    public String goods;

    // 毛重
    @NameInMap("gross_weight")
    public String grossWeight;

    // 件数
    @NameInMap("packages_no")
    public String packagesNo;

    // 报关总金额 [业务必填]
    @NameInMap("customs_total_amount")
    public String customsTotalAmount;

    // 报关运费金额 [业务必填]
    @NameInMap("customs_amount")
    public String customsAmount;

    // 报关杂费金额 [业务必填]
    @NameInMap("customs_charges")
    public String customsCharges;

    // 币种 [业务必填]
    @NameInMap("currency")
    public String currency;

    // 订舱单号列表 [业务必填]
    @NameInMap("booking_info_list")
    public java.util.List<BookingNoInfo> bookingInfoList;

    public static SaveBiznewCustomsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewCustomsRequest self = new SaveBiznewCustomsRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewCustomsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewCustomsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewCustomsRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBiznewCustomsRequest setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
        return this;
    }
    public String getCustomsCode() {
        return this.customsCode;
    }

    public SaveBiznewCustomsRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewCustomsRequest setBroker(String broker) {
        this.broker = broker;
        return this;
    }
    public String getBroker() {
        return this.broker;
    }

    public SaveBiznewCustomsRequest setExporter(String exporter) {
        this.exporter = exporter;
        return this;
    }
    public String getExporter() {
        return this.exporter;
    }

    public SaveBiznewCustomsRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBiznewCustomsRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

    public SaveBiznewCustomsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SaveBiznewCustomsRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SaveBiznewCustomsRequest setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public SaveBiznewCustomsRequest setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public SaveBiznewCustomsRequest setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
        return this;
    }
    public String getGrossWeight() {
        return this.grossWeight;
    }

    public SaveBiznewCustomsRequest setPackagesNo(String packagesNo) {
        this.packagesNo = packagesNo;
        return this;
    }
    public String getPackagesNo() {
        return this.packagesNo;
    }

    public SaveBiznewCustomsRequest setCustomsTotalAmount(String customsTotalAmount) {
        this.customsTotalAmount = customsTotalAmount;
        return this;
    }
    public String getCustomsTotalAmount() {
        return this.customsTotalAmount;
    }

    public SaveBiznewCustomsRequest setCustomsAmount(String customsAmount) {
        this.customsAmount = customsAmount;
        return this;
    }
    public String getCustomsAmount() {
        return this.customsAmount;
    }

    public SaveBiznewCustomsRequest setCustomsCharges(String customsCharges) {
        this.customsCharges = customsCharges;
        return this;
    }
    public String getCustomsCharges() {
        return this.customsCharges;
    }

    public SaveBiznewCustomsRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBiznewCustomsRequest setBookingInfoList(java.util.List<BookingNoInfo> bookingInfoList) {
        this.bookingInfoList = bookingInfoList;
        return this;
    }
    public java.util.List<BookingNoInfo> getBookingInfoList() {
        return this.bookingInfoList;
    }

}
