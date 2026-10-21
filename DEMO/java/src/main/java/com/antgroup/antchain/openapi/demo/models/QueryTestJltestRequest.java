// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestJltestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 数据bbb
    @NameInMap("datax")
    @Validation(required = true)
    public String datax;

    // 数据bbb
    @NameInMap("datay")
    @Validation(required = true)
    public String datay;

    // 数据ddd
    @NameInMap("dataa")
    @Validation(required = true)
    public String dataa;

    public static QueryTestJltestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestJltestRequest self = new QueryTestJltestRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestJltestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestJltestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestJltestRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryTestJltestRequest setDatax(String datax) {
        this.datax = datax;
        return this;
    }
    public String getDatax() {
        return this.datax;
    }

    public QueryTestJltestRequest setDatay(String datay) {
        this.datay = datay;
        return this;
    }
    public String getDatay() {
        return this.datay;
    }

    public QueryTestJltestRequest setDataa(String dataa) {
        this.dataa = dataa;
        return this;
    }
    public String getDataa() {
        return this.dataa;
    }

}
