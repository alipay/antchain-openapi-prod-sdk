// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class GetJusticeUploadfilepathResponse : TeaModel {
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

        // OSS上传链接
        [NameInMap("upload_file_url")]
        [Validation(Required=false)]
        public string UploadFileUrl { get; set; }

        // 文件key
        [NameInMap("file_key")]
        [Validation(Required=false)]
        public string FileKey { get; set; }

        // 业务码 0表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 业务码描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
