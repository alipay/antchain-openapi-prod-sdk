// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class BaiGoodsPointIdentificationResult extends TeaModel {
    // 鉴定点大项名称
    @NameInMap("point_name")
    @Validation(required = true)
    public String pointName;

    // 鉴定点子项名称
    @NameInMap("sub_point_name")
    @Validation(required = true)
    public String subPointName;

    // 单点鉴定结果
    // REAL：鉴定为真
    // FAKE：鉴定为假
    // UNABLE_IDENTIFY：无法鉴定
    @NameInMap("result")
    @Validation(required = true)
    public String result;

    // 鉴定分数
    @NameInMap("grade")
    public String grade;

    // 用户侧的鉴定点point_id，直接将用户传入的user_point_id返回
    @NameInMap("user_point_id")
    public String userPointId;

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

}
