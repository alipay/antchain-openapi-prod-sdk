// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CreateMypocketQrcoderequestaccountsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部业务号
    @NameInMap("out_biz_no")
    @Validation(required = true, maxLength = 64)
    public String outBizNo;

    // 应用唯一标识
    @NameInMap("app_id")
    @Validation(required = true)
    public String appId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(maxLength = 64)
    public String chainId;

    // 账户类型，枚举值，  MYCHAIN|ETH
    @NameInMap("account_type")
    public String accountType;

    // 小程序码颜色，枚举，  ALIPAY_BLUE|BLACK|WHITE
    @NameInMap("color")
    public String color;

    // 小程序码大小，枚举，SMALL|MEDIUM|LARGE
    @NameInMap("size")
    public String size;

    public static CreateMypocketQrcoderequestaccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMypocketQrcoderequestaccountsRequest self = new CreateMypocketQrcoderequestaccountsRequest();
        return TeaModel.build(map, self);
    }

    public CreateMypocketQrcoderequestaccountsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMypocketQrcoderequestaccountsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMypocketQrcoderequestaccountsRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CreateMypocketQrcoderequestaccountsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateMypocketQrcoderequestaccountsRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateMypocketQrcoderequestaccountsRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateMypocketQrcoderequestaccountsRequest setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public CreateMypocketQrcoderequestaccountsRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

}
