// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainDownload extends TeaModel {
    // private_key
    /**
     * <strong>example:</strong>
     * <p>private_key</p>
     */
    @NameInMap("private_key")
    public String privateKey;

    // download_path
    /**
     * <strong>example:</strong>
     * <p>download_path</p>
     */
    @NameInMap("download_path")
    public ALiYunDownloadPath downloadPath;

    public static ALiYunChainDownload build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainDownload self = new ALiYunChainDownload();
        return TeaModel.build(map, self);
    }

    public ALiYunChainDownload setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public ALiYunChainDownload setDownloadPath(ALiYunDownloadPath downloadPath) {
        this.downloadPath = downloadPath;
        return this;
    }
    public ALiYunDownloadPath getDownloadPath() {
        return this.downloadPath;
    }

}
