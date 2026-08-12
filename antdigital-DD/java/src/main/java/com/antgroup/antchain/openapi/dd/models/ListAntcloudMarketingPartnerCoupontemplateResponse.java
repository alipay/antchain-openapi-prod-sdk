// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class ListAntcloudMarketingPartnerCoupontemplateResponse extends TeaModel {
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

    public static ListAntcloudMarketingPartnerCoupontemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAntcloudMarketingPartnerCoupontemplateResponse self = new ListAntcloudMarketingPartnerCoupontemplateResponse();
        return TeaModel.build(map, self);
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListAntcloudMarketingPartnerCoupontemplateResponse setTemplates(java.util.List<ChannelTemplateInfo> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ChannelTemplateInfo> getTemplates() {
        return this.templates;
    }

}
