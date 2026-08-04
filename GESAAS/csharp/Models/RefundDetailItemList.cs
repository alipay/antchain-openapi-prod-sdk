// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 条件返回：refundStatus=SUCCESS 返回
    // 退分账明细
    public class RefundDetailItemList : TeaModel {
        // 退款退分账金额，单位为分
        /// <summary>
        /// <b>Example:</b>
        /// <para>990</para>
        /// </summary>
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 退款退分账支出账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126765726</para>
        /// </summary>
        [NameInMap("trans_out_account")]
        [Validation(Required=false)]
        public string TransOutAccount { get; set; }

        // 退款退分账转入账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088101126765726</para>
        /// </summary>
        [NameInMap("trans_in_account")]
        [Validation(Required=false)]
        public string TransInAccount { get; set; }

    }

}
