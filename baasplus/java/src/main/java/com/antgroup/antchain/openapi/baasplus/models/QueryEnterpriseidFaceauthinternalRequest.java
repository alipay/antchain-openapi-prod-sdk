// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryEnterpriseidFaceauthinternalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 认证的唯一性标示
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 内部字段
    @NameInMap("biz_info")
    @Validation(required = true)
    public BizInfo bizInfo;

    public static QueryEnterpriseidFaceauthinternalRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEnterpriseidFaceauthinternalRequest self = new QueryEnterpriseidFaceauthinternalRequest();
        return TeaModel.build(map, self);
    }

    public QueryEnterpriseidFaceauthinternalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEnterpriseidFaceauthinternalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEnterpriseidFaceauthinternalRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public QueryEnterpriseidFaceauthinternalRequest setBizInfo(BizInfo bizInfo) {
        this.bizInfo = bizInfo;
        return this;
    }
    public BizInfo getBizInfo() {
        return this.bizInfo;
    }

}
