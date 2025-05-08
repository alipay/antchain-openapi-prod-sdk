// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class ShortUrlCreateResult extends TeaModel {
    // 卡片模板id
    @NameInMap("smart_template_id")
    @Validation(required = true)
    public String smartTemplateId;

    // 短链详细信息列表
    @NameInMap("param_list")
    @Validation(required = true)
    public java.util.List<ShortUrlResult> paramList;

    public static ShortUrlCreateResult build(java.util.Map<String, ?> map) throws Exception {
        ShortUrlCreateResult self = new ShortUrlCreateResult();
        return TeaModel.build(map, self);
    }

    public ShortUrlCreateResult setSmartTemplateId(String smartTemplateId) {
        this.smartTemplateId = smartTemplateId;
        return this;
    }
    public String getSmartTemplateId() {
        return this.smartTemplateId;
    }

    public ShortUrlCreateResult setParamList(java.util.List<ShortUrlResult> paramList) {
        this.paramList = paramList;
        return this;
    }
    public java.util.List<ShortUrlResult> getParamList() {
        return this.paramList;
    }

}
