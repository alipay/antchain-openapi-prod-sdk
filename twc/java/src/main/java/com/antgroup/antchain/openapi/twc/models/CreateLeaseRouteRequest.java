// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseRouteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 方法名
    @NameInMap("route")
    @Validation(required = true)
    public String route;

    // 具体业务字段，json形式
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    public static CreateLeaseRouteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseRouteRequest self = new CreateLeaseRouteRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseRouteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseRouteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseRouteRequest setRoute(String route) {
        this.route = route;
        return this;
    }
    public String getRoute() {
        return this.route;
    }

    public CreateLeaseRouteRequest setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

}
