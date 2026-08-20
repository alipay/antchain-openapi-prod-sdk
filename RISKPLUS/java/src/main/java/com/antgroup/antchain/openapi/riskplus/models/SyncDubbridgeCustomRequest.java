// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SyncDubbridgeCustomRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产方用户唯一标识
    @NameInMap("open_id")
    @Validation(required = true)
    public String openId;

    // 补充信息
    @NameInMap("replenish_info")
    public ReplenishInfo replenishInfo;

    // 扩展信息，json格式字符串
    @NameInMap("ext_info")
    public String extInfo;

    // 资金方编码
    @NameInMap("fund_code")
    public String fundCode;

    public static SyncDubbridgeCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDubbridgeCustomRequest self = new SyncDubbridgeCustomRequest();
        return TeaModel.build(map, self);
    }

    public SyncDubbridgeCustomRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncDubbridgeCustomRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncDubbridgeCustomRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public SyncDubbridgeCustomRequest setReplenishInfo(ReplenishInfo replenishInfo) {
        this.replenishInfo = replenishInfo;
        return this;
    }
    public ReplenishInfo getReplenishInfo() {
        return this.replenishInfo;
    }

    public SyncDubbridgeCustomRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SyncDubbridgeCustomRequest setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

}
