// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class UploadImageResponse : TeaModel {
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

        // 临时可访问的url，过期时间2小时
        [NameInMap("temporary_url")]
        [Validation(Required=false)]
        public string TemporaryUrl { get; set; }

        // 图片的不可访问url，发布权益时使用
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
