// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 信用凭证数据集合
    public class IssueTransferData : TeaModel {
        // 凭证id
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 转出方did
        [NameInMap("payer_did")]
        [Validation(Required=true)]
        public string PayerDid { get; set; }

        // 接收方did
        [NameInMap("rcv_did")]
        [Validation(Required=true)]
        public string RcvDid { get; set; }

    }

}
