// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class RecognizeOcrIndividualcardResponse : TeaModel {
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

        // 返回结果码
        [NameInMap("ret_code")]
        [Validation(Required=false)]
        public string RetCode { get; set; }

        // 错误码
        [NameInMap("ret_code_sub")]
        [Validation(Required=false)]
        public string RetCodeSub { get; set; }

        // 错误信息
        [NameInMap("ret_message_sub")]
        [Validation(Required=false)]
        public string RetMessageSub { get; set; }

        // 识别结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。
        [NameInMap("ocr_info")]
        [Validation(Required=false)]
        public OcrInfo OcrInfo { get; set; }

        // 防伪结果，为JSON串。如果入参resp_enc_type=1则是经过AES加密后的JSON串。 如果不启用防伪，则不返回该字段。
        [NameInMap("risk_info")]
        [Validation(Required=false)]
        public RiskInfo RiskInfo { get; set; }

        // 扩展信息JSON串。
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 加密后的识别结果
        [NameInMap("ocr_info_encrypt")]
        [Validation(Required=false)]
        public string OcrInfoEncrypt { get; set; }

    }

}
