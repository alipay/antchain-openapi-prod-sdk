// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryPhonenumberEducationinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据源id
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 用户是否已授权
    @NameInMap("user_authed")
    @Validation(required = true)
    public Boolean userAuthed;

    // 该接口对应的授权协议索引号
    @NameInMap("file_index")
    @Validation(required = true)
    public String fileIndex;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户手机号
    @NameInMap("user_tel")
    public String userTel;

    // 身份证号
    @NameInMap("user_cert_no")
    public String userCertNo;

    // 类型指示码
    @NameInMap("type_code")
    @Validation(required = true)
    public String typeCode;

    public static QueryPhonenumberEducationinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPhonenumberEducationinfoRequest self = new QueryPhonenumberEducationinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryPhonenumberEducationinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPhonenumberEducationinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPhonenumberEducationinfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryPhonenumberEducationinfoRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryPhonenumberEducationinfoRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryPhonenumberEducationinfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryPhonenumberEducationinfoRequest setUserTel(String userTel) {
        this.userTel = userTel;
        return this;
    }
    public String getUserTel() {
        return this.userTel;
    }

    public QueryPhonenumberEducationinfoRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

    public QueryPhonenumberEducationinfoRequest setTypeCode(String typeCode) {
        this.typeCode = typeCode;
        return this;
    }
    public String getTypeCode() {
        return this.typeCode;
    }

}
