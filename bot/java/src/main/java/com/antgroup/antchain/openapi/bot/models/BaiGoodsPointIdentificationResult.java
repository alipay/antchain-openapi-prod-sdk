// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsPointIdentificationResult extends TeaModel {
    // 鉴定点大项名称
    /**
     * <strong>example:</strong>
     * <p>内包装</p>
     */
    @NameInMap("point_name")
    @Validation(required = true)
    public String pointName;

    // 鉴定点子项名称
    /**
     * <strong>example:</strong>
     * <p>顶部</p>
     */
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 单点鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    /**
     * <strong>example:</strong>
     * <p>REAL</p>
     */
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 鉴定分数
    /**
     * <strong>example:</strong>
     * <p>0.92</p>
     */
    @NameInMap("grade")
    public String grade;

    // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("user_point_id")
    public String userPointId;

    // 鉴定评价
    /**
     * <strong>example:</strong>
     * <p>完全同一，趋于同一，不同一</p>
     */
    @NameInMap("appraise_message")
    public String appraiseMessage;

    // 鉴定点图片资源定位符
    @NameInMap("resource_location")
    public BaiResourceLocation resourceLocation;

    public static BaiGoodsPointIdentificationResult build(java.util.Map<String, ?> map) throws Exception {
        BaiGoodsPointIdentificationResult self = new BaiGoodsPointIdentificationResult();
        return TeaModel.build(map, self);
    }

    public BaiGoodsPointIdentificationResult setPointName(String pointName) {
        this.pointName = pointName;
        return this;
    }
    public String getPointName() {
        return this.pointName;
    }

    public BaiGoodsPointIdentificationResult setSubPointName(String subPointName) {
        this.subPointName = subPointName;
        return this;
    }
    public String getSubPointName() {
        return this.subPointName;
    }

    public BaiGoodsPointIdentificationResult setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public BaiGoodsPointIdentificationResult setGrade(String grade) {
        this.grade = grade;
        return this;
    }
    public String getGrade() {
        return this.grade;
    }

    public BaiGoodsPointIdentificationResult setUserPointId(String userPointId) {
        this.userPointId = userPointId;
        return this;
    }
    public String getUserPointId() {
        return this.userPointId;
    }

    public BaiGoodsPointIdentificationResult setAppraiseMessage(String appraiseMessage) {
        this.appraiseMessage = appraiseMessage;
        return this;
    }
    public String getAppraiseMessage() {
        return this.appraiseMessage;
    }

    public BaiGoodsPointIdentificationResult setResourceLocation(BaiResourceLocation resourceLocation) {
        this.resourceLocation = resourceLocation;
        return this;
    }
    public BaiResourceLocation getResourceLocation() {
        return this.resourceLocation;
    }

}
