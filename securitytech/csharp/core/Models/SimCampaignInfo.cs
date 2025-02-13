// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 两轮车一体机营销活动信息
    public class SimCampaignInfo : TeaModel {
        // 营销活动id
        [NameInMap("campaign_id")]
        [Validation(Required=true)]
        public string CampaignId { get; set; }

        // 营销活动名
        [NameInMap("campaign_name")]
        [Validation(Required=true)]
        public string CampaignName { get; set; }

        // 营销图片
        [NameInMap("image_url")]
        [Validation(Required=true)]
        public string ImageUrl { get; set; }

        // 营销活动内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
