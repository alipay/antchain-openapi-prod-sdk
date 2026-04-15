// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryInstanceidRuleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数字
    @NameInMap("count")
    @Validation(required = true)
    public String count;

    // 姓名
    @NameInMap("oprator")
    @Validation(required = true)
    public String oprator;

    // 结构体
    @NameInMap("struct")
    @Validation(required = true)
    public TestA struct;

    public static QueryInstanceidRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceidRuleRequest self = new QueryInstanceidRuleRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceidRuleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInstanceidRuleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInstanceidRuleRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public QueryInstanceidRuleRequest setOprator(String oprator) {
        this.oprator = oprator;
        return this;
    }
    public String getOprator() {
        return this.oprator;
    }

    public QueryInstanceidRuleRequest setStruct(TestA struct) {
        this.struct = struct;
        return this;
    }
    public TestA getStruct() {
        return this.struct;
    }

}
