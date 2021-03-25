// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateContractTemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 模板文件md5值，再做base64编码
    @NameInMap("content_md5")
    @Validation(required = true)
    public String contentMd5;

    // 目标文件的MIME类型
    @NameInMap("content_type")
    @Validation(required = true)
    public String contentType;

    // 是否需要转成pdf，如果模板文件为.doc/.docx 传true，为pdf传false
    @NameInMap("convert2_pdf")
    @Validation(required = true)
    public Boolean convert2Pdf;

    // 文件名称，必须带扩展名如:.pdf,.doc,.docx
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static CreateContractTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContractTemplateRequest self = new CreateContractTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateContractTemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateContractTemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateContractTemplateRequest setContentMd5(String contentMd5) {
        this.contentMd5 = contentMd5;
        return this;
    }
    public String getContentMd5() {
        return this.contentMd5;
    }

    public CreateContractTemplateRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public CreateContractTemplateRequest setConvert2Pdf(Boolean convert2Pdf) {
        this.convert2Pdf = convert2Pdf;
        return this;
    }
    public Boolean getConvert2Pdf() {
        return this.convert2Pdf;
    }

    public CreateContractTemplateRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
