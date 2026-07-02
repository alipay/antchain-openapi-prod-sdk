// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeComparisonRespData extends TeaModel {
    // 识别结果（REAL：真   FAKE：假   UNABLE_IDENTIFY：无法识别）
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 辅助识别结果码
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("identification_code")
    public String identificationCode;

    // 辅助识别信息
    /**
     * <strong>example:</strong>
     * <p>识别成功</p>
     */
    @NameInMap("identification_message")
    public String identificationMessage;

    // 无法识别时提示的解决方案
    /**
     * <strong>example:</strong>
     * <p>调整焦距</p>
     */
    @NameInMap("unable_identify_solution")
    public String unableIdentifySolution;

    public static BaiQrcodeComparisonRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeComparisonRespData self = new BaiQrcodeComparisonRespData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeComparisonRespData setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

    public BaiQrcodeComparisonRespData setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
        return this;
    }
    public String getIdentificationCode() {
        return this.identificationCode;
    }

    public BaiQrcodeComparisonRespData setIdentificationMessage(String identificationMessage) {
        this.identificationMessage = identificationMessage;
        return this;
    }
    public String getIdentificationMessage() {
        return this.identificationMessage;
    }

    public BaiQrcodeComparisonRespData setUnableIdentifySolution(String unableIdentifySolution) {
        this.unableIdentifySolution = unableIdentifySolution;
        return this;
    }
    public String getUnableIdentifySolution() {
        return this.unableIdentifySolution;
    }

}
