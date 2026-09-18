// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 解冻结果详情（成功时返回）
    public class PointUnfreezeResult : TeaModel {
        // 账户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 本次解冻总积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_unfreeze_point")]
        [Validation(Required=false)]
        public string TotalUnfreezePoint { get; set; }

        // 解冻后可用积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("available_point")]
        [Validation(Required=false)]
        public string AvailablePoint { get; set; }

        // 成功解冻的子订单数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("unfreeze_order_count")]
        [Validation(Required=false)]
        public string UnfreezeOrderCount { get; set; }

        // 解冻失败的子订单ID列表（全部成功时为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("failed_order_ids")]
        [Validation(Required=false)]
        public List<string> FailedOrderIds { get; set; }

    }

}
