// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ALiYunChainSubnetList extends TeaModel {
    // ant_chain_id
    /**
     * <strong>example:</strong>
     * <p>S210304150059</p>
     */
    @NameInMap("ant_chain_id")
    public String antChainId;

    // 子链名称
    /**
     * <strong>example:</strong>
     * <p>子链名称</p>
     */
    @NameInMap("blockchain_name")
    public String blockchainName;

    // 联盟管理员
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("consortium_admin")
    public Boolean consortiumAdmin;

    // 子链列表信息
    @NameInMap("blockchain_subnet_list")
    public java.util.List<ALiYunChainSubnet> blockchainSubnetList;

    public static ALiYunChainSubnetList build(java.util.Map<String, ?> map) throws Exception {
        ALiYunChainSubnetList self = new ALiYunChainSubnetList();
        return TeaModel.build(map, self);
    }

    public ALiYunChainSubnetList setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ALiYunChainSubnetList setBlockchainName(String blockchainName) {
        this.blockchainName = blockchainName;
        return this;
    }
    public String getBlockchainName() {
        return this.blockchainName;
    }

    public ALiYunChainSubnetList setConsortiumAdmin(Boolean consortiumAdmin) {
        this.consortiumAdmin = consortiumAdmin;
        return this;
    }
    public Boolean getConsortiumAdmin() {
        return this.consortiumAdmin;
    }

    public ALiYunChainSubnetList setBlockchainSubnetList(java.util.List<ALiYunChainSubnet> blockchainSubnetList) {
        this.blockchainSubnetList = blockchainSubnetList;
        return this;
    }
    public java.util.List<ALiYunChainSubnet> getBlockchainSubnetList() {
        return this.blockchainSubnetList;
    }

}
