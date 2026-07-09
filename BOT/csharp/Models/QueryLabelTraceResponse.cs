// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryLabelTraceResponse : TeaModel {
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

        // 标签流转历史
        [NameInMap("label_trace_list")]
        [Validation(Required=false)]
        public List<LabelTrace> LabelTraceList { get; set; }

        // 当前页码
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 单页记录数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 总记录数
        [NameInMap("total_size")]
        [Validation(Required=false)]
        public long? TotalSize { get; set; }

        // 总页数
        [NameInMap("total_pages")]
        [Validation(Required=false)]
        public long? TotalPages { get; set; }

    }

}
