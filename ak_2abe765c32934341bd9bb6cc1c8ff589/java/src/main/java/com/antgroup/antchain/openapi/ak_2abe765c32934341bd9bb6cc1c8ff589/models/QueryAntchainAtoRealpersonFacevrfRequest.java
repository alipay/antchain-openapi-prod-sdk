// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2abe765c32934341bd9bb6cc1c8ff589.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoRealpersonFacevrfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 可信实人认证的唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 商户请求的唯一标识。
    // 
    // 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    public static QueryAntchainAtoRealpersonFacevrfRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoRealpersonFacevrfRequest self = new QueryAntchainAtoRealpersonFacevrfRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public QueryAntchainAtoRealpersonFacevrfRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
