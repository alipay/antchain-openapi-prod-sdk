// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    // 分账通知明细
    public class SettleOrderRoyaltyDetail : TeaModel {
        // 分账金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 分账执行时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-30 12:00:00</para>
        /// </summary>
        [NameInMap("execute_time")]
        [Validation(Required=true)]
        public string ExecuteTime { get; set; }

        // 分账转出账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088111111111111</para>
        /// </summary>
        [NameInMap("trans_out_account")]
        [Validation(Required=true)]
        public string TransOutAccount { get; set; }

        // 分账转入账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088111111111111</para>
        /// </summary>
        [NameInMap("trans_in_account")]
        [Validation(Required=true)]
        public string TransInAccount { get; set; }

    }

}
