// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 用户选择的规格配置列表
    public class SelectedConfigItem : TeaModel {
        // 商品主数据内码（L5内码）
        /// <summary>
        /// <b>Example:</b>
        /// <para>BSTAFM01234567</para>
        /// </summary>
        [NameInMap("offer_inner_code")]
        [Validation(Required=true)]
        public string OfferInnerCode { get; set; }

        // 商品销售码（带 OU 属性）
        /// <summary>
        /// <b>Example:</b>
        /// <para>BSTAFSZL70139xxxx</para>
        /// </summary>
        [NameInMap("offer_sale_code")]
        [Validation(Required=true)]
        public string OfferSaleCode { get; set; }

        // 购买时长；预付费根据实际时长填写，后付费填 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // 购买时长单位； month / year
        /// <summary>
        /// <b>Example:</b>
        /// <para>month</para>
        /// </summary>
        [NameInMap("pricing_cycle")]
        [Validation(Required=true)]
        public string PricingCycle { get; set; }

        // 购买实例的数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=true)]
        public long? Quantity { get; set; }

        // 该子商品使用的优惠券ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("coupon_id")]
        [Validation(Required=false)]
        public string CouponId { get; set; }

        // 要购买的产品规格配件值,JSON格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("components_map")]
        [Validation(Required=false)]
        public string ComponentsMap { get; set; }

    }

}
