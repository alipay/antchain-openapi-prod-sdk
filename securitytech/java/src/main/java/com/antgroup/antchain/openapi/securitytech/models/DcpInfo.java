// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class DcpInfo extends TeaModel {
    // 企业入驻租户ID
    @NameInMap("dcp_tenant_id")
    @Validation(required = true)
    public String dcpTenantId;

    // 企业名称
    @NameInMap("dcp_name")
    @Validation(required = true)
    public String dcpName;

    public static DcpInfo build(java.util.Map<String, ?> map) throws Exception {
        DcpInfo self = new DcpInfo();
        return TeaModel.build(map, self);
    }

    public DcpInfo setDcpTenantId(String dcpTenantId) {
        this.dcpTenantId = dcpTenantId;
        return this;
    }
    public String getDcpTenantId() {
        return this.dcpTenantId;
    }

    public DcpInfo setDcpName(String dcpName) {
        this.dcpName = dcpName;
        return this;
    }
    public String getDcpName() {
        return this.dcpName;
    }

}
