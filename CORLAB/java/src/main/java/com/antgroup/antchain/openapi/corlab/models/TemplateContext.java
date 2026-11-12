// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.corlab.models;

import com.aliyun.tea.*;

public class TemplateContext extends TeaModel {
    // 模版header头
    /**
     * <strong>example:</strong>
     * <p>bizCode</p>
     */
    @NameInMap("head_name")
    @Validation(required = true)
    public String headName;

    // 字段描述
    /**
     * <strong>example:</strong>
     * <p>加密身份id</p>
     */
    @NameInMap("remark")
    public String remark;

    // 是否为必填:REQUIRED,ONE_OF
    /**
     * <strong>example:</strong>
     * <p>ONE_OF</p>
     */
    @NameInMap("require_type")
    @Validation(required = true)
    public String requireType;

    public static TemplateContext build(java.util.Map<String, ?> map) throws Exception {
        TemplateContext self = new TemplateContext();
        return TeaModel.build(map, self);
    }

    public TemplateContext setHeadName(String headName) {
        this.headName = headName;
        return this;
    }
    public String getHeadName() {
        return this.headName;
    }

    public TemplateContext setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public TemplateContext setRequireType(String requireType) {
        this.requireType = requireType;
        return this;
    }
    public String getRequireType() {
        return this.requireType;
    }

}
