// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 分账详情
    public class OrderSplitInfo : TeaModel {
        // 主订单分账状态，PROCESSING-处理中,SUCCESS-成功,FAILED-失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("order_split_status")]
        [Validation(Required=true)]
        public string OrderSplitStatus { get; set; }

        // 分账账号个数
        /// <summary>
        /// <b>Example:</b>
        /// <para>9</para>
        /// </summary>
        [NameInMap("order_split_account_count")]
        [Validation(Required=true)]
        public long? OrderSplitAccountCount { get; set; }

        // 分账账号详情，针对某一笔分账
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("order_split_detail_list")]
        [Validation(Required=true)]
        public List<OrderSplitDetailList> OrderSplitDetailList { get; set; }

    }

}
