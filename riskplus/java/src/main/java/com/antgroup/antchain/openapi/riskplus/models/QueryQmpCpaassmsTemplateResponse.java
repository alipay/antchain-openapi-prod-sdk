// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpCpaassmsTemplateResponse extends TeaModel {
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

    // 每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 模板列表
    @NameInMap("cpass_sms_templates")
    public java.util.List<CpaasSmsTemplate> cpassSmsTemplates;

    public static QueryQmpCpaassmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpCpaassmsTemplateResponse self = new QueryQmpCpaassmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpCpaassmsTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpCpaassmsTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpCpaassmsTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpCpaassmsTemplateResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryQmpCpaassmsTemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryQmpCpaassmsTemplateResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryQmpCpaassmsTemplateResponse setCpassSmsTemplates(java.util.List<CpaasSmsTemplate> cpassSmsTemplates) {
        this.cpassSmsTemplates = cpassSmsTemplates;
        return this;
    }
    public java.util.List<CpaasSmsTemplate> getCpassSmsTemplates() {
        return this.cpassSmsTemplates;
    }

}
