// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class CountEcarActivedataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 盘查排放项编码
    @NameInMap("inventory_item_no")
    @Validation(required = true)
    public String inventoryItemNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
    @NameInMap("occurrence_start_time")
    @Validation(required = true)
    public String occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
    @NameInMap("occurrence_end_time")
    @Validation(required = true)
    public String occurrenceEndTime;

    // 活动数据附加要素信息，将统计满足相关要素值的活动数据
    @NameInMap("emission_source_element_list")
    public java.util.List<AnyKeywordItem> emissionSourceElementList;

    // 活动数据扩展信息，将统计满足相关要素值的活动数据
    @NameInMap("extension_value_list")
    public java.util.List<AnyKeywordItem> extensionValueList;

    // 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
    // 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
    // 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
    @NameInMap("extra_statistic_item_list")
    public java.util.List<AnyKeywordItem> extraStatisticItemList;

    public static CountEcarActivedataRequest build(java.util.Map<String, ?> map) throws Exception {
        CountEcarActivedataRequest self = new CountEcarActivedataRequest();
        return TeaModel.build(map, self);
    }

    public CountEcarActivedataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CountEcarActivedataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CountEcarActivedataRequest setInventoryItemNo(String inventoryItemNo) {
        this.inventoryItemNo = inventoryItemNo;
        return this;
    }
    public String getInventoryItemNo() {
        return this.inventoryItemNo;
    }

    public CountEcarActivedataRequest setOccurrenceStartTime(String occurrenceStartTime) {
        this.occurrenceStartTime = occurrenceStartTime;
        return this;
    }
    public String getOccurrenceStartTime() {
        return this.occurrenceStartTime;
    }

    public CountEcarActivedataRequest setOccurrenceEndTime(String occurrenceEndTime) {
        this.occurrenceEndTime = occurrenceEndTime;
        return this;
    }
    public String getOccurrenceEndTime() {
        return this.occurrenceEndTime;
    }

    public CountEcarActivedataRequest setEmissionSourceElementList(java.util.List<AnyKeywordItem> emissionSourceElementList) {
        this.emissionSourceElementList = emissionSourceElementList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getEmissionSourceElementList() {
        return this.emissionSourceElementList;
    }

    public CountEcarActivedataRequest setExtensionValueList(java.util.List<AnyKeywordItem> extensionValueList) {
        this.extensionValueList = extensionValueList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getExtensionValueList() {
        return this.extensionValueList;
    }

    public CountEcarActivedataRequest setExtraStatisticItemList(java.util.List<AnyKeywordItem> extraStatisticItemList) {
        this.extraStatisticItemList = extraStatisticItemList;
        return this;
    }
    public java.util.List<AnyKeywordItem> getExtraStatisticItemList() {
        return this.extraStatisticItemList;
    }

}
