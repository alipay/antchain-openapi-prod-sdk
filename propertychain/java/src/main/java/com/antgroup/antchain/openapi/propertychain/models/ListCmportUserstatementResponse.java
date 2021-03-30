// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListCmportUserstatementResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 用户对账单
    @NameInMap("user_statement_list")
    public java.util.List<UserStatement> userStatementList;

    public static ListCmportUserstatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCmportUserstatementResponse self = new ListCmportUserstatementResponse();
        return TeaModel.build(map, self);
    }

    public ListCmportUserstatementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCmportUserstatementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCmportUserstatementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCmportUserstatementResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCmportUserstatementResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCmportUserstatementResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListCmportUserstatementResponse setUserStatementList(java.util.List<UserStatement> userStatementList) {
        this.userStatementList = userStatementList;
        return this;
    }
    public java.util.List<UserStatement> getUserStatementList() {
        return this.userStatementList;
    }

}
