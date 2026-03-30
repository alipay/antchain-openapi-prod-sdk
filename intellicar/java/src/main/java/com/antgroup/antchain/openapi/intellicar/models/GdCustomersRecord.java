// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.intellicar.models;

import com.aliyun.tea.*;

public class GdCustomersRecord extends TeaModel {
    // 城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>021</p>
     */
    @NameInMap("citycode")
    @Validation(required = true)
    public String citycode;

    // 品牌id
    /**
     * <strong>example:</strong>
     * <p>104</p>
     */
    @NameInMap("brand_id")
    @Validation(required = true)
    public String brandId;

    // 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
    /**
     * <strong>example:</strong>
     * <p>26nhJ8duzh</p>
     */
    @NameInMap("shop_id")
    @Validation(required = true)
    public String shopId;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
    /**
     * <strong>example:</strong>
     * <p>20230102</p>
     */
    @NameInMap("time")
    @Validation(required = true)
    public String time;

    // 重叠指数集合
    @NameInMap("overlap_list")
    @Validation(required = true)
    public java.util.List<Overlap> overlapList;

    // 重叠指数集合条数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("overlap_list_num")
    @Validation(required = true)
    public String overlapListNum;

    // 流入指数集合
    @NameInMap("src_list")
    @Validation(required = true)
    public java.util.List<GdSrc> srcList;

    // 流入指数条数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("src_list_num")
    @Validation(required = true)
    public String srcListNum;

    // 流出指数集合
    @NameInMap("dest_list")
    @Validation(required = true)
    public java.util.List<GdDest> destList;

    // 流出指数条数
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("dest_list_num")
    @Validation(required = true)
    public String destListNum;

    public static GdCustomersRecord build(java.util.Map<String, ?> map) throws Exception {
        GdCustomersRecord self = new GdCustomersRecord();
        return TeaModel.build(map, self);
    }

    public GdCustomersRecord setCitycode(String citycode) {
        this.citycode = citycode;
        return this;
    }
    public String getCitycode() {
        return this.citycode;
    }

    public GdCustomersRecord setBrandId(String brandId) {
        this.brandId = brandId;
        return this;
    }
    public String getBrandId() {
        return this.brandId;
    }

    public GdCustomersRecord setShopId(String shopId) {
        this.shopId = shopId;
        return this;
    }
    public String getShopId() {
        return this.shopId;
    }

    public GdCustomersRecord setTime(String time) {
        this.time = time;
        return this;
    }
    public String getTime() {
        return this.time;
    }

    public GdCustomersRecord setOverlapList(java.util.List<Overlap> overlapList) {
        this.overlapList = overlapList;
        return this;
    }
    public java.util.List<Overlap> getOverlapList() {
        return this.overlapList;
    }

    public GdCustomersRecord setOverlapListNum(String overlapListNum) {
        this.overlapListNum = overlapListNum;
        return this;
    }
    public String getOverlapListNum() {
        return this.overlapListNum;
    }

    public GdCustomersRecord setSrcList(java.util.List<GdSrc> srcList) {
        this.srcList = srcList;
        return this;
    }
    public java.util.List<GdSrc> getSrcList() {
        return this.srcList;
    }

    public GdCustomersRecord setSrcListNum(String srcListNum) {
        this.srcListNum = srcListNum;
        return this;
    }
    public String getSrcListNum() {
        return this.srcListNum;
    }

    public GdCustomersRecord setDestList(java.util.List<GdDest> destList) {
        this.destList = destList;
        return this;
    }
    public java.util.List<GdDest> getDestList() {
        return this.destList;
    }

    public GdCustomersRecord setDestListNum(String destListNum) {
        this.destListNum = destListNum;
        return this;
    }
    public String getDestListNum() {
        return this.destListNum;
    }

}
