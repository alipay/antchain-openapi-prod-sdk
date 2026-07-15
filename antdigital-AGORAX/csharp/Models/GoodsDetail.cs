// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 商品信息
    public class GoodsDetail : TeaModel {
        // 商品编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>apple-01</para>
        /// </summary>
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>apple</para>
        /// </summary>
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public string Quantity { get; set; }

        // 商品单价
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 商品类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>34543238</para>
        /// </summary>
        [NameInMap("goods_category")]
        [Validation(Required=false)]
        public string GoodsCategory { get; set; }

        // 商品类目树
        /// <summary>
        /// <b>Example:</b>
        /// <para>124868003|126232002|126252004</para>
        /// </summary>
        [NameInMap("categories_tree")]
        [Validation(Required=false)]
        public string CategoriesTree { get; set; }

        // 商品的展示地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.alipay.com/xxx.jpg">http://www.alipay.com/xxx.jpg</a></para>
        /// </summary>
        [NameInMap("show_url")]
        [Validation(Required=false)]
        public string ShowUrl { get; set; }

        // 商品69条码
        /// <summary>
        /// <b>Example:</b>
        /// <para>6972829161111</para>
        /// </summary>
        [NameInMap("goods_ean_id")]
        [Validation(Required=false)]
        public string GoodsEanId { get; set; }

        // 商家侧小程序商品 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>outItem_01</para>
        /// </summary>
        [NameInMap("out_item_id")]
        [Validation(Required=false)]
        public string OutItemId { get; set; }

        // 商家侧小程序商品ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>outSku_01</para>
        /// </summary>
        [NameInMap("out_sku_id")]
        [Validation(Required=false)]
        public string OutSkuId { get; set; }

    }

}
