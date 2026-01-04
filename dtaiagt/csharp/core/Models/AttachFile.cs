// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 文件附件信息
    public class AttachFile : TeaModel {
        // 文件Id
        // 
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件名称
        // 
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // 文件类型
        // 
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 文件来源
        // 
        [NameInMap("file_source")]
        [Validation(Required=true)]
        public string FileSource { get; set; }

        // 文件链接
        // 
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 文件总结
        // 
        [NameInMap("file_summary")]
        [Validation(Required=true)]
        public string FileSummary { get; set; }

        // 上传时间
        // 
        [NameInMap("operate_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OperateTime { get; set; }

        // Map<String, String>	扩展信息
        // 
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 文件大小
        // 
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public string FileSize { get; set; }

        // 内容库 dbId, 用于检索
        // 
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

    }

}
