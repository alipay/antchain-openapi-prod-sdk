// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetAccessorCurrentResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 一方化链路为阿里云用户ID，蚂蚁链路为金融云用户ID
    @NameInMap("id")
    public String id;

    // 登录名
    @NameInMap("login_name")
    public String loginName;

    // 一方化链路：
    // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
    // 蚂蚁链路：
    // 用户真实姓名
    // 
    @NameInMap("name")
    public String name;

    // 当前AK所属租户
    @NameInMap("tenant")
    public String tenant;

    // 一方化链路：
    // 阿里云用户类型，主账号为CUSTOMER，操作员为SUB，RAM角色为RAM_ROLE
    // 蚂蚁链路：
    // 主账号为MASTER，操作员为OPERATOR，服务账号为SERVICE
    @NameInMap("type")
    public String type;

    public static GetAccessorCurrentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessorCurrentResponse self = new GetAccessorCurrentResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessorCurrentResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAccessorCurrentResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAccessorCurrentResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAccessorCurrentResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAccessorCurrentResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetAccessorCurrentResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAccessorCurrentResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetAccessorCurrentResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
