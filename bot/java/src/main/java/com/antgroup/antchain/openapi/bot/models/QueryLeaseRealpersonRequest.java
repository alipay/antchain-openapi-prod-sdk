// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryLeaseRealpersonRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 实人认证的唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 商户请求的唯一标识。 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    public static QueryLeaseRealpersonRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseRealpersonRequest self = new QueryLeaseRealpersonRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseRealpersonRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseRealpersonRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseRealpersonRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryLeaseRealpersonRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

}
