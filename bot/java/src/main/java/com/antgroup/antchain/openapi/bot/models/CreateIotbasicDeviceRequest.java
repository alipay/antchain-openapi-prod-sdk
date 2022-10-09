// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备厂商名称
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 设备品类编码
    @NameInMap("device_category_code")
    @Validation(required = true)
    public String deviceCategoryCode;

    // A1
    @NameInMap("device_model")
    @Validation(required = true)
    public String deviceModel;

    // xxx
    @NameInMap("device_name")
    @Validation(required = true)
    public String deviceName;

    // xe21d
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // standard
    @NameInMap("device_specs")
    @Validation(required = true)
    public String deviceSpecs;

    // 安装位置
    @NameInMap("location")
    public String location;

    // 设备标签
    @NameInMap("nick_name")
    public String nickName;

    // secid
    @NameInMap("sec_id")
    public String secId;

    // 设备扩展信息
    @NameInMap("device_ext")
    public String deviceExt;

    // 业务场景编码
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 所属租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    public static CreateIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotbasicDeviceRequest self = new CreateIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotbasicDeviceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public CreateIotbasicDeviceRequest setDeviceCategoryCode(String deviceCategoryCode) {
        this.deviceCategoryCode = deviceCategoryCode;
        return this;
    }
    public String getDeviceCategoryCode() {
        return this.deviceCategoryCode;
    }

    public CreateIotbasicDeviceRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CreateIotbasicDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateIotbasicDeviceRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public CreateIotbasicDeviceRequest setDeviceSpecs(String deviceSpecs) {
        this.deviceSpecs = deviceSpecs;
        return this;
    }
    public String getDeviceSpecs() {
        return this.deviceSpecs;
    }

    public CreateIotbasicDeviceRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public CreateIotbasicDeviceRequest setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public CreateIotbasicDeviceRequest setSecId(String secId) {
        this.secId = secId;
        return this;
    }
    public String getSecId() {
        return this.secId;
    }

    public CreateIotbasicDeviceRequest setDeviceExt(String deviceExt) {
        this.deviceExt = deviceExt;
        return this;
    }
    public String getDeviceExt() {
        return this.deviceExt;
    }

    public CreateIotbasicDeviceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public CreateIotbasicDeviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
