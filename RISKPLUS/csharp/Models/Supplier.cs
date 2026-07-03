// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 供应商
    public class Supplier : TeaModel {
        // 供应商id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111</para>
        /// </summary>
        [NameInMap("supplier_id")]
        [Validation(Required=true)]
        public string SupplierId { get; set; }

        // 供应商名字
        /// <summary>
        /// <b>Example:</b>
        /// <para>ANTCLOUD</para>
        /// </summary>
        [NameInMap("supplier_name")]
        [Validation(Required=true)]
        public string SupplierName { get; set; }

    }

}
