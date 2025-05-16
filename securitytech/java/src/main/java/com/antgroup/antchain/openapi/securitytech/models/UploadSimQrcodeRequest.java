// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class UploadSimQrcodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备号
    @NameInMap("device_id")
    @Validation(required = true)
    public String deviceId;

    // 登录态token
    @NameInMap("token")
    @Validation(required = true)
    public String token;

    // 车型
    @NameInMap("vehicle_model")
    @Validation(required = true)
    public String vehicleModel;

    // 解析类型
    @NameInMap("parse_type")
    @Validation(required = true)
    public String parseType;

    // base64后的图象数据
    @NameInMap("base64_data")
    @Validation(required = true)
    public String base64Data;

    public static UploadSimQrcodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadSimQrcodeRequest self = new UploadSimQrcodeRequest();
        return TeaModel.build(map, self);
    }

    public UploadSimQrcodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadSimQrcodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadSimQrcodeRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public UploadSimQrcodeRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public UploadSimQrcodeRequest setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
        return this;
    }
    public String getVehicleModel() {
        return this.vehicleModel;
    }

    public UploadSimQrcodeRequest setParseType(String parseType) {
        this.parseType = parseType;
        return this;
    }
    public String getParseType() {
        return this.parseType;
    }

    public UploadSimQrcodeRequest setBase64Data(String base64Data) {
        this.base64Data = base64Data;
        return this;
    }
    public String getBase64Data() {
        return this.base64Data;
    }

}
