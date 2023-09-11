// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class BindResourceGeneralresourcefileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 版本号
    @NameInMap("version")
    public Long version;

    // 文件下载地址
    @NameInMap("url")
    public String url;

    // md5摘要值
    @NameInMap("md5")
    public String md5;

    // 文件大小
    @NameInMap("size")
    public Long size;

    public static BindResourceGeneralresourcefileResponse build(java.util.Map<String, ?> map) throws Exception {
        BindResourceGeneralresourcefileResponse self = new BindResourceGeneralresourcefileResponse();
        return TeaModel.build(map, self);
    }

    public BindResourceGeneralresourcefileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BindResourceGeneralresourcefileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BindResourceGeneralresourcefileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BindResourceGeneralresourcefileResponse setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

    public BindResourceGeneralresourcefileResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public BindResourceGeneralresourcefileResponse setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public BindResourceGeneralresourcefileResponse setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
