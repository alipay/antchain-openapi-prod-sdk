// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class GetCreditIssuescpticketResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请唯一流水号
    @NameInMap("apply_id")
    public String applyId;

    // 集团平台方分布式数字身份
    @NameInMap("group_platform_did")
    public String groupPlatformDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    public String platformDid;

    // 产品id
    @NameInMap("product_id")
    public String productId;

    public static GetCreditIssuescpticketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreditIssuescpticketResponse self = new GetCreditIssuescpticketResponse();
        return TeaModel.build(map, self);
    }

    public GetCreditIssuescpticketResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetCreditIssuescpticketResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetCreditIssuescpticketResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetCreditIssuescpticketResponse setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public GetCreditIssuescpticketResponse setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public GetCreditIssuescpticketResponse setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public GetCreditIssuescpticketResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

}
