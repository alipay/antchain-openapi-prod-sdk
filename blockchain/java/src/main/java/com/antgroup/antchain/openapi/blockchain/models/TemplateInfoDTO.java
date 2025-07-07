// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TemplateInfoDTO extends TeaModel {
    // 主键
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 模板类别：马拉松类、滑雪类
    /**
     * <strong>example:</strong>
     * <p>marathon</p>
     */
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 模板内容， json格式文本
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("claim_template")
    @Validation(required = true)
    public String claimTemplate;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("gmt_create")
    @Validation(required = true)
    public String gmtCreate;

    // 修改时间
    /**
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static TemplateInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        TemplateInfoDTO self = new TemplateInfoDTO();
        return TeaModel.build(map, self);
    }

    public TemplateInfoDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public TemplateInfoDTO setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public TemplateInfoDTO setClaimTemplate(String claimTemplate) {
        this.claimTemplate = claimTemplate;
        return this;
    }
    public String getClaimTemplate() {
        return this.claimTemplate;
    }

    public TemplateInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public TemplateInfoDTO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
