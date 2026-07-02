// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class MerchantAgentPage extends TeaModel {
    // 进件id
    /**
     * <strong>example:</strong>
     * <p>1231234343423423</p>
     */
    @NameInMap("pay_expand_id")
    @Validation(required = true)
    public String payExpandId;

    // 	
    // 代理企业名称
    /**
     * <strong>example:</strong>
     * <p>xx商户</p>
     */
    @NameInMap("agent_name")
    @Validation(required = true)
    public String agentName;

    // 租户8位id
    /**
     * <strong>example:</strong>
     * <p>SADWQWAW</p>
     */
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 业务类型
    /**
     * <strong>example:</strong>
     * <p>业务类型</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 进件审核状态 枚举
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("pay_expand_status")
    @Validation(required = true)
    public String payExpandStatus;

    public static MerchantAgentPage build(java.util.Map<String, ?> map) throws Exception {
        MerchantAgentPage self = new MerchantAgentPage();
        return TeaModel.build(map, self);
    }

    public MerchantAgentPage setPayExpandId(String payExpandId) {
        this.payExpandId = payExpandId;
        return this;
    }
    public String getPayExpandId() {
        return this.payExpandId;
    }

    public MerchantAgentPage setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public MerchantAgentPage setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public MerchantAgentPage setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public MerchantAgentPage setPayExpandStatus(String payExpandStatus) {
        this.payExpandStatus = payExpandStatus;
        return this;
    }
    public String getPayExpandStatus() {
        return this.payExpandStatus;
    }

}
