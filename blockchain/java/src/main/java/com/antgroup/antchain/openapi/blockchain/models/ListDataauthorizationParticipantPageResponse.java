// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListDataauthorizationParticipantPageResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 参与方列表
    @NameInMap("data")
    public java.util.List<Participant> data;

    // 是否有下一页
    @NameInMap("has_next_page")
    public Boolean hasNextPage;

    // 是否有上一页
    @NameInMap("has_previous_page")
    public Boolean hasPreviousPage;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总量
    @NameInMap("total")
    public Long total;

    public static ListDataauthorizationParticipantPageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataauthorizationParticipantPageResponse self = new ListDataauthorizationParticipantPageResponse();
        return TeaModel.build(map, self);
    }

    public ListDataauthorizationParticipantPageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListDataauthorizationParticipantPageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListDataauthorizationParticipantPageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListDataauthorizationParticipantPageResponse setData(java.util.List<Participant> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Participant> getData() {
        return this.data;
    }

    public ListDataauthorizationParticipantPageResponse setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
        return this;
    }
    public Boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public ListDataauthorizationParticipantPageResponse setHasPreviousPage(Boolean hasPreviousPage) {
        this.hasPreviousPage = hasPreviousPage;
        return this;
    }
    public Boolean getHasPreviousPage() {
        return this.hasPreviousPage;
    }

    public ListDataauthorizationParticipantPageResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListDataauthorizationParticipantPageResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDataauthorizationParticipantPageResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
