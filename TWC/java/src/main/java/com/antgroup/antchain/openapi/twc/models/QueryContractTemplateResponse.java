// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractTemplateResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 业务码，0表示成功
    @NameInMap("code")
    public Long code;

    // 创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 模板文件下载地址
    @NameInMap("download_url")
    public String downloadUrl;

    // 模板文件大小
    @NameInMap("file_size")
    public Long fileSize;

    // 业务码信息
    @NameInMap("message")
    public String message;

    // 文件模板中的输入项组件列表
    @NameInMap("struct_components")
    public java.util.List<ContractTemplateStructComponent> structComponents;

    // 模板id
    @NameInMap("template_id")
    public String templateId;

    // 模板名称
    @NameInMap("template_name")
    public String templateName;

    // 更新时间
    @NameInMap("update_time")
    public Long updateTime;

    public static QueryContractTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractTemplateResponse self = new QueryContractTemplateResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractTemplateResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractTemplateResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractTemplateResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractTemplateResponse setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryContractTemplateResponse setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryContractTemplateResponse setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public QueryContractTemplateResponse setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public QueryContractTemplateResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryContractTemplateResponse setStructComponents(java.util.List<ContractTemplateStructComponent> structComponents) {
        this.structComponents = structComponents;
        return this;
    }
    public java.util.List<ContractTemplateStructComponent> getStructComponents() {
        return this.structComponents;
    }

    public QueryContractTemplateResponse setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public QueryContractTemplateResponse setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public QueryContractTemplateResponse setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
