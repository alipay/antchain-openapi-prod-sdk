// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSeal extends TeaModel {
    // 印章别名
    @NameInMap("alias")
    public String alias;

    // 印章创建时间
    @NameInMap("create_date")
    public Long createDate;

    // 默认印章标识
    @NameInMap("default_flag")
    public Boolean defaultFlag;

    // 印章fileKey
    @NameInMap("file_key")
    public String fileKey;

    // 印章高度
    @NameInMap("height")
    public Long height;

    // 印章宽度
    @NameInMap("width")
    public Long width;

    // 印章id
    @NameInMap("seal_id")
    public String sealId;

    // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
    @NameInMap("seal_type")
    public Long sealType;

    // 印章下载地址, 有效时间1小时
    @NameInMap("url")
    public String url;

    // 印章业务类型，CANCELLATION-作废章，COMMON-其它
    @NameInMap("seal_biz_type")
    public String sealBizType;

    public static ContractSeal build(java.util.Map<String, ?> map) throws Exception {
        ContractSeal self = new ContractSeal();
        return TeaModel.build(map, self);
    }

    public ContractSeal setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public ContractSeal setCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }
    public Long getCreateDate() {
        return this.createDate;
    }

    public ContractSeal setDefaultFlag(Boolean defaultFlag) {
        this.defaultFlag = defaultFlag;
        return this;
    }
    public Boolean getDefaultFlag() {
        return this.defaultFlag;
    }

    public ContractSeal setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ContractSeal setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public ContractSeal setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

    public ContractSeal setSealId(String sealId) {
        this.sealId = sealId;
        return this;
    }
    public String getSealId() {
        return this.sealId;
    }

    public ContractSeal setSealType(Long sealType) {
        this.sealType = sealType;
        return this;
    }
    public Long getSealType() {
        return this.sealType;
    }

    public ContractSeal setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public ContractSeal setSealBizType(String sealBizType) {
        this.sealBizType = sealBizType;
        return this;
    }
    public String getSealBizType() {
        return this.sealBizType;
    }

}
