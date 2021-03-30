// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateImportassetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产id
    @NameInMap("asset_id")
    public String assetId;

    // 区块链信息
    @NameInMap("info")
    public BlockchainInfo info;

    // 时间
    @NameInMap("date")
    public Long date;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    // 短码
    @NameInMap("qr_code")
    public String qrCode;

    public static CreateImportassetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImportassetResponse self = new CreateImportassetResponse();
        return TeaModel.build(map, self);
    }

    public CreateImportassetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateImportassetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateImportassetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateImportassetResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public CreateImportassetResponse setInfo(BlockchainInfo info) {
        this.info = info;
        return this;
    }
    public BlockchainInfo getInfo() {
        return this.info;
    }

    public CreateImportassetResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public CreateImportassetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateImportassetResponse setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
