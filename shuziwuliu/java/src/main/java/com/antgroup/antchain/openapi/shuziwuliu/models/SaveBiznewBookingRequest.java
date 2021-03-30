// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBiznewBookingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 托运订单号
    // 
    // 
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 订舱单唯一标识
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 订舱号 [业务必填]
    @NameInMap("bkg_no")
    public String bkgNo;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 收货人
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

    // 箱型箱量 [业务必填]
    @NameInMap("container_type_info_list")
    public java.util.List<ContainerTypeInfo> containerTypeInfoList;

    // 截关时间（秒时间戳）
    @NameInMap("customs_clearance")
    public Long customsClearance;

    // 截港时间（秒时间戳）
    @NameInMap("cy_closing")
    public Long cyClosing;

    // 截单时间 (秒时间戳)
    @NameInMap("si_closing")
    public Long siClosing;

    // 预计船期（秒时间戳）
    @NameInMap("etd")
    public Long etd;

    // 订舱费总金额 [业务必填]
    @NameInMap("bkg_total_amount")
    public String bkgTotalAmount;

    // 订舱费金额 [业务必填]
    @NameInMap("bkg_amount")
    public String bkgAmount;

    // 港杂费金额 [业务必填]
    @NameInMap("port_charges")
    public String portCharges;

    // 币种 CNY/USD [业务必填]
    // 
    // 
    @NameInMap("currency")
    public String currency;

    // 订单确认 CREATE/FINISH (创建/确认) [业务必填]
    @NameInMap("status")
    public String status;

    public static SaveBiznewBookingRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBiznewBookingRequest self = new SaveBiznewBookingRequest();
        return TeaModel.build(map, self);
    }

    public SaveBiznewBookingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBiznewBookingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBiznewBookingRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBiznewBookingRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBiznewBookingRequest setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

    public SaveBiznewBookingRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBiznewBookingRequest setConsignee(String consignee) {
        this.consignee = consignee;
        return this;
    }
    public String getConsignee() {
        return this.consignee;
    }

    public SaveBiznewBookingRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBiznewBookingRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBiznewBookingRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

    public SaveBiznewBookingRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBiznewBookingRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBiznewBookingRequest setContainerTypeInfoList(java.util.List<ContainerTypeInfo> containerTypeInfoList) {
        this.containerTypeInfoList = containerTypeInfoList;
        return this;
    }
    public java.util.List<ContainerTypeInfo> getContainerTypeInfoList() {
        return this.containerTypeInfoList;
    }

    public SaveBiznewBookingRequest setCustomsClearance(Long customsClearance) {
        this.customsClearance = customsClearance;
        return this;
    }
    public Long getCustomsClearance() {
        return this.customsClearance;
    }

    public SaveBiznewBookingRequest setCyClosing(Long cyClosing) {
        this.cyClosing = cyClosing;
        return this;
    }
    public Long getCyClosing() {
        return this.cyClosing;
    }

    public SaveBiznewBookingRequest setSiClosing(Long siClosing) {
        this.siClosing = siClosing;
        return this;
    }
    public Long getSiClosing() {
        return this.siClosing;
    }

    public SaveBiznewBookingRequest setEtd(Long etd) {
        this.etd = etd;
        return this;
    }
    public Long getEtd() {
        return this.etd;
    }

    public SaveBiznewBookingRequest setBkgTotalAmount(String bkgTotalAmount) {
        this.bkgTotalAmount = bkgTotalAmount;
        return this;
    }
    public String getBkgTotalAmount() {
        return this.bkgTotalAmount;
    }

    public SaveBiznewBookingRequest setBkgAmount(String bkgAmount) {
        this.bkgAmount = bkgAmount;
        return this;
    }
    public String getBkgAmount() {
        return this.bkgAmount;
    }

    public SaveBiznewBookingRequest setPortCharges(String portCharges) {
        this.portCharges = portCharges;
        return this;
    }
    public String getPortCharges() {
        return this.portCharges;
    }

    public SaveBiznewBookingRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SaveBiznewBookingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
