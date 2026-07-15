// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 新建合约服务
    public class ContractCreateResp : TeaModel {
        // 合约标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>cme20230724104931af3a4d</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

    }

}
