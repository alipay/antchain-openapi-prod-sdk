// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationEducationstatusRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 需求ID
    @NameInMap("data_set_id")
    @Validation(required = true)
    public String dataSetId;

    // 用户是否已经授权
    @NameInMap("user_authed")
    @Validation(required = true)
    public Boolean userAuthed;

    // 授权文件索引
    @NameInMap("file_index")
    @Validation(required = true)
    public String fileIndex;

    // 姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 身份证号
    @NameInMap("user_cert_no")
    @Validation(required = true)
    public String userCertNo;

    public static QueryApplicationEducationstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationEducationstatusRequest self = new QueryApplicationEducationstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationEducationstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationEducationstatusRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationEducationstatusRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryApplicationEducationstatusRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryApplicationEducationstatusRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationEducationstatusRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryApplicationEducationstatusRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

}
