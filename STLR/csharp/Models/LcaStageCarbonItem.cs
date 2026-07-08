// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 分阶段碳排放量
    public class LcaStageCarbonItem : TeaModel {
        // 生命周期阶段：
        // [MaterialPurchase]-原材料，[ProductManufacture]-生产制造，[ProductSale]-分销，[ProductUsage]-产品使用，[ProductWithdraw]-处置/再生利用
        /// <summary>
        /// <b>Example:</b>
        /// <para>MaterialPurchase</para>
        /// </summary>
        [NameInMap("lca_stage_code")]
        [Validation(Required=true)]
        public string LcaStageCode { get; set; }

        // 阶段碳排放量
        /// <summary>
        /// <b>Example:</b>
        /// <para>223.23</para>
        /// </summary>
        [NameInMap("lca_stage_carbon_amount")]
        [Validation(Required=true)]
        public string LcaStageCarbonAmount { get; set; }

    }

}
