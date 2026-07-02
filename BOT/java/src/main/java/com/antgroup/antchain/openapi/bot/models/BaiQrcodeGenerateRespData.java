// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeGenerateRespData extends TeaModel {
    // 二维码的base64字符串
    /**
     * <strong>example:</strong>
     * <p>/9j/4QyXRXhpZgAATU0AKgAAAAgABwESAAMAAAABAAEAAAEa......</p>
     */
    @NameInMap("generate_result")
    @Validation(required = true)
    public String generateResult;

    // 生成结果码
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("generate_code")
    @Validation(required = true)
    public String generateCode;

    // 用于异常场景下细化错误信息
    /**
     * <strong>example:</strong>
     * <p>码值不正确</p>
     */
    @NameInMap("generate_message")
    @Validation(required = true)
    public String generateMessage;

    // 生成失败时的解决方案，用于异常场景下细化错误信息
    /**
     * <strong>example:</strong>
     * <p>请调整码值重试</p>
     */
    @NameInMap("unable_generate_solution")
    @Validation(required = true)
    public String unableGenerateSolution;

    public static BaiQrcodeGenerateRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeGenerateRespData self = new BaiQrcodeGenerateRespData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeGenerateRespData setGenerateResult(String generateResult) {
        this.generateResult = generateResult;
        return this;
    }
    public String getGenerateResult() {
        return this.generateResult;
    }

    public BaiQrcodeGenerateRespData setGenerateCode(String generateCode) {
        this.generateCode = generateCode;
        return this;
    }
    public String getGenerateCode() {
        return this.generateCode;
    }

    public BaiQrcodeGenerateRespData setGenerateMessage(String generateMessage) {
        this.generateMessage = generateMessage;
        return this;
    }
    public String getGenerateMessage() {
        return this.generateMessage;
    }

    public BaiQrcodeGenerateRespData setUnableGenerateSolution(String unableGenerateSolution) {
        this.unableGenerateSolution = unableGenerateSolution;
        return this;
    }
    public String getUnableGenerateSolution() {
        return this.unableGenerateSolution;
    }

}
