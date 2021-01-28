// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class KeywordsPosition extends TeaModel {
    // 关键字
    @NameInMap("keyword")
    @Validation(required = true)
    public String keyword;

    // 页码
    @NameInMap("page_index")
    @Validation(required = true)
    public Long pageIndex;

    // x坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public Long posX;

    // y坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public Long posY;

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

    public KeywordsPosition setPosX(Long posX) {
        this.posX = posX;
        return this;
    }
    public Long getPosX() {
        return this.posX;
    }

    public KeywordsPosition setPosY(Long posY) {
        this.posY = posY;
        return this;
    }
    public Long getPosY() {
        return this.posY;
    }

}
