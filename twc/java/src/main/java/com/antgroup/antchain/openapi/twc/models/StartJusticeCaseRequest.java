// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class StartJusticeCaseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 案件Id,创建案件返回的id
    @NameInMap("case_id")
    @Validation(required = true)
    public Long caseId;

    // 处置端租户ID
    @NameInMap("isv_tenant_id")
    @Validation(required = true)
    public String isvTenantId;

    // 处置方式, 5-司法调解
    @NameInMap("judicial_biz_type")
    @Validation(required = true)
    public Long judicialBizType;

    // 司法调解基础参数, 当处置方式为5, 必填.
    @NameInMap("judiciall_mediation_param")
    public JudicialMediationBaseParamInfo judiciallMediationParam;

    public static StartJusticeCaseRequest build(java.util.Map<String, ?> map) throws Exception {
        StartJusticeCaseRequest self = new StartJusticeCaseRequest();
        return TeaModel.build(map, self);
    }

    public StartJusticeCaseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartJusticeCaseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartJusticeCaseRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public StartJusticeCaseRequest setIsvTenantId(String isvTenantId) {
        this.isvTenantId = isvTenantId;
        return this;
    }
    public String getIsvTenantId() {
        return this.isvTenantId;
    }

    public StartJusticeCaseRequest setJudicialBizType(Long judicialBizType) {
        this.judicialBizType = judicialBizType;
        return this;
    }
    public Long getJudicialBizType() {
        return this.judicialBizType;
    }

    public StartJusticeCaseRequest setJudiciallMediationParam(JudicialMediationBaseParamInfo judiciallMediationParam) {
        this.judiciallMediationParam = judiciallMediationParam;
        return this;
    }
    public JudicialMediationBaseParamInfo getJudiciallMediationParam() {
        return this.judiciallMediationParam;
    }

}
