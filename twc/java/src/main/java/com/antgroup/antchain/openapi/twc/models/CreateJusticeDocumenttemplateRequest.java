// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateJusticeDocumenttemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文书模板id，如果不为空是修改
    @NameInMap("document_template_id")
    public String documentTemplateId;

    // 维权要素模板id
    @NameInMap("right_protect_template_id")
    @Validation(required = true)
    public String rightProtectTemplateId;

    // 文书模板类型名称，如“仲裁申请书”、“调解协议书”、“起诉状”等
    @NameInMap("template_name")
    @Validation(required = true)
    public String templateName;

    // 文书生成格式类型，枚举
    // NORMAL：普通文本，
    // RICHTEXT：富文本，
    // PDF：pdf格式文件
    @NameInMap("output_type")
    @Validation(required = true)
    public String outputType;

    // 传入的模板样式文件格式（目前只支持txt、doc）
    // TXT：txt格式
    // DOC：doc格式
    @NameInMap("input_type")
    @Validation(required = true)
    public String inputType;

    // 原始模板文件下载地址，如果inputType为DOC则必填
    @NameInMap("download_url")
    public String downloadUrl;

    // 模板数据内容，如果inputType为TXT则必填
    @NameInMap("text_content")
    public String textContent;

    public static CreateJusticeDocumenttemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJusticeDocumenttemplateRequest self = new CreateJusticeDocumenttemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateJusticeDocumenttemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateJusticeDocumenttemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateJusticeDocumenttemplateRequest setDocumentTemplateId(String documentTemplateId) {
        this.documentTemplateId = documentTemplateId;
        return this;
    }
    public String getDocumentTemplateId() {
        return this.documentTemplateId;
    }

    public CreateJusticeDocumenttemplateRequest setRightProtectTemplateId(String rightProtectTemplateId) {
        this.rightProtectTemplateId = rightProtectTemplateId;
        return this;
    }
    public String getRightProtectTemplateId() {
        return this.rightProtectTemplateId;
    }

    public CreateJusticeDocumenttemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateJusticeDocumenttemplateRequest setOutputType(String outputType) {
        this.outputType = outputType;
        return this;
    }
    public String getOutputType() {
        return this.outputType;
    }

    public CreateJusticeDocumenttemplateRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public CreateJusticeDocumenttemplateRequest setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public CreateJusticeDocumenttemplateRequest setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }
    public String getTextContent() {
        return this.textContent;
    }

}
