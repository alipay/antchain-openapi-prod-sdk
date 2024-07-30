// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_320bc483f2434f39a3af9ec9f04d3cc0.models;

import com.aliyun.tea.*;

public class CaSignTaskRequest extends TeaModel {
    // 子业务流水号
    @NameInMap("sub_biz_no")
    @Validation(required = true)
    public String subBizNo;

    // 任务描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 签署人信息
    @NameInMap("sign_user_info_request_list")
    @Validation(required = true)
    public java.util.List<CaSignUserInfoRequest> signUserInfoRequestList;

    // 待签署文件列表
    @NameInMap("sign_file_request_list")
    public java.util.List<CaSignFileRequest> signFileRequestList;

    public static CaSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSignTaskRequest self = new CaSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public CaSignTaskRequest setSubBizNo(String subBizNo) {
        this.subBizNo = subBizNo;
        return this;
    }
    public String getSubBizNo() {
        return this.subBizNo;
    }

    public CaSignTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CaSignTaskRequest setSignUserInfoRequestList(java.util.List<CaSignUserInfoRequest> signUserInfoRequestList) {
        this.signUserInfoRequestList = signUserInfoRequestList;
        return this;
    }
    public java.util.List<CaSignUserInfoRequest> getSignUserInfoRequestList() {
        return this.signUserInfoRequestList;
    }

    public CaSignTaskRequest setSignFileRequestList(java.util.List<CaSignFileRequest> signFileRequestList) {
        this.signFileRequestList = signFileRequestList;
        return this;
    }
    public java.util.List<CaSignFileRequest> getSignFileRequestList() {
        return this.signFileRequestList;
    }

}
