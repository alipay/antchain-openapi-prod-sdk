// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class CreateAntiQrcodeimageResponse : TeaModel {
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

        // 生成的二维码图片的oss地址
        [NameInMap("qrcode_url")]
        [Validation(Required=false)]
        public string QrcodeUrl { get; set; }

        // 生成结果码，用于异常场景下细化错误信息
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public string GenerateCode { get; set; }

        // 生成结果码含义,用于异常场景下细化错误信息
        [NameInMap("generate_message")]
        [Validation(Required=false)]
        public string GenerateMessage { get; set; }

        // 生成失败时的解决方案,用于异常场景下细化错误信息
        [NameInMap("unable_generate_solution")]
        [Validation(Required=false)]
        public string UnableGenerateSolution { get; set; }

    }

}
