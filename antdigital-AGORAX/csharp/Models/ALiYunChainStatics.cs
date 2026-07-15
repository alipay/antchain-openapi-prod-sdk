// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云链统计信息
    public class ALiYunChainStatics : TeaModel {
        // alias
        /// <summary>
        /// <b>Example:</b>
        /// <para>alias</para>
        /// </summary>
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // Dt
        /// <summary>
        /// <b>Example:</b>
        /// <para>Dt</para>
        /// </summary>
        [NameInMap("dt")]
        [Validation(Required=false)]
        public long? Dt { get; set; }

        // trans_count
        /// <summary>
        /// <b>Example:</b>
        /// <para>21323</para>
        /// </summary>
        [NameInMap("trans_count")]
        [Validation(Required=false)]
        public long? TransCount { get; set; }

        // last_sum_block_height
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231</para>
        /// </summary>
        [NameInMap("last_sum_block_height")]
        [Validation(Required=false)]
        public long? LastSumBlockHeight { get; set; }

        // creat_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>creat_time</para>
        /// </summary>
        [NameInMap("creat_time")]
        [Validation(Required=false)]
        public long? CreatTime { get; set; }

    }

}
