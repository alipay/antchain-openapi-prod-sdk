// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商家举证材料
    public class MerchantSupportEvidence : TeaModel {
        // 商家操作(拒绝)时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-01-01 12:00:00</para>
        /// </summary>
        [NameInMap("merchant_operate_time")]
        [Validation(Required=false)]
        public string MerchantOperateTime { get; set; }

        // 商家拒绝原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>理由</para>
        /// </summary>
        [NameInMap("merchant_refuse_reason")]
        [Validation(Required=false)]
        public string MerchantRefuseReason { get; set; }

        // 商家拒绝举证材料
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;fileKey&quot;]</para>
        /// </summary>
        [NameInMap("merchant_refuse_evidences")]
        [Validation(Required=false)]
        public List<string> MerchantRefuseEvidences { get; set; }

    }

}
