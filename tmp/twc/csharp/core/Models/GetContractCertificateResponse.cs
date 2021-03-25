// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetContractCertificateResponse : TeaModel {
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

        // 下载文件地址(一小时内有效)
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 状态值
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 	状态信息描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
