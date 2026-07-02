// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerMerchantagentResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数据总量
    @NameInMap("total_size")
    public Long totalSize;

    // 代理租户分页对象
    @NameInMap("merchant_agent_page")
    public java.util.List<MerchantAgentPage> merchantAgentPage;

    public static PagequeryInnerMerchantagentResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerMerchantagentResponse self = new PagequeryInnerMerchantagentResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerMerchantagentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerMerchantagentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerMerchantagentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerMerchantagentResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PagequeryInnerMerchantagentResponse setMerchantAgentPage(java.util.List<MerchantAgentPage> merchantAgentPage) {
        this.merchantAgentPage = merchantAgentPage;
        return this;
    }
    public java.util.List<MerchantAgentPage> getMerchantAgentPage() {
        return this.merchantAgentPage;
    }

}
