// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainMiniAppCodeCreate extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // transaction_hash
    /**
     * <strong>example:</strong>
     * <p>transaction_hash</p>
     */
    @NameInMap("transaction_hash")
    public String transactionHash;

    // base64_q_r_code_p_n_g
    /**
     * <strong>example:</strong>
     * <p>base64_q_r_code_p_n_g</p>
     */
    @NameInMap("base64_q_r_code_p_n_g")
    public String base64QRCodePNG;

    // q_r_code_content
    /**
     * <strong>example:</strong>
     * <p>q_r_code_content</p>
     */
    @NameInMap("q_r_code_content")
    public String qRCodeContent;

    public static ALiYunChainMiniAppCodeCreate build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainMiniAppCodeCreate self = new ALiYunChainMiniAppCodeCreate();
        return TeaModel.build(map, self);
    }

    public ALiYunChainMiniAppCodeCreate setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainMiniAppCodeCreate setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public ALiYunChainMiniAppCodeCreate setBase64QRCodePNG(String base64QRCodePNG) {
        this.base64QRCodePNG = base64QRCodePNG;
        return this;
    }
    public String getBase64QRCodePNG() {
        return this.base64QRCodePNG;
    }

    public ALiYunChainMiniAppCodeCreate setQRCodeContent(String qRCodeContent) {
        this.qRCodeContent = qRCodeContent;
        return this;
    }
    public String getQRCodeContent() {
        return this.qRCodeContent;
    }

}
