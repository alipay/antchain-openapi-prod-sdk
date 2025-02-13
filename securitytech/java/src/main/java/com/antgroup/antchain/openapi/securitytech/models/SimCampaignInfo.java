// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SimCampaignInfo extends TeaModel {
    // 营销活动id
    @NameInMap("campaign_id")
    @Validation(required = true)
    public String campaignId;

    // 营销活动名
    @NameInMap("campaign_name")
    @Validation(required = true)
    public String campaignName;

    // 营销图片
    @NameInMap("image_url")
    @Validation(required = true)
    public String imageUrl;

    // 营销活动内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static SimCampaignInfo build(java.util.Map<String, ?> map) throws Exception {
        SimCampaignInfo self = new SimCampaignInfo();
        return TeaModel.build(map, self);
    }

    public SimCampaignInfo setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public String getCampaignId() {
        return this.campaignId;
    }

    public SimCampaignInfo setCampaignName(String campaignName) {
        this.campaignName = campaignName;
        return this;
    }
    public String getCampaignName() {
        return this.campaignName;
    }

    public SimCampaignInfo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SimCampaignInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
