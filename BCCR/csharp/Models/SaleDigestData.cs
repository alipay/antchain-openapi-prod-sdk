// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 在售摘要信息
    public class SaleDigestData : TeaModel {
        // 商品hash值
        /// <summary>
        /// <b>Example:</b>
        /// <para>hash</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 物料置信度
        /// <summary>
        /// <b>Example:</b>
        /// <para>0.8</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

    }

}
