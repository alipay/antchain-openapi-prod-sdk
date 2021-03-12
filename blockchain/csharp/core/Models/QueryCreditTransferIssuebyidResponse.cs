// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryCreditTransferIssuebyidResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 凭证所属did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 凭证列表
        [NameInMap("issue_ids")]
        [Validation(Required=false)]
        public List<IssueInfo> IssueIds { get; set; }

        // 页数 从1开始
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页显示数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 数据总量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
