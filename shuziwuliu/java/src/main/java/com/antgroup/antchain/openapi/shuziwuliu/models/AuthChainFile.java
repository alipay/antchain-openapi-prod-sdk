// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class AuthChainFile extends TeaModel {
    // 签署文件的hash值
    /**
     * <strong>example:</strong>
     * <p>ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52</p>
     */
    @NameInMap("sign_file_hash")
    @Validation(required = true)
    public String signFileHash;

    // 上链事务唯一标识
    /**
     * <strong>example:</strong>
     * <p>ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52</p>
     */
    @NameInMap("upload_chain_tx_code")
    @Validation(required = true)
    public String uploadChainTxCode;

    // 蚂蚁区块链统一证据编号
    /**
     * <strong>example:</strong>
     * <p>ca94860b2f902e1ba7917d2c6a983cc43e5b3921f4b7ab28ea791ac28314ba52</p>
     */
    @NameInMap("baas_uniq_code")
    @Validation(required = true)
    public String baasUniqCode;

    // 上链时间(13位毫秒级时间戳)
    /**
     * <strong>example:</strong>
     * <p>1628563284015</p>
     */
    @NameInMap("upload_chain_time")
    @Validation(required = true)
    public String uploadChainTime;

    // 上链文件下载链接
    /**
     * <strong>example:</strong>
     * <p><a href="https://pic2.zhimg.com/v2-4d91e54c6cc5d225471684987a2061a1_r.jpg">https://pic2.zhimg.com/v2-4d91e54c6cc5d225471684987a2061a1_r.jpg</a></p>
     */
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 上链文件名称，要求包含扩展名。文件格式允许: pdf, txt, doc, docx
    /**
     * <strong>example:</strong>
     * <p>上链文件.pdf</p>
     */
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    public static AuthChainFile build(java.util.Map<String, ?> map) throws Exception {
        AuthChainFile self = new AuthChainFile();
        return TeaModel.build(map, self);
    }

    public AuthChainFile setSignFileHash(String signFileHash) {
        this.signFileHash = signFileHash;
        return this;
    }
    public String getSignFileHash() {
        return this.signFileHash;
    }

    public AuthChainFile setUploadChainTxCode(String uploadChainTxCode) {
        this.uploadChainTxCode = uploadChainTxCode;
        return this;
    }
    public String getUploadChainTxCode() {
        return this.uploadChainTxCode;
    }

    public AuthChainFile setBaasUniqCode(String baasUniqCode) {
        this.baasUniqCode = baasUniqCode;
        return this;
    }
    public String getBaasUniqCode() {
        return this.baasUniqCode;
    }

    public AuthChainFile setUploadChainTime(String uploadChainTime) {
        this.uploadChainTime = uploadChainTime;
        return this;
    }
    public String getUploadChainTime() {
        return this.uploadChainTime;
    }

    public AuthChainFile setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AuthChainFile setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
