// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    // 七麦安卓ASO接入信息
    public class Data : TeaModel {
        // 订单安排日期
        [NameInMap("day")]
        [Validation(Required=true)]
        public string Day { get; set; }

        // 设备信息（oaid）
        [NameInMap("device")]
        [Validation(Required=true)]
        public string Device { get; set; }

        // 关键词
        [NameInMap("keyword")]
        [Validation(Required=true)]
        public string Keyword { get; set; }

        // 应用商店id
        // 2:OPPO
        // 3:联想
        // 4:华为
        // 5:小米
        // 6:魅族
        // 7:360
        // 8:应用宝
        // 9:VIVO
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 应用商店描述
        [NameInMap("store_desc")]
        [Validation(Required=true)]
        public string StoreDesc { get; set; }

        // 激活时间
        [NameInMap("active_time")]
        [Validation(Required=true)]
        public string ActiveTime { get; set; }

        // 任务截图1
        [NameInMap("img_url_1")]
        [Validation(Required=true)]
        public string ImgUrl1 { get; set; }

        // 任务截图2
        [NameInMap("img_url_2")]
        [Validation(Required=true)]
        public string ImgUrl2 { get; set; }

    }

}
