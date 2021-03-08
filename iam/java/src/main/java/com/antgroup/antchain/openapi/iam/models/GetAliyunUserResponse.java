// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class GetAliyunUserResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 阿里云用户ID
    @NameInMap("id")
    public String id;

    // 主账号类型下有值，即type为ENTERPRISE和PERSONAL时有值
    @NameInMap("login_name")
    public String loginName;

    // 用户名称，ENTERPRISE类型为企业名称，PERSONAL为个人姓名，RAM为唯一名称
    @NameInMap("name")
    public String name;

    // RAM子账号的显示名称
    @NameInMap("ram_display_name")
    public String ramDisplayName;

    // 用户所属租户
    @NameInMap("tenant")
    public String tenant;

    // 阿里云用户类型，分为主账号企业（ENTERPRISE），主账号个人（PERSONAL），和子账号（RAM）
    @NameInMap("type")
    public String type;

    // 显示名
    @NameInMap("display_name")
    public String displayName;

    public static GetAliyunUserResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliyunUserResponse self = new GetAliyunUserResponse();
        return TeaModel.build(map, self);
    }

    public GetAliyunUserResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAliyunUserResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAliyunUserResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAliyunUserResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAliyunUserResponse setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }
    public String getLoginName() {
        return this.loginName;
    }

    public GetAliyunUserResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAliyunUserResponse setRamDisplayName(String ramDisplayName) {
        this.ramDisplayName = ramDisplayName;
        return this;
    }
    public String getRamDisplayName() {
        return this.ramDisplayName;
    }

    public GetAliyunUserResponse setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetAliyunUserResponse setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetAliyunUserResponse setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

}
