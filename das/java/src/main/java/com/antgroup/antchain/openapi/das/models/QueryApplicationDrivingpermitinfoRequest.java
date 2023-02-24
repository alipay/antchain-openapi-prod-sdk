// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationDrivingpermitinfoRequest extends TeaModel {
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
    @NameInMap("plat_number")
    @Validation(required = true)
    public String platNumber;

    // 号牌种类，枚举
    @NameInMap("platetype")
    @Validation(required = true)
    public String platetype;

    // 所有人姓名
    @NameInMap("owner")
    @Validation(required = true)
    public String owner;

    public static QueryApplicationDrivingpermitinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDrivingpermitinfoRequest self = new QueryApplicationDrivingpermitinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDrivingpermitinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationDrivingpermitinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationDrivingpermitinfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryApplicationDrivingpermitinfoRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryApplicationDrivingpermitinfoRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationDrivingpermitinfoRequest setPlatNumber(String platNumber) {
        this.platNumber = platNumber;
        return this;
    }
    public String getPlatNumber() {
        return this.platNumber;
    }

    public QueryApplicationDrivingpermitinfoRequest setPlatetype(String platetype) {
        this.platetype = platetype;
        return this;
    }
    public String getPlatetype() {
        return this.platetype;
    }

    public QueryApplicationDrivingpermitinfoRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

}
