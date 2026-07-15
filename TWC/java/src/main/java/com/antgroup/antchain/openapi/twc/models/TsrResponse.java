// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class TsrResponse extends TeaModel {
    // 可信时间请求结果状态吗
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // hash后的信息
    /**
     * <strong>example:</strong>
     * <p>AAAAA </p>
     */
    @NameInMap("hashed_message")
    @Validation(required = true)
    public String hashedMessage;

    // 哈希算法
    /**
     * <strong>example:</strong>
     * <p>321</p>
     */
    @NameInMap("hash_algorithm")
    @Validation(required = true)
    public String hashAlgorithm;

    // 请求失败时候的错误信息
    /**
     * <strong>example:</strong>
     * <p>Request failed</p>
     */
    @NameInMap("message")
    public String message;

    // 时间
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("ts")
    @Validation(required = true)
    public String ts;

    // 精简后的时间戳完整编码（在校验时需要提交）
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("ctsr")
    @Validation(required = true)
    public String ctsr;

    // 凭证序列号 （在校验的时需要先填写凭证编号）
    // 
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sn")
    @Validation(required = true)
    public String sn;

    public static TsrResponse build(java.util.Map<String, ?> map) throws Exception {
        TsrResponse self = new TsrResponse();
        return TeaModel.build(map, self);
    }

    public TsrResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TsrResponse setHashedMessage(String hashedMessage) {
        this.hashedMessage = hashedMessage;
        return this;
    }
    public String getHashedMessage() {
        return this.hashedMessage;
    }

    public TsrResponse setHashAlgorithm(String hashAlgorithm) {
        this.hashAlgorithm = hashAlgorithm;
        return this;
    }
    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public TsrResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TsrResponse setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public TsrResponse setCtsr(String ctsr) {
        this.ctsr = ctsr;
        return this;
    }
    public String getCtsr() {
        return this.ctsr;
    }

    public TsrResponse setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
