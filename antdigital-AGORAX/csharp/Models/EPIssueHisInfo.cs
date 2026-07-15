// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 版通历史发行记录信息
    public class EPIssueHisInfo : TeaModel {
        // 版通发行日期时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1560827725</para>
        /// </summary>
        [NameInMap("issue_date")]
        [Validation(Required=true)]
        public long? IssueDate { get; set; }

        // 版通线下发行量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("offline_issue_amount")]
        [Validation(Required=true)]
        public long? OfflineIssueAmount { get; set; }

        // 版通线上发行量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("online_issue_amount")]
        [Validation(Required=true)]
        public long? OnlineIssueAmount { get; set; }

        // 版通自持发行量
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("self_issue_amount")]
        [Validation(Required=true)]
        public long? SelfIssueAmount { get; set; }

    }

}
