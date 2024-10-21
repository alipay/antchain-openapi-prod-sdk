// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DataSummaryTotal extends TeaModel {
    // 原始币种资产价值列表
    @NameInMap("total_value_list")
    @Validation(required = true)
    public java.util.List<MultiCurrencyMoney> totalValueList;

    // 总项目数
    @NameInMap("total_projects")
    @Validation(required = true)
    public Long totalProjects;

    // 总用户数
    @NameInMap("total_holders")
    @Validation(required = true)
    public Long totalHolders;

    // 最后更新时间戳
    @NameInMap("last_updated_time")
    @Validation(required = true)
    public Long lastUpdatedTime;

    public static DataSummaryTotal build(java.util.Map<String, ?> map) throws Exception {
        DataSummaryTotal self = new DataSummaryTotal();
        return TeaModel.build(map, self);
    }

    public DataSummaryTotal setTotalValueList(java.util.List<MultiCurrencyMoney> totalValueList) {
        this.totalValueList = totalValueList;
        return this;
    }
    public java.util.List<MultiCurrencyMoney> getTotalValueList() {
        return this.totalValueList;
    }

    public DataSummaryTotal setTotalProjects(Long totalProjects) {
        this.totalProjects = totalProjects;
        return this;
    }
    public Long getTotalProjects() {
        return this.totalProjects;
    }

    public DataSummaryTotal setTotalHolders(Long totalHolders) {
        this.totalHolders = totalHolders;
        return this;
    }
    public Long getTotalHolders() {
        return this.totalHolders;
    }

    public DataSummaryTotal setLastUpdatedTime(Long lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }
    public Long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

}
