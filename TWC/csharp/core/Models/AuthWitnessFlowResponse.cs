// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class AuthWitnessFlowResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 二维码内容
        [NameInMap("qrcode_content")]
        [Validation(Required=false)]
        public string QrcodeContent { get; set; }

        // 签署日志id，外部用户签署返回
        [NameInMap("signlog_id")]
        [Validation(Required=false)]
        public string SignlogId { get; set; }

        // 签名结果，外部用户签署返回
        [NameInMap("sign_result")]
        [Validation(Required=false)]
        public string SignResult { get; set; }

        // 签署结果，批量签署返回
        [NameInMap("sign_results")]
        [Validation(Required=false)]
        public List<WitnessSignResult> SignResults { get; set; }

        // 签署方式，1-单个签署，2-批量签署
        [NameInMap("sign_way")]
        [Validation(Required=false)]
        public long? SignWay { get; set; }

        // 手机盾用户签署返回
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
