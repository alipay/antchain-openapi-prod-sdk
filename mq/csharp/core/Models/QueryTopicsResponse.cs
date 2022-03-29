// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class QueryTopicsResponse : TeaModel {
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

        // page num
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

        // list
        [NameInMap("topics")]
        [Validation(Required=true)]
        public List<Topic> Topics { get; set; }

        // total count
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public int? TotalCount { get; set; }

    }

}
