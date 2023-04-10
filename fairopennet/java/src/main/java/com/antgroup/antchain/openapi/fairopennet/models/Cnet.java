// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class Cnet extends TeaModel {
    //  
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    //  
    @NameInMap("blockchain_num")
    @Validation(required = true)
    public String blockchainNum;

    //  
    @NameInMap("my_normal_node_id")
    @Validation(required = true)
    public String myNormalNodeId;

    //  
    @NameInMap("governance_contract")
    @Validation(required = true)
    public String governanceContract;

    //  
    @NameInMap("my_role")
    @Validation(required = true)
    public String myRole;

    //  
    @NameInMap("party_list")
    @Validation(required = true)
    public java.util.List<String> partyList;

    public static Cnet build(java.util.Map<String, ?> map) throws Exception {
        Cnet self = new Cnet();
        return TeaModel.build(map, self);
    }

    public Cnet setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Cnet setBlockchainNum(String blockchainNum) {
        this.blockchainNum = blockchainNum;
        return this;
    }
    public String getBlockchainNum() {
        return this.blockchainNum;
    }

    public Cnet setMyNormalNodeId(String myNormalNodeId) {
        this.myNormalNodeId = myNormalNodeId;
        return this;
    }
    public String getMyNormalNodeId() {
        return this.myNormalNodeId;
    }

    public Cnet setGovernanceContract(String governanceContract) {
        this.governanceContract = governanceContract;
        return this;
    }
    public String getGovernanceContract() {
        return this.governanceContract;
    }

    public Cnet setMyRole(String myRole) {
        this.myRole = myRole;
        return this;
    }
    public String getMyRole() {
        return this.myRole;
    }

    public Cnet setPartyList(java.util.List<String> partyList) {
        this.partyList = partyList;
        return this;
    }
    public java.util.List<String> getPartyList() {
        return this.partyList;
    }

}
