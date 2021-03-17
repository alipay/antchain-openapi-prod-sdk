// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class SignTask extends TeaModel {
    // 文件路径
    @NameInMap("file_path")
    @Validation(required = true)
    public String filePath;

    // 签署信息列表
    @NameInMap("sign_info_list")
    @Validation(required = true)
    public java.util.List<SignInfo> signInfoList;

    // 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
    @NameInMap("sign_document_type")
    @Validation(required = true)
    public String signDocumentType;

    public static SignTask build(java.util.Map<String, ?> map) throws Exception {
        SignTask self = new SignTask();
        return TeaModel.build(map, self);
    }

    public SignTask setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public SignTask setSignInfoList(java.util.List<SignInfo> signInfoList) {
        this.signInfoList = signInfoList;
        return this;
    }
    public java.util.List<SignInfo> getSignInfoList() {
        return this.signInfoList;
    }

    public SignTask setSignDocumentType(String signDocumentType) {
        this.signDocumentType = signDocumentType;
        return this;
    }
    public String getSignDocumentType() {
        return this.signDocumentType;
    }

}
