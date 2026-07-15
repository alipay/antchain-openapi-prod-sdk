// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class ShortUrlCreateResult extends TeaModel {
    // 卡片模板id
    /**
     * <strong>example:</strong>
     * <p>202409050005000000019020</p>
     */
    @NameInMap("smart_template_id")
    @Validation(required = true)
    public String smartTemplateId;

    // 客户批号
    /**
     * <strong>example:</strong>
     * <p>1223112</p>
     */
    @NameInMap("cust_batch_id")
    @Validation(required = true)
    public String custBatchId;

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

    public ShortUrlCreateResult setCustBatchId(String custBatchId) {
        this.custBatchId = custBatchId;
        return this;
    }
    public String getCustBatchId() {
        return this.custBatchId;
    }

    public ShortUrlCreateResult setParamList(java.util.List<ShortUrlResult> paramList) {
        this.paramList = paramList;
        return this;
    }
    public java.util.List<ShortUrlResult> getParamList() {
        return this.paramList;
    }

}
