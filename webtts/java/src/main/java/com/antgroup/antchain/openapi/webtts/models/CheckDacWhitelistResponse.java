// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class CheckDacWhitelistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 公钥地址
    @NameInMap("address")
    public String address;

    // 支持的链列表
    @NameInMap("blockchain_list")
    public java.util.List<String> blockchainList;

    // 检查结果类型
    @NameInMap("check_result_type")
    public String checkResultType;

    public static CheckDacWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckDacWhitelistResponse self = new CheckDacWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public CheckDacWhitelistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckDacWhitelistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckDacWhitelistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckDacWhitelistResponse setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CheckDacWhitelistResponse setBlockchainList(java.util.List<String> blockchainList) {
        this.blockchainList = blockchainList;
        return this;
    }
    public java.util.List<String> getBlockchainList() {
        return this.blockchainList;
    }

    public CheckDacWhitelistResponse setCheckResultType(String checkResultType) {
        this.checkResultType = checkResultType;
        return this;
    }
    public String getCheckResultType() {
        return this.checkResultType;
    }

}
