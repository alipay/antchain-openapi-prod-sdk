// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryUserListResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码，从1开始
    @NameInMap("page_index")
    public Long pageIndex;

    // 每页数据，1~100
    @NameInMap("page_size")
    public Long pageSize;

    // 总数量
    @NameInMap("total_count")
    public Long totalCount;

    // 用户信息列表
    @NameInMap("user_list")
    public java.util.List<UserData> userList;

    public static QueryUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserListResponse self = new QueryUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserListResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserListResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserListResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserListResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryUserListResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserListResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryUserListResponse setUserList(java.util.List<UserData> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<UserData> getUserList() {
        return this.userList;
    }

}
