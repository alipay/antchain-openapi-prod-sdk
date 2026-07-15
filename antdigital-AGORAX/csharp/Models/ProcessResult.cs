// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 授权流程操作结果
    public class ProcessResult : TeaModel {
        // 申请权限的扩展参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

        // 申请权限原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 下一个处理节点ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("next")]
        [Validation(Required=false)]
        public string Next { get; set; }

        // 流程ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>68f955a58591e80b94e6ed755722abab4d665936a59bbe6482dd0be9aad21d9a</para>
        /// </summary>
        [NameInMap("process_id")]
        [Validation(Required=true)]
        public string ProcessId { get; set; }

        // 流程状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>processing</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 数据对象ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:test:0000:3fc223617da9a17a4d7792ef0c3f57bd176eca8408f2f4cb1df42939220829d2</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 交易HASH
        /// <summary>
        /// <b>Example:</b>
        /// <para>AQEETAAAAEEAAAAETbYFwqfIiyqFWt2Tasr2f4</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 区块高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>1256</para>
        /// </summary>
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

        // 授权凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>JSON格式</para>
        /// </summary>
        [NameInMap("authority_cert")]
        [Validation(Required=false)]
        public string AuthorityCert { get; set; }

    }

}
