// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchunfreezeImportassetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批量返回信息列表
    @NameInMap("result_list")
    public java.util.List<AssetResult> resultList;

    public static BatchunfreezeImportassetResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchunfreezeImportassetResponse self = new BatchunfreezeImportassetResponse();
        return TeaModel.build(map, self);
    }

    public BatchunfreezeImportassetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchunfreezeImportassetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchunfreezeImportassetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchunfreezeImportassetResponse setResultList(java.util.List<AssetResult> resultList) {
        this.resultList = resultList;
        return this;
    }
    public java.util.List<AssetResult> getResultList() {
        return this.resultList;
    }

}
