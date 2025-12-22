// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaSystemMainBodyRequest extends TeaModel {
    // 正文章模式坐标ABSOLUTE_POSITION, 关键字KEY_WORD
    /**
     * <strong>example:</strong>
     * <p>ABSOLUTE_POSITION, KEY_WORD</p>
     */
    @NameInMap("main_body_model")
    @Validation(required = true)
    public String mainBodyModel;

    // 签署页码
    @NameInMap("pos_page")
    @Validation(required = true)
    public Long posPage;

    // 签署区位置横坐标;mainBodyModel为ABSOLUTE_POSITION时必填
    @NameInMap("pos_x")
    public Long posX;

    // 签署区位置纵坐标;mainBodyModel为ABSOLUTE_POSITION时必填
    @NameInMap("pos_y")
    public Long posY;

    // 关键字：mainBodyModel为KEY_WORD时必填
    /**
     * <strong>example:</strong>
     * <p>关键字</p>
     */
    @NameInMap("key_word")
    public String keyWord;

    // mainBodyModel为KEY_WORD时必填
    /**
     * <strong>example:</strong>
     * <p>关键字类型</p>
     */
    @NameInMap("key_word_type")
    public Long keyWordType;

    // 第几个关键字;mainBodyModel为KEY_WORD时必填
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("kw_index")
    public Long kwIndex;

    // x偏移量
    @NameInMap("kw_shift_x")
    public Long kwShiftX;

    // y偏移量
    @NameInMap("kw_shift_y")
    public Long kwShiftY;

    public static CaSystemMainBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemMainBodyRequest self = new CaSystemMainBodyRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemMainBodyRequest setMainBodyModel(String mainBodyModel) {
        this.mainBodyModel = mainBodyModel;
        return this;
    }
    public String getMainBodyModel() {
        return this.mainBodyModel;
    }

    public CaSystemMainBodyRequest setPosPage(Long posPage) {
        this.posPage = posPage;
        return this;
    }
    public Long getPosPage() {
        return this.posPage;
    }

    public CaSystemMainBodyRequest setPosX(Long posX) {
        this.posX = posX;
        return this;
    }
    public Long getPosX() {
        return this.posX;
    }

    public CaSystemMainBodyRequest setPosY(Long posY) {
        this.posY = posY;
        return this;
    }
    public Long getPosY() {
        return this.posY;
    }

    public CaSystemMainBodyRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public CaSystemMainBodyRequest setKeyWordType(Long keyWordType) {
        this.keyWordType = keyWordType;
        return this;
    }
    public Long getKeyWordType() {
        return this.keyWordType;
    }

    public CaSystemMainBodyRequest setKwIndex(Long kwIndex) {
        this.kwIndex = kwIndex;
        return this;
    }
    public Long getKwIndex() {
        return this.kwIndex;
    }

    public CaSystemMainBodyRequest setKwShiftX(Long kwShiftX) {
        this.kwShiftX = kwShiftX;
        return this;
    }
    public Long getKwShiftX() {
        return this.kwShiftX;
    }

    public CaSystemMainBodyRequest setKwShiftY(Long kwShiftY) {
        this.kwShiftY = kwShiftY;
        return this;
    }
    public Long getKwShiftY() {
        return this.kwShiftY;
    }

}
