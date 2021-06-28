// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class ConfirmCpfDatauseResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 使用方ID
    @NameInMap("data_user_identity")
    public String dataUserIdentity;

    // 使用方名称
    @NameInMap("data_user_name")
    public String dataUserName;

    // 数据拥有者ID，用户身份证ID
    @NameInMap("data_owner_identity")
    public String dataOwnerIdentity;

    // 数据拥有者名称，用户名称
    @NameInMap("data_owner_name")
    public String dataOwnerName;

    // 数据源ID
    @NameInMap("provider_id")
    public String providerId;

    // 数据源名称
    @NameInMap("provider_name")
    public String providerName;

    // 存证端ID
    @NameInMap("terminal_identity")
    public String terminalIdentity;

    // 业务描述
    @NameInMap("data_desc")
    public String dataDesc;

    // 存证数据hash
    @NameInMap("data_hash")
    public String dataHash;

    // 链信息
    @NameInMap("chain_info")
    public ChainInfo chainInfo;

    public static ConfirmCpfDatauseResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfirmCpfDatauseResponse self = new ConfirmCpfDatauseResponse();
        return TeaModel.build(map, self);
    }

    public ConfirmCpfDatauseResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ConfirmCpfDatauseResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ConfirmCpfDatauseResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ConfirmCpfDatauseResponse setDataUserIdentity(String dataUserIdentity) {
        this.dataUserIdentity = dataUserIdentity;
        return this;
    }
    public String getDataUserIdentity() {
        return this.dataUserIdentity;
    }

    public ConfirmCpfDatauseResponse setDataUserName(String dataUserName) {
        this.dataUserName = dataUserName;
        return this;
    }
    public String getDataUserName() {
        return this.dataUserName;
    }

    public ConfirmCpfDatauseResponse setDataOwnerIdentity(String dataOwnerIdentity) {
        this.dataOwnerIdentity = dataOwnerIdentity;
        return this;
    }
    public String getDataOwnerIdentity() {
        return this.dataOwnerIdentity;
    }

    public ConfirmCpfDatauseResponse setDataOwnerName(String dataOwnerName) {
        this.dataOwnerName = dataOwnerName;
        return this;
    }
    public String getDataOwnerName() {
        return this.dataOwnerName;
    }

    public ConfirmCpfDatauseResponse setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }
    public String getProviderId() {
        return this.providerId;
    }

    public ConfirmCpfDatauseResponse setProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }
    public String getProviderName() {
        return this.providerName;
    }

    public ConfirmCpfDatauseResponse setTerminalIdentity(String terminalIdentity) {
        this.terminalIdentity = terminalIdentity;
        return this;
    }
    public String getTerminalIdentity() {
        return this.terminalIdentity;
    }

    public ConfirmCpfDatauseResponse setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
        return this;
    }
    public String getDataDesc() {
        return this.dataDesc;
    }

    public ConfirmCpfDatauseResponse setDataHash(String dataHash) {
        this.dataHash = dataHash;
        return this;
    }
    public String getDataHash() {
        return this.dataHash;
    }

    public ConfirmCpfDatauseResponse setChainInfo(ChainInfo chainInfo) {
        this.chainInfo = chainInfo;
        return this;
    }
    public ChainInfo getChainInfo() {
        return this.chainInfo;
    }

}
