// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class QueryPolicyResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
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
