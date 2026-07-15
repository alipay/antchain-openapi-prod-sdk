// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class QueryTemplateStatusRes extends TeaModel {
    // 短信模板id
    /**
     * <strong>example:</strong>
     * <p>202409050005000000019020</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 短信标题
    /**
     * <strong>example:</strong>
     * <p> XX活动</p>
     */
    @NameInMap("sms_title")
    @Validation(required = true)
    public String smsTitle;

    // 模板状态
    /**
     * <strong>example:</strong>
     * <p> CENSOR_ING、 CENSOR_PASS、 CENSOR_FAILED</p>
     */
    @NameInMap("template_status")
    @Validation(required = true)
    public String templateStatus;

    // 审核结果描述
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("censor_result")
    @Validation(required = true)
    public String censorResult;

    public static QueryTemplateStatusRes build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateStatusRes self = new QueryTemplateStatusRes();
        return TeaModel.build(map, self);
    }

    public QueryTemplateStatusRes setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryTemplateStatusRes setSmsTitle(String smsTitle) {
        this.smsTitle = smsTitle;
        return this;
    }
    public String getSmsTitle() {
        return this.smsTitle;
    }

    public QueryTemplateStatusRes setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public QueryTemplateStatusRes setCensorResult(String censorResult) {
        this.censorResult = censorResult;
        return this;
    }
    public String getCensorResult() {
        return this.censorResult;
    }

}
