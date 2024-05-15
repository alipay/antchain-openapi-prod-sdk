// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class DataAssetInfo extends TeaModel {
    // 数据资产DID
    @NameInMap("dataset_did")
    @Validation(required = true)
    public String datasetDid;

    // 数据资产所有方DID
    @NameInMap("user_did")
    @Validation(required = true)
    public String userDid;

    // 数据资产名称
    @NameInMap("dataset_name")
    @Validation(required = true)
    public String datasetName;

    // 数据类型
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    public static DataAssetInfo build(java.util.Map<String, ?> map) throws Exception {
        DataAssetInfo self = new DataAssetInfo();
        return TeaModel.build(map, self);
    }

    public DataAssetInfo setDatasetDid(String datasetDid) {
        this.datasetDid = datasetDid;
        return this;
    }
    public String getDatasetDid() {
        return this.datasetDid;
    }

    public DataAssetInfo setUserDid(String userDid) {
        this.userDid = userDid;
        return this;
    }
    public String getUserDid() {
        return this.userDid;
    }

    public DataAssetInfo setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public DataAssetInfo setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

}
