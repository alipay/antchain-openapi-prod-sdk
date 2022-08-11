// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    public class InitAntchainBbpVerifyResponse : TeaModel {
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

        // 核身id
        [NameInMap("verify_id")]
        [Validation(Required=false)]
        public string VerifyId { get; set; }

        // 核身请求地址url
        [NameInMap("verify_url")]
        [Validation(Required=false)]
        public string VerifyUrl { get; set; }

        // 核身处理状态:INITIAL、PROCESSING、SUCCESS、EXPIRED、FAIL
        [NameInMap("verify_status")]
        [Validation(Required=false)]
        public string VerifyStatus { get; set; }

        // 可用产品集合
        [NameInMap("valid_prod")]
        [Validation(Required=false)]
        public List<GwValidateProduct> ValidProd { get; set; }

    }

}
