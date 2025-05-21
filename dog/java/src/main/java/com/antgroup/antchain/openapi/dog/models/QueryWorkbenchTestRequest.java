// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dog.models;

import com.aliyun.tea.*;

public class QueryWorkbenchTestRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 3000
    @NameInMap("timeout")
    public String timeout;

    // 1
    @NameInMap("count")
    public Long count;

    // 2022-11-07 14:46
    @NameInMap("time")
    public String time;

    // call for back
    @NameInMap("desc")
    public String desc;

    // wanyi
    @NameInMap("operator")
    public String operator;

    public static QueryWorkbenchTestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkbenchTestRequest self = new QueryWorkbenchTestRequest();
        return TeaModel.build(map, self);
    }

    public QueryWorkbenchTestRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryWorkbenchTestRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryWorkbenchTestRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public QueryWorkbenchTestRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public QueryWorkbenchTestRequest setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public QueryWorkbenchTestRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public QueryWorkbenchTestRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
