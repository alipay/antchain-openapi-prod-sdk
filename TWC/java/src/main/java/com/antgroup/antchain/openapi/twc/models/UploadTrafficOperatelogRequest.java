// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadTrafficOperatelogRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通过trace_id生成接口生成的trace_id
    @NameInMap("trace_id")
    @Validation(required = true)
    public String traceId;

    // 事件时间
    @NameInMap("event_time")
    @Validation(required = true)
    public String eventTime;

    // 当前页面类型标记 
    @NameInMap("page_flag")
    @Validation(required = true)
    public String pageFlag;

    // 行为标记
    @NameInMap("action_flag")
    @Validation(required = true)
    public String actionFlag;

    // 当前页面地址
    @NameInMap("cur_url")
    @Validation(required = true)
    public String curUrl;

    // 事件对应位置编码
    @NameInMap("position_no")
    @Validation(required = true)
    public String positionNo;

    // 商品标识
    @NameInMap("item_id")
    public String itemId;

    // 店铺标识
    @NameInMap("shop_id")
    public String shopId;

    // 上一跳页面地址
    @NameInMap("pre_url")
    public String preUrl;

    // 渠道说明
    @NameInMap("source")
    public String source;

    // 当前广告位级别
    @NameInMap("ad_space_level")
    public String adSpaceLevel;

    // 人群组标签ID
    @NameInMap("group_id")
    public String groupId;

    public static UploadTrafficOperatelogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadTrafficOperatelogRequest self = new UploadTrafficOperatelogRequest();
        return TeaModel.build(map, self);
    }

    public UploadTrafficOperatelogRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadTrafficOperatelogRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadTrafficOperatelogRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public UploadTrafficOperatelogRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public UploadTrafficOperatelogRequest setPageFlag(String pageFlag) {
        this.pageFlag = pageFlag;
        return this;
    }
    public String getPageFlag() {
        return this.pageFlag;
    }

    public UploadTrafficOperatelogRequest setActionFlag(String actionFlag) {
        this.actionFlag = actionFlag;
        return this;
    }
    public String getActionFlag() {
        return this.actionFlag;
    }

    public UploadTrafficOperatelogRequest setCurUrl(String curUrl) {
        this.curUrl = curUrl;
        return this;
    }
    public String getCurUrl() {
        return this.curUrl;
    }

    public UploadTrafficOperatelogRequest setPositionNo(String positionNo) {
        this.positionNo = positionNo;
        return this;
    }
    public String getPositionNo() {
        return this.positionNo;
    }

    public UploadTrafficOperatelogRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public UploadTrafficOperatelogRequest setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public UploadTrafficOperatelogRequest setPreUrl(String preUrl) {
        this.preUrl = preUrl;
        return this;
    }
    public String getPreUrl() {
        return this.preUrl;
    }

    public UploadTrafficOperatelogRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public UploadTrafficOperatelogRequest setAdSpaceLevel(String adSpaceLevel) {
        this.adSpaceLevel = adSpaceLevel;
        return this;
    }
    public String getAdSpaceLevel() {
        return this.adSpaceLevel;
    }

    public UploadTrafficOperatelogRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
