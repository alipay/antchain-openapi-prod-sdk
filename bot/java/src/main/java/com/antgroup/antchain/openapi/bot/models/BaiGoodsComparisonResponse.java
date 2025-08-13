// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsComparisonResponse extends TeaModel {
    // 鉴定结果（REAL：为真   FAKE：为假   UNABLE_IDENTIFY：无法鉴定）
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("identification_result")
    @Validation(required = true)
    public String identificationResult;

    // 鉴定补充信息
    /**
     * <strong>example:</strong>
     * <p>鉴定成功</p>
     */
    @NameInMap("identification_message")
    public String identificationMessage;

    // 鉴定信息code
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("identification_code")
    public String identificationCode;

    public static BaiGoodsComparisonResponse build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsComparisonResponse self = new BaiGoodsComparisonResponse();
        return TeaModel.build(map, self);
    }

    public BaiGoodsComparisonResponse setIdentificationResult(String identificationResult) {
        this.identificationResult = identificationResult;
        return this;
    }
    public String getIdentificationResult() {
        return this.identificationResult;
    }

    public BaiGoodsComparisonResponse setIdentificationMessage(String identificationMessage) {
        this.identificationMessage = identificationMessage;
        return this;
    }
    public String getIdentificationMessage() {
        return this.identificationMessage;
    }

    public BaiGoodsComparisonResponse setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
        return this;
    }
    public String getIdentificationCode() {
        return this.identificationCode;
    }

}
