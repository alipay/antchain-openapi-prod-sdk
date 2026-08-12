// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 国家list
    @NameInMap("countrylist")
    public java.util.List<CountryCnEnItem> countrylist;

    public static QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse self = new QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse setCountrylist(java.util.List<CountryCnEnItem> countrylist) {
        this.countrylist = countrylist;
        return this;
    }
    public java.util.List<CountryCnEnItem> getCountrylist() {
        return this.countrylist;
    }

}
