// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclNotaryInfo extends TeaModel {
    // 存证类型，
    // 文件 FILE
    // 文本 TEXT
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 存证内容
    @NameInMap("content")
    public String content;

    // 文件下载链接 类型为文件有值
    @NameInMap("file_url")
    public String fileUrl;

    // 存证内容hash
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // 存证哈希
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 存证阶段描述：
    // UPLOAD_PROMISE_FLOW：上传履约流水，
    // UPLOAD_LOGISTIC_INFO：上传物流信息，
    // SIGNED_CONTRACT_FILE：合同签署后文件存证，
    // BCL_ORDER_PROMISING：租赁订单履约中存证，
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    public static BclNotaryInfo build(java.util.Map<String, ?> map) throws Exception {
        BclNotaryInfo self = new BclNotaryInfo();
        return TeaModel.build(map, self);
    }

    public BclNotaryInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BclNotaryInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public BclNotaryInfo setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public BclNotaryInfo setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public BclNotaryInfo setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public BclNotaryInfo setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
