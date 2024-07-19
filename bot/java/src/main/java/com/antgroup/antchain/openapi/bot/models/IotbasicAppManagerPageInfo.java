// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class IotbasicAppManagerPageInfo extends TeaModel {
    // 应用类型
    @NameInMap("file_format")
    @Validation(required = true)
    public String fileFormat;

    // 应用大小
    @NameInMap("file_size")
    @Validation(required = true)
    public Long fileSize;

    // 应用模块名称
    @NameInMap("module_name")
    @Validation(required = true)
    public String moduleName;

    // 设备品类code
    @NameInMap("device_category")
    @Validation(required = true)
    public String deviceCategory;

    // 设备品类名称
    @NameInMap("device_category_name")
    @Validation(required = true)
    public String deviceCategoryName;

    // 应用模块包名
    @NameInMap("package_name")
    @Validation(required = true)
    public String packageName;

    // 应用描述
    @NameInMap("remark")
    public String remark;

    // 应用版本号
    @NameInMap("apk_version")
    @Validation(required = true)
    public String apkVersion;

    // 应用包类型（整包：0/差分：1）
    @NameInMap("apk_type")
    @Validation(required = true)
    public Long apkType;

    // 应用名称
    @NameInMap("apk_name")
    @Validation(required = true)
    public String apkName;

    // 应用包id
    @NameInMap("apk_id")
    @Validation(required = true)
    public String apkId;

    // 下载次数
    @NameInMap("download_count")
    @Validation(required = true)
    public Long downloadCount;

    // 安装次数
    @NameInMap("install_count")
    @Validation(required = true)
    public Long installCount;

    // 设备型号
    @NameInMap("device_model")
    public String deviceModel;

    public static IotbasicAppManagerPageInfo build(java.util.Map<String, ?> map) throws Exception {
        IotbasicAppManagerPageInfo self = new IotbasicAppManagerPageInfo();
        return TeaModel.build(map, self);
    }

    public IotbasicAppManagerPageInfo setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public IotbasicAppManagerPageInfo setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public IotbasicAppManagerPageInfo setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public IotbasicAppManagerPageInfo setDeviceCategory(String deviceCategory) {
        this.deviceCategory = deviceCategory;
        return this;
    }
    public String getDeviceCategory() {
        return this.deviceCategory;
    }

    public IotbasicAppManagerPageInfo setDeviceCategoryName(String deviceCategoryName) {
        this.deviceCategoryName = deviceCategoryName;
        return this;
    }
    public String getDeviceCategoryName() {
        return this.deviceCategoryName;
    }

    public IotbasicAppManagerPageInfo setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public IotbasicAppManagerPageInfo setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public IotbasicAppManagerPageInfo setApkVersion(String apkVersion) {
        this.apkVersion = apkVersion;
        return this;
    }
    public String getApkVersion() {
        return this.apkVersion;
    }

    public IotbasicAppManagerPageInfo setApkType(Long apkType) {
        this.apkType = apkType;
        return this;
    }
    public Long getApkType() {
        return this.apkType;
    }

    public IotbasicAppManagerPageInfo setApkName(String apkName) {
        this.apkName = apkName;
        return this;
    }
    public String getApkName() {
        return this.apkName;
    }

    public IotbasicAppManagerPageInfo setApkId(String apkId) {
        this.apkId = apkId;
        return this;
    }
    public String getApkId() {
        return this.apkId;
    }

    public IotbasicAppManagerPageInfo setDownloadCount(Long downloadCount) {
        this.downloadCount = downloadCount;
        return this;
    }
    public Long getDownloadCount() {
        return this.downloadCount;
    }

    public IotbasicAppManagerPageInfo setInstallCount(Long installCount) {
        this.installCount = installCount;
        return this;
    }
    public Long getInstallCount() {
        return this.installCount;
    }

    public IotbasicAppManagerPageInfo setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

}
