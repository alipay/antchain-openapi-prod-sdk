// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm.models;

import com.aliyun.tea.*;

public class AddProductMemberRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // user_id
    @NameInMap("member_list")
    @Validation(required = true)
    public java.util.List<String> memberList;

    // 产品码
    @NameInMap("prod_code")
    @Validation(required = true)
    public String prodCode;

    public static AddProductMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddProductMemberRequest self = new AddProductMemberRequest();
        return TeaModel.build(map, self);
    }

    public AddProductMemberRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddProductMemberRequest setMemberList(java.util.List<String> memberList) {
        this.memberList = memberList;
        return this;
    }
    public java.util.List<String> getMemberList() {
        return this.memberList;
    }

    public AddProductMemberRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

}
