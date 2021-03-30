// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class ListCmportEnterprisestatementResponse extends TeaModel {
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

    // 总对账单
    @NameInMap("total_statement_list")
    public java.util.List<TotalStatement> totalStatementList;

    public static ListCmportEnterprisestatementResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCmportEnterprisestatementResponse self = new ListCmportEnterprisestatementResponse();
        return TeaModel.build(map, self);
    }

    public ListCmportEnterprisestatementResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCmportEnterprisestatementResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCmportEnterprisestatementResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCmportEnterprisestatementResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCmportEnterprisestatementResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCmportEnterprisestatementResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public ListCmportEnterprisestatementResponse setTotalStatementList(java.util.List<TotalStatement> totalStatementList) {
        this.totalStatementList = totalStatementList;
        return this;
    }
    public java.util.List<TotalStatement> getTotalStatementList() {
        return this.totalStatementList;
    }

}
