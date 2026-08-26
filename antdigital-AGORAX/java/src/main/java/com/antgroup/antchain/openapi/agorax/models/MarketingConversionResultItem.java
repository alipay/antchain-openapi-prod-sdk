// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class MarketingConversionResultItem extends TeaModel {
    // 转化记录业务唯一标识
    /**
     * <strong>example:</strong>
     * <p>345d6577513d43c1a4b80aa8961890df</p>
     */
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 该条转化记录是否成功受理
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("accepted")
    @Validation(required = true)
    public Boolean accepted;

    // 单条记录处理失败码；accepted=false 时返回
    /**
     * <strong>example:</strong>
     * <p>DUPLICATE_REQUEST</p>
     */
    @NameInMap("error_code")
    public String errorCode;

    // 单条记录处理失败原因；accepted=false 时返回
    /**
     * <strong>example:</strong>
     * <p>重复请求</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    public static MarketingConversionResultItem build(java.util.Map<String, ?> map) throws Exception {
        MarketingConversionResultItem self = new MarketingConversionResultItem();
        return TeaModel.build(map, self);
    }

    public MarketingConversionResultItem setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public MarketingConversionResultItem setAccepted(Boolean accepted) {
        this.accepted = accepted;
        return this;
    }
    public Boolean getAccepted() {
        return this.accepted;
    }

    public MarketingConversionResultItem setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MarketingConversionResultItem setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
