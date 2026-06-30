// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListDcpAccountbookRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
    @NameInMap("outer_order_no")
    @Validation(required = true)
    public String outerOrderNo;

    // 企业入驻租户ID
    @NameInMap("dcp_tenant_id")
    @Validation(required = true)
    public String dcpTenantId;

    // 扩展信息，预留字段
    @NameInMap("extern_param")
    public String externParam;

    public static ListDcpAccountbookRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDcpAccountbookRequest self = new ListDcpAccountbookRequest();
        return TeaModel.build(map, self);
    }

    public ListDcpAccountbookRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListDcpAccountbookRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListDcpAccountbookRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public ListDcpAccountbookRequest setDcpTenantId(String dcpTenantId) {
        this.dcpTenantId = dcpTenantId;
        return this;
    }
    public String getDcpTenantId() {
        return this.dcpTenantId;
    }

    public ListDcpAccountbookRequest setExternParam(String externParam) {
        this.externParam = externParam;
        return this;
    }
    public String getExternParam() {
        return this.externParam;
    }

}
