// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class CancelTradeUsageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部业务编号
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 业务类型，例如交易检索
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 扩展信息
    @NameInMap("ext_info")
    public String extInfo;

    public static CancelTradeUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelTradeUsageRequest self = new CancelTradeUsageRequest();
        return TeaModel.build(map, self);
    }

    public CancelTradeUsageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CancelTradeUsageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CancelTradeUsageRequest setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public CancelTradeUsageRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CancelTradeUsageRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
