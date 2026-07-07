// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryEcarLcaorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单号码
    @NameInMap("order_no")
    public String orderNo;

    // 来源于三方平台的订单编号，跟前面的订单编号order_no必须任传一个进行订单查询。优先使用碳矩阵平台生成的订单编号查询
    @NameInMap("source_order_no")
    public String sourceOrderNo;

    public static QueryEcarLcaorderRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEcarLcaorderRequest self = new QueryEcarLcaorderRequest();
        return TeaModel.build(map, self);
    }

    public QueryEcarLcaorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryEcarLcaorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryEcarLcaorderRequest setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public QueryEcarLcaorderRequest setSourceOrderNo(String sourceOrderNo) {
        this.sourceOrderNo = sourceOrderNo;
        return this;
    }
    public String getSourceOrderNo() {
        return this.sourceOrderNo;
    }

}
