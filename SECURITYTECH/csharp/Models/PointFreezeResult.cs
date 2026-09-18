// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 冻结结果详情（成功时返回）
    public class PointFreezeResult : TeaModel {
        // 账户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 本次冻结总积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_freeze_point")]
        [Validation(Required=false)]
        public string TotalFreezePoint { get; set; }

        // 冻结后剩余可用积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("available_point")]
        [Validation(Required=false)]
        public string AvailablePoint { get; set; }

        // 成功冻结的子订单数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("freeze_order_count")]
        [Validation(Required=false)]
        public string FreezeOrderCount { get; set; }

        // 冻结失败的子订单ID列表（全部成功时为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("failed_order_ids")]
        [Validation(Required=false)]
        public List<string> FailedOrderIds { get; set; }

    }

}
