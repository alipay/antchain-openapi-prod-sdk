// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class TemplateInfo extends TeaModel {
    // 数据字id
    @NameInMap("template_id")
    public String templateId;

    // 数据字典名称
    @NameInMap("template_name")
    public String templateName;

    // 数据字典内容
    @NameInMap("template")
    public String template;

    public static TemplateInfo build(java.util.Map<String, ?> map) throws Exception {
        TemplateInfo self = new TemplateInfo();
        return TeaModel.build(map, self);
    }

    public TemplateInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TemplateInfo setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public TemplateInfo setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
