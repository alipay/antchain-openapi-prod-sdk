// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品订购属性结构
    public class CommodityOrderAttribute : TeaModel {
        // 属性编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SYS_USAGE_AMOUNT</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 属性值
        /// <summary>
        /// <b>Example:</b>
        /// <para>abc</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
        /// <summary>
        /// <b>Example:</b>
        /// <para>MB</para>
        /// </summary>
        [NameInMap("value_unit")]
        [Validation(Required=true)]
        public string ValueUnit { get; set; }

    }

}
