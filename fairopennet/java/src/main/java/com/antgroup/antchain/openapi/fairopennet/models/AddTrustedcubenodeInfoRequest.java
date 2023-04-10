// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class AddTrustedcubenodeInfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("cube_node")
    @Validation(required = true)
    public CubeNode cubeNode;

    //  
    @NameInMap("extra")
    @Validation(required = true)
    public String extra;

    public static AddTrustedcubenodeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTrustedcubenodeInfoRequest self = new AddTrustedcubenodeInfoRequest();
        return TeaModel.build(map, self);
    }

    public AddTrustedcubenodeInfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddTrustedcubenodeInfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddTrustedcubenodeInfoRequest setCubeNode(CubeNode cubeNode) {
        this.cubeNode = cubeNode;
        return this;
    }
    public CubeNode getCubeNode() {
        return this.cubeNode;
    }

    public AddTrustedcubenodeInfoRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
