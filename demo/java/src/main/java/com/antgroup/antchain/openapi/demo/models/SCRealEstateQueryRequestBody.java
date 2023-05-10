// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryRequestBody extends TeaModel {
    // cmd
    @NameInMap("cmd")
    @Validation(required = true)
    public Cmd cmd;

    // 路由信息
    @NameInMap("route_condition")
    @Validation(required = true)
    public RouteCondition routeCondition;

    // requestId
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // payload
    @NameInMap("payload")
    @Validation(required = true)
    public SCRealEstateQueryRequestPayload payload;

    public static SCRealEstateQueryRequestBody build(java.util.Map<String, ?> map) throws Exception {
        SCRealEstateQueryRequestBody self = new SCRealEstateQueryRequestBody();
        return TeaModel.build(map, self);
    }

    public SCRealEstateQueryRequestBody setCmd(Cmd cmd) {
        this.cmd = cmd;
        return this;
    }
    public Cmd getCmd() {
        return this.cmd;
    }

    public SCRealEstateQueryRequestBody setRouteCondition(RouteCondition routeCondition) {
        this.routeCondition = routeCondition;
        return this;
    }
    public RouteCondition getRouteCondition() {
        return this.routeCondition;
    }

    public SCRealEstateQueryRequestBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SCRealEstateQueryRequestBody setPayload(SCRealEstateQueryRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public SCRealEstateQueryRequestPayload getPayload() {
        return this.payload;
    }

}
