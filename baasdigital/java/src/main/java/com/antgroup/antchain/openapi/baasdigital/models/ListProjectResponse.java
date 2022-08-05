// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class ListProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目ID列表
    @NameInMap("id_list")
    public java.util.List<String> idList;

    // 链上项目总数
    @NameInMap("total")
    public Long total;

    public static ListProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponse self = new ListProjectResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListProjectResponse setIdList(java.util.List<String> idList) {
        this.idList = idList;
        return this;
    }
    public java.util.List<String> getIdList() {
        return this.idList;
    }

    public ListProjectResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
