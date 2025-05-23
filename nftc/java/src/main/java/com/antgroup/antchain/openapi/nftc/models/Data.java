// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class Data extends TeaModel {
    // 订单安排日期
    @NameInMap("day")
    @Validation(required = true)
    public String day;

    // 设备信息（oaid）
    @NameInMap("device")
    @Validation(required = true)
    public String device;

    // 关键词
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 应用商店id
    // 2:OPPO
    // 3:联想
    // 4:华为
    // 5:小米
    // 6:魅族
    // 7:360
    // 8:应用宝
    // 9:VIVO
    @NameInMap("store_id")
    @Validation(required = true)
    public String storeId;

    // 应用商店描述
    @NameInMap("store_desc")
    @Validation(required = true)
    public String storeDesc;

    // 激活时间
    @NameInMap("active_time")
    @Validation(required = true)
    public String activeTime;

    // 任务截图1
    @NameInMap("img_url_1")
    @Validation(required = true)
    public String imgUrl1;

    // 任务截图2
    @NameInMap("img_url_2")
    @Validation(required = true)
    public String imgUrl2;

    public static Data build(java.util.Map<String, ?> map) throws Exception {
        Data self = new Data();
        return TeaModel.build(map, self);
    }

    public Data setDay(String day) {
        this.day = day;
        return this;
    }
    public String getDay() {
        return this.day;
    }

    public Data setDevice(String device) {
        this.device = device;
        return this;
    }
    public String getDevice() {
        return this.device;
    }

    public Data setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public Data setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public Data setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
        return this;
    }
    public String getStoreDesc() {
        return this.storeDesc;
    }

    public Data setActiveTime(String activeTime) {
        this.activeTime = activeTime;
        return this;
    }
    public String getActiveTime() {
        return this.activeTime;
    }

    public Data setImgUrl1(String imgUrl1) {
        this.imgUrl1 = imgUrl1;
        return this;
    }
    public String getImgUrl1() {
        return this.imgUrl1;
    }

    public Data setImgUrl2(String imgUrl2) {
        this.imgUrl2 = imgUrl2;
        return this;
    }
    public String getImgUrl2() {
        return this.imgUrl2;
    }

}
