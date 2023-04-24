// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class CheckMypocketQrcoderequestaccountsRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 小程序码唯一标识
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 外部业务号，仅透传，不校验
    @NameInMap("out_biz_no")
    public String outBizNo;

    public static CheckMypocketQrcoderequestaccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMypocketQrcoderequestaccountsRequest self = new CheckMypocketQrcoderequestaccountsRequest();
        return TeaModel.build(map, self);
    }

    public CheckMypocketQrcoderequestaccountsRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CheckMypocketQrcoderequestaccountsRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CheckMypocketQrcoderequestaccountsRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public CheckMypocketQrcoderequestaccountsRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

}
