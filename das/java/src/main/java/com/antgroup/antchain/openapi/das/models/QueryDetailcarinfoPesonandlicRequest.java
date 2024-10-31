// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryDetailcarinfoPesonandlicRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据集id，开发者提供
    // 
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 是否授权
    // 
    @NameInMap("user_authed")
    @Validation(required = true)
    public Boolean userAuthed;

    // 授权协议索引
    // 
    @NameInMap("file_index")
    @Validation(required = true)
    public String fileIndex;

    // 待核验车主姓名
    // 
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 待核验车主身份证号
    // 
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 号牌号码
    @NameInMap("license_no")
    @Validation(required = true)
    public String licenseNo;

    public static QueryDetailcarinfoPesonandlicRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDetailcarinfoPesonandlicRequest self = new QueryDetailcarinfoPesonandlicRequest();
        return TeaModel.build(map, self);
    }

    public QueryDetailcarinfoPesonandlicRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDetailcarinfoPesonandlicRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDetailcarinfoPesonandlicRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryDetailcarinfoPesonandlicRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryDetailcarinfoPesonandlicRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryDetailcarinfoPesonandlicRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryDetailcarinfoPesonandlicRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public QueryDetailcarinfoPesonandlicRequest setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
        return this;
    }
    public String getLicenseNo() {
        return this.licenseNo;
    }

}
