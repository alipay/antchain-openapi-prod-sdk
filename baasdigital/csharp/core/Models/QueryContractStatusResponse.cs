// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class QueryContractStatusResponse : TeaModel {
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

        // 客户端传入的请求唯一标识
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 资产状态；0：可用；1：已核销；2：已销毁
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
