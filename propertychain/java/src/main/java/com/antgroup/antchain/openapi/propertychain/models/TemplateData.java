// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class TemplateData extends TeaModel {
    // 字典类型ID
    @NameInMap("template_uid")
    public String templateUid;

    // 数字字典内容
    @NameInMap("form_data")
    public TemplateDataConverter formData;

    public static TemplateData build(java.util.Map<String, ?> map) throws Exception {
        TemplateData self = new TemplateData();
        return TeaModel.build(map, self);
    }

    public TemplateData setTemplateUid(String templateUid) {
        this.templateUid = templateUid;
        return this;
    }
    public String getTemplateUid() {
        return this.templateUid;
    }

    public TemplateData setFormData(TemplateDataConverter formData) {
        this.formData = formData;
        return this;
    }
    public TemplateDataConverter getFormData() {
        return this.formData;
    }

}
