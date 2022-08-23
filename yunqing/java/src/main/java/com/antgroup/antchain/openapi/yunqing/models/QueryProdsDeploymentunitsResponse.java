// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class QueryProdsDeploymentunitsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 产品部署单元实例信息
    @NameInMap("data")
    public java.util.List<DeploymentUnitInstance> data;

    public static QueryProdsDeploymentunitsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryProdsDeploymentunitsResponse self = new QueryProdsDeploymentunitsResponse();
        return TeaModel.build(map, self);
    }

    public QueryProdsDeploymentunitsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryProdsDeploymentunitsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryProdsDeploymentunitsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryProdsDeploymentunitsResponse setData(java.util.List<DeploymentUnitInstance> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DeploymentUnitInstance> getData() {
        return this.data;
    }

}
