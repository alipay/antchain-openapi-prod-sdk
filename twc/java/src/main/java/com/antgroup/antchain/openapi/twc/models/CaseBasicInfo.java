// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaseBasicInfo extends TeaModel {
    // 案件租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 案件类型:LEASE：租赁，FINANCIAL：金融，OTHER：其他
    @NameInMap("case_type")
    @Validation(required = true)
    public String caseType;

    // 标的金额（单位元）
    @NameInMap("amount")
    public String amount;

    // 业务来源主键
    @NameInMap("input_source_id")
    @Validation(required = true)
    public String inputSourceId;

    // 案件进件来源 
    @NameInMap("input_source")
    @Validation(required = true)
    public String inputSource;

    // 根据业务来源主键对应订单号下的租赁事实报告和证据列表页面的嵌入URL
    @NameInMap("case_ext")
    public String caseExt;

    public static CaseBasicInfo build(java.util.Map<String, ?> map) throws Exception {
        CaseBasicInfo self = new CaseBasicInfo();
        return TeaModel.build(map, self);
    }

    public CaseBasicInfo setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CaseBasicInfo setCaseType(String caseType) {
        this.caseType = caseType;
        return this;
    }
    public String getCaseType() {
        return this.caseType;
    }

    public CaseBasicInfo setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public CaseBasicInfo setInputSourceId(String inputSourceId) {
        this.inputSourceId = inputSourceId;
        return this;
    }
    public String getInputSourceId() {
        return this.inputSourceId;
    }

    public CaseBasicInfo setInputSource(String inputSource) {
        this.inputSource = inputSource;
        return this;
    }
    public String getInputSource() {
        return this.inputSource;
    }

    public CaseBasicInfo setCaseExt(String caseExt) {
        this.caseExt = caseExt;
        return this;
    }
    public String getCaseExt() {
        return this.caseExt;
    }

}
