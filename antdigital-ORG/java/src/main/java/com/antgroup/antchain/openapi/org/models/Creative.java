// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class Creative extends TeaModel {
    // 业务场景标识
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 业务ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 创意ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("creative_id")
    @Validation(required = true)
    public String creativeId;

    // 模版类型
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("template_type")
    @Validation(required = true)
    public String templateType;

    // 模板格式
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("template_format")
    @Validation(required = true)
    public String templateFormat;

    // 模板 ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 名称
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 渲染类型
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("render_type")
    public String renderType;

    // 渲染状态
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("render_status")
    public String renderStatus;

    // 核验状态
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("audit_status")
    public String auditStatus;

    // 创意链接
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("creative_url")
    public String creativeUrl;

    // 创意 AFTS ID
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("creative_afts_id")
    public String creativeAftsId;

    // 宽度
    @NameInMap("width")
    public Long width;

    // 高度
    @NameInMap("height")
    public Long height;

    public static Creative build(java.util.Map<String, ?> map) throws Exception {
        Creative self = new Creative();
        return TeaModel.build(map, self);
    }

    public Creative setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public Creative setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public Creative setCreativeId(String creativeId) {
        this.creativeId = creativeId;
        return this;
    }
    public String getCreativeId() {
        return this.creativeId;
    }

    public Creative setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public Creative setTemplateFormat(String templateFormat) {
        this.templateFormat = templateFormat;
        return this;
    }
    public String getTemplateFormat() {
        return this.templateFormat;
    }

    public Creative setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Creative setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Creative setRenderType(String renderType) {
        this.renderType = renderType;
        return this;
    }
    public String getRenderType() {
        return this.renderType;
    }

    public Creative setRenderStatus(String renderStatus) {
        this.renderStatus = renderStatus;
        return this;
    }
    public String getRenderStatus() {
        return this.renderStatus;
    }

    public Creative setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public String getAuditStatus() {
        return this.auditStatus;
    }

    public Creative setCreativeUrl(String creativeUrl) {
        this.creativeUrl = creativeUrl;
        return this;
    }
    public String getCreativeUrl() {
        return this.creativeUrl;
    }

    public Creative setCreativeAftsId(String creativeAftsId) {
        this.creativeAftsId = creativeAftsId;
        return this;
    }
    public String getCreativeAftsId() {
        return this.creativeAftsId;
    }

    public Creative setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public Creative setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

}
