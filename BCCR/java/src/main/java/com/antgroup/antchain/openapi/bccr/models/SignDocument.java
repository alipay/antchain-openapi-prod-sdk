// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SignDocument extends TeaModel {
    // 签署文件
    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("sign_file")
    @Validation(required = true)
    public String signFile;

    // 到期时间戳
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    // 签署文件名
    /**
     * <strong>example:</strong>
     * <p>在线公证申办过程记录.pdf</p>
     */
    @NameInMap("sign_file_name")
    @Validation(required = true)
    public String signFileName;

    // 签署文件描述
    /**
     * <strong>example:</strong>
     * <p>在线公证申办过程记录</p>
     */
    @NameInMap("sign_file_desc")
    @Validation(required = true)
    public String signFileDesc;

    // 签署文件哈希
    /**
     * <strong>example:</strong>
     * <p>用于校验文件完整性，计算文件的SHA-256值</p>
     */
    @NameInMap("sign_file_hash")
    @Validation(required = true)
    public String signFileHash;

    // 签署文件类型
    /**
     * <strong>example:</strong>
     * <p>NOTARY_PAPER：公证申请表 ONLINE_NOTIFICATION：在线公证受理平台公证受理告知书 EVIDENCE_NOTIFICATION：保全证据通用告知书 ONLINE_RECORD：在线公证申办询问记录</p>
     */
    @NameInMap("sign_file_type")
    @Validation(required = true)
    public String signFileType;

    public static SignDocument build(java.util.Map<String, ?> map) throws Exception {
        SignDocument self = new SignDocument();
        return TeaModel.build(map, self);
    }

    public SignDocument setSignFile(String signFile) {
        this.signFile = signFile;
        return this;
    }
    public String getSignFile() {
        return this.signFile;
    }

    public SignDocument setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public SignDocument setSignFileName(String signFileName) {
        this.signFileName = signFileName;
        return this;
    }
    public String getSignFileName() {
        return this.signFileName;
    }

    public SignDocument setSignFileDesc(String signFileDesc) {
        this.signFileDesc = signFileDesc;
        return this;
    }
    public String getSignFileDesc() {
        return this.signFileDesc;
    }

    public SignDocument setSignFileHash(String signFileHash) {
        this.signFileHash = signFileHash;
        return this;
    }
    public String getSignFileHash() {
        return this.signFileHash;
    }

    public SignDocument setSignFileType(String signFileType) {
        this.signFileType = signFileType;
        return this;
    }
    public String getSignFileType() {
        return this.signFileType;
    }

}
