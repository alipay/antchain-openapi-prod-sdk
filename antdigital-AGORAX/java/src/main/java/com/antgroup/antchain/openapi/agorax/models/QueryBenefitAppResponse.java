// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.agorax.models;

import com.aliyun.tea.*;

public class QueryBenefitAppResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 平台配置的档位稳定 ID，例如TIER_17
    @NameInMap("tier_id")
    public String tierId;

    // 档位名称，例如中级会员17元
    @NameInMap("tier_name")
    public String tierName;

    public static QueryBenefitAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBenefitAppResponse self = new QueryBenefitAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryBenefitAppResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBenefitAppResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBenefitAppResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBenefitAppResponse setTierId(String tierId) {
        this.tierId = tierId;
        return this;
    }
    public String getTierId() {
        return this.tierId;
    }

    public QueryBenefitAppResponse setTierName(String tierName) {
        this.tierName = tierName;
        return this;
    }
    public String getTierName() {
        return this.tierName;
    }

}
