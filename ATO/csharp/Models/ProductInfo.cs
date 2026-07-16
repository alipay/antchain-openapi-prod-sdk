// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商品信息
    public class ProductInfo : TeaModel {
        // 商家社会统一信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91428406M284UL87G</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>二手苹果14ProMax</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1725944255332_08831729157506415</para>
        /// </summary>
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>到期归还-可随时买断/256G</para>
        /// </summary>
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 商品版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("product_version")]
        [Validation(Required=false)]
        public string ProductVersion { get; set; }

        // 指导价(单位分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>4000</para>
        /// </summary>
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public long? ProductPrice { get; set; }

        // 一级类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>3C</para>
        /// </summary>
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 二级类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>3c_mobile</para>
        /// </summary>
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>苹果</para>
        /// </summary>
        [NameInMap("product_brand")]
        [Validation(Required=false)]
        public string ProductBrand { get; set; }

    }

}
