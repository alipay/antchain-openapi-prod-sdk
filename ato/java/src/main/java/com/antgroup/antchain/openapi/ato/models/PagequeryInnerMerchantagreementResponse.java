// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerMerchantagreementResponse extends TeaModel {
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

    // 协议分页对象
    @NameInMap("agreement_page")
    public java.util.List<AgreementPage> agreementPage;

    public static PagequeryInnerMerchantagreementResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerMerchantagreementResponse self = new PagequeryInnerMerchantagreementResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerMerchantagreementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerMerchantagreementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerMerchantagreementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerMerchantagreementResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public PagequeryInnerMerchantagreementResponse setAgreementPage(java.util.List<AgreementPage> agreementPage) {
        this.agreementPage = agreementPage;
        return this;
    }
    public java.util.List<AgreementPage> getAgreementPage() {
        return this.agreementPage;
    }

}
