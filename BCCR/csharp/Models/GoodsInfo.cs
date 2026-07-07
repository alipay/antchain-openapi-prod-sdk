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
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111</para>
        /// </summary>
        [NameInMap("goods_id")]
        [Validation(Required=false)]
        public string GoodsId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试商品</para>
        /// </summary>
        [NameInMap("goods_name")]
        [Validation(Required=false)]
        public string GoodsName { get; set; }

        // 商品状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>UP</para>
        /// </summary>
        [NameInMap("goods_status")]
        [Validation(Required=false)]
        public string GoodsStatus { get; set; }

        // 商品分类
        /// <summary>
        /// <b>Example:</b>
        /// <para>分类</para>
        /// </summary>
        [NameInMap("classification")]
        [Validation(Required=false)]
        public string Classification { get; set; }

        // 售卖数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("total_sold_num")]
        [Validation(Required=false)]
        public long? TotalSoldNum { get; set; }

        // 售价（分）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("standard_price_in_cent")]
        [Validation(Required=false)]
        public long? StandardPriceInCent { get; set; }

        // 商品标题
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试标题</para>
        /// </summary>
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
