// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpCodecirculationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数字凭证流转信息列表
    @NameInMap("code_circulation_list")
    public java.util.List<CodeCirculation> codeCirculationList;

    // 数字凭证的流转信息总数
    @NameInMap("total_count")
    public Long totalCount;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面数据量大小
    @NameInMap("page_size")
    public Long pageSize;

    public static PagequeryIpCodecirculationResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpCodecirculationResponse self = new PagequeryIpCodecirculationResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpCodecirculationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpCodecirculationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpCodecirculationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpCodecirculationResponse setCodeCirculationList(java.util.List<CodeCirculation> codeCirculationList) {
        this.codeCirculationList = codeCirculationList;
        return this;
    }
    public java.util.List<CodeCirculation> getCodeCirculationList() {
        return this.codeCirculationList;
    }

    public PagequeryIpCodecirculationResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryIpCodecirculationResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpCodecirculationResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
