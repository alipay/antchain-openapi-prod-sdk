// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryTxtransactionDeviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备did
    @NameInMap("device_did")
    @Validation(required = true)
    public String deviceDid;

    // 设备签名
    @NameInMap("device_signature")
    @Validation(required = true)
    public String deviceSignature;

    public static QueryTxtransactionDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTxtransactionDeviceRequest self = new QueryTxtransactionDeviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTxtransactionDeviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTxtransactionDeviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTxtransactionDeviceRequest setDeviceDid(String deviceDid) {
        this.deviceDid = deviceDid;
        return this;
    }
    public String getDeviceDid() {
        return this.deviceDid;
    }

    public QueryTxtransactionDeviceRequest setDeviceSignature(String deviceSignature) {
        this.deviceSignature = deviceSignature;
        return this;
    }
    public String getDeviceSignature() {
        return this.deviceSignature;
    }

}
