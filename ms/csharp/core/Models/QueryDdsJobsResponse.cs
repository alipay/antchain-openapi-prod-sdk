// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QueryDdsJobsResponse : TeaModel {
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

        // 任务信息
        [NameInMap("jobs")]
        [Validation(Required=false)]
        public List<Job> Jobs { get; set; }

        // Page number
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // Page size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // Total item number
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public int? TotalCount { get; set; }

    }

}
