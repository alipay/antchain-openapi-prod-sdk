// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class TemplateInstanceErrorDetailDTO extends TeaModel {
    // 当前错误类型的错误行数
    /**
     * <strong>example:</strong>
     * <p>1-5000</p>
     */
    @NameInMap("error_num")
    @Validation(required = true)
    public Long errorNum;

    // 出错数据抽样
    /**
     * <strong>example:</strong>
     * <p>[“xxx“, “xxxx“]</p>
     */
    @NameInMap("samples")
    @Validation(required = true)
    public java.util.List<String> samples;

    // 出错列，从0开始
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("error_column_index")
    @Validation(required = true)
    public Long errorColumnIndex;

    // 当前错误类型的描述
    /**
     * <strong>example:</strong>
     * <p>身份证号格式不正确</p>
     */
    @NameInMap("error_description")
    @Validation(required = true)
    public String errorDescription;

    public static TemplateInstanceErrorDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        TemplateInstanceErrorDetailDTO self = new TemplateInstanceErrorDetailDTO();
        return TeaModel.build(map, self);
    }

    public TemplateInstanceErrorDetailDTO setErrorNum(Long errorNum) {
        this.errorNum = errorNum;
        return this;
    }
    public Long getErrorNum() {
        return this.errorNum;
    }

    public TemplateInstanceErrorDetailDTO setSamples(java.util.List<String> samples) {
        this.samples = samples;
        return this;
    }
    public java.util.List<String> getSamples() {
        return this.samples;
    }

    public TemplateInstanceErrorDetailDTO setErrorColumnIndex(Long errorColumnIndex) {
        this.errorColumnIndex = errorColumnIndex;
        return this;
    }
    public Long getErrorColumnIndex() {
        return this.errorColumnIndex;
    }

    public TemplateInstanceErrorDetailDTO setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
        return this;
    }
    public String getErrorDescription() {
        return this.errorDescription;
    }

}
