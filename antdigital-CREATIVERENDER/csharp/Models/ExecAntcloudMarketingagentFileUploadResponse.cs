// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class ExecAntcloudMarketingagentFileUploadResponse : TeaModel {
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

        // 上传后的 AFTS 文件 ID
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // OSS 对象路径
        [NameInMap("oss_file_path")]
        [Validation(Required=false)]
        public string OssFilePath { get; set; }

        // 图片访问地址，可用于视频生成 input_elements[].url
        [NameInMap("access_url")]
        [Validation(Required=false)]
        public string AccessUrl { get; set; }

    }

}
