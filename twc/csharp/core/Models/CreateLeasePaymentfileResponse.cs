// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeasePaymentfileResponse : TeaModel {
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

        // 状态码 0表示成功
        // 
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误信息
        // 
        [NameInMap("err_message")]
        [Validation(Required=false)]
        public string ErrMessage { get; set; }

        // 租赁平台上传付款通知到合约中对应
        [NameInMap("response_data")]
        [Validation(Required=false)]
        public string ResponseData { get; set; }

    }

}
