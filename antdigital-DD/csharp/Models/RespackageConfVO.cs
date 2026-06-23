// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包配置信息
    public class RespackageConfVO : TeaModel {
        // 模板code
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_deadline</para>
        /// </summary>
        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        // 模板展示名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源包模板</para>
        /// </summary>
        [NameInMap("template_name")]
        [Validation(Required=false)]
        public string TemplateName { get; set; }

        // 资源包模板维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>Single</para>
        /// </summary>
        [NameInMap("template_dimension")]
        [Validation(Required=false)]
        public string TemplateDimension { get; set; }

        // 产品名称 -> 商品模型2.0中的渠道产品Code
        /// <summary>
        /// <b>Example:</b>
        /// <para>testcode</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 商品名称 -> 商品模型2.0中的offerInnerCode
        /// <summary>
        /// <b>Example:</b>
        /// <para>testcode</para>
        /// </summary>
        [NameInMap("offer_code")]
        [Validation(Required=false)]
        public string OfferCode { get; set; }

        // 抵扣的量价商品 -> 商品模型2.0中的渠道产品Code
        [NameInMap("deduct_product_code")]
        [Validation(Required=false)]
        public List<string> DeductProductCode { get; set; }

        // 抵扣的量价商品与计量项的关系
        [NameInMap("deduct_oms_field")]
        [Validation(Required=false)]
        public List<DeductOmsField> DeductOmsField { get; set; }

        // 资源包抵扣类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PeriodMonthly</para>
        /// </summary>
        [NameInMap("deduct_type")]
        [Validation(Required=false)]
        public string DeductType { get; set; }

        // 产时的规格约束
        [NameInMap("specification")]
        [Validation(Required=false)]
        public List<StringMap> Specification { get; set; }

        // 是否计算金额
        [NameInMap("calc_amount")]
        [Validation(Required=false)]
        public bool? CalcAmount { get; set; }

        // 是否使用子包
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("sub_pack")]
        [Validation(Required=false)]
        public bool? SubPack { get; set; }

        // 子包切分规则 None(不切割)、NaturalMonth(按自然月切割) 、SubscribeMonth(按订单月切割) *
        /// <summary>
        /// <b>Example:</b>
        /// <para>None</para>
        /// </summary>
        [NameInMap("sub_pack_split_type")]
        [Validation(Required=false)]
        public string SubPackSplitType { get; set; }

        // 关联子包模版
        /// <summary>
        /// <b>Example:</b>
        /// <para>template</para>
        /// </summary>
        [NameInMap("rel_template")]
        [Validation(Required=false)]
        public string RelTemplate { get; set; }

    }

}
