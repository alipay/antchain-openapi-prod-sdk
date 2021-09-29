// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierInfo extends TeaModel {
    // 供应商id
    @NameInMap("agent_supplier_id")
    @Validation(required = true)
    public String agentSupplierId;

    // 被代理供应商名称
    @NameInMap("agent_supplier_name")
    @Validation(required = true)
    public String agentSupplierName;

    // 额外信息
    @NameInMap("extra_info")
    public String extraInfo;

    public static SupplierInfo build(java.util.Map<String, ?> map) throws Exception {
        SupplierInfo self = new SupplierInfo();
        return TeaModel.build(map, self);
    }

    public SupplierInfo setAgentSupplierId(String agentSupplierId) {
        this.agentSupplierId = agentSupplierId;
        return this;
    }
    public String getAgentSupplierId() {
        return this.agentSupplierId;
    }

    public SupplierInfo setAgentSupplierName(String agentSupplierName) {
        this.agentSupplierName = agentSupplierName;
        return this;
    }
    public String getAgentSupplierName() {
        return this.agentSupplierName;
    }

    public SupplierInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
