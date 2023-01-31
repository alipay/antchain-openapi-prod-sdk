// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class QueryPdcpAuthResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总量
    @NameInMap("total")
    public Long total;

    // 当前页面
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 授权信息
    @NameInMap("authentication_info_list")
    public java.util.List<AuthenticationInfoVO> authenticationInfoList;

    public static QueryPdcpAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPdcpAuthResponse self = new QueryPdcpAuthResponse();
        return TeaModel.build(map, self);
    }

    public QueryPdcpAuthResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryPdcpAuthResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryPdcpAuthResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryPdcpAuthResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryPdcpAuthResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryPdcpAuthResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryPdcpAuthResponse setAuthenticationInfoList(java.util.List<AuthenticationInfoVO> authenticationInfoList) {
        this.authenticationInfoList = authenticationInfoList;
        return this;
    }
    public java.util.List<AuthenticationInfoVO> getAuthenticationInfoList() {
        return this.authenticationInfoList;
    }

}
