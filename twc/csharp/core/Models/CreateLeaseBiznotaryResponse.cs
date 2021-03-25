// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseBiznotaryResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 是否租赁宝存证哈希成功，成功则为0，否则不为0
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误码具体详情
        [NameInMap("err_message")]
        [Validation(Required=false)]
        public string ErrMessage { get; set; }

    }

}
