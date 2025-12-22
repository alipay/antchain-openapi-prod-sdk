// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SupplierInfo extends TeaModel {
    // 供应商id
    /**
     * <strong>example:</strong>
     * <p>ABCDEFGH</p>
     */
    @NameInMap("agent_supplier_id")
    @Validation(required = true)
    public String agentSupplierId;

    // 被代理机构社会统一信用码
    /**
     * <strong>example:</strong>
     * <p>12345678</p>
     */
    @NameInMap("agent_supplier_corp_id")
    @Validation(required = true)
    public String agentSupplierCorpId;

    // 被代理机构名称
    /**
     * <strong>example:</strong>
     * <p>阿里巴巴有限公司</p>
     */
    @NameInMap("agent_supplier_corp_name")
    @Validation(required = true)
    public String agentSupplierCorpName;

    // 被代理供应商名称
    /**
     * <strong>example:</strong>
     * <p>阿里</p>
     */
    @NameInMap("agent_supplier_name")
    @Validation(required = true)
    public String agentSupplierName;

    // 被代理机构的法人名称
    /**
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("agent_supplier_corp_owner_name")
    @Validation(required = true)
    public String agentSupplierCorpOwnerName;

    // 额外信息
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
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

    public SupplierInfo setAgentSupplierCorpId(String agentSupplierCorpId) {
        this.agentSupplierCorpId = agentSupplierCorpId;
        return this;
    }
    public String getAgentSupplierCorpId() {
        return this.agentSupplierCorpId;
    }

    public SupplierInfo setAgentSupplierCorpName(String agentSupplierCorpName) {
        this.agentSupplierCorpName = agentSupplierCorpName;
        return this;
    }
    public String getAgentSupplierCorpName() {
        return this.agentSupplierCorpName;
    }

    public SupplierInfo setAgentSupplierName(String agentSupplierName) {
        this.agentSupplierName = agentSupplierName;
        return this;
    }
    public String getAgentSupplierName() {
        return this.agentSupplierName;
    }

    public SupplierInfo setAgentSupplierCorpOwnerName(String agentSupplierCorpOwnerName) {
        this.agentSupplierCorpOwnerName = agentSupplierCorpOwnerName;
        return this;
    }
    public String getAgentSupplierCorpOwnerName() {
        return this.agentSupplierCorpOwnerName;
    }

    public SupplierInfo setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

}
