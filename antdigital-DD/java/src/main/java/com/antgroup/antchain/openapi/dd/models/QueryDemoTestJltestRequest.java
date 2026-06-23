// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryDemoTestJltestRequest extends TeaModel {
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

    public static QueryDemoTestJltestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDemoTestJltestRequest self = new QueryDemoTestJltestRequest();
        return TeaModel.build(map, self);
    }

    public QueryDemoTestJltestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDemoTestJltestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDemoTestJltestRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryDemoTestJltestRequest setDatax(String datax) {
        this.datax = datax;
        return this;
    }
    public String getDatax() {
        return this.datax;
    }

    public QueryDemoTestJltestRequest setDatay(String datay) {
        this.datay = datay;
        return this;
    }
    public String getDatay() {
        return this.datay;
    }

    public QueryDemoTestJltestRequest setDataa(String dataa) {
        this.dataa = dataa;
        return this;
    }
    public String getDataa() {
        return this.dataa;
    }

}
