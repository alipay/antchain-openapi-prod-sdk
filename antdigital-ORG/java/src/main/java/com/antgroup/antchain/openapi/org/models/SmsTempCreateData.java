// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class SmsTempCreateData extends TeaModel {
    // 模版id
    /**
     * <strong>example:</strong>
     * <p>202408150005000000019020</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static SmsTempCreateData build(java.util.Map<String, ?> map) throws Exception {
        SmsTempCreateData self = new SmsTempCreateData();
        return TeaModel.build(map, self);
    }

    public SmsTempCreateData setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
