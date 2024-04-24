// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryEkytTrustsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求头
    @NameInMap("head")
    @Validation(required = true)
    public RequestHead head;

    // 小程序appId
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 发起签约的外部流水号
    @NameInMap("out_order_no")
    @Validation(required = true)
    public String outOrderNo;

    // 签约方案码
    @NameInMap("solution_code")
    @Validation(required = true)
    public String solutionCode;

    public static QueryEkytTrustsignRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEkytTrustsignRequest self = new QueryEkytTrustsignRequest();
        return TeaModel.build(map, self);
    }

    public QueryEkytTrustsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEkytTrustsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEkytTrustsignRequest setHead(RequestHead head) {
        this.head = head;
        return this;
    }
    public RequestHead getHead() {
        return this.head;
    }

    public QueryEkytTrustsignRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryEkytTrustsignRequest setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
        return this;
    }
    public String getOutOrderNo() {
        return this.outOrderNo;
    }

    public QueryEkytTrustsignRequest setSolutionCode(String solutionCode) {
        this.solutionCode = solutionCode;
        return this;
    }
    public String getSolutionCode() {
        return this.solutionCode;
    }

}
