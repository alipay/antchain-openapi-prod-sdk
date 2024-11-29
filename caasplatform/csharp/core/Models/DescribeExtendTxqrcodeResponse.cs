// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class DescribeExtendTxqrcodeResponse : TeaModel {
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

        // Base64编码的二维码 png 图片
        [NameInMap("base64_qr_code_png")]
        [Validation(Required=false)]
        public string Base64QrCodePng { get; set; }

        // 二维码内容
        [NameInMap("qr_code_content")]
        [Validation(Required=false)]
        public string QrCodeContent { get; set; }

        // ac73c8fa158436513e0b398632d9a082e04cee3eac6f9fb50087a46d801bdfd1
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
