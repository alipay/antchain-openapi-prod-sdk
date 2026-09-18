// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class GetAshieldHardeninglogResponse : TeaModel {
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

        // 请求id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 查询是否成功
        [NameInMap("res_success")]
        [Validation(Required=false)]
        public bool? ResSuccess { get; set; }

        // SUCCESS为成功，其他为失败
        [NameInMap("res_code")]
        [Validation(Required=false)]
        public string ResCode { get; set; }

        // 返回信息描述
        [NameInMap("res_message")]
        [Validation(Required=false)]
        public string ResMessage { get; set; }

        // 返回的下载链接
        [NameInMap("res_data")]
        [Validation(Required=false)]
        public string ResData { get; set; }

    }

}
