// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 套餐内商品信息列表（仅包含当前 OU 下上架的商品）
    public class ComboItemDTO : TeaModel {
        // 主键ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 唯一编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>123xxx</para>
        /// </summary>
        [NameInMap("unique_code")]
        [Validation(Required=false)]
        public string UniqueCode { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx商品</para>
        /// </summary>
        [NameInMap("offer_name")]
        [Validation(Required=false)]
        public string OfferName { get; set; }

        // 商品主数据CODE
        /// <summary>
        /// <b>Example:</b>
        /// <para>sf12321xxx</para>
        /// </summary>
        [NameInMap("offer_inner_code")]
        [Validation(Required=false)]
        public string OfferInnerCode { get; set; }

        // 商品销售CODE（仅当指定 ou 且商品在该 OU 下上架时有值）
        /// <summary>
        /// <b>Example:</b>
        /// <para>sf123xxxx</para>
        /// </summary>
        [NameInMap("offer_sale_code")]
        [Validation(Required=false)]
        public string OfferSaleCode { get; set; }

        // 商品规格，JSON 结构
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("offer_attr")]
        [Validation(Required=false)]
        public string OfferAttr { get; set; }

        // 商品规格描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx描述</para>
        /// </summary>
        [NameInMap("offer_attr_desc")]
        [Validation(Required=false)]
        public string OfferAttrDesc { get; set; }

        // 付费方式（如 AFTER_PAY_BY_HOUR 后付费量价、PREPAY_BY_MONTH 预付费包年包月）
        /// <summary>
        /// <b>Example:</b>
        /// <para>AFTER_PAY_BY_HOUR</para>
        /// </summary>
        [NameInMap("charge_type")]
        [Validation(Required=false)]
        public string ChargeType { get; set; }

        // 商品数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("quantity")]
        [Validation(Required=false)]
        public long? Quantity { get; set; }

        // 订购周期类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>Y</para>
        /// </summary>
        [NameInMap("duration_type")]
        [Validation(Required=false)]
        public string DurationType { get; set; }

        // 订购周期值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("duration_value")]
        [Validation(Required=false)]
        public long? DurationValue { get; set; }

        // 是否必选（true 必选，false 可选）
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("required")]
        [Validation(Required=false)]
        public bool? Required { get; set; }

        // 商品在套餐中的排序
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("seq_order")]
        [Validation(Required=false)]
        public long? SeqOrder { get; set; }

        // 扩展配置
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("extends_config")]
        [Validation(Required=false)]
        public string ExtendsConfig { get; set; }

        // 商品规格 JSON 结构，CommodityInfo 的 JSON 序列化字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("offer_attr_option")]
        [Validation(Required=false)]
        public string OfferAttrOption { get; set; }

    }

}
