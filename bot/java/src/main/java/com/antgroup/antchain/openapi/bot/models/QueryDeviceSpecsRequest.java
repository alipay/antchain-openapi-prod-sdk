// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryDeviceSpecsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备SN
    @NameInMap("device_sn")
    @Validation(required = true)
    public String deviceSn;

    // 厂商编码
    @NameInMap("corp_name")
    @Validation(required = true)
    public String corpName;

    public static QueryDeviceSpecsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceSpecsRequest self = new QueryDeviceSpecsRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceSpecsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDeviceSpecsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDeviceSpecsRequest setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
        return this;
    }
    public String getDeviceSn() {
        return this.deviceSn;
    }

    public QueryDeviceSpecsRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
