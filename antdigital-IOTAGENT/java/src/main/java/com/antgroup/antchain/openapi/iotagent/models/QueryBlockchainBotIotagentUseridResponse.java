// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIotagentUseridResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 对应租户名下的user_id
    @NameInMap("user_id_list")
    public java.util.List<String> userIdList;

    @NameInMap("total")
    public Long total;

    @NameInMap("page_num")
    public Long pageNum;

    @NameInMap("page_size")
    public Long pageSize;

    public static QueryBlockchainBotIotagentUseridResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIotagentUseridResponse self = new QueryBlockchainBotIotagentUseridResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIotagentUseridResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotIotagentUseridResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotIotagentUseridResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotIotagentUseridResponse setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public QueryBlockchainBotIotagentUseridResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryBlockchainBotIotagentUseridResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryBlockchainBotIotagentUseridResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
