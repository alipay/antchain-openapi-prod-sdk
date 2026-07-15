// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 数字资产管理平台批发结构
    public class AccountWholesaleParam : TeaModel {
        // 批发数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("ep_amount")]
        [Validation(Required=true)]
        public long? EpAmount { get; set; }

        // 用户账户
        /// <summary>
        /// <b>Example:</b>
        /// <para>testAccount</para>
        /// </summary>
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

    }

}
