// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 营销分销推广人账户流水信息
    public class CapitalInfo : TeaModel {
        // 记录流水额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>15.9</para>
        /// </summary>
        [NameInMap("balance_log")]
        [Validation(Required=true)]
        public string BalanceLog { get; set; }

        // 商户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>testid</para>
        /// </summary>
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 记录时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>12.2</para>
        /// </summary>
        [NameInMap("time_log")]
        [Validation(Required=true)]
        public long? TimeLog { get; set; }

        // 链上地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
