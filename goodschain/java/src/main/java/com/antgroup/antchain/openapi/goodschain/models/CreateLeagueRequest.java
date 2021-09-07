// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class CreateLeagueRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 酒证:WINE_ASSET,茶证:TEA_ASSET,艺术物证:ARTISTIC_ASSET
    @NameInMap("scene_type")
    @Validation(required = true)
    public String sceneType;

    // 联盟名称
    @NameInMap("league_name")
    @Validation(required = true)
    public String leagueName;

    // 黄酒集市
    @NameInMap("scene_desc")
    public String sceneDesc;

    public static CreateLeagueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeagueRequest self = new CreateLeagueRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeagueRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeagueRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeagueRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

    public CreateLeagueRequest setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        return this;
    }
    public String getLeagueName() {
        return this.leagueName;
    }

    public CreateLeagueRequest setSceneDesc(String sceneDesc) {
        this.sceneDesc = sceneDesc;
        return this;
    }
    public String getSceneDesc() {
        return this.sceneDesc;
    }

}
