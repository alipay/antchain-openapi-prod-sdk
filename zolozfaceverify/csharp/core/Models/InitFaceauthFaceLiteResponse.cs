// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ZOLOZFACEVERIFY.Models
{
    public class InitFaceauthFaceLiteResponse : TeaModel {
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

        // 扩展结果
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

        // 人脸协议
        [NameInMap("protocol")]
        [Validation(Required=false)]
        public string Protocol { get; set; }

        // 产品结果明细，不影响决策
        [NameInMap("result_code_sub")]
        [Validation(Required=false)]
        public string ResultCodeSub { get; set; }

        // 明细返回码对应的文案
        [NameInMap("result_msg_sub")]
        [Validation(Required=false)]
        public string ResultMsgSub { get; set; }

        // 刷脸认证唯一标识。如果初始化失败则为空，可通过返回码分析具体原因
        [NameInMap("zim_id")]
        [Validation(Required=false)]
        public string ZimId { get; set; }

    }

}
