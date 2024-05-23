// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SaveInnerTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 商户对应租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 魔法库模板code
    @NameInMap("template_code")
    @Validation(required = true)
    public String templateCode;

    // 魔法库模板版本
    @NameInMap("template_version")
    @Validation(required = true)
    public String templateVersion;

    // 文件预览地址
    @NameInMap("preview_address")
    @Validation(required = true)
    public String previewAddress;

    // 创建模板的元素列表
    @NameInMap("template_element_list")
    public String templateElementList;

    // 文件oss存储的key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
    @NameInMap("confirm")
    @Validation(required = true)
    public Boolean confirm;

    public static SaveInnerTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveInnerTemplateRequest self = new SaveInnerTemplateRequest();
        return TeaModel.build(map, self);
    }

    public SaveInnerTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SaveInnerTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SaveInnerTemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SaveInnerTemplateRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SaveInnerTemplateRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public SaveInnerTemplateRequest setPreviewAddress(String previewAddress) {
        this.previewAddress = previewAddress;
        return this;
    }
    public String getPreviewAddress() {
        return this.previewAddress;
    }

    public SaveInnerTemplateRequest setTemplateElementList(String templateElementList) {
        this.templateElementList = templateElementList;
        return this;
    }
    public String getTemplateElementList() {
        return this.templateElementList;
    }

    public SaveInnerTemplateRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SaveInnerTemplateRequest setConfirm(Boolean confirm) {
        this.confirm = confirm;
        return this;
    }
    public Boolean getConfirm() {
        return this.confirm;
    }

}
