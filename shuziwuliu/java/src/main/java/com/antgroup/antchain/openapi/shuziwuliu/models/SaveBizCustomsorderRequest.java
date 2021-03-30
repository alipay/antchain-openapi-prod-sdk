// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizCustomsorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 订舱单号
    @NameInMap("booking_params")
    public java.util.List<CustomsOrderBookingParam> bookingParams;

    // 报关代理
    @NameInMap("broker")
    public String broker;

    // 集装箱ID
    @NameInMap("container_id")
    public String containerId;

    // 箱号
    @NameInMap("container_no")
    public String containerNo;

    // 报关单号
    @NameInMap("customs_code")
    @Validation(required = true)
    public String customsCode;

    //  出口人
    @NameInMap("exporter")
    public String exporter;

    // 货代did
    // 
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 货物名称
    @NameInMap("goods")
    public String goods;

    // 毛重 
    @NameInMap("gross_weight")
    public String grossWeight;

    // 订单号
    // 
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 件数
    @NameInMap("packages_no")
    public String packagesNo;

    // 报关状态  APPROVED--通关，UNAPPROVED-未通关
    @NameInMap("status")
    public String status;

    // 航名 业务必填
    @NameInMap("vessel")
    @Validation(required = true)
    public String vessel;

    // 航次 业务必填
    @NameInMap("voyage")
    public String voyage;

    public static SaveBizCustomsorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizCustomsorderRequest self = new SaveBizCustomsorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizCustomsorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizCustomsorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizCustomsorderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizCustomsorderRequest setBookingParams(java.util.List<CustomsOrderBookingParam> bookingParams) {
        this.bookingParams = bookingParams;
        return this;
    }
    public java.util.List<CustomsOrderBookingParam> getBookingParams() {
        return this.bookingParams;
    }

    public SaveBizCustomsorderRequest setBroker(String broker) {
        this.broker = broker;
        return this;
    }
    public String getBroker() {
        return this.broker;
    }

    public SaveBizCustomsorderRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

    public SaveBizCustomsorderRequest setContainerNo(String containerNo) {
        this.containerNo = containerNo;
        return this;
    }
    public String getContainerNo() {
        return this.containerNo;
    }

    public SaveBizCustomsorderRequest setCustomsCode(String customsCode) {
        this.customsCode = customsCode;
        return this;
    }
    public String getCustomsCode() {
        return this.customsCode;
    }

    public SaveBizCustomsorderRequest setExporter(String exporter) {
        this.exporter = exporter;
        return this;
    }
    public String getExporter() {
        return this.exporter;
    }

    public SaveBizCustomsorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizCustomsorderRequest setGoods(String goods) {
        this.goods = goods;
        return this;
    }
    public String getGoods() {
        return this.goods;
    }

    public SaveBizCustomsorderRequest setGrossWeight(String grossWeight) {
        this.grossWeight = grossWeight;
        return this;
    }
    public String getGrossWeight() {
        return this.grossWeight;
    }

    public SaveBizCustomsorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizCustomsorderRequest setPackagesNo(String packagesNo) {
        this.packagesNo = packagesNo;
        return this;
    }
    public String getPackagesNo() {
        return this.packagesNo;
    }

    public SaveBizCustomsorderRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SaveBizCustomsorderRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBizCustomsorderRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
