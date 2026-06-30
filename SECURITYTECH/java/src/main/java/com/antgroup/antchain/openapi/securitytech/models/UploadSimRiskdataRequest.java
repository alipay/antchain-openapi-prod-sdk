// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UploadSimRiskdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备ID
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 上报类型
    @NameInMap("upload_type")
    @Validation(required = true)
    public String uploadType;

    // 智能中控id
    @NameInMap("tuid")
    public String tuid;

    // 中控照片，base64后的图象数据
    @NameInMap("tuid_photo")
    public String tuidPhoto;

    // 车架号
    @NameInMap("frame_no")
    public String frameNo;

    // 车架号照片，base64后的图象数据
    @NameInMap("frame_no_photo")
    public String frameNoPhoto;

    // 人车合影（销售+用户），base64后的图象数据
    @NameInMap("group_photo")
    public String groupPhoto;

    // 单据照片（发票/收据），base64后的图象数据
    @NameInMap("bill_photo")
    public String billPhoto;

    // 上牌照片，base64后的图象数据
    @NameInMap("license_plate_photo")
    public String licensePlatePhoto;

    // 订单ID
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static UploadSimRiskdataRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSimRiskdataRequest self = new UploadSimRiskdataRequest();
        return TeaModel.build(map, self);
    }

    public UploadSimRiskdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSimRiskdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSimRiskdataRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UploadSimRiskdataRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UploadSimRiskdataRequest setUploadType(String uploadType) {
        this.uploadType = uploadType;
        return this;
    }
    public String getUploadType() {
        return this.uploadType;
    }

    public UploadSimRiskdataRequest setTuid(String tuid) {
        this.tuid = tuid;
        return this;
    }
    public String getTuid() {
        return this.tuid;
    }

    public UploadSimRiskdataRequest setTuidPhoto(String tuidPhoto) {
        this.tuidPhoto = tuidPhoto;
        return this;
    }
    public String getTuidPhoto() {
        return this.tuidPhoto;
    }

    public UploadSimRiskdataRequest setFrameNo(String frameNo) {
        this.frameNo = frameNo;
        return this;
    }
    public String getFrameNo() {
        return this.frameNo;
    }

    public UploadSimRiskdataRequest setFrameNoPhoto(String frameNoPhoto) {
        this.frameNoPhoto = frameNoPhoto;
        return this;
    }
    public String getFrameNoPhoto() {
        return this.frameNoPhoto;
    }

    public UploadSimRiskdataRequest setGroupPhoto(String groupPhoto) {
        this.groupPhoto = groupPhoto;
        return this;
    }
    public String getGroupPhoto() {
        return this.groupPhoto;
    }

    public UploadSimRiskdataRequest setBillPhoto(String billPhoto) {
        this.billPhoto = billPhoto;
        return this;
    }
    public String getBillPhoto() {
        return this.billPhoto;
    }

    public UploadSimRiskdataRequest setLicensePlatePhoto(String licensePlatePhoto) {
        this.licensePlatePhoto = licensePlatePhoto;
        return this;
    }
    public String getLicensePlatePhoto() {
        return this.licensePlatePhoto;
    }

    public UploadSimRiskdataRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
