// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidPersonFacevrfminiappRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可能由于租户ID被多个调用方公用时候，使用bizCode作为隔离区分。
    @NameInMap("biz_code")
    public String bizCode;

    // 请求的唯一标识，通常为32字符宽度的字符串内容，也可以只用UUID，此参数通常用来支持幂等，或者排查问题，调用方可以使用业务流水号。 与创建申请认证的接口的bizId目前不强校验一致性。
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 可信实人认证的唯一标识，用于核心查询认证结果的唯一标识。
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    public static QueryDidPersonFacevrfminiappRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDidPersonFacevrfminiappRequest self = new QueryDidPersonFacevrfminiappRequest();
        return TeaModel.build(map, self);
    }

    public QueryDidPersonFacevrfminiappRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDidPersonFacevrfminiappRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDidPersonFacevrfminiappRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public QueryDidPersonFacevrfminiappRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryDidPersonFacevrfminiappRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

}
