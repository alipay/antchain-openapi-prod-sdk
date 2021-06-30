// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpApprovalwithupdateResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 带上更新信息
    @NameInMap("ip_list")
    public java.util.List<IpBasicInfoWithUpdate> ipList;

    // 总数
    @NameInMap("all_count")
    public Long allCount;

    public static BatchqueryIpApprovalwithupdateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpApprovalwithupdateResponse self = new BatchqueryIpApprovalwithupdateResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpApprovalwithupdateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryIpApprovalwithupdateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryIpApprovalwithupdateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryIpApprovalwithupdateResponse setIpList(java.util.List<IpBasicInfoWithUpdate> ipList) {
        this.ipList = ipList;
        return this;
    }
    public java.util.List<IpBasicInfoWithUpdate> getIpList() {
        return this.ipList;
    }

    public BatchqueryIpApprovalwithupdateResponse setAllCount(Long allCount) {
        this.allCount = allCount;
        return this;
    }
    public Long getAllCount() {
        return this.allCount;
    }

}
