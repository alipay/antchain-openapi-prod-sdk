// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DescribeUnifiedresourceVpcResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // vpc对象
    @NameInMap("vpc")
    public VPC vpc;

    public static DescribeUnifiedresourceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUnifiedresourceVpcResponse self = new DescribeUnifiedresourceVpcResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUnifiedresourceVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeUnifiedresourceVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeUnifiedresourceVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeUnifiedresourceVpcResponse setVpc(VPC vpc) {
        this.vpc = vpc;
        return this;
    }
    public VPC getVpc() {
        return this.vpc;
    }

}
