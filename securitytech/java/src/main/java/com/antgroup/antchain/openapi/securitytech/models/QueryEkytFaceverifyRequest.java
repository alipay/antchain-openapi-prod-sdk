// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEkytFaceverifyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 可信实人认证的唯一标识
    @NameInMap("certify_id")
    @Validation(required = true)
    public String certifyId;

    // 商户请求的唯一标识
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    public static QueryEkytFaceverifyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEkytFaceverifyRequest self = new QueryEkytFaceverifyRequest();
        return TeaModel.build(map, self);
    }

    public QueryEkytFaceverifyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEkytFaceverifyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEkytFaceverifyRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public QueryEkytFaceverifyRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public QueryEkytFaceverifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

}
