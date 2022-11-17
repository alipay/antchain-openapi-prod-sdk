// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class SignDocument extends TeaModel {
    // 签署文件
    @NameInMap("sign_file")
    @Validation(required = true)
    public String signFile;

    // 到期时间戳
    @NameInMap("expire_time")
    @Validation(required = true)
    public Long expireTime;

    // 签署文件名
    @NameInMap("sign_file_name")
    @Validation(required = true)
    public String signFileName;

    // 签署文件描述
    @NameInMap("sign_file_desc")
    @Validation(required = true)
    public String signFileDesc;

    // 签署文件哈希
    @NameInMap("sign_file_hash")
    @Validation(required = true)
    public String signFileHash;

    // 签署文件类型
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
