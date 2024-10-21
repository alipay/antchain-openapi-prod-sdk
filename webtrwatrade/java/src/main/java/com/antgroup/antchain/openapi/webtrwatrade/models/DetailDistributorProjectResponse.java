// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DetailDistributorProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产项目详情
    @NameInMap("data")
    public AssetProject data;

    public static DetailDistributorProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DetailDistributorProjectResponse self = new DetailDistributorProjectResponse();
        return TeaModel.build(map, self);
    }

    public DetailDistributorProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DetailDistributorProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DetailDistributorProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DetailDistributorProjectResponse setData(AssetProject data) {
        this.data = data;
        return this;
    }
    public AssetProject getData() {
        return this.data;
    }

}
