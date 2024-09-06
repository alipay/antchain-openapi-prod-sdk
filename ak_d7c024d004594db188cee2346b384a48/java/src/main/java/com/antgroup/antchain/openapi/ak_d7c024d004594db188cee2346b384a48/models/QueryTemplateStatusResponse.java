// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d7c024d004594db188cee2346b384a48.models;

import com.aliyun.tea.*;

public class QueryTemplateStatusResponse extends TeaModel {
    // 彩信模版id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模版名称
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 模板状态
    @NameInMap("template_status")
    @Validation(required = true)
    public String templateStatus;

    // 审核信息
    @NameInMap("censor_result")
    @Validation(required = true)
    public String censorResult;

    public static QueryTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateStatusResponse self = new QueryTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryTemplateStatusResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryTemplateStatusResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QueryTemplateStatusResponse setTemplateStatus(String templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public String getTemplateStatus() {
        return this.templateStatus;
    }

    public QueryTemplateStatusResponse setCensorResult(String censorResult) {
        this.censorResult = censorResult;
        return this;
    }
    public String getCensorResult() {
        return this.censorResult;
    }

}
