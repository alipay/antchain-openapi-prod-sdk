// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分账户信息
    public class PointAccountInfo : TeaModel {
        // 门店ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("store_id")]
        [Validation(Required=false)]
        public string StoreId { get; set; }

        // 账户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 总积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("total_point")]
        [Validation(Required=false)]
        public string TotalPoint { get; set; }

        // 已充值积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("recharged_point")]
        [Validation(Required=false)]
        public string RechargedPoint { get; set; }

        // 可用积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("available_point")]
        [Validation(Required=false)]
        public string AvailablePoint { get; set; }

        // 冻结积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("frozen_point")]
        [Validation(Required=false)]
        public string FrozenPoint { get; set; }

        // 已消费积分
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("consumed_point")]
        [Validation(Required=false)]
        public string ConsumedPoint { get; set; }

        // 账户状态：ACTIVE-生效, INACTIVE-失效, FROZEN-逾期冻结, CANCEL-解约中
        /// <summary>
        /// <b>Example:</b>
        /// <para>ACTIVE</para>
        /// </summary>
        [NameInMap("account_status")]
        [Validation(Required=false)]
        public string AccountStatus { get; set; }

    }

}
