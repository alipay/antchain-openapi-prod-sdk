// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 商品信息
    public class GoodsInfo : TeaModel {
        // 商品id
        [NameInMap("goods_id")]
        [Validation(Required=false)]
        public string GoodsId { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=false)]
        public string GoodsName { get; set; }

        // 商品状态
        [NameInMap("goods_status")]
        [Validation(Required=false)]
        public string GoodsStatus { get; set; }

        // 商品分类
        [NameInMap("classification")]
        [Validation(Required=false)]
        public string Classification { get; set; }

        // 售卖数量
        [NameInMap("total_sold_num")]
        [Validation(Required=false)]
        public long? TotalSoldNum { get; set; }

        // 售价（分）
        [NameInMap("standard_price_in_cent")]
        [Validation(Required=false)]
        public long? StandardPriceInCent { get; set; }

        // 商品标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 授权期限起始时间
        [NameInMap("auth_start_time")]
        [Validation(Required=false)]
        public long? AuthStartTime { get; set; }

        // 授权期限结束时间
        [NameInMap("auth_end_time")]
        [Validation(Required=false)]
        public long? AuthEndTime { get; set; }

        // 发布时间
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

    }

}
