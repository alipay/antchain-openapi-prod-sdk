// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListAppgroupOwnerResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 用户列表
    @NameInMap("data")
    public java.util.List<UserDTO> data;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static ListAppgroupOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppgroupOwnerResponse self = new ListAppgroupOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ListAppgroupOwnerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAppgroupOwnerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAppgroupOwnerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAppgroupOwnerResponse setData(java.util.List<UserDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<UserDTO> getData() {
        return this.data;
    }

    public ListAppgroupOwnerResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
