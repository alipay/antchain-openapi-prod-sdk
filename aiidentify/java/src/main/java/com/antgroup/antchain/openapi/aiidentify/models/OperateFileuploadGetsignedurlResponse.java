// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiidentify.models;

import com.aliyun.tea.*;

public class OperateFileuploadGetsignedurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
    @NameInMap("file_id")
    public String fileId;

    // oss上传文件链接
    @NameInMap("oss_url")
    public String ossUrl;

    // oss上传文件时的ossKey值 
    @NameInMap("oss_key")
    public String ossKey;

    public static OperateFileuploadGetsignedurlResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateFileuploadGetsignedurlResponse self = new OperateFileuploadGetsignedurlResponse();
        return TeaModel.build(map, self);
    }

    public OperateFileuploadGetsignedurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OperateFileuploadGetsignedurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OperateFileuploadGetsignedurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OperateFileuploadGetsignedurlResponse setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public OperateFileuploadGetsignedurlResponse setOssUrl(String ossUrl) {
        this.ossUrl = ossUrl;
        return this;
    }
    public String getOssUrl() {
        return this.ossUrl;
    }

    public OperateFileuploadGetsignedurlResponse setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
