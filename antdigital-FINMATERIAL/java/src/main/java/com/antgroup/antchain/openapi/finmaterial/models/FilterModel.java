// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class FilterModel extends TeaModel {
    // 仅搜索指定网站。例如 ["gov.cn"] 表示只返回该域名下的内容；填写域名，不包含协议和路径
    /**
     * <strong>example:</strong>
     * <p>[&quot;gov.cn&quot;]</p>
     */
    @NameInMap("include_domains")
    public java.util.List<String> includeDomains;

    // 排除指定网站；填写域名，不包含协议和路径
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("exclude_domains")
    public java.util.List<String> excludeDomains;

    // 预留。计划用于按发布时间筛选，当前不生效
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("time_range")
    public String timeRange;

    // 是否同时查询行业垂类数据接口；命中结果通过 Result.IndustryData 独立返回
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("need_url")
    public Boolean needUrl;

    // 预留。计划支持 news 等网页搜索领域，当前不生效
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("industry")
    public String industry;

    public static FilterModel build(java.util.Map<String, ?> map) throws Exception {
        FilterModel self = new FilterModel();
        return TeaModel.build(map, self);
    }

    public FilterModel setIncludeDomains(java.util.List<String> includeDomains) {
        this.includeDomains = includeDomains;
        return this;
    }
    public java.util.List<String> getIncludeDomains() {
        return this.includeDomains;
    }

    public FilterModel setExcludeDomains(java.util.List<String> excludeDomains) {
        this.excludeDomains = excludeDomains;
        return this;
    }
    public java.util.List<String> getExcludeDomains() {
        return this.excludeDomains;
    }

    public FilterModel setTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public String getTimeRange() {
        return this.timeRange;
    }

    public FilterModel setNeedUrl(Boolean needUrl) {
        this.needUrl = needUrl;
        return this;
    }
    public Boolean getNeedUrl() {
        return this.needUrl;
    }

    public FilterModel setIndustry(String industry) {
        this.industry = industry;
        return this;
    }
    public String getIndustry() {
        return this.industry;
    }

}
