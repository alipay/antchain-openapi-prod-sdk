// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class PagequeryInnerCompanyinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总数
    @NameInMap("total")
    public Long total;

    // 公司信息
    @NameInMap("company_info")
    public java.util.List<CompanySummaryInfo> companyInfo;

    public static PagequeryInnerCompanyinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInnerCompanyinfoResponse self = new PagequeryInnerCompanyinfoResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInnerCompanyinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInnerCompanyinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInnerCompanyinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInnerCompanyinfoResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryInnerCompanyinfoResponse setCompanyInfo(java.util.List<CompanySummaryInfo> companyInfo) {
        this.companyInfo = companyInfo;
        return this;
    }
    public java.util.List<CompanySummaryInfo> getCompanyInfo() {
        return this.companyInfo;
    }

}
