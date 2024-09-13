// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class SmsTempCreateData extends TeaModel {
    // 模版id
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
