// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mreach.models;

import com.aliyun.tea.*;

public class QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // VP 信封采用的加密算法
    @NameInMap("algorithm")
    public String algorithm;

    // 用于标识解密密钥的密钥别名
    @NameInMap("key_alias")
    public String keyAlias;

    // 加密后的VP数据密文
    @NameInMap("cipher")
    public String cipher;

    // 加密后的数据加密密钥密文
    @NameInMap("key_cipher")
    public String keyCipher;

    // 扩展信息，建议使用JSON字符串，用于返回扩展结果
    @NameInMap("extern_info")
    public String externInfo;

    public static QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse self = new QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setKeyAlias(String keyAlias) {
        this.keyAlias = keyAlias;
        return this;
    }
    public String getKeyAlias() {
        return this.keyAlias;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setCipher(String cipher) {
        this.cipher = cipher;
        return this;
    }
    public String getCipher() {
        return this.cipher;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setKeyCipher(String keyCipher) {
        this.keyCipher = keyCipher;
        return this;
    }
    public String getKeyCipher() {
        return this.keyCipher;
    }

    public QueryAntfinMpaasfaceverifyDigitalcredentialVpResponse setExternInfo(String externInfo) {
        this.externInfo = externInfo;
        return this;
    }
    public String getExternInfo() {
        return this.externInfo;
    }

}
