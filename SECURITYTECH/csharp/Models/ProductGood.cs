// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 商品明细
    public class ProductGood : TeaModel {
        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>猫罐头</para>
        /// </summary>
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品类别，枚举值
        /// <summary>
        /// <b>Example:</b>
        /// <para>CAN</para>
        /// </summary>
        [NameInMap("goods_category")]
        [Validation(Required=true)]
        public string GoodsCategory { get; set; }

        // 此商品总金额（元，两位小数）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("goods_amount")]
        [Validation(Required=true)]
        public string GoodsAmount { get; set; }

        // 此商消费总积分（两位小数）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("goods_points")]
        [Validation(Required=true)]
        public string GoodsPoints { get; set; }

        // 商品件数（整数）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("goods_count")]
        [Validation(Required=true)]
        public string GoodsCount { get; set; }

    }

}
