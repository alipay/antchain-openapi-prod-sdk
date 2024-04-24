// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证文件信息
    public class EvidenceFile : TeaModel {
        // 证据文件名称
        [NameInMap("evidence_file_name")]
        [Validation(Required=true)]
        public string EvidenceFileName { get; set; }

        // 证据文件备注
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 文件类型
        [NameInMap("evidence_file_type")]
        [Validation(Required=true)]
        public string EvidenceFileType { get; set; }

        // 文件大小
        [NameInMap("evidence_file_size")]
        [Validation(Required=true)]
        public long? EvidenceFileSize { get; set; }

        // 文件时长（单位：秒）
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // 证据文件指纹
        [NameInMap("evidence_file_hash")]
        [Validation(Required=true)]
        public string EvidenceFileHash { get; set; }

        // 文件url
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
