// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchcreateIotbasicDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备厂商
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    // 设备品类编码
    @NameInMap("device_category_code")
    @Validation(required = true)
    public String deviceCategoryCode;

    // 业务场景码
    @NameInMap("biz_scene")
    @Validation(required = true)
    public String bizScene;

    // 所属租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 注册设备集合
    @NameInMap("device_list")
    @Validation(required = true)
    public java.util.List<IotBasicDeviceRegisterInfo> deviceList;

    public static BatchcreateIotbasicDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateIotbasicDeviceRequest self = new BatchcreateIotbasicDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateIotbasicDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateIotbasicDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateIotbasicDeviceRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public BatchcreateIotbasicDeviceRequest setDeviceCategoryCode(String deviceCategoryCode) {
        this.deviceCategoryCode = deviceCategoryCode;
        return this;
    }
    public String getDeviceCategoryCode() {
        return this.deviceCategoryCode;
    }

    public BatchcreateIotbasicDeviceRequest setBizScene(String bizScene) {
        this.bizScene = bizScene;
        return this;
    }
    public String getBizScene() {
        return this.bizScene;
    }

    public BatchcreateIotbasicDeviceRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public BatchcreateIotbasicDeviceRequest setDeviceList(java.util.List<IotBasicDeviceRegisterInfo> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<IotBasicDeviceRegisterInfo> getDeviceList() {
        return this.deviceList;
    }

}
