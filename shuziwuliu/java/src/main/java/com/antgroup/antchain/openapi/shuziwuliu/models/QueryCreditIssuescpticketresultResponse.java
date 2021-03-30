// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuescpticketresultResponse extends TeaModel {
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

    // 电子回单下载地址,链接有有效期
    @NameInMap("file_download_url")
    public String fileDownloadUrl;

    // 集团平台方分布式数字身份
    // 
    @NameInMap("group_platform_did")
    public String groupPlatformDid;

    // 业务发起方分布式数字身
    @NameInMap("platform_did")
    public String platformDid;

    // 产品id
    // 
    @NameInMap("product_id")
    public String productId;

    // 状态
    @NameInMap("status")
    public String status;

    public static QueryCreditIssuescpticketresultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuescpticketresultResponse self = new QueryCreditIssuescpticketresultResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuescpticketresultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssuescpticketresultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssuescpticketresultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssuescpticketresultResponse setApplyId(String applyId) {
        this.applyId = applyId;
        return this;
    }
    public String getApplyId() {
        return this.applyId;
    }

    public QueryCreditIssuescpticketresultResponse setFileDownloadUrl(String fileDownloadUrl) {
        this.fileDownloadUrl = fileDownloadUrl;
        return this;
    }
    public String getFileDownloadUrl() {
        return this.fileDownloadUrl;
    }

    public QueryCreditIssuescpticketresultResponse setGroupPlatformDid(String groupPlatformDid) {
        this.groupPlatformDid = groupPlatformDid;
        return this;
    }
    public String getGroupPlatformDid() {
        return this.groupPlatformDid;
    }

    public QueryCreditIssuescpticketresultResponse setPlatformDid(String platformDid) {
        this.platformDid = platformDid;
        return this;
    }
    public String getPlatformDid() {
        return this.platformDid;
    }

    public QueryCreditIssuescpticketresultResponse setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public QueryCreditIssuescpticketresultResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
