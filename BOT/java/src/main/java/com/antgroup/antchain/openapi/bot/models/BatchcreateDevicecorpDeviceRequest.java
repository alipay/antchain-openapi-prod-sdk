// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BatchcreateDevicecorpDeviceRequest extends TeaModel {
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

    // 注册设备集合
    @NameInMap("device_list")
    @Validation(required = true)
    public java.util.List<IotBasicDeviceRegisterInfo> deviceList;

    public static BatchcreateDevicecorpDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDevicecorpDeviceRequest self = new BatchcreateDevicecorpDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDevicecorpDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateDevicecorpDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateDevicecorpDeviceRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public BatchcreateDevicecorpDeviceRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public BatchcreateDevicecorpDeviceRequest setDeviceList(java.util.List<IotBasicDeviceRegisterInfo> deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public java.util.List<IotBasicDeviceRegisterInfo> getDeviceList() {
        return this.deviceList;
    }

}
