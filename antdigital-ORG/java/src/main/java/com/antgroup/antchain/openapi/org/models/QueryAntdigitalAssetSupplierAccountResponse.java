// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.org.models;

import com.aliyun.tea.*;

public class QueryAntdigitalAssetSupplierAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 主帐号列表
    @NameInMap("account_list")
    public java.util.List<String> accountList;

    public static QueryAntdigitalAssetSupplierAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalAssetSupplierAccountResponse self = new QueryAntdigitalAssetSupplierAccountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalAssetSupplierAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalAssetSupplierAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalAssetSupplierAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalAssetSupplierAccountResponse setAccountList(java.util.List<String> accountList) {
        this.accountList = accountList;
        return this;
    }
    public java.util.List<String> getAccountList() {
        return this.accountList;
    }

}
