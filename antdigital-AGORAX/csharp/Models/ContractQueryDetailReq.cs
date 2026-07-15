// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约查询
    public class ContractQueryDetailReq : TeaModel {
        // 服务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>cme20230724104931af3a4d</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=true, MaxLength=64)]
        public string ServiceId { get; set; }

    }

}
