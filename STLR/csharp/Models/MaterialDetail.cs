// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 物料产品详情
    public class MaterialDetail : TeaModel {
        // 物料名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("material_name")]
        [Validation(Required=false)]
        public string MaterialName { get; set; }

        // 供应商产品详情列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("supplier_product_list")]
        [Validation(Required=false)]
        public SupplierProductDetail SupplierProductList { get; set; }

    }

}
