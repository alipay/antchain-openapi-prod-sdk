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
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件名称</para>
        /// </summary>
        [NameInMap("evidence_file_name")]
        [Validation(Required=true)]
        public string EvidenceFileName { get; set; }

        // 证据文件备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>RECORD_SCREEN</para>
        /// </summary>
        [NameInMap("evidence_file_type")]
        [Validation(Required=true)]
        public string EvidenceFileType { get; set; }

        // 文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("evidence_file_size")]
        [Validation(Required=true)]
        public long? EvidenceFileSize { get; set; }

        // 文件时长（单位：秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("duration")]
        [Validation(Required=true)]
        public long? Duration { get; set; }

        // 证据文件指纹
        /// <summary>
        /// <b>Example:</b>
        /// <para>b99bd7628080f2ec55d68bfe15d62a2b</para>
        /// </summary>
        [NameInMap("evidence_file_hash")]
        [Validation(Required=true)]
        public string EvidenceFileHash { get; set; }

        // 文件url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

    }

}
