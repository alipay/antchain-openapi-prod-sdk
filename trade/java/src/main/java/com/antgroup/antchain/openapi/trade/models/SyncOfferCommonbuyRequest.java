// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class SyncOfferCommonbuyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id offerCode_yyyyMMddHHm0(最后一位固定为0幂等用，请求10分钟内只能触发一次)
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 需要同步的商品code
    @NameInMap("offer_code")
    @Validation(required = true)
    public String offerCode;

    // 操作人工号
    @NameInMap("request_work_no")
    @Validation(required = true)
    public String requestWorkNo;

    // 商品同步commonBuy的配置列表对应json
    @NameInMap("offer_common_buy_sync_info")
    @Validation(required = true)
    public OfferSyncCommonBuyInfo offerCommonBuySyncInfo;

    public static SyncOfferCommonbuyRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncOfferCommonbuyRequest self = new SyncOfferCommonbuyRequest();
        return TeaModel.build(map, self);
    }

    public SyncOfferCommonbuyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncOfferCommonbuyRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncOfferCommonbuyRequest setOfferCode(String offerCode) {
        this.offerCode = offerCode;
        return this;
    }
    public String getOfferCode() {
        return this.offerCode;
    }

    public SyncOfferCommonbuyRequest setRequestWorkNo(String requestWorkNo) {
        this.requestWorkNo = requestWorkNo;
        return this;
    }
    public String getRequestWorkNo() {
        return this.requestWorkNo;
    }

    public SyncOfferCommonbuyRequest setOfferCommonBuySyncInfo(OfferSyncCommonBuyInfo offerCommonBuySyncInfo) {
        this.offerCommonBuySyncInfo = offerCommonBuySyncInfo;
        return this;
    }
    public OfferSyncCommonBuyInfo getOfferCommonBuySyncInfo() {
        return this.offerCommonBuySyncInfo;
    }

}
