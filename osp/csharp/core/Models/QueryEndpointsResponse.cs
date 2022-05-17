// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class QueryEndpointsResponse : TeaModel {
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

        // endpoint信息
        [NameInMap("endpoints")]
        [Validation(Required=true)]
        public List<AksEndpoint> Endpoints { get; set; }

        // 当前页数
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总记录数
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

    }

}
