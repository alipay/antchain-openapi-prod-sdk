// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SaveBizBookingorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    @NameInMap("action")
    public String action;

    // 订舱单号
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 船公司 业务必填
    @NameInMap("carrier")
    public String carrier;

    // 截关时间
    @NameInMap("customs_clearance")
    public Long customsClearance;

    // 场站 业务必填
    @NameInMap("cy")
    public String cy;

    // 截港时间 毫秒值单位
    @NameInMap("cy_closing")
    public Long cyClosing;

    // 目的地
    @NameInMap("delivery_place")
    public String deliveryPlace;

    // 卸货港
    @NameInMap("discharge_port")
    public String dischargePort;

    // 预计船期 毫秒值单位
    @NameInMap("etd")
    public Long etd;

    // 货代did
    @NameInMap("forwarder_did")
    @Validation(required = true)
    public String forwarderDid;

    // 起运港
    @NameInMap("loading_port")
    public String loadingPort;

    // 订单号
    @NameInMap("order_no")
    @Validation(required = true)
    public String orderNo;

    // 截单时间  毫秒值单位
    @NameInMap("si_closing")
    public Long siClosing;

    // 特殊字段无要求非必填
    @NameInMap("source")
    public String source;

    // 船名 业务必填
    @NameInMap("vessel")
    public String vessel;

    // 航次 业务必填
    @NameInMap("voyage")
    public String voyage;

    // 订舱号
    @NameInMap("bkg_no")
    @Validation(required = true)
    public String bkgNo;

    // 确认时间
    @NameInMap("confirm_time")
    public Long confirmTime;

    public static SaveBizBookingorderRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveBizBookingorderRequest self = new SaveBizBookingorderRequest();
        return TeaModel.build(map, self);
    }

    public SaveBizBookingorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveBizBookingorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveBizBookingorderRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SaveBizBookingorderRequest setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SaveBizBookingorderRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SaveBizBookingorderRequest setCustomsClearance(Long customsClearance) {
        this.customsClearance = customsClearance;
        return this;
    }
    public Long getCustomsClearance() {
        return this.customsClearance;
    }

    public SaveBizBookingorderRequest setCy(String cy) {
        this.cy = cy;
        return this;
    }
    public String getCy() {
        return this.cy;
    }

    public SaveBizBookingorderRequest setCyClosing(Long cyClosing) {
        this.cyClosing = cyClosing;
        return this;
    }
    public Long getCyClosing() {
        return this.cyClosing;
    }

    public SaveBizBookingorderRequest setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
        return this;
    }
    public String getDeliveryPlace() {
        return this.deliveryPlace;
    }

    public SaveBizBookingorderRequest setDischargePort(String dischargePort) {
        this.dischargePort = dischargePort;
        return this;
    }
    public String getDischargePort() {
        return this.dischargePort;
    }

    public SaveBizBookingorderRequest setEtd(Long etd) {
        this.etd = etd;
        return this;
    }
    public Long getEtd() {
        return this.etd;
    }

    public SaveBizBookingorderRequest setForwarderDid(String forwarderDid) {
        this.forwarderDid = forwarderDid;
        return this;
    }
    public String getForwarderDid() {
        return this.forwarderDid;
    }

    public SaveBizBookingorderRequest setLoadingPort(String loadingPort) {
        this.loadingPort = loadingPort;
        return this;
    }
    public String getLoadingPort() {
        return this.loadingPort;
    }

    public SaveBizBookingorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public SaveBizBookingorderRequest setSiClosing(Long siClosing) {
        this.siClosing = siClosing;
        return this;
    }
    public Long getSiClosing() {
        return this.siClosing;
    }

    public SaveBizBookingorderRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SaveBizBookingorderRequest setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SaveBizBookingorderRequest setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

    public SaveBizBookingorderRequest setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

    public SaveBizBookingorderRequest setConfirmTime(Long confirmTime) {
        this.confirmTime = confirmTime;
        return this;
    }
    public Long getConfirmTime() {
        return this.confirmTime;
    }

}
