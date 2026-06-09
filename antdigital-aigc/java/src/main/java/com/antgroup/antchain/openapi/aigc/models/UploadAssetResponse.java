// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aigc.models;

import com.aliyun.tea.*;

public class UploadAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产ID
    @NameInMap("asset_id")
    public String assetId;

    // 任务状态
    @NameInMap("status")
    public String status;

    // 资产类型
    @NameInMap("asset_type")
    public String assetType;

    // 扩展信息 JSON
    @NameInMap("ext_info")
    public String extInfo;

    public static UploadAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadAssetResponse self = new UploadAssetResponse();
        return TeaModel.build(map, self);
    }

    public UploadAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadAssetResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public UploadAssetResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UploadAssetResponse setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public UploadAssetResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
