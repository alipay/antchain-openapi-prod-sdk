// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAshieldPeriodhardeningtaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // APK,ABB 上传后的地址
    @NameInMap("file_url")
    @Validation(required = true)
    public String fileUrl;

    // 开启so加固
    @NameInMap("so_protect")
    public String soProtect;

    // 开启so加固后,设置的so加固配置文件,默认对apk中libs目录下所有so进行加固,以逗号分隔
    @NameInMap("so_protect_config")
    public String soProtectConfig;

    // 开启对assets下的资源文件进行加固
    @NameInMap("assets_protect")
    public String assetsProtect;

    // 开启assets加固后,指定要对apk中assets目录下的哪些文件做加固,默认对assets下所有的文件进行保护,以逗号分隔
    @NameInMap("assets_protect_confing")
    public String assetsProtectConfing;

    // 开启运行时保护,需要填写的参数,具体参数见下方,json格式
    @NameInMap("runtime_protect_config")
    public RuntimeProtectConfig runtimeProtectConfig;

    // 对生命周期函数进行java2jni保护
    @NameInMap("enable_life_func")
    public String enableLifeFunc;

    // java2jni配置文件
    @NameInMap("javatoc_jni_config")
    public java.util.List<ClassMethodConfig> javatocJniConfig;

    // 扩展信息,json字符串,暂不使用
    @NameInMap("ext_info")
    public String extInfo;

    public static SubmitAshieldPeriodhardeningtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAshieldPeriodhardeningtaskRequest self = new SubmitAshieldPeriodhardeningtaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAshieldPeriodhardeningtaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setSoProtect(String soProtect) {
        this.soProtect = soProtect;
        return this;
    }
    public String getSoProtect() {
        return this.soProtect;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setSoProtectConfig(String soProtectConfig) {
        this.soProtectConfig = soProtectConfig;
        return this;
    }
    public String getSoProtectConfig() {
        return this.soProtectConfig;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setAssetsProtect(String assetsProtect) {
        this.assetsProtect = assetsProtect;
        return this;
    }
    public String getAssetsProtect() {
        return this.assetsProtect;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setAssetsProtectConfing(String assetsProtectConfing) {
        this.assetsProtectConfing = assetsProtectConfing;
        return this;
    }
    public String getAssetsProtectConfing() {
        return this.assetsProtectConfing;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setRuntimeProtectConfig(RuntimeProtectConfig runtimeProtectConfig) {
        this.runtimeProtectConfig = runtimeProtectConfig;
        return this;
    }
    public RuntimeProtectConfig getRuntimeProtectConfig() {
        return this.runtimeProtectConfig;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setEnableLifeFunc(String enableLifeFunc) {
        this.enableLifeFunc = enableLifeFunc;
        return this;
    }
    public String getEnableLifeFunc() {
        return this.enableLifeFunc;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setJavatocJniConfig(java.util.List<ClassMethodConfig> javatocJniConfig) {
        this.javatocJniConfig = javatocJniConfig;
        return this;
    }
    public java.util.List<ClassMethodConfig> getJavatocJniConfig() {
        return this.javatocJniConfig;
    }

    public SubmitAshieldPeriodhardeningtaskRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
