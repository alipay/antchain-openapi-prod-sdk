// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ListRtopStarCompanyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 企业列表
    @NameInMap("company_infos")
    public java.util.List<RtopStarCompanyInfo> companyInfos;

    // 页码
    @NameInMap("page_no")
    public Long pageNo;

    // 一页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总的记录数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListRtopStarCompanyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRtopStarCompanyResponse self = new ListRtopStarCompanyResponse();
        return TeaModel.build(map, self);
    }

    public ListRtopStarCompanyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRtopStarCompanyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRtopStarCompanyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRtopStarCompanyResponse setCompanyInfos(java.util.List<RtopStarCompanyInfo> companyInfos) {
        this.companyInfos = companyInfos;
        return this;
    }
    public java.util.List<RtopStarCompanyInfo> getCompanyInfos() {
        return this.companyInfos;
    }

    public ListRtopStarCompanyResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListRtopStarCompanyResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRtopStarCompanyResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
