// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryPolicyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 传入的页码, 如果没有传入, 则取默认值1
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public int? PageNum { get; set; }

        // 传入的页大小, 如果没有传入, 则取默认值10
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public int? PageSize { get; set; }

        // 授权策略列表
        [NameInMap("policies")]
        [Validation(Required=true)]
        public List<AuthPolicy> Policies { get; set; }

        // 查询结果的总条目数量
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public int? TotalCount { get; set; }

    }

}
