// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ExpandProcessInfo extends TeaModel {
    // TENANT_INDIRECT_MAINCLASS(间联类目)
    // TENANT_ENDPOINT（回调地址）
    // CUSTOM_SERVICE_INFO（客服信息）
    // AGENTCUSTOMERPESONINFO（间联客诉人员）
    // MERCHANT_EXPAND（商户进件）
    /**
     * <strong>example:</strong>
     * <p>TENANT_INDIRECT_MAINCLASS</p>
     */
    @NameInMap("process_node")
    public String processNode;

    // 是否已提交
    /**
     * <strong>example:</strong>
     * <p>是否已提交</p>
     */
    @NameInMap("is_submitted")
    public Boolean isSubmitted;

    // 审核通过
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("audit_status")
    public String auditStatus;

    public static ExpandProcessInfo build(java.util.Map<String, ?> map) throws Exception {
        ExpandProcessInfo self = new ExpandProcessInfo();
        return TeaModel.build(map, self);
    }

    public ExpandProcessInfo setProcessNode(String processNode) {
        this.processNode = processNode;
        return this;
    }
    public String getProcessNode() {
        return this.processNode;
    }

    public ExpandProcessInfo setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
        return this;
    }
    public Boolean getIsSubmitted() {
        return this.isSubmitted;
    }

    public ExpandProcessInfo setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

}
