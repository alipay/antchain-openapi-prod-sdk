// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryWithholdPayresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求扣款时，返回的委托单号,该笔转账在支付宝系统内部的单据ID
    @NameInMap("entrust_order_id")
    @Validation(required = true)
    public String entrustOrderId;

    // 外部订单号,请求方保证唯一性
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    public static QueryWithholdPayresultRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWithholdPayresultRequest self = new QueryWithholdPayresultRequest();
        return TeaModel.build(map, self);
    }

    public QueryWithholdPayresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWithholdPayresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWithholdPayresultRequest setEntrustOrderId(String entrustOrderId) {
        this.entrustOrderId = entrustOrderId;
        return this;
    }
    public String getEntrustOrderId() {
        return this.entrustOrderId;
    }

    public QueryWithholdPayresultRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
