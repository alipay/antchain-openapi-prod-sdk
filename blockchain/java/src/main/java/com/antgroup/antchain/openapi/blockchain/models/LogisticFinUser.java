// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class LogisticFinUser extends TeaModel {
    // 纳税人识别号
    @NameInMap("drawee_tax_no")
    @Validation(required = true)
    public String draweeTaxNo;

    // 业务方企业id
    @NameInMap("org_id")
    @Validation(required = true)
    public String orgId;

    // 业务方用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static LogisticFinUser build(java.util.Map<String, ?> map) throws Exception {
        LogisticFinUser self = new LogisticFinUser();
        return TeaModel.build(map, self);
    }

    public LogisticFinUser setDraweeTaxNo(String draweeTaxNo) {
        this.draweeTaxNo = draweeTaxNo;
        return this;
    }
    public String getDraweeTaxNo() {
        return this.draweeTaxNo;
    }

    public LogisticFinUser setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public LogisticFinUser setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
