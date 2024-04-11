// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class YuqingMessageExtInfo extends TeaModel {
    // 媒体地域
    @NameInMap("media_area_country")
    public String mediaAreaCountry;

    // 媒体地域省份
    @NameInMap("media_area_province")
    public String mediaAreaProvince;

    // 媒体地域-市
    @NameInMap("media_res_city")
    public String mediaResCity;

    // 内容风险
    @NameInMap("general_model")
    public String generalModel;

    public static YuqingMessageExtInfo build(java.util.Map<String, ?> map) throws Exception {
        YuqingMessageExtInfo self = new YuqingMessageExtInfo();
        return TeaModel.build(map, self);
    }

    public YuqingMessageExtInfo setMediaAreaCountry(String mediaAreaCountry) {
        this.mediaAreaCountry = mediaAreaCountry;
        return this;
    }
    public String getMediaAreaCountry() {
        return this.mediaAreaCountry;
    }

    public YuqingMessageExtInfo setMediaAreaProvince(String mediaAreaProvince) {
        this.mediaAreaProvince = mediaAreaProvince;
        return this;
    }
    public String getMediaAreaProvince() {
        return this.mediaAreaProvince;
    }

    public YuqingMessageExtInfo setMediaResCity(String mediaResCity) {
        this.mediaResCity = mediaResCity;
        return this;
    }
    public String getMediaResCity() {
        return this.mediaResCity;
    }

    public YuqingMessageExtInfo setGeneralModel(String generalModel) {
        this.generalModel = generalModel;
        return this;
    }
    public String getGeneralModel() {
        return this.generalModel;
    }

}
