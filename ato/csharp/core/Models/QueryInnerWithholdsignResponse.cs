// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerWithholdsignResponse : TeaModel {
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

        // 协议当前状态
        // 1. UNSIGNED：未签约
        // 2. SIGNED：已签约；
        // 3.APPLY_TERMINATE:申请解约
        // 4. TERMINATED：已解约
        // 5.TIMEOUT_CLOSE:超时关闭
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 支付宝代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 协议签署时间
        // yyyy-MM-dd HH:mm:ss 格式
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 协议生效时间
        // yyyy-MM-dd HH:mm:ss 格式
        [NameInMap("valid_time")]
        [Validation(Required=false)]
        public string ValidTime { get; set; }

        // 协议失效时间
        // yyyy-MM-dd HH:mm:ss 格式
        [NameInMap("invalid_time")]
        [Validation(Required=false)]
        public string InvalidTime { get; set; }

    }

}
