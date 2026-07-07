// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 版权商品库存
    public class ItemInventoryVO : TeaModel {
        // 库存数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("stock")]
        [Validation(Required=true)]
        public long? Stock { get; set; }

        // 生效时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-05-20 08:00:00</para>
        /// </summary>
        [NameInMap("gmt_valid")]
        [Validation(Required=true)]
        public string GmtValid { get; set; }

        // 失效时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2025-05-20 09:00:00</para>
        /// </summary>
        [NameInMap("gmt_invalid")]
        [Validation(Required=true)]
        public string GmtInvalid { get; set; }

    }

}
