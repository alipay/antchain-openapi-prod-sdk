// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunCertificateApplication extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>ant_chain_id</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // username
    /**
     * <strong>example:</strong>
     * <p>username</p>
     */
    @NameInMap("username")
    public String username;

    // createtime
    /**
     * <strong>example:</strong>
     * <p>createtime</p>
     */
    @NameInMap("createtime")
    public Long createtime;

    // updatetime
    /**
     * <strong>example:</strong>
     * <p>1231231231231</p>
     */
    @NameInMap("updatetime")
    public Long updatetime;

    // bid
    /**
     * <strong>example:</strong>
     * <p>bid</p>
     */
    @NameInMap("bid")
    public String bid;

    // status
    /**
     * <strong>example:</strong>
     * <p>status</p>
     */
    @NameInMap("status")
    public String status;

    public static ALiYunCertificateApplication build(java.util.Map<String, ?> map) throws Exception {
        ALiYunCertificateApplication self = new ALiYunCertificateApplication();
        return TeaModel.build(map, self);
    }

    public ALiYunCertificateApplication setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunCertificateApplication setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public ALiYunCertificateApplication setCreatetime(Long createtime) {
        this.createtime = createtime;
        return this;
    }
    public Long getCreatetime() {
        return this.createtime;
    }

    public ALiYunCertificateApplication setUpdatetime(Long updatetime) {
        this.updatetime = updatetime;
        return this;
    }
    public Long getUpdatetime() {
        return this.updatetime;
    }

    public ALiYunCertificateApplication setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ALiYunCertificateApplication setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
