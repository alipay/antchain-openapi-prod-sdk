// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryGatewayMyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 字符串类型入参
    @NameInMap("test_1")
    @Validation(required = true)
    public String test1;

    // 数字入参
    @NameInMap("test_2")
    @Validation(required = true)
    public Long test2;

    // 布尔值入参
    @NameInMap("test_3")
    @Validation(required = true)
    public Boolean test3;

    // 日期类型入参
    @NameInMap("test_4")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String test4;

    // 数组类型入参（数组内元素为结构体类型）
    @NameInMap("test_5")
    @Validation(required = true)
    public java.util.List<NumberTest> test5;

    // 结构体入参
    @NameInMap("test_6")
    @Validation(required = true)
    public NumberTest test6;

    public static QueryGatewayMyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryGatewayMyRequest self = new QueryGatewayMyRequest();
        return TeaModel.build(map, self);
    }

    public QueryGatewayMyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryGatewayMyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryGatewayMyRequest setTest1(String test1) {
        this.test1 = test1;
        return this;
    }
    public String getTest1() {
        return this.test1;
    }

    public QueryGatewayMyRequest setTest2(Long test2) {
        this.test2 = test2;
        return this;
    }
    public Long getTest2() {
        return this.test2;
    }

    public QueryGatewayMyRequest setTest3(Boolean test3) {
        this.test3 = test3;
        return this;
    }
    public Boolean getTest3() {
        return this.test3;
    }

    public QueryGatewayMyRequest setTest4(String test4) {
        this.test4 = test4;
        return this;
    }
    public String getTest4() {
        return this.test4;
    }

    public QueryGatewayMyRequest setTest5(java.util.List<NumberTest> test5) {
        this.test5 = test5;
        return this;
    }
    public java.util.List<NumberTest> getTest5() {
        return this.test5;
    }

    public QueryGatewayMyRequest setTest6(NumberTest test6) {
        this.test6 = test6;
        return this;
    }
    public NumberTest getTest6() {
        return this.test6;
    }

}
