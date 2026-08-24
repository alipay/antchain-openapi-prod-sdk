// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryCdsqScratchesResponse : TeaModel {
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

        // 结果码，999999 表示成功
        [NameInMap("response_code")]
        [Validation(Required=false)]
        public string ResponseCode { get; set; }

        // 错误信息，成功时为空
        [NameInMap("response_msg")]
        [Validation(Required=false)]
        public string ResponseMsg { get; set; }

        // 电子保单 url 地址
        [NameInMap("return_pdf_value")]
        [Validation(Required=false)]
        public string ReturnPdfValue { get; set; }

        // 保单服务号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 保单生效时间，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("begin_time")]
        [Validation(Required=false)]
        public string BeginTime { get; set; }

        // 保单失效时间，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

    }

}
