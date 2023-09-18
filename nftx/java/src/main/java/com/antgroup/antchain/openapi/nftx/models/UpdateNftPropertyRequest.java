// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class UpdateNftPropertyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id标识
    @NameInMap("id_no")
    @Validation(required = true)
    public String idNo;

    // 用户id类型
    @NameInMap("id_type")
    @Validation(required = true)
    public String idType;

    // 资产标识
    @NameInMap("nft_id")
    @Validation(required = true)
    public String nftId;

    // 更新的来源
    @NameInMap("source")
    @Validation(required = true)
    public String source;

    // Json字符串：通过解析该字段，根据提前约定的key进行取值操作
    @NameInMap("update_info")
    @Validation(required = true)
    public String updateInfo;

    public static UpdateNftPropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNftPropertyRequest self = new UpdateNftPropertyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNftPropertyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateNftPropertyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateNftPropertyRequest setIdNo(String idNo) {
        this.idNo = idNo;
        return this;
    }
    public String getIdNo() {
        return this.idNo;
    }

    public UpdateNftPropertyRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public UpdateNftPropertyRequest setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public UpdateNftPropertyRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UpdateNftPropertyRequest setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
        return this;
    }
    public String getUpdateInfo() {
        return this.updateInfo;
    }

}
