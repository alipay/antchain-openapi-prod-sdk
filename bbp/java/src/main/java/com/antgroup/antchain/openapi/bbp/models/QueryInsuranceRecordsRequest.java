// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class QueryInsuranceRecordsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 第三方Id，此处为天猫uid
    @NameInMap("source_uid")
    @Validation(required = true)
    public String sourceUid;

    // 保司编码
    @NameInMap("mechanism_code")
    @Validation(required = true)
    public String mechanismCode;

    public static QueryInsuranceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInsuranceRecordsRequest self = new QueryInsuranceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryInsuranceRecordsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInsuranceRecordsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInsuranceRecordsRequest setSourceUid(String sourceUid) {
        this.sourceUid = sourceUid;
        return this;
    }
    public String getSourceUid() {
        return this.sourceUid;
    }

    public QueryInsuranceRecordsRequest setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
        return this;
    }
    public String getMechanismCode() {
        return this.mechanismCode;
    }

}
