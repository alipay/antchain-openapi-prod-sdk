// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class MarketingConversionRejectedItem extends TeaModel {
    // 转化记录业务唯一标识
    /**
     * <strong>example:</strong>
     * <p>345d6577513d43c1a4b80aa8961890df</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 失败码
    /**
     * <strong>example:</strong>
     * <p>DUPLICATE_REQUEST</p>
     */
    @NameInMap("error_code")
    @Validation(required = true)
    public String errorCode;

    // 失败原因
    /**
     * <strong>example:</strong>
     * <p>重复请求</p>
     */
    @NameInMap("error_message")
    @Validation(required = true)
    public String errorMessage;

    public static MarketingConversionRejectedItem build(java.util.Map<String, ?> map) throws Exception {
        MarketingConversionRejectedItem self = new MarketingConversionRejectedItem();
        return TeaModel.build(map, self);
    }

    public MarketingConversionRejectedItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MarketingConversionRejectedItem setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MarketingConversionRejectedItem setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
