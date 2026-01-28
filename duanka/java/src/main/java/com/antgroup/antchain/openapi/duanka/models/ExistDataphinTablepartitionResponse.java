// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class ExistDataphinTablepartitionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分区返回数据
    @NameInMap("data")
    public PartitionObject data;

    public static ExistDataphinTablepartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExistDataphinTablepartitionResponse self = new ExistDataphinTablepartitionResponse();
        return TeaModel.build(map, self);
    }

    public ExistDataphinTablepartitionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExistDataphinTablepartitionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExistDataphinTablepartitionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExistDataphinTablepartitionResponse setData(PartitionObject data) {
        this.data = data;
        return this;
    }
    public PartitionObject getData() {
        return this.data;
    }

}
