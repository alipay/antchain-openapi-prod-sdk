// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码配置资源位信息
    public class IPCodeAdvertisingInfo : TeaModel {
        // 资源位头图
        [NameInMap("ad_image")]
        [Validation(Required=false)]
        public string AdImage { get; set; }

        // 资源位头图可直接访问的临时链接
        [NameInMap("ad_image_tmp")]
        [Validation(Required=false)]
        public string AdImageTmp { get; set; }

        // 资源位链接
        [NameInMap("ad_url")]
        [Validation(Required=false)]
        public string AdUrl { get; set; }

        // 资源商品名称
        [NameInMap("ad_name")]
        [Validation(Required=false)]
        public string AdName { get; set; }

        // 广告位类型，为空时代表是商品广告位，Resource时代表是资源位
        [NameInMap("ad_type")]
        [Validation(Required=false)]
        public string AdType { get; set; }

        // 展示有效期开始时间
        [NameInMap("ad_valid_begin_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AdValidBeginTime { get; set; }

        // 展示有效期结束时间
        [NameInMap("ad_valid_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string AdValidEndTime { get; set; }

    }

}
