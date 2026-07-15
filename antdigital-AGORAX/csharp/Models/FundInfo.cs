// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 营销分销平台推广人账户信息
    public class FundInfo : TeaModel {
        // 可提现余额
        /// <summary>
        /// <b>Example:</b>
        /// <para>10.8</para>
        /// </summary>
        [NameInMap("balance")]
        [Validation(Required=true)]
        public string Balance { get; set; }

        // 待结算额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>11.4</para>
        /// </summary>
        [NameInMap("settle_quota")]
        [Validation(Required=true)]
        public string SettleQuota { get; set; }

        // 商户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>tset id</para>
        /// </summary>
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

    }

}
