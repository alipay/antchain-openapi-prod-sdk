// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 结算订单分账明细对象
    public class SettleOrderRoyaltyDetail : TeaModel {
        // 分账金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 分账执行时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-30 12:00:00</para>
        /// </summary>
        [NameInMap("execute_time")]
        [Validation(Required=false)]
        public string ExecuteTime { get; set; }

        // 分账转出账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088111111111111</para>
        /// </summary>
        [NameInMap("trans_out_account")]
        [Validation(Required=false)]
        public string TransOutAccount { get; set; }

        // 分账转入账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088111111111111</para>
        /// </summary>
        [NameInMap("trans_in_account")]
        [Validation(Required=false)]
        public string TransInAccount { get; set; }

    }

}
