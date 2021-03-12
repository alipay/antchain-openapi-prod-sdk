// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartAuthVcRevokeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 在type参数为1时，此did参数不需要传递，默认调用方吊销给用户颁发的卡证。
    @NameInMap("did")
    @Validation(required = true)
    public String did;

    // 类型说明，1：机构给用户颁发的证书，2：用户授权机构的证书(需要用户授权)
    @NameInMap("type")
    public Long type;

    // 吊销的目标可验证声明ID，如果type参数为1时，此参数可以默认不传，授权宝将会找到目标user当前持有的有效卡证，进行吊销处理。
    // 当type不为1时，此参数也可以不传，此时授权宝会根据userInfo和did信息去找到一个可吊销的VC进行吊销（应用层慎重使用，确保这样筛选的目标唯一性）。
    @NameInMap("vc_id")
    public String vcId;

    // 当type参数为1时，此参数和did参数，两者选一个使用，使用userId或者did参数指明did，代表的都是目标C类用户身份。
    // 当type不为1时，此参数代表C类用户身份，did参数指明授权的目标机构身份。
    // 
    @NameInMap("user_info")
    public String userInfo;

    public static StartAuthVcRevokeRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAuthVcRevokeRequest self = new StartAuthVcRevokeRequest();
        return TeaModel.build(map, self);
    }

    public StartAuthVcRevokeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartAuthVcRevokeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartAuthVcRevokeRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public StartAuthVcRevokeRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public StartAuthVcRevokeRequest setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public StartAuthVcRevokeRequest setUserInfo(String userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public String getUserInfo() {
        return this.userInfo;
    }

}
