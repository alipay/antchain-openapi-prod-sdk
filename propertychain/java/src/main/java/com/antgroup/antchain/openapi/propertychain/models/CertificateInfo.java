// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CertificateInfo extends TeaModel {
    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 字典模板定义的数据，key-value的json对象
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 自定义序列（不能重复）
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    public static CertificateInfo build(java.util.Map<String, ?> map) throws Exception {
        CertificateInfo self = new CertificateInfo();
        return TeaModel.build(map, self);
    }

    public CertificateInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public CertificateInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CertificateInfo setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

}
