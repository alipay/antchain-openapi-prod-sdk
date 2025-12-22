// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class KeywordsPosition extends TeaModel {
    // 关键字
    /**
     * <strong>example:</strong>
     * <p>keyword1</p>
     */
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 页码
    /**
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // x坐标
    /**
     * <strong>example:</strong>
     * <p>315.43</p>
     */
    @NameInMap("pos_x")
    @Validation(required = true)
    public String posX;

    // y坐标
    /**
     * <strong>example:</strong>
     * <p>185.65723</p>
     */
    @NameInMap("pos_y")
    @Validation(required = true)
    public String posY;

    public static KeywordsPosition build(java.util.Map<String, ?> map) throws Exception {
        KeywordsPosition self = new KeywordsPosition();
        return TeaModel.build(map, self);
    }

    public KeywordsPosition setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public KeywordsPosition setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public KeywordsPosition setPosX(String posX) {
        this.posX = posX;
        return this;
    }
    public String getPosX() {
        return this.posX;
    }

    public KeywordsPosition setPosY(String posY) {
        this.posY = posY;
        return this;
    }
    public String getPosY() {
        return this.posY;
    }

}
