// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CaSystemCrossPageRequest extends TeaModel {
    // 签署开始页码
    @NameInMap("pos_page_start")
    public Long posPageStart;

    // 签署结束页码
    @NameInMap("pos_page_end")
    public Long posPageEnd;

    // 签署区位置横坐标
    @NameInMap("pos_x")
    @Validation(required = true)
    public Long posX;

    // 签署区位置纵坐标
    @NameInMap("pos_y")
    @Validation(required = true)
    public Long posY;

    // 用印次数
    @NameInMap("seal_times")
    public Long sealTimes;

    // 是否采取系统默认骑缝章用印规则
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("default_cross_page_rule")
    public Boolean defaultCrossPageRule;

    // 默认骑缝章页数
    @NameInMap("default_cross_page")
    public Long defaultCrossPage;

    public static CaSystemCrossPageRequest build(java.util.Map<String, ?> map) throws Exception {
        CaSystemCrossPageRequest self = new CaSystemCrossPageRequest();
        return TeaModel.build(map, self);
    }

    public CaSystemCrossPageRequest setPosPageStart(Long posPageStart) {
        this.posPageStart = posPageStart;
        return this;
    }
    public Long getPosPageStart() {
        return this.posPageStart;
    }

    public CaSystemCrossPageRequest setPosPageEnd(Long posPageEnd) {
        this.posPageEnd = posPageEnd;
        return this;
    }
    public Long getPosPageEnd() {
        return this.posPageEnd;
    }

    public CaSystemCrossPageRequest setPosX(Long posX) {
        this.posX = posX;
        return this;
    }
    public Long getPosX() {
        return this.posX;
    }

    public CaSystemCrossPageRequest setPosY(Long posY) {
        this.posY = posY;
        return this;
    }
    public Long getPosY() {
        return this.posY;
    }

    public CaSystemCrossPageRequest setSealTimes(Long sealTimes) {
        this.sealTimes = sealTimes;
        return this;
    }
    public Long getSealTimes() {
        return this.sealTimes;
    }

    public CaSystemCrossPageRequest setDefaultCrossPageRule(Boolean defaultCrossPageRule) {
        this.defaultCrossPageRule = defaultCrossPageRule;
        return this;
    }
    public Boolean getDefaultCrossPageRule() {
        return this.defaultCrossPageRule;
    }

    public CaSystemCrossPageRequest setDefaultCrossPage(Long defaultCrossPage) {
        this.defaultCrossPage = defaultCrossPage;
        return this;
    }
    public Long getDefaultCrossPage() {
        return this.defaultCrossPage;
    }

}
