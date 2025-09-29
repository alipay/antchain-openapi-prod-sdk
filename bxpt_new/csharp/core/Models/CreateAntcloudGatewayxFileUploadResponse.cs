// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BXPT_NEW.Models
{
    public class CreateAntcloudGatewayxFileUploadResponse : TeaModel {
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

        // 上传有效期
        [NameInMap("expired_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ExpiredTime { get; set; }

        // 32位文件唯一id
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 放入http请求头里
        [NameInMap("upload_headers")]
        [Validation(Required=false)]
        public List<XNameValuePair> UploadHeaders { get; set; }

        // 文件上传地址
        [NameInMap("upload_url")]
        [Validation(Required=false)]
        public string UploadUrl { get; set; }

    }

}
