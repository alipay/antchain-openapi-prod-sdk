// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationDrivingpermitinfoResponse : TeaModel {
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

        // 行驶证核验结果
        [NameInMap("check_result")]
        [Validation(Required=false)]
        public DrivingPermitCheckResult CheckResult { get; set; }

        // 行驶证信息
        [NameInMap("data")]
        [Validation(Required=false)]
        public DrivingPermitInfo Data { get; set; }

    }

}
