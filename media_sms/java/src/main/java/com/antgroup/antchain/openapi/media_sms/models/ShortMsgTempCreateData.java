// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ShortMsgTempCreateData extends TeaModel {
    // 普短模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    public static ShortMsgTempCreateData build(java.util.Map<String, ?> map) throws Exception {
        ShortMsgTempCreateData self = new ShortMsgTempCreateData();
        return TeaModel.build(map, self);
    }

    public ShortMsgTempCreateData setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
