// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class UserOperatorInfoBO extends TeaModel {
    // userId
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_id")
    public String userId;

    // 别名
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("alias")
    public String alias;

    // 钱包地址
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("address")
    public String address;

    // 登录账号类型列表
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_login_account_list")
    public java.util.List<LoginAccountTypeBO> userLoginAccountList;

    // 机构类型列表
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("user_institution_type_list")
    public java.util.List<String> userInstitutionTypeList;

    public static UserOperatorInfoBO build(java.util.Map<String, ?> map) throws Exception {
        UserOperatorInfoBO self = new UserOperatorInfoBO();
        return TeaModel.build(map, self);
    }

    public UserOperatorInfoBO setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UserOperatorInfoBO setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public UserOperatorInfoBO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UserOperatorInfoBO setUserLoginAccountList(java.util.List<LoginAccountTypeBO> userLoginAccountList) {
        this.userLoginAccountList = userLoginAccountList;
        return this;
    }
    public java.util.List<LoginAccountTypeBO> getUserLoginAccountList() {
        return this.userLoginAccountList;
    }

    public UserOperatorInfoBO setUserInstitutionTypeList(java.util.List<String> userInstitutionTypeList) {
        this.userInstitutionTypeList = userInstitutionTypeList;
        return this;
    }
    public java.util.List<String> getUserInstitutionTypeList() {
        return this.userInstitutionTypeList;
    }

}
