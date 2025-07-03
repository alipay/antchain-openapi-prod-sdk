// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class SCRealEstateQueryRequestBody extends TeaModel {
    // cmd
    /**
     * <strong>example:</strong>
     * <p>&quot;cmd&quot;: {       &quot;cmdCode&quot;: &quot;SC-RealEstate-Query&quot;,       &quot;version&quot;: &quot;test_d19bd9d59915&quot;     }</p>
     */
    @NameInMap("cmd")
    @Validation(required = true)
    public Cmd cmd;

    // 路由信息
    /**
     * <strong>example:</strong>
     * <p>&quot;routeCondition&quot;: {       &quot;channelId&quot;: &quot;HZZKZTKJ&quot;     }</p>
     */
    @NameInMap("route_condition")
    @Validation(required = true)
    public RouteCondition routeCondition;

    // requestId
    /**
     * <strong>example:</strong>
     * <p>test_8c964bb7781a</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // payload
    /**
     * <strong>example:</strong>
     * <p>{ &quot;xm&quot;: &quot;张三&quot;,   &quot;sfz&quot;: &quot;51382219970820817X&quot;}</p>
     */
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
