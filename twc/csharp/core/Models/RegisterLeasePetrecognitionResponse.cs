// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class RegisterLeasePetrecognitionResponse : TeaModel {
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

        // 用于追踪业务调用流程
        [NameInMap("trace_id")]
        [Validation(Required=false)]
        public string TraceId { get; set; }

        // 注册结果：_0_注册不成功，_1_注册成功
        [NameInMap("is_register_success")]
        [Validation(Required=false)]
        public string IsRegisterSuccess { get; set; }

        // 注册成功宠物档案ID
        [NameInMap("pet_id")]
        [Validation(Required=false)]
        public string PetId { get; set; }

    }

}
