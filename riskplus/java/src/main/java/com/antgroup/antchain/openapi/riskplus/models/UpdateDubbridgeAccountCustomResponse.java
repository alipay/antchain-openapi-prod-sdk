// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UpdateDubbridgeAccountCustomResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // id
    @NameInMap("id")
    public Long id;

    // 渠道编码
    @NameInMap("channel_code")
    public String channelCode;

    // 渠道id
    @NameInMap("channel_no")
    public String channelNo;

    // 客户号
    @NameInMap("customer_no")
    public String customerNo;

    // 创建时间
    @NameInMap("create_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String createTime;

    // 更新时间
    @NameInMap("update_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String updateTime;

    public static UpdateDubbridgeAccountCustomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDubbridgeAccountCustomResponse self = new UpdateDubbridgeAccountCustomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDubbridgeAccountCustomResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UpdateDubbridgeAccountCustomResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateDubbridgeAccountCustomResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UpdateDubbridgeAccountCustomResponse setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateDubbridgeAccountCustomResponse setChannelCode(String channelCode) {
        this.channelCode = channelCode;
        return this;
    }
    public String getChannelCode() {
        return this.channelCode;
    }

    public UpdateDubbridgeAccountCustomResponse setChannelNo(String channelNo) {
        this.channelNo = channelNo;
        return this;
    }
    public String getChannelNo() {
        return this.channelNo;
    }

    public UpdateDubbridgeAccountCustomResponse setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
        return this;
    }
    public String getCustomerNo() {
        return this.customerNo;
    }

    public UpdateDubbridgeAccountCustomResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public UpdateDubbridgeAccountCustomResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
