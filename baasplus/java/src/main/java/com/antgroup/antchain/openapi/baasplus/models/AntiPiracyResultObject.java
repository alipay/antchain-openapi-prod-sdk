// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class AntiPiracyResultObject extends TeaModel {
    // 侵权主体
    @NameInMap("infr_host")
    public String infrHost;

    // 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
    @NameInMap("infr_time")
    public Long infrTime;

    // 侵权标题
    @NameInMap("infr_title")
    public String infrTitle;

    // 侵权网址
    @NameInMap("infr_url")
    public String infrUrl;

    // 默认值：VIDEO
    @NameInMap("production_type")
    public String productionType;

    // 相似度
    @NameInMap("similarity")
    public String similarity;

    public static AntiPiracyResultObject build(java.util.Map<String, ?> map) throws Exception {
        AntiPiracyResultObject self = new AntiPiracyResultObject();
        return TeaModel.build(map, self);
    }

    public AntiPiracyResultObject setInfrHost(String infrHost) {
        this.infrHost = infrHost;
        return this;
    }
    public String getInfrHost() {
        return this.infrHost;
    }

    public AntiPiracyResultObject setInfrTime(Long infrTime) {
        this.infrTime = infrTime;
        return this;
    }
    public Long getInfrTime() {
        return this.infrTime;
    }

    public AntiPiracyResultObject setInfrTitle(String infrTitle) {
        this.infrTitle = infrTitle;
        return this;
    }
    public String getInfrTitle() {
        return this.infrTitle;
    }

    public AntiPiracyResultObject setInfrUrl(String infrUrl) {
        this.infrUrl = infrUrl;
        return this;
    }
    public String getInfrUrl() {
        return this.infrUrl;
    }

    public AntiPiracyResultObject setProductionType(String productionType) {
        this.productionType = productionType;
        return this;
    }
    public String getProductionType() {
        return this.productionType;
    }

    public AntiPiracyResultObject setSimilarity(String similarity) {
        this.similarity = similarity;
        return this;
    }
    public String getSimilarity() {
        return this.similarity;
    }

}
