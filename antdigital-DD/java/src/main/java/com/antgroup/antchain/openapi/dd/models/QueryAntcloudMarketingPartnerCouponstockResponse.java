// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingPartnerCouponstockResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模版总量
    @NameInMap("total_quota")
    public Long totalQuota;

    // 已使用
    @NameInMap("released_quota")
    public Long releasedQuota;

    // 可用
    @NameInMap("available_quota")
    public Long availableQuota;

    public static QueryAntcloudMarketingPartnerCouponstockResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingPartnerCouponstockResponse self = new QueryAntcloudMarketingPartnerCouponstockResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setTotalQuota(Long totalQuota) {
        this.totalQuota = totalQuota;
        return this;
    }
    public Long getTotalQuota() {
        return this.totalQuota;
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setReleasedQuota(Long releasedQuota) {
        this.releasedQuota = releasedQuota;
        return this;
    }
    public Long getReleasedQuota() {
        return this.releasedQuota;
    }

    public QueryAntcloudMarketingPartnerCouponstockResponse setAvailableQuota(Long availableQuota) {
        this.availableQuota = availableQuota;
        return this;
    }
    public Long getAvailableQuota() {
        return this.availableQuota;
    }

}
