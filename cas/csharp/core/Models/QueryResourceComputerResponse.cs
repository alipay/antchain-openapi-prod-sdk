// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceComputerResponse : TeaModel {
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

        // 查询的实例集合
        [NameInMap("instances")]
        [Validation(Required=false)]
        public List<Computer> Instances { get; set; }

        // 实例列表的页码。
        [NameInMap("page_number")]
        [Validation(Required=false)]
        public long? PageNumber { get; set; }

        // 输入时设置的每页行数。
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 请求ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 查询到的实例总数。
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
