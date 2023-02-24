// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationDriverlicenseinfoRequest extends TeaModel {
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

    // 身份证号AES加密
    @NameInMap("id_card")
    @Validation(required = true)
    public String idCard;

    // 姓名aes加密
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static QueryApplicationDriverlicenseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationDriverlicenseinfoRequest self = new QueryApplicationDriverlicenseinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationDriverlicenseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationDriverlicenseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationDriverlicenseinfoRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public QueryApplicationDriverlicenseinfoRequest setUserAuthed(Boolean userAuthed) {
        this.userAuthed = userAuthed;
        return this;
    }
    public Boolean getUserAuthed() {
        return this.userAuthed;
    }

    public QueryApplicationDriverlicenseinfoRequest setFileIndex(String fileIndex) {
        this.fileIndex = fileIndex;
        return this;
    }
    public String getFileIndex() {
        return this.fileIndex;
    }

    public QueryApplicationDriverlicenseinfoRequest setIdCard(String idCard) {
        this.idCard = idCard;
        return this;
    }
    public String getIdCard() {
        return this.idCard;
    }

    public QueryApplicationDriverlicenseinfoRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
