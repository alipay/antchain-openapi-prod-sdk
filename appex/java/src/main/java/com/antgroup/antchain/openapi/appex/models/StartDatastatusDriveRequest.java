// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class StartDatastatusDriveRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链身份
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 联盟标识（联盟码）
    @NameInMap("union_id")
    @Validation(required = true)
    public String unionId;

    // 链上物体的身份，即物体（物权）上链接口返回的交易哈希
    @NameInMap("object_hash")
    @Validation(required = true)
    public String objectHash;

    // 进行驱动状态的环节业务类型
    @NameInMap("form_type")
    @Validation(required = true)
    public String formType;

    // 驱动状态的信息备注
    @NameInMap("form_body")
    @Validation(required = true)
    public String formBody;

    // 是否驱动状态流转，前置条件配置了状态流转模版
    @NameInMap("drive_status")
    @Validation(required = true)
    public Boolean driveStatus;

    public static StartDatastatusDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDatastatusDriveRequest self = new StartDatastatusDriveRequest();
        return TeaModel.build(map, self);
    }

    public StartDatastatusDriveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public StartDatastatusDriveRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public StartDatastatusDriveRequest setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public StartDatastatusDriveRequest setUnionId(String unionId) {
        this.unionId = unionId;
        return this;
    }
    public String getUnionId() {
        return this.unionId;
    }

    public StartDatastatusDriveRequest setObjectHash(String objectHash) {
        this.objectHash = objectHash;
        return this;
    }
    public String getObjectHash() {
        return this.objectHash;
    }

    public StartDatastatusDriveRequest setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public StartDatastatusDriveRequest setFormBody(String formBody) {
        this.formBody = formBody;
        return this;
    }
    public String getFormBody() {
        return this.formBody;
    }

    public StartDatastatusDriveRequest setDriveStatus(Boolean driveStatus) {
        this.driveStatus = driveStatus;
        return this;
    }
    public Boolean getDriveStatus() {
        return this.driveStatus;
    }

}
