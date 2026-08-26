// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 商品规格
    public class CommodityAttr : TeaModel {
        // 规格属性编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>version</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 规格属性值
        /// <summary>
        /// <b>Example:</b>
        /// <para>mytc_mini</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 规格属性单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>个</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

    }

}
