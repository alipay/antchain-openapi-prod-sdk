// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateDevicecorpDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目编码
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 设备型号值
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // 设备规格值
    @NameInMap("device_specs")
    @Validation(required = true)
    public String deviceSpecs;

    // 设备名称
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // 设备sn
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 设备标签
    @NameInMap("nick_name")
    public String nickName;

    // 设备扩展信息（json字符串，车架号等信息）
    @NameInMap("device_ext")
    public String deviceExt;

    // 安全认证ID
    @NameInMap("sec_id")
    public String secId;

    public static CreateDevicecorpDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDevicecorpDeviceRequest self = new CreateDevicecorpDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateDevicecorpDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDevicecorpDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDevicecorpDeviceRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateDevicecorpDeviceRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CreateDevicecorpDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateDevicecorpDeviceRequest setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public CreateDevicecorpDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateDevicecorpDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CreateDevicecorpDeviceRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public CreateDevicecorpDeviceRequest setDeviceExt(String deviceExt) {
        this.deviceExt = deviceExt;
        return this;
    }
    public String getDeviceExt() {
        return this.deviceExt;
    }

    public CreateDevicecorpDeviceRequest setSecId(String secId) {
        this.secId = secId;
        return this;
    }
    public String getSecId() {
        return this.secId;
    }

}
