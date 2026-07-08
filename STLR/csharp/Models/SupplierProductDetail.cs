// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 供应商产品详情
    public class SupplierProductDetail : TeaModel {
        // 供应商名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("supplier_name")]
        [Validation(Required=false)]
        public string SupplierName { get; set; }

        // 供应商产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("supplier_product_name")]
        [Validation(Required=false)]
        public string SupplierProductName { get; set; }

        // 填报单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("dosage_unit")]
        [Validation(Required=false)]
        public string DosageUnit { get; set; }

    }

}
