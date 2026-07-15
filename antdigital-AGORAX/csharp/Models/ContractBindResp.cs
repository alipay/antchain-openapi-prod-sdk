// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约绑定关系
    public class ContractBindResp : TeaModel {
        // 合约标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>cme20230724104931af3a4d</para>
        /// </summary>
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // 合约名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资产合约</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否已关联
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("bind")]
        [Validation(Required=false)]
        public bool? Bind { get; set; }

    }

}
