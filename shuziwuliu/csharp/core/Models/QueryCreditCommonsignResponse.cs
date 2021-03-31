// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditCommonsignResponse : TeaModel {
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

        // 签约结果，-1:签约失败，0:未签约，1:已签约，2:签约中
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 查询信息
        [NameInMap("query_msg")]
        [Validation(Required=false)]
        public string QueryMsg { get; set; }

    }

}
