// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class CreateVpcVroutertableRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 目标网端
    @NameInMap("destination_cidr_block")
    @Validation(required = true)
    public String destinationCidrBlock;

    // 下一跳资源 id
    @NameInMap("next_hop_id")
    @Validation(required = true)
    public String nextHopId;

    // 下一跳类型
    @NameInMap("next_hop_type")
    @Validation(required = true)
    public String nextHopType;

    // 路由表 id
    @NameInMap("v_route_table_id")
    @Validation(required = true)
    public String vRouteTableId;

    // vpc paas id
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    public static CreateVpcVroutertableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcVroutertableRequest self = new CreateVpcVroutertableRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcVroutertableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateVpcVroutertableRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public CreateVpcVroutertableRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public CreateVpcVroutertableRequest setNextHopType(String nextHopType) {
        this.nextHopType = nextHopType;
        return this;
    }
    public String getNextHopType() {
        return this.nextHopType;
    }

    public CreateVpcVroutertableRequest setVRouteTableId(String vRouteTableId) {
        this.vRouteTableId = vRouteTableId;
        return this;
    }
    public String getVRouteTableId() {
        return this.vRouteTableId;
    }

    public CreateVpcVroutertableRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

}
