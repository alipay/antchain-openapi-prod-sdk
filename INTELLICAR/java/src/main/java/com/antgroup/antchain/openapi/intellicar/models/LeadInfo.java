// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class LeadInfo extends TeaModel {
    // 线索信息
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("lead_id")
    @Validation(required = true)
    public String leadId;

    // 状态值
    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static LeadInfo build(java.util.Map<String, ?> map) throws Exception {
        LeadInfo self = new LeadInfo();
        return TeaModel.build(map, self);
    }

    public LeadInfo setLeadId(String leadId) {
        this.leadId = leadId;
        return this;
    }
    public String getLeadId() {
        return this.leadId;
    }

    public LeadInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
