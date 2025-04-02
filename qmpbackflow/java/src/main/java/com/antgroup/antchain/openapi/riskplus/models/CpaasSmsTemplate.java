// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class CpaasSmsTemplate extends TeaModel {
    // 模板类型
    @NameInMap("template_type")
    public String templateType;

    // 模板名称
    @NameInMap("template_name")
    public String templateName;

    // 模板内容
    @NameInMap("template_content")
    public String templateContent;

    // 审批状态
    @NameInMap("status")
    public String status;

    // 模版code
    @NameInMap("template_code")
    public String templateCode;

    // 审核未通过原因
    @NameInMap("fail_reason")
    public String failReason;

    // 短信创建时间
    @NameInMap("create_time")
    public String createTime;

    public static CpaasSmsTemplate build(java.util.Map<String, ?> map) throws Exception {
        CpaasSmsTemplate self = new CpaasSmsTemplate();
        return TeaModel.build(map, self);
    }

    public CpaasSmsTemplate setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public CpaasSmsTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CpaasSmsTemplate setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }
    public String getTemplateContent() {
        return this.templateContent;
    }

    public CpaasSmsTemplate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CpaasSmsTemplate setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CpaasSmsTemplate setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public CpaasSmsTemplate setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

}
