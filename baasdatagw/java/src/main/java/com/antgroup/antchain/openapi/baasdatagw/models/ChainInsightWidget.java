// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightWidget extends TeaModel {
    // 看版类型，内置看版类型为Default
    @NameInMap("widget_type")
    @Validation(required = true)
    public String widgetType;

    // 看版子类型；ChainIdWidget, ChainAccountWidget, ChainContractWidget, ChainTotalTransactionWidget, ChainActiveAddressWidget, ChainTxTimeLineWidget
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 看版时间范围，单位小时
    @NameInMap("time_range")
    @Validation(required = true)
    public Long timeRange;

    // 看板ID
    @NameInMap("id")
    public String id;

    // 看版名称，最大32字符
    @NameInMap("name")
    @Validation(maxLength = 32)
    public String name;

    // 看版描述，最大 255 字符
    @NameInMap("description")
    @Validation(maxLength = 255)
    public String description;

    // 看版创建时间，单位毫秒时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 看版修改时间，单位毫秒时间戳
    @NameInMap("modify_time")
    public Long modifyTime;

    // 看版对应的链ID，空表示联盟下所有的链
    @NameInMap("biz_id")
    public String bizId;

    // 链名称
    @NameInMap("biz_id_name")
    public String bizIdName;

    // 看版对应的链上账户地址，hex编码
    @NameInMap("hex_address")
    public String hexAddress;

    // 时间轴搜索的请求
    @NameInMap("query")
    public String query;

    public static ChainInsightWidget build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightWidget self = new ChainInsightWidget();
        return TeaModel.build(map, self);
    }

    public ChainInsightWidget setWidgetType(String widgetType) {
        this.widgetType = widgetType;
        return this;
    }
    public String getWidgetType() {
        return this.widgetType;
    }

    public ChainInsightWidget setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightWidget setTimeRange(Long timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public Long getTimeRange() {
        return this.timeRange;
    }

    public ChainInsightWidget setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainInsightWidget setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ChainInsightWidget setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ChainInsightWidget setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ChainInsightWidget setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public ChainInsightWidget setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightWidget setBizIdName(String bizIdName) {
        this.bizIdName = bizIdName;
        return this;
    }
    public String getBizIdName() {
        return this.bizIdName;
    }

    public ChainInsightWidget setHexAddress(String hexAddress) {
        this.hexAddress = hexAddress;
        return this;
    }
    public String getHexAddress() {
        return this.hexAddress;
    }

    public ChainInsightWidget setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
