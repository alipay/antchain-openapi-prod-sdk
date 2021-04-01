// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryDidNotificationFulldidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // did详情
    @NameInMap("list")
    public java.util.List<DidDetail> list;

    // 总体数量
    @NameInMap("total_num")
    public Long totalNum;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static QueryDidNotificationFulldidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDidNotificationFulldidResponse self = new QueryDidNotificationFulldidResponse();
        return TeaModel.build(map, self);
    }

    public QueryDidNotificationFulldidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDidNotificationFulldidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDidNotificationFulldidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDidNotificationFulldidResponse setList(java.util.List<DidDetail> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DidDetail> getList() {
        return this.list;
    }

    public QueryDidNotificationFulldidResponse setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public QueryDidNotificationFulldidResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
