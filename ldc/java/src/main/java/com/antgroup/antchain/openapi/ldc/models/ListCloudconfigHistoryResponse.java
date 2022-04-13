// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ListCloudconfigHistoryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 配置历史列表
    @NameInMap("config_lists")
    public java.util.List<CloudConfigEntity> configLists;

    public static ListCloudconfigHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCloudconfigHistoryResponse self = new ListCloudconfigHistoryResponse();
        return TeaModel.build(map, self);
    }

    public ListCloudconfigHistoryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListCloudconfigHistoryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListCloudconfigHistoryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListCloudconfigHistoryResponse setConfigLists(java.util.List<CloudConfigEntity> configLists) {
        this.configLists = configLists;
        return this;
    }
    public java.util.List<CloudConfigEntity> getConfigLists() {
        return this.configLists;
    }

}
