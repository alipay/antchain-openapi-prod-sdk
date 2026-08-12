// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.marketing.models;

import com.aliyun.tea.*;

public class ListPartnerCoupontemplateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页查询的页码
    @NameInMap("page_no")
    public Long pageNo;

    // 分页查询每页展示的数量
    @NameInMap("page_size")
    public Long pageSize;

    // 查询出来的总模板数量
    @NameInMap("total_count")
    public Long totalCount;

    // 优惠券模板信息
    @NameInMap("templates")
    public java.util.List<ChannelTemplateInfo> templates;

    public static ListPartnerCoupontemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartnerCoupontemplateResponse self = new ListPartnerCoupontemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListPartnerCoupontemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListPartnerCoupontemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListPartnerCoupontemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListPartnerCoupontemplateResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListPartnerCoupontemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListPartnerCoupontemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListPartnerCoupontemplateResponse setTemplates(java.util.List<ChannelTemplateInfo> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ChannelTemplateInfo> getTemplates() {
        return this.templates;
    }

}
