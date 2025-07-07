// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainCloudIdeConfig extends TeaModel {
    // bizid
    /**
     * <strong>example:</strong>
     * <p>bizid</p>
     */
    @NameInMap("bizid")
    public String bizid;

    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    public String name;

    // trial_account
    /**
     * <strong>example:</strong>
     * <p>trial_account</p>
     */
    @NameInMap("trial_account")
    public String trialAccount;

    // trial_account_private_key
    /**
     * <strong>example:</strong>
     * <p>trial_account_private_key</p>
     */
    @NameInMap("trial_account_private_key")
    public String trialAccountPrivateKey;

    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // ant_chain_name
    /**
     * <strong>example:</strong>
     * <p>ant_chain_name</p>
     */
    @NameInMap("ant_chain_name")
    public String antChainName;

    // version
    /**
     * <strong>example:</strong>
     * <p>version</p>
     */
    @NameInMap("version")
    public String version;

    public static ALiYunChainCloudIdeConfig build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainCloudIdeConfig self = new ALiYunChainCloudIdeConfig();
        return TeaModel.build(map, self);
    }

    public ALiYunChainCloudIdeConfig setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public ALiYunChainCloudIdeConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ALiYunChainCloudIdeConfig setTrialAccount(String trialAccount) {
        this.trialAccount = trialAccount;
        return this;
    }
    public String getTrialAccount() {
        return this.trialAccount;
    }

    public ALiYunChainCloudIdeConfig setTrialAccountPrivateKey(String trialAccountPrivateKey) {
        this.trialAccountPrivateKey = trialAccountPrivateKey;
        return this;
    }
    public String getTrialAccountPrivateKey() {
        return this.trialAccountPrivateKey;
    }

    public ALiYunChainCloudIdeConfig setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainCloudIdeConfig setAntChainName(String antChainName) {
        this.antChainName = antChainName;
        return this;
    }
    public String getAntChainName() {
        return this.antChainName;
    }

    public ALiYunChainCloudIdeConfig setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
