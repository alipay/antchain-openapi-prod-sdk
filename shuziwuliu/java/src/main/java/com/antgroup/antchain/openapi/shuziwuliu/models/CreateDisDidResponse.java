// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CreateDisDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分布式数字身份did
    @NameInMap("did")
    public String did;

    // 组织类型
    @NameInMap("organization_type")
    public String organizationType;

    // 现阶段此did下的所有授予的角色
    @NameInMap("role_types")
    public java.util.List<String> roleTypes;

    public static CreateDisDidResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDisDidResponse self = new CreateDisDidResponse();
        return TeaModel.build(map, self);
    }

    public CreateDisDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateDisDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateDisDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateDisDidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public CreateDisDidResponse setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
        return this;
    }
    public String getOrganizationType() {
        return this.organizationType;
    }

    public CreateDisDidResponse setRoleTypes(java.util.List<String> roleTypes) {
        this.roleTypes = roleTypes;
        return this;
    }
    public java.util.List<String> getRoleTypes() {
        return this.roleTypes;
    }

}
