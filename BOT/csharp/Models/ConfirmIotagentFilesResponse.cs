// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ConfirmIotagentFilesResponse : TeaModel {
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

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 媒体类型
        [NameInMap("media_type")]
        [Validation(Required=false)]
        public string MediaType { get; set; }

        // 字节数
        [NameInMap("size_bytes")]
        [Validation(Required=false)]
        public string SizeBytes { get; set; }

        // 确认时间
        [NameInMap("created_at")]
        [Validation(Required=false)]
        public string CreatedAt { get; set; }

    }

}
