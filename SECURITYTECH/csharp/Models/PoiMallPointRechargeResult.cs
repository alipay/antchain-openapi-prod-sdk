// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 积分充值结果
    public class PoiMallPointRechargeResult : TeaModel {
        // 充值成功的ID列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("succeed_recharge_ids")]
        [Validation(Required=false)]
        public List<string> SucceedRechargeIds { get; set; }

        // 充值失败的ID列表（全部成功时为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("failed_recharge_ids")]
        [Validation(Required=false)]
        public List<string> FailedRechargeIds { get; set; }

    }

}
