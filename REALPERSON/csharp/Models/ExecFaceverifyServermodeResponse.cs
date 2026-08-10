// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class ExecFaceverifyServermodeResponse : TeaModel {
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

        // 认证ID
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 是否通过，通过为T，不通过为F
        [NameInMap("passed")]
        [Validation(Required=false)]
        public string Passed { get; set; }

        // 业务失败原因
        [NameInMap("reason")]
        [Validation(Required=false)]
        public string Reason { get; set; }

        // 认证主体附件信息，包含共计类型等
        [NameInMap("material_info")]
        [Validation(Required=false)]
        public string MaterialInfo { get; set; }

    }

}
