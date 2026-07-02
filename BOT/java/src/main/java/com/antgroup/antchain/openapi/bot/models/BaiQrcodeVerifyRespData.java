// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiQrcodeVerifyRespData extends TeaModel {
    // 鉴定结果
    // REAL：通过
    // UNABLE_IDENTIFY：无法鉴定
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
     * <p>700</p>
     */
    @NameInMap("identification_code")
    @Validation(required = true)
    public String identificationCode;

    // 辅助识别信息
    /**
     * <strong>example:</strong>
     * <p>二维码不符合标准</p>
     */
    @NameInMap("identification_message")
    @Validation(required = true)
    public String identificationMessage;

    // 无法鉴定时的解决方案
    /**
     * <strong>example:</strong>
     * <p>请重新印刷</p>
     */
    @NameInMap("unable_identify_solution")
    @Validation(required = true)
    public String unableIdentifySolution;

    public static BaiQrcodeVerifyRespData build(java.util.Map<String, ?> map) throws Exception {
        BaiQrcodeVerifyRespData self = new BaiQrcodeVerifyRespData();
        return TeaModel.build(map, self);
    }

    public BaiQrcodeVerifyRespData setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

    public BaiQrcodeVerifyRespData setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
        return this;
    }
    public String getIdentificationCode() {
        return this.identificationCode;
    }

    public BaiQrcodeVerifyRespData setIdentificationMessage(String identificationMessage) {
        this.identificationMessage = identificationMessage;
        return this;
    }
    public String getIdentificationMessage() {
        return this.identificationMessage;
    }

    public BaiQrcodeVerifyRespData setUnableIdentifySolution(String unableIdentifySolution) {
        this.unableIdentifySolution = unableIdentifySolution;
        return this;
    }
    public String getUnableIdentifySolution() {
        return this.unableIdentifySolution;
    }

}
