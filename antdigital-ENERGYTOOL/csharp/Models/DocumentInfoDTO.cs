// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    // 文档基础信息
    public class DocumentInfoDTO : TeaModel {
        // 文档id
        /// <summary>
        /// <b>Example:</b>
        /// <para>id</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 文档名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>file_size</para>
        /// </summary>
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public long? FileSize { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>file_type</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // oss下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss_url</para>
        /// </summary>
        [NameInMap("oss_url")]
        [Validation(Required=true)]
        public string OssUrl { get; set; }

        // 文件md5
        /// <summary>
        /// <b>Example:</b>
        /// <para>md5</para>
        /// </summary>
        [NameInMap("md5")]
        [Validation(Required=true)]
        public string Md5 { get; set; }

        // 文档来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>source</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 文档提供方的附加信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>source_ext</para>
        /// </summary>
        [NameInMap("source_ext")]
        [Validation(Required=true)]
        public string SourceExt { get; set; }

    }

}
