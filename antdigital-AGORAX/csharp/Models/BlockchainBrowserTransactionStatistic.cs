// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 蚂蚁链交易汇总信息
    public class BlockchainBrowserTransactionStatistic : TeaModel {
        // 蚂蚁链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>27ce375122ef483691488395808e009e</para>
        /// </summary>
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1604480401000</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 时间点
        /// <summary>
        /// <b>Example:</b>
        /// <para>2020-10-28</para>
        /// </summary>
        [NameInMap("date_time")]
        [Validation(Required=true)]
        public string DateTime { get; set; }

        // 统计时间内最新块高度
        /// <summary>
        /// <b>Example:</b>
        /// <para>6372915</para>
        /// </summary>
        [NameInMap("last_sum_block_height")]
        [Validation(Required=true)]
        public long? LastSumBlockHeight { get; set; }

        // 统计周期内交易的数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>2750038</para>
        /// </summary>
        [NameInMap("trans_count")]
        [Validation(Required=true)]
        public long? TransCount { get; set; }

    }

}
