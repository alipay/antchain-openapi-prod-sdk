// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RequestHead extends TeaModel {
    // 请求唯一标识
    /**
     * <strong>example:</strong>
     * <p>91440300892305861T</p>
     */
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 客户身份标识ID
    /**
     * <strong>example:</strong>
     * <p>91440300892305861T</p>
     */
    @NameInMap("secret_id")
    @Validation(required = true)
    public String secretId;

    // 客户签约产品code
    /**
     * <strong>example:</strong>
     * <p>RDDB04201PR</p>
     */
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // response输出类型，默认json
    /**
     * <strong>example:</strong>
     * <p>&quot;tlv&quot;</p>
     */
    @NameInMap("format_type")
    public String formatType;

    // false
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("online_flag")
    public Boolean onlineFlag;

    public static RequestHead build(java.util.Map<String, ?> map) throws Exception {
        RequestHead self = new RequestHead();
        return TeaModel.build(map, self);
    }

    public RequestHead setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RequestHead setSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    public String getSecretId() {
        return this.secretId;
    }

    public RequestHead setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RequestHead setFormatType(String formatType) {
        this.formatType = formatType;
        return this;
    }
    public String getFormatType() {
        return this.formatType;
    }

    public RequestHead setOnlineFlag(Boolean onlineFlag) {
        this.onlineFlag = onlineFlag;
        return this;
    }
    public Boolean getOnlineFlag() {
        return this.onlineFlag;
    }

}
