// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpGoodsgalleryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 图库链接
    @NameInMap("ip_gallery_url")
    public String ipGalleryUrl;

    // 图库临时下载链接，过期时间2小时
    @NameInMap("ip_gallery_temporary_url")
    public String ipGalleryTemporaryUrl;

    // 是否允许商家下载图库
    @NameInMap("allow_download")
    public Boolean allowDownload;

    public static QueryIpGoodsgalleryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpGoodsgalleryResponse self = new QueryIpGoodsgalleryResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpGoodsgalleryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpGoodsgalleryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpGoodsgalleryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpGoodsgalleryResponse setIpGalleryUrl(String ipGalleryUrl) {
        this.ipGalleryUrl = ipGalleryUrl;
        return this;
    }
    public String getIpGalleryUrl() {
        return this.ipGalleryUrl;
    }

    public QueryIpGoodsgalleryResponse setIpGalleryTemporaryUrl(String ipGalleryTemporaryUrl) {
        this.ipGalleryTemporaryUrl = ipGalleryTemporaryUrl;
        return this;
    }
    public String getIpGalleryTemporaryUrl() {
        return this.ipGalleryTemporaryUrl;
    }

    public QueryIpGoodsgalleryResponse setAllowDownload(Boolean allowDownload) {
        this.allowDownload = allowDownload;
        return this;
    }
    public Boolean getAllowDownload() {
        return this.allowDownload;
    }

}
