// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class TemplateArgs extends TeaModel {
    // 模板id
    /**
     * <strong>example:</strong>
     * <p>T1762152216</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 模板版本
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("template_version")
    public String templateVersion;

    // 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
    /**
     * <strong>example:</strong>
     * <p>{&quot;模板key&quot;:&quot;模板value&quot;}</p>
     */
    @NameInMap("template_args")
    public String templateArgs;

    public static TemplateArgs build(java.util.Map<String, ?> map) throws Exception {
        TemplateArgs self = new TemplateArgs();
        return TeaModel.build(map, self);
    }

    public TemplateArgs setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public TemplateArgs setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public TemplateArgs setTemplateArgs(String templateArgs) {
        this.templateArgs = templateArgs;
        return this;
    }
    public String getTemplateArgs() {
        return this.templateArgs;
    }

}
