// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class EtcVehicleInfo extends TeaModel {
    // 车辆id
    @NameInMap("vehicle_id")
    @Validation(required = true)
    public String vehicleId;

    // etc申请单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // etc平台扣款协议号
    @NameInMap("biz_agreement_no")
    @Validation(required = true)
    public String bizAgreementNo;

    // etc申请单状态
    // ORDER_CREATE:订单创建;ORDER_SYNCED:订单已同步;SUCCESS_ACTIVATE:订单已激活;UNMOUNTING:注销中;UNMOUNTED:已注销;
    @NameInMap("order_status")
    @Validation(required = true)
    public String orderStatus;

    // 用户ETC设备OBU号，当order_status为SUCCESS_ACTIVATE及以后状态时，必选
    @NameInMap("device_no")
    public String deviceNo;

    // 代扣签约状态，当传入waybill_no且匹配到对应运单时，deduct_sign_status必选
    // 待签约: WAIT_SIGN
    // 已签约: SIGNED
    // 已解约: UNSIGN
    @NameInMap("deduct_sign_status")
    public String deductSignStatus;

    // 设备首次激活时间
    @NameInMap("first_actived_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String firstActivedTime;

    // 合约到期时间
    @NameInMap("service_exp")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String serviceExp;

    // etc设备状态，USABLE-设备激活可用（可上高速正常使用）PENDING-设备激活挂起（限制消费） UNUSABLE-设备异常不可用
    @NameInMap("device_status")
    public String deviceStatus;

    // 设备状态明细，能清楚说明etc设备此时状态（/卡签注销/卡签挂失/已过户/维修中/黑名单/卡过期/欠费/标签脱落/设备报警/正常/ETC停用等）
    @NameInMap("device_status_detail")
    public String deviceStatusDetail;

    // 设备状态触发的具体时间
    @NameInMap("device_biz_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String deviceBizTime;

    public static EtcVehicleInfo build(java.util.Map<String, ?> map) throws Exception {
        EtcVehicleInfo self = new EtcVehicleInfo();
        return TeaModel.build(map, self);
    }

    public EtcVehicleInfo setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }
    public String getVehicleId() {
        return this.vehicleId;
    }

    public EtcVehicleInfo setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public EtcVehicleInfo setBizAgreementNo(String bizAgreementNo) {
        this.bizAgreementNo = bizAgreementNo;
        return this;
    }
    public String getBizAgreementNo() {
        return this.bizAgreementNo;
    }

    public EtcVehicleInfo setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public EtcVehicleInfo setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
        return this;
    }
    public String getDeviceNo() {
        return this.deviceNo;
    }

    public EtcVehicleInfo setDeductSignStatus(String deductSignStatus) {
        this.deductSignStatus = deductSignStatus;
        return this;
    }
    public String getDeductSignStatus() {
        return this.deductSignStatus;
    }

    public EtcVehicleInfo setFirstActivedTime(String firstActivedTime) {
        this.firstActivedTime = firstActivedTime;
        return this;
    }
    public String getFirstActivedTime() {
        return this.firstActivedTime;
    }

    public EtcVehicleInfo setServiceExp(String serviceExp) {
        this.serviceExp = serviceExp;
        return this;
    }
    public String getServiceExp() {
        return this.serviceExp;
    }

    public EtcVehicleInfo setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
        return this;
    }
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    public EtcVehicleInfo setDeviceStatusDetail(String deviceStatusDetail) {
        this.deviceStatusDetail = deviceStatusDetail;
        return this;
    }
    public String getDeviceStatusDetail() {
        return this.deviceStatusDetail;
    }

    public EtcVehicleInfo setDeviceBizTime(String deviceBizTime) {
        this.deviceBizTime = deviceBizTime;
        return this;
    }
    public String getDeviceBizTime() {
        return this.deviceBizTime;
    }

}
