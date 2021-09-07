// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class GoodsTemplateDTO extends TeaModel {
    // 模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 商品名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品模板描述
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static GoodsTemplateDTO build(java.util.Map<String, ?> map) throws Exception {
        GoodsTemplateDTO self = new GoodsTemplateDTO();
        return TeaModel.build(map, self);
    }

    public GoodsTemplateDTO setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GoodsTemplateDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GoodsTemplateDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
