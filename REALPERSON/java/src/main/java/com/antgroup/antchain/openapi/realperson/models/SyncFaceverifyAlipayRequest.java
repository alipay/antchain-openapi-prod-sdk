// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class SyncFaceverifyAlipayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务请求唯一标识
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 数科租户 ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // ASOP审批单号
    @NameInMap("asop_ticket_id")
    @Validation(required = true)
    public String asopTicketId;

    // 扩展参数
    @NameInMap("extern_param")
    public String externParam;

    public static SyncFaceverifyAlipayRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFaceverifyAlipayRequest self = new SyncFaceverifyAlipayRequest();
        return TeaModel.build(map, self);
    }

    public SyncFaceverifyAlipayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFaceverifyAlipayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFaceverifyAlipayRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public SyncFaceverifyAlipayRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SyncFaceverifyAlipayRequest setAsopTicketId(String asopTicketId) {
        this.asopTicketId = asopTicketId;
        return this;
    }
    public String getAsopTicketId() {
        return this.asopTicketId;
    }

    public SyncFaceverifyAlipayRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
