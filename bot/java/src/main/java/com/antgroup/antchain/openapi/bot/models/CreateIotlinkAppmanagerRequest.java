// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateIotlinkAppmanagerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 应用文件
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    public String fileId;

    // 应用模块名称，由查询应用类型列表获取。默认使用default模块
    @NameInMap("module_name")
    public String moduleName;

    // OTA升级包名称，需在iot账号下唯一，创建后不可修改。支持中文、英文字母、日文、数字、短划线（-）、下划线（_）和半角圆括号（()），必须以中文、英文、日文或数字开头，长度限制为1~40个字符。
    @NameInMap("apk_name")
    @Validation(required = true)
    public String apkName;

    // 品类code
    @NameInMap("category_code")
    @Validation(required = true)
    public String categoryCode;

    // 设备型号值
    @NameInMap("device_model_value")
    public String deviceModelValue;

    // 应用包描述
    // 最大字符为100
    @NameInMap("remark")
    public String remark;

    // 当前OTA升级包的版本号，仅支持英文字母、数字、半角句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
    // 最新模块版本好可通过查询应用类型列表接口获取
    @NameInMap("apk_version")
    @Validation(required = true)
    public String apkVersion;

    // 项目编码
    @NameInMap("project_code")
    @Validation(required = true)
    public String projectCode;

    // 文件地址
    @NameInMap("file_url")
    public String fileUrl;

    public static CreateIotlinkAppmanagerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIotlinkAppmanagerRequest self = new CreateIotlinkAppmanagerRequest();
        return TeaModel.build(map, self);
    }

    public CreateIotlinkAppmanagerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateIotlinkAppmanagerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateIotlinkAppmanagerRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateIotlinkAppmanagerRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateIotlinkAppmanagerRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateIotlinkAppmanagerRequest setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public CreateIotlinkAppmanagerRequest setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public CreateIotlinkAppmanagerRequest setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
        return this;
    }
    public String getCategoryCode() {
        return this.categoryCode;
    }

    public CreateIotlinkAppmanagerRequest setDeviceModelValue(String deviceModelValue) {
        this.deviceModelValue = deviceModelValue;
        return this;
    }
    public String getDeviceModelValue() {
        return this.deviceModelValue;
    }

    public CreateIotlinkAppmanagerRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateIotlinkAppmanagerRequest setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public CreateIotlinkAppmanagerRequest setProjectCode(String projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public String getProjectCode() {
        return this.projectCode;
    }

    public CreateIotlinkAppmanagerRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

}
