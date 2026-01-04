// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 知识库-文件上传响应内容
    public class UploadAttachmentFileVO : TeaModel {
        // 上传结果	
        // 
        [NameInMap("upload_status")]
        [Validation(Required=true)]
        public string UploadStatus { get; set; }

        // 文件URL
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件类型
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件名
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 附件大小	
        // 
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public long? FileSize { get; set; }

        // 内容库 ID（用于检索）	
        // 
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 错误信息	
        // 
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
