// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationVehiclelicensecertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集id，开发者提供
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 是否授权
    @NameInMap("user_authed")
    @Validation(required = true)
    public Boolean userAuthed;

    // 授权协议索引
    @NameInMap("file_index")
    @Validation(required = true)
    public String fileIndex;

    // 车牌号
    @NameInMap("plate_number")
    @Validation(required = true)
    public String plateNumber;

    // 号牌种类，枚举
    @NameInMap("plate_type")
    @Validation(required = true)
    public String plateType;

    // 所有人姓名
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    public static QueryApplicationVehiclelicensecertRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationVehiclelicensecertRequest self = new QueryApplicationVehiclelicensecertRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationVehiclelicensecertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationVehiclelicensecertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationVehiclelicensecertRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryApplicationVehiclelicensecertRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryApplicationVehiclelicensecertRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationVehiclelicensecertRequest setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
        return this;
    }
    public String getPlateNumber() {
        return this.plateNumber;
    }

    public QueryApplicationVehiclelicensecertRequest setPlateType(String plateType) {
        this.plateType = plateType;
        return this;
    }
    public String getPlateType() {
        return this.plateType;
    }

    public QueryApplicationVehiclelicensecertRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
