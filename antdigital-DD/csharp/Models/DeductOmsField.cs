// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 抵扣的计量项
    public class DeductOmsField : TeaModel {
        // 抵扣的资源包商品
        /// <summary>
        /// <b>Example:</b>
        /// <para>testcode</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 计量项列表
        [NameInMap("oms_field")]
        [Validation(Required=false)]
        public List<string> OmsField { get; set; }

    }

}
