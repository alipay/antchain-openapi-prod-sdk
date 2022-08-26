// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_faa507f3bcf74109812a97f8296f54ca.Models
{
    public class AuthBlockchainTaxIcmInvoiceResponse : TeaModel {
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

        // 授权是否成功：true：成功 false：失败
        [NameInMap("success")]
        [Validation(Required=false)]
        public string Success { get; set; }

        // 透传字段
        [NameInMap("biz_context")]
        [Validation(Required=false)]
        public string BizContext { get; set; }

        // 纳税人识别号
        [NameInMap("nsrsbh")]
        [Validation(Required=false)]
        public string Nsrsbh { get; set; }

        // 过期时间
        [NameInMap("expired_time")]
        [Validation(Required=false)]
        public string ExpiredTime { get; set; }

        // 业务请求id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_msg")]
        [Validation(Required=false)]
        public string ErrorMsg { get; set; }

    }

}
