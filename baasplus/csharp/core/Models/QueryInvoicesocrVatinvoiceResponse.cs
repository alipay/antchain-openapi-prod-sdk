// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryInvoicesocrVatinvoiceResponse : TeaModel {
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

        // 算法错误信息
        [NameInMap("algo_msg")]
        [Validation(Required=false)]
        public string AlgoMsg { get; set; }

        // 算法异常错误码
        // 
        [NameInMap("algo_ret")]
        [Validation(Required=false)]
        public string AlgoRet { get; set; }

        // 框架错误信息
        // 
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 算法结果,JSON String
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 框架inference服务错误码，0为正常
        [NameInMap("ret")]
        [Validation(Required=false)]
        public string Ret { get; set; }

    }

}
