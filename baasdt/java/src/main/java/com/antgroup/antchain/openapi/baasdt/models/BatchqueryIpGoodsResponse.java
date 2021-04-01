// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpGoodsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ip重要信息
    @NameInMap("ip_list")
    public java.util.List<IpEmphasisInfo> ipList;

    // 结果总数，不是列表值，用于分页
    @NameInMap("all_count")
    public Long allCount;

    public static BatchqueryIpGoodsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpGoodsResponse self = new BatchqueryIpGoodsResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpGoodsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryIpGoodsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryIpGoodsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryIpGoodsResponse setIpList(java.util.List<IpEmphasisInfo> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<IpEmphasisInfo> getIpList() {
        return this.ipList;
    }

    public BatchqueryIpGoodsResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

}
