// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class InitializeFaceauthWebResponse : TeaModel {
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

        // 预留扩展结果
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

        // 产品结果明细，不影响决策
        [NameInMap("result_code_sub")]
        [Validation(Required=false)]
        public string ResultCodeSub { get; set; }

        // result_code_sub对应的文案
        [NameInMap("result_msg_sub")]
        [Validation(Required=false)]
        public string ResultMsgSub { get; set; }

        // 实人认证id
        [NameInMap("zim_id")]
        [Validation(Required=false)]
        public string ZimId { get; set; }

    }

}
