// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class RiskEvaluationAgreementExtRequest extends TeaModel {
    // URL：文件地址
    // CONTENT:Base64的文件流
    // 
    /**
     * <strong>example:</strong>
     * <p>URL</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 文件类型
    // PDF
    /**
     * <strong>example:</strong>
     * <p>PDF</p>
     */
    @NameInMap("file_type")
    public String fileType;

    // type为url是传入文件地址
    // type为CONTENT时传入Base64文件内容编码
    // 
    /**
     * <strong>example:</strong>
     * <p>ewronvdnfidonfsidfis</p>
     */
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static RiskEvaluationAgreementExtRequest build(java.util.Map<String, ?> map) throws Exception {
        RiskEvaluationAgreementExtRequest self = new RiskEvaluationAgreementExtRequest();
        return TeaModel.build(map, self);
    }

    public RiskEvaluationAgreementExtRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public RiskEvaluationAgreementExtRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public RiskEvaluationAgreementExtRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
