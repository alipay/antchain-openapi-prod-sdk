// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class TemplateInfo extends TeaModel {
    // 模板id
    /**
     * <strong>example:</strong>
     * <p>T20240712134030001693</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模板版本，不传取最新模板
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_version")
    public Long templateVersion;

    // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
    /**
     * <strong>example:</strong>
     * <p>{&quot;模板key&quot;:&quot;模板value&quot;}</p>
     */
    @NameInMap("template_args")
    public String templateArgs;

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

    public TemplateInfo setTemplateVersion(Long templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public Long getTemplateVersion() {
        return this.templateVersion;
    }

    public TemplateInfo setTemplateArgs(String templateArgs) {
        this.templateArgs = templateArgs;
        return this;
    }
    public String getTemplateArgs() {
        return this.templateArgs;
    }

}
