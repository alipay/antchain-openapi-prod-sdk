// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class FileurlBlockchainBotIotagentFilesResponse : TeaModel {
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

        // 文件ID
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 短期预签名下载地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 下载地址过期时间（ISO-8601）
        [NameInMap("expire_at")]
        [Validation(Required=false)]
        public string ExpireAt { get; set; }

    }

}
