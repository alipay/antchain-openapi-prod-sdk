// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.duanka.models;

import com.aliyun.tea.*;

public class QueryHrUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 花名列表
    @NameInMap("nick_name_list")
    public java.util.List<String> nickNameList;

    // 域账户列表
    @NameInMap("login_account_list")
    public java.util.List<String> loginAccountList;

    public static QueryHrUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHrUserRequest self = new QueryHrUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryHrUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryHrUserRequest setNickNameList(java.util.List<String> nickNameList) {
        this.nickNameList = nickNameList;
        return this;
    }
    public java.util.List<String> getNickNameList() {
        return this.nickNameList;
    }

    public QueryHrUserRequest setLoginAccountList(java.util.List<String> loginAccountList) {
        this.loginAccountList = loginAccountList;
        return this;
    }
    public java.util.List<String> getLoginAccountList() {
        return this.loginAccountList;
    }

}
