// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RegisterPdcpDataassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据类型编码
    @NameInMap("data_type_no")
    @Validation(required = true)
    public String dataTypeNo;

    // 数据资产所有者id
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    public static RegisterPdcpDataassetRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterPdcpDataassetRequest self = new RegisterPdcpDataassetRequest();
        return TeaModel.build(map, self);
    }

    public RegisterPdcpDataassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterPdcpDataassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterPdcpDataassetRequest setDataTypeNo(String dataTypeNo) {
        this.dataTypeNo = dataTypeNo;
        return this;
    }
    public String getDataTypeNo() {
        return this.dataTypeNo;
    }

    public RegisterPdcpDataassetRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

}
