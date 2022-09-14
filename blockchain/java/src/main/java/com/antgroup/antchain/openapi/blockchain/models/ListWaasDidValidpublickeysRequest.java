// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ListWaasDidValidpublickeysRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户数字身份ID
    @NameInMap("did")
    public String did;

    // 姓名
    @NameInMap("name")
    public String name;

    // 证件号码
    @NameInMap("cert_no")
    public String certNo;

    public static ListWaasDidValidpublickeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWaasDidValidpublickeysRequest self = new ListWaasDidValidpublickeysRequest();
        return TeaModel.build(map, self);
    }

    public ListWaasDidValidpublickeysRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListWaasDidValidpublickeysRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListWaasDidValidpublickeysRequest setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public ListWaasDidValidpublickeysRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListWaasDidValidpublickeysRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
