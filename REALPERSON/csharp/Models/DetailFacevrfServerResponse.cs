// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class DetailFacevrfServerResponse : TeaModel {
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

        // PASS：认证通过
        // FAIL：认证不通过
        // NO_RECODE：无认证记录
        // PROCESSING：认证中
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 认证人信息，包括姓名和身份证号，不加密
        // state为PASS/FAIL/PROCESSING时为JSON字符串，为NO_RECORD时为空
        [NameInMap("identity_info")]
        [Validation(Required=false)]
        public string IdentityInfo { get; set; }

        // 预留扩展结果
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
