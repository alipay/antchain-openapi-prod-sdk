// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpTextsmsTemplateResponse extends TeaModel {
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

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 扩展参数
    @NameInMap("ext_info")
    public String extInfo;

    // 模板列表
    @NameInMap("sms_templates")
    public java.util.List<SmsTemplate> smsTemplates;

    public static QueryQmpTextsmsTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpTextsmsTemplateResponse self = new QueryQmpTextsmsTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpTextsmsTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpTextsmsTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpTextsmsTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpTextsmsTemplateResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryQmpTextsmsTemplateResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryQmpTextsmsTemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryQmpTextsmsTemplateResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public QueryQmpTextsmsTemplateResponse setSmsTemplates(java.util.List<SmsTemplate> smsTemplates) {
        this.smsTemplates = smsTemplates;
        return this;
    }
    public java.util.List<SmsTemplate> getSmsTemplates() {
        return this.smsTemplates;
    }

}
