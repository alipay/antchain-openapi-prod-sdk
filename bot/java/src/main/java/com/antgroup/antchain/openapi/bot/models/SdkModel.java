// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class SdkModel extends TeaModel {
    // 主键id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 设备SDK公钥
    @NameInMap("verify_key")
    @Validation(required = true)
    public String verifyKey;

    // SDK版本号
    @NameInMap("sdk_version_str")
    public String sdkVersionStr;

    // sdk模型
    @NameInMap("meta_model")
    public String metaModel;

    // 平台
    @NameInMap("platform")
    public String platform;

    // 公司名称
    @NameInMap("corp_name")
    public String corpName;

    public static SdkModel build(java.util.Map<String, ?> map) throws Exception {
        SdkModel self = new SdkModel();
        return TeaModel.build(map, self);
    }

    public SdkModel setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SdkModel setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public SdkModel setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SdkModel setVerifyKey(String verifyKey) {
        this.verifyKey = verifyKey;
        return this;
    }
    public String getVerifyKey() {
        return this.verifyKey;
    }

    public SdkModel setSdkVersionStr(String sdkVersionStr) {
        this.sdkVersionStr = sdkVersionStr;
        return this;
    }
    public String getSdkVersionStr() {
        return this.sdkVersionStr;
    }

    public SdkModel setMetaModel(String metaModel) {
        this.metaModel = metaModel;
        return this;
    }
    public String getMetaModel() {
        return this.metaModel;
    }

    public SdkModel setPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    public String getPlatform() {
        return this.platform;
    }

    public SdkModel setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

}
