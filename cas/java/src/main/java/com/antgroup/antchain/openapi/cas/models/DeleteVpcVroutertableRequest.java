// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DeleteVpcVroutertableRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // 目标网段
    @NameInMap("destination_cidr_block")
    @Validation(required = true)
    public String destinationCidrBlock;

    // 下一跳实例 iaas id
    @NameInMap("next_hop_id")
    @Validation(required = true)
    public String nextHopId;

    // 路由表 iaasId
    @NameInMap("v_route_table_id")
    @Validation(required = true)
    public String vRouteTableId;

    // vpc paas id
    @NameInMap("vpc_sequence")
    @Validation(required = true)
    public String vpcSequence;

    public static DeleteVpcVroutertableRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVpcVroutertableRequest self = new DeleteVpcVroutertableRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVpcVroutertableRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteVpcVroutertableRequest setDestinationCidrBlock(String destinationCidrBlock) {
        this.destinationCidrBlock = destinationCidrBlock;
        return this;
    }
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    public DeleteVpcVroutertableRequest setNextHopId(String nextHopId) {
        this.nextHopId = nextHopId;
        return this;
    }
    public String getNextHopId() {
        return this.nextHopId;
    }

    public DeleteVpcVroutertableRequest setVRouteTableId(String vRouteTableId) {
        this.vRouteTableId = vRouteTableId;
        return this;
    }
    public String getVRouteTableId() {
        return this.vRouteTableId;
    }

    public DeleteVpcVroutertableRequest setVpcSequence(String vpcSequence) {
        this.vpcSequence = vpcSequence;
        return this;
    }
    public String getVpcSequence() {
        return this.vpcSequence;
    }

}
