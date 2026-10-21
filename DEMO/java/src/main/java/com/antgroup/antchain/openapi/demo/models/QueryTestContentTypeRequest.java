// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询输入
    @NameInMap("data")
    public String data;

    // datax
    @NameInMap("datax")
    public String datax;

    // y的描述
    @NameInMap("datay")
    public Boolean datay;

    public static QueryTestContentTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypeRequest self = new QueryTestContentTypeRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestContentTypeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestContentTypeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryTestContentTypeRequest setDatax(String datax) {
        this.datax = datax;
        return this;
    }
    public String getDatax() {
        return this.datax;
    }

    public QueryTestContentTypeRequest setDatay(Boolean datay) {
        this.datay = datay;
        return this;
    }
    public Boolean getDatay() {
        return this.datay;
    }

}
