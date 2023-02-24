// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryIdnumberEducationtaginfoRequest extends TeaModel {
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

    // 用户身份证号
    @NameInMap("user_cert_no")
    @Validation(required = true)
    public String userCertNo;

    public static QueryIdnumberEducationtaginfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIdnumberEducationtaginfoRequest self = new QueryIdnumberEducationtaginfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryIdnumberEducationtaginfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIdnumberEducationtaginfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIdnumberEducationtaginfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryIdnumberEducationtaginfoRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryIdnumberEducationtaginfoRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryIdnumberEducationtaginfoRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryIdnumberEducationtaginfoRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

}
