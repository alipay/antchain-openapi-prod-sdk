// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class GetCurrentidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建时间，ISO8601格式
    @NameInMap("create_time")
    @Validation(required = true)
    public String createTime;

    // 身份实体所属企业
    @NameInMap("customer")
    @Validation(required = true)
    public String customer;

    // 身份实体ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 身份实体类型，OPERATOR(操作员)或SERVICE(服务账号)
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 最近一次修改时间，ISO8601格式
    @NameInMap("update_time")
    @Validation(required = true)
    public String updateTime;

    public static GetCurrentidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentidResponse self = new GetCurrentidResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCurrentidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCurrentidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCurrentidResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetCurrentidResponse setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public GetCurrentidResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetCurrentidResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetCurrentidResponse setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

}
