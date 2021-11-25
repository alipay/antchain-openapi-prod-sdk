// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class AddContractFileResponse : TeaModel {
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

        // 文件下载地址，有效期一小时
        // 
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 文件id
        // 
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 文件名称
        // 
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 业务码，0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
