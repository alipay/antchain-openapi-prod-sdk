// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractSeal extends TeaModel {
    // 印章别名
    /**
     * <strong>example:</strong>
     * <p>红色四方形印章</p>
     */
    @NameInMap("alias")
    public String alias;

    // 印章创建时间
    /**
     * <strong>example:</strong>
     * <p>1556161219000</p>
     */
    @NameInMap("create_date")
    public Long createDate;

    // 默认印章标识
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("default_flag")
    public Boolean defaultFlag;

    // 印章fileKey
    /**
     * <strong>example:</strong>
     * <p>$fbd1d433-9f8f-4439-b184-7eb75861b31f$1759125409</p>
     */
    @NameInMap("file_key")
    public String fileKey;

    // 印章高度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("height")
    public Long height;

    // 印章宽度
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("width")
    public Long width;

    // 印章id
    /**
     * <strong>example:</strong>
     * <p>bcd7ffd9-5caf-4342-bd1c-02257229ccd5</p>
     */
    @NameInMap("seal_id")
    public String sealId;

    // 印章类型，1-机构模板章，2-个人模板章，3-自定义印章，4-手绘章
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("seal_type")
    public Long sealType;

    // 印章下载地址, 有效时间1小时
    /**
     * <strong>example:</strong>
     * <p><a href="https://esignoss.oss-cn-hangzhou.aliyuncs.com/seal-service/18bcc4c7-91">https://esignoss.oss-cn-hangzhou.aliyuncs.com/seal-service/18bcc4c7-91</a></p>
     */
    @NameInMap("url")
    public String url;

    // 印章业务类型，CANCELLATION-作废章，COMMON-其它
    /**
     * <strong>example:</strong>
     * <p>COMMON</p>
     */
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
