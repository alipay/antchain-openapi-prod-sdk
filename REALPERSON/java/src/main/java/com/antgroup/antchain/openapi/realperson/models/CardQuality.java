// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class CardQuality extends TeaModel {
    // 1-清晰
    // 0-不清晰
    // 
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_clear")
    public String isClear;

    // 清晰度取值0-1，值越大表示图像质量越好，默认阈值0.5
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_clear_propobility")
    public String isClearPropobility;

    // 1-边框/四角完整
    // 0-边框/四角不完整
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_complete")
    public String isComplete;

    // 取值0-1，值越大表示图像质量越好，默认阈值0.5
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_complete_propobility")
    public String isCompletePropobility;

    // 1-头像、关键字段无遮挡/马赛克
    // 0-头像、关键字段有遮挡/马赛克
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_no_cover")
    public String isNoCover;

    // 有无遮挡propobility-取值0-1，值越大表示图像质量越好，默认阈值0.3
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("is_no_cover_propobility")
    public String isNoCoverPropobility;

    public static CardQuality build(java.util.Map<String, ?> map) throws Exception {
        CardQuality self = new CardQuality();
        return TeaModel.build(map, self);
    }

    public CardQuality setIsClear(String isClear) {
        this.isClear = isClear;
        return this;
    }
    public String getIsClear() {
        return this.isClear;
    }

    public CardQuality setIsClearPropobility(String isClearPropobility) {
        this.isClearPropobility = isClearPropobility;
        return this;
    }
    public String getIsClearPropobility() {
        return this.isClearPropobility;
    }

    public CardQuality setIsComplete(String isComplete) {
        this.isComplete = isComplete;
        return this;
    }
    public String getIsComplete() {
        return this.isComplete;
    }

    public CardQuality setIsCompletePropobility(String isCompletePropobility) {
        this.isCompletePropobility = isCompletePropobility;
        return this;
    }
    public String getIsCompletePropobility() {
        return this.isCompletePropobility;
    }

    public CardQuality setIsNoCover(String isNoCover) {
        this.isNoCover = isNoCover;
        return this;
    }
    public String getIsNoCover() {
        return this.isNoCover;
    }

    public CardQuality setIsNoCoverPropobility(String isNoCoverPropobility) {
        this.isNoCoverPropobility = isNoCoverPropobility;
        return this;
    }
    public String getIsNoCoverPropobility() {
        return this.isNoCoverPropobility;
    }

}
