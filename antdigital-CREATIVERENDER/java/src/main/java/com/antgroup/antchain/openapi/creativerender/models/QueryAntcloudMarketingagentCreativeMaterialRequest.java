// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creativerender.models;

import com.aliyun.tea.*;

public class QueryAntcloudMarketingagentCreativeMaterialRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 页码，从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // Creative 行业产品代码：FUND / RETAIL，查询时缺省为 RETAIL
    @NameInMap("product_code")
    public String productCode;

    // 空间类型：PERSONAL / ENTERPRISE
    @NameInMap("space_type")
    public String spaceType;

    // 素材类型，如 IMAGE / ANIMATION / FONT
    @NameInMap("material_type")
    public String materialType;

    // 使用场景
    @NameInMap("scene")
    public String scene;

    // 素材用途：REFERENCE_STYLE=参考样式，INPUT_ELEMENT=输入元素
    @NameInMap("material_usage")
    public String materialUsage;

    // 行业
    @NameInMap("industry")
    public String industry;

    // 投放平台，支持多选，多个值使用英文逗号分隔
    @NameInMap("publish_platforms")
    public String publishPlatforms;

    // 尺寸类型（16:9、9:16、1:1、4:3、3:4、OTHER）
    @NameInMap("material_size_type")
    public String materialSizeType;

    // 搜索关键词
    @NameInMap("keyword")
    public String keyword;

    // 是否平铺展示（true 时展开素材包子素材，不返回素材包父记录）
    @NameInMap("flatten")
    public Boolean flatten;

    public static QueryAntcloudMarketingagentCreativeMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudMarketingagentCreativeMaterialRequest self = new QueryAntcloudMarketingagentCreativeMaterialRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setSpaceType(String spaceType) {
        this.spaceType = spaceType;
        return this;
    }
    public String getSpaceType() {
        return this.spaceType;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setMaterialUsage(String materialUsage) {
        this.materialUsage = materialUsage;
        return this;
    }
    public String getMaterialUsage() {
        return this.materialUsage;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setPublishPlatforms(String publishPlatforms) {
        this.publishPlatforms = publishPlatforms;
        return this;
    }
    public String getPublishPlatforms() {
        return this.publishPlatforms;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setMaterialSizeType(String materialSizeType) {
        this.materialSizeType = materialSizeType;
        return this;
    }
    public String getMaterialSizeType() {
        return this.materialSizeType;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryAntcloudMarketingagentCreativeMaterialRequest setFlatten(Boolean flatten) {
        this.flatten = flatten;
        return this;
    }
    public Boolean getFlatten() {
        return this.flatten;
    }

}
