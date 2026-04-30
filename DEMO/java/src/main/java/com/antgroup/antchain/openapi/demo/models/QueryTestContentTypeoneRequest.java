// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryTestContentTypeoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询输入
    @NameInMap("data")
    @Validation(required = true)
    public String data;

    // 测试
    @NameInMap("person")
    public Person person;

    public static QueryTestContentTypeoneRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTestContentTypeoneRequest self = new QueryTestContentTypeoneRequest();
        return TeaModel.build(map, self);
    }

    public QueryTestContentTypeoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTestContentTypeoneRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryTestContentTypeoneRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryTestContentTypeoneRequest setPerson(Person person) {
        this.person = person;
        return this;
    }
    public Person getPerson() {
        return this.person;
    }

}
