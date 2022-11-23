// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetContractEncryptedfileuploadurlResponse : TeaModel {
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

        // 上传的原始文件记录id
        [NameInMap("file_log_id")]
        [Validation(Required=false)]
        public string FileLogId { get; set; }

        // 文件上传链接
        [NameInMap("file_upload_url")]
        [Validation(Required=false)]
        public string FileUploadUrl { get; set; }

        // 上传链接过期时间. yyyy-MM-dd HH:mm:ss
        [NameInMap("expired_time")]
        [Validation(Required=false)]
        public string ExpiredTime { get; set; }

    }

}
