// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryRealpersonFacevrfResponse : TeaModel {
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

        // 实人认证结果
        // PROCESSING（初始化）
        // SUCCESS（认证通过）FAIL（认证不通过）
        [NameInMap("certify_state")]
        [Validation(Required=false)]
        public string CertifyState { get; set; }

        // 【solution_type=H5 | APP 返回】
        // 本次认证是否存在安全风险
        // true(检测到安全风险)
        // false(未检测到安全风险)
        [NameInMap("attack_flag")]
        [Validation(Required=false)]
        public string AttackFlag { get; set; }

        // 【solution_type=H5 | APP 返回】
        // base64过后的二值化图片
        [NameInMap("alive_photo")]
        [Validation(Required=false)]
        public string AlivePhoto { get; set; }

    }

}
