// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约列表
    public class ContractPageListResp : TeaModel {
        // 服务ID
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

        // 合约类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>存证合约</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1690166971465</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

    }

}
