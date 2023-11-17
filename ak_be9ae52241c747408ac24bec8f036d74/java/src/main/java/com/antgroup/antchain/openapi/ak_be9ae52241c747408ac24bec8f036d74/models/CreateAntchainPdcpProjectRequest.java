// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class CreateAntchainPdcpProjectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 参与方节点信息列表，不同的节点类型参考不同结构体。一期节点类型仅支持FATE，其构造方式请参考FatePartyLocalConfigInfo
    @NameInMap("party_list")
    @Validation(required = true)
    public java.util.List<PartyReq> partyList;

    public static CreateAntchainPdcpProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAntchainPdcpProjectRequest self = new CreateAntchainPdcpProjectRequest();
        return TeaModel.build(map, self);
    }

    public CreateAntchainPdcpProjectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateAntchainPdcpProjectRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateAntchainPdcpProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAntchainPdcpProjectRequest setPartyList(java.util.List<PartyReq> partyList) {
        this.partyList = partyList;
        return this;
    }
    public java.util.List<PartyReq> getPartyList() {
        return this.partyList;
    }

}
