// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerMerchantexpandsummaryResponse extends TeaModel {
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
    @NameInMap("total")
    public Long total;

    // 商户进件记录分页查询对象
    @NameInMap("merchant_expand_summary_page")
    public java.util.List<MerchantExpandSummaryPage> merchantExpandSummaryPage;

    public static PagequeryInnerMerchantexpandsummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerMerchantexpandsummaryResponse self = new PagequeryInnerMerchantexpandsummaryResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerMerchantexpandsummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerMerchantexpandsummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerMerchantexpandsummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerMerchantexpandsummaryResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerMerchantexpandsummaryResponse setMerchantExpandSummaryPage(java.util.List<MerchantExpandSummaryPage> merchantExpandSummaryPage) {
        this.merchantExpandSummaryPage = merchantExpandSummaryPage;
        return this;
    }
    public java.util.List<MerchantExpandSummaryPage> getMerchantExpandSummaryPage() {
        return this.merchantExpandSummaryPage;
    }

}
