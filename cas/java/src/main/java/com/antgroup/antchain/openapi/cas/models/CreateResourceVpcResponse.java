// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateResourceVpcResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建VPC后，系统自动创建的路由表的ID。
    @NameInMap("route_table_id")
    public String routeTableId;

    // 创建的VPC的ID
    @NameInMap("vpc_id")
    public String vpcId;

    // 创建VPC后，系统自动创建的路由器的ID。
    @NameInMap("v_router_id")
    public String vRouterId;

    public static CreateResourceVpcResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceVpcResponse self = new CreateResourceVpcResponse();
        return TeaModel.build(map, self);
    }

    public CreateResourceVpcResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateResourceVpcResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateResourceVpcResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateResourceVpcResponse setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
        return this;
    }
    public String getRouteTableId() {
        return this.routeTableId;
    }

    public CreateResourceVpcResponse setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateResourceVpcResponse setVRouterId(String vRouterId) {
        this.vRouterId = vRouterId;
        return this;
    }
    public String getVRouterId() {
        return this.vRouterId;
    }

}
