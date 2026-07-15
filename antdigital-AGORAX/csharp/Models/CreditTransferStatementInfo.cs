// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 物流金融信用流转流水信息
    public class CreditTransferStatementInfo : TeaModel {
        // 信用凭证额度
        /// <summary>
        /// <b>Example:</b>
        /// <para>1989.76</para>
        /// </summary>
        [NameInMap("credit_limit")]
        [Validation(Required=false)]
        public string CreditLimit { get; set; }

        // 信用凭证到期时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20191212</para>
        /// </summary>
        [NameInMap("expire_date")]
        [Validation(Required=false)]
        public string ExpireDate { get; set; }

        // 凭证来源方did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb</para>
        /// </summary>
        [NameInMap("from_did")]
        [Validation(Required=false)]
        public string FromDid { get; set; }

        // 信用凭证发起时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>20190101</para>
        /// </summary>
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public string IssueDate { get; set; }

        // 信用流转凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>000abc</para>
        /// </summary>
        [NameInMap("issue_id")]
        [Validation(Required=false)]
        public string IssueId { get; set; }

        // 流水类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>融资提现</para>
        /// </summary>
        [NameInMap("state_type")]
        [Validation(Required=false)]
        public string StateType { get; set; }

        // 凭证流转方did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:1b8b30228ec99cb5de99b2265538f3c505b274e0bef98fb9cee7aabd8f5f47eb</para>
        /// </summary>
        [NameInMap("to_did")]
        [Validation(Required=false)]
        public string ToDid { get; set; }

    }

}
