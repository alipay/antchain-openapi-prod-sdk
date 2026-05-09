// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.qqq.models;

import com.aliyun.tea.*;

public class QueryAntchainDemosdkTestapiRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 测试
    @NameInMap("class_name")
    public DemoClass className;

    public static QueryAntchainDemosdkTestapiRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainDemosdkTestapiRequest self = new QueryAntchainDemosdkTestapiRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainDemosdkTestapiRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainDemosdkTestapiRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainDemosdkTestapiRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryAntchainDemosdkTestapiRequest setClassName(DemoClass className) {
        this.className = className;
        return this;
    }
    public DemoClass getClassName() {
        return this.className;
    }

}
