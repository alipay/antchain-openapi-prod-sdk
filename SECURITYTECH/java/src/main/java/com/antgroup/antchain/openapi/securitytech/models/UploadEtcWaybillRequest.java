// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UploadEtcWaybillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 企业侧车辆编号
    @NameInMap("corp_vehicle_id")
    @Validation(required = true)
    public String corpVehicleId;

    // 车牌号码
    @NameInMap("plate_no")
    @Validation(required = true)
    public String plateNo;

    // 车牌颜色，枚举值
    // 蓝: BLUE
    // 黄: YELLOW
    // 黑: BLACK
    // 白: WHITE
    // 绿: GREEN
    @NameInMap("plate_color")
    @Validation(required = true)
    public String plateColor;

    // 企业运单号，唯一值
    @NameInMap("waybill_no")
    @Validation(required = true)
    public String waybillNo;

    // 企业运单状态，枚举值
    // 进行中: IN_PROGRESS
    // 已完成: COMPLETED
    // 已取消: CANCELED
    @NameInMap("waybill_status")
    @Validation(required = true)
    public String waybillStatus;

    // 运单开始时间
    // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
    @NameInMap("waybill_start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String waybillStartTime;

    // 企业运单结束时间
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    @NameInMap("waybill_end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String waybillEndTime;

    // 运单开始地址
    // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
    @NameInMap("waybill_start_address")
    public String waybillStartAddress;

    // 运单结束地址，运单目的地
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    @NameInMap("waybill_end_address")
    public String waybillEndAddress;

    // 运单总费用，单位元，精确到两位小数
    // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
    @NameInMap("waybill_fee")
    public String waybillFee;

    // 高速通行费用，单位元，精确到两位小数
    @NameInMap("highway_fee")
    public String highwayFee;

    public static UploadEtcWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadEtcWaybillRequest self = new UploadEtcWaybillRequest();
        return TeaModel.build(map, self);
    }

    public UploadEtcWaybillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadEtcWaybillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadEtcWaybillRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public UploadEtcWaybillRequest setCorpVehicleId(String corpVehicleId) {
        this.corpVehicleId = corpVehicleId;
        return this;
    }
    public String getCorpVehicleId() {
        return this.corpVehicleId;
    }

    public UploadEtcWaybillRequest setPlateNo(String plateNo) {
        this.plateNo = plateNo;
        return this;
    }
    public String getPlateNo() {
        return this.plateNo;
    }

    public UploadEtcWaybillRequest setPlateColor(String plateColor) {
        this.plateColor = plateColor;
        return this;
    }
    public String getPlateColor() {
        return this.plateColor;
    }

    public UploadEtcWaybillRequest setWaybillNo(String waybillNo) {
        this.waybillNo = waybillNo;
        return this;
    }
    public String getWaybillNo() {
        return this.waybillNo;
    }

    public UploadEtcWaybillRequest setWaybillStatus(String waybillStatus) {
        this.waybillStatus = waybillStatus;
        return this;
    }
    public String getWaybillStatus() {
        return this.waybillStatus;
    }

    public UploadEtcWaybillRequest setWaybillStartTime(String waybillStartTime) {
        this.waybillStartTime = waybillStartTime;
        return this;
    }
    public String getWaybillStartTime() {
        return this.waybillStartTime;
    }

    public UploadEtcWaybillRequest setWaybillEndTime(String waybillEndTime) {
        this.waybillEndTime = waybillEndTime;
        return this;
    }
    public String getWaybillEndTime() {
        return this.waybillEndTime;
    }

    public UploadEtcWaybillRequest setWaybillStartAddress(String waybillStartAddress) {
        this.waybillStartAddress = waybillStartAddress;
        return this;
    }
    public String getWaybillStartAddress() {
        return this.waybillStartAddress;
    }

    public UploadEtcWaybillRequest setWaybillEndAddress(String waybillEndAddress) {
        this.waybillEndAddress = waybillEndAddress;
        return this;
    }
    public String getWaybillEndAddress() {
        return this.waybillEndAddress;
    }

    public UploadEtcWaybillRequest setWaybillFee(String waybillFee) {
        this.waybillFee = waybillFee;
        return this;
    }
    public String getWaybillFee() {
        return this.waybillFee;
    }

    public UploadEtcWaybillRequest setHighwayFee(String highwayFee) {
        this.highwayFee = highwayFee;
        return this;
    }
    public String getHighwayFee() {
        return this.highwayFee;
    }

}
