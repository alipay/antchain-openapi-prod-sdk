// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoMerchantexpandMerchantResponse : TeaModel {
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

        // 商户入驻状态
        // INIT 入驻中
        // SUCCESS 入驻成功
        // FAIL 入驻失败
        [NameInMap("enrollment_status")]
        [Validation(Required=false)]
        public string EnrollmentStatus { get; set; }

        // 入驻失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

    }

}
