// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class BclNotaryInfo extends TeaModel {
    // 存证类型
    // 1.文件：FILE
    // 2.文本：TEXT
    /**
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 存证内容
    /**
     * <strong>example:</strong>
     * <p>asd2112123</p>
     */
    @NameInMap("content")
    public String content;

    // 文件下载链接
    // 存证类型为FILE时此参数必填；
    /**
     * <strong>example:</strong>
     * <p><a href="http://oss.com/asdas">http://oss.com/asdas</a></p>
     */
    @NameInMap("file_url")
    public String fileUrl;

    // 存证内容hash
    /**
     * <strong>example:</strong>
     * <p>12321312asdsqwewer12312sd</p>
     */
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // 存证哈希
    /**
     * <strong>example:</strong>
     * <p>adsawqe12we12312werserqwe</p>
     */
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 存证阶段描述： 
    // 1.上传履约流水：UPLOAD_PROMISE_FLOW
    // 2.上传物流信息：UPLOAD_LOGISTIC_INFO
    // 3.合同签署后文件存证：SIGNED_CONTRACT_FILE 
    // 4.租赁订单履约中存证：BCL_ORDER_PROMISING
    /**
     * <strong>example:</strong>
     * <p>UPLOAD_PROMISE_FLOW</p>
     */
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
