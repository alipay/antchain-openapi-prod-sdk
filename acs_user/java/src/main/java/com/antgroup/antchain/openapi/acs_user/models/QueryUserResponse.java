// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acs_user.models;

import com.aliyun.tea.*;

public class QueryUserResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户列表
    @NameInMap("user_infos")
    public java.util.List<ACSUserInfo> userInfos;

    // 传入的页码，没有传入，则取默认值1
    @NameInMap("page_num")
    public Long pageNum;

    // 传入的页大小，如果没有传入，则取默认值20
    @NameInMap("page_size")
    public Long pageSize;

    // 查询结果的总条目数量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserResponse self = new QueryUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUserResponse setUserInfos(java.util.List<ACSUserInfo> userInfos) {
        this.userInfos = userInfos;
        return this;
    }
    public java.util.List<ACSUserInfo> getUserInfos() {
        return this.userInfos;
    }

    public QueryUserResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryUserResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
