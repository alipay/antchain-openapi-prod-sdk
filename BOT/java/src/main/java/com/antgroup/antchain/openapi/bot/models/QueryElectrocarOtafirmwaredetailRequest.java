// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtafirmwaredetailRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 固件包id
    @NameInMap("firmware_id")
    @Validation(required = true)
    public String firmwareId;

    // 可信物联唯一产品标识
    @NameInMap("trust_product_key")
    public String trustProductKey;

    public static QueryElectrocarOtafirmwaredetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtafirmwaredetailRequest self = new QueryElectrocarOtafirmwaredetailRequest();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtafirmwaredetailRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryElectrocarOtafirmwaredetailRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryElectrocarOtafirmwaredetailRequest setFirmwareId(String firmwareId) {
        this.firmwareId = firmwareId;
        return this;
    }
    public String getFirmwareId() {
        return this.firmwareId;
    }

    public QueryElectrocarOtafirmwaredetailRequest setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

}
