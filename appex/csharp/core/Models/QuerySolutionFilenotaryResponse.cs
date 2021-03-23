// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class QuerySolutionFilenotaryResponse : TeaModel {
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

        // 文件sha256哈希
        // 
        [NameInMap("file_content_hash")]
        [Validation(Required=false)]
        public string FileContentHash { get; set; }

        // 小程序二维码对应的url
        // 
        [NameInMap("qr_code_url")]
        [Validation(Required=false)]
        public string QrCodeUrl { get; set; }

        // 下载url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
