// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class PreviewKmDocumentResponse : TeaModel {
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

        // 文档ID
        [NameInMap("document_id")]
        [Validation(Required=false)]
        public string DocumentId { get; set; }

        // 文档名
        [NameInMap("document_name")]
        [Validation(Required=false)]
        public string DocumentName { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // 文档Markdown正文
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // OSS预览地址
        [NameInMap("oss_preview_url")]
        [Validation(Required=false)]
        public string OssPreviewUrl { get; set; }

    }

}
