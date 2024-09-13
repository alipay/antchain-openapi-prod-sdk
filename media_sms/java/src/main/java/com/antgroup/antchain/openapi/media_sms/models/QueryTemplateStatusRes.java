// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryTemplateStatusRes extends TeaModel {
    // 短信模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 短信标题
    @NameInMap("sms_title")
    @Validation(required = true)
    public String smsTitle;

    // 模板状态
    @NameInMap("template_status")
    @Validation(required = true)
    public String templateStatus;

    // 审核结果描述
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
