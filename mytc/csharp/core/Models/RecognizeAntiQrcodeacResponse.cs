// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class RecognizeAntiQrcodeacResponse : TeaModel {
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

        // 解码结果,0:失败,1:成功，如果解码成功，可忽略detectState字段返回结果
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 识别状态
        [NameInMap("detect_state")]
        [Validation(Required=false)]
        public string DetectState { get; set; }

        // 识别状态描述
        [NameInMap("detect_desc")]
        [Validation(Required=false)]
        public string DetectDesc { get; set; }

        // 加密数据
        [NameInMap("encrypt_data")]
        [Validation(Required=false)]
        public string EncryptData { get; set; }

    }

}
