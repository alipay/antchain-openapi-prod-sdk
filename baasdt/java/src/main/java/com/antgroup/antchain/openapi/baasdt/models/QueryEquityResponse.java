// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryEquityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 权益商品完整信息: equityType 权益类型：0积分，1卡券，2实物。 status 权益状态：0可用状态，1下线，2冻结。 authType 权益授权类型：0自动，1合约。
    //  { "equity_id": "6041f851f4d", "tenant_id": "ZEJEZKUA", "admin_id": "ed7b3ac3c061", "equity_type": 1, "equity_name": "FDCardtest", "description": "FDCard", "total_count": "1000000", "status": 0, "auth_type": 0, "currency": "CNY", "value": "10.0000", "default_price": "1.0000", "images": "oss://myexchange/12593acf32dd6d4257fa0.jpeg", "desc_images": "", "memo": "", "is_public": true, "valid_not_before": 112692, "valid_not_after": 112654365244, "use_valid_not_before": 112612, "use_valid_not_after": 11265436524415235, "limit_per_user_and_day": 1000000, "limit_per_user_and_month": 100000, "limit_per_merchant_and_day": 1000000, "limit_per_merchant_and_month": 1000000, "equity_ext_info": { "open_to_tenant_id": "", "tenant_price": "", "tenant_user_price": { "snapshot_tenant_price": "", "user_price_type": 0, "price": "", "ratio": "" }, "target_date": "", "limit_per_day_used": 0, "limit_per_month_used": 0 } }
    @NameInMap("equity")
    public Equity equity;

    // 权益图片的永久oss地址
    @NameInMap("urls")
    public java.util.List<String> urls;

    public static QueryEquityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEquityResponse self = new QueryEquityResponse();
        return TeaModel.build(map, self);
    }

    public QueryEquityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryEquityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryEquityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryEquityResponse setEquity(Equity equity) {
        this.equity = equity;
        return this;
    }
    public Equity getEquity() {
        return this.equity;
    }

    public QueryEquityResponse setUrls(java.util.List<String> urls) {
        this.urls = urls;
        return this;
    }
    public java.util.List<String> getUrls() {
        return this.urls;
    }

}
