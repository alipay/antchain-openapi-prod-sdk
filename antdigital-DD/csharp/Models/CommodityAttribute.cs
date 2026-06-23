// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品属性结构
    public class CommodityAttribute : TeaModel {
        // 属性编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>CAPACITY</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 属性名
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源包容量</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 默认值
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("default_value")]
        [Validation(Required=true)]
        public string DefaultValue { get; set; }

        // 属性值类型，离散值：DISCRETE，数值：NUMBER
        /// <summary>
        /// <b>Example:</b>
        /// <para>DISCRETE</para>
        /// </summary>
        [NameInMap("value_type")]
        [Validation(Required=true)]
        public string ValueType { get; set; }

        // 当是离散值类型时，为多个离散值逗号分隔
        // 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
        /// <summary>
        /// <b>Example:</b>
        /// <para>100,200</para>
        /// </summary>
        [NameInMap("value_range")]
        [Validation(Required=true)]
        public string ValueRange { get; set; }

        // 展示类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>RadioGroup</para>
        /// </summary>
        [NameInMap("display_type")]
        [Validation(Required=true)]
        public string DisplayType { get; set; }

        // 提示文案
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是一个属性</para>
        /// </summary>
        [NameInMap("tips")]
        [Validation(Required=true)]
        public string Tips { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>次、分钟</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
