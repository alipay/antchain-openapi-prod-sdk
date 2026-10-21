// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    // 文件名字
    public class FileItem : TeaModel {
        // 文件 id
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件 id</para>
        /// </summary>
        [NameInMap("document_id")]
        [Validation(Required=true)]
        public string DocumentId { get; set; }

        // 文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件名</para>
        /// </summary>
        [NameInMap("file_name")]
        [Validation(Required=false)]
        public string FileName { get; set; }

        // 文件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>pdf</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // OSS文件地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>oss地址</para>
        /// </summary>
        [NameInMap("oss_url")]
        [Validation(Required=false)]
        public string OssUrl { get; set; }

        // OSS提供方
        /// <summary>
        /// <b>Example:</b>
        /// <para>OSS提供方</para>
        /// </summary>
        [NameInMap("oss_provider")]
        [Validation(Required=false)]
        public string OssProvider { get; set; }

        // 文档来源
        /// <summary>
        /// <b>Example:</b>
        /// <para>文档来源</para>
        /// </summary>
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 文档来源方对文档的额外描述信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>文档来源方对文档的额外描述信息</para>
        /// </summary>
        [NameInMap("source_ext")]
        [Validation(Required=false)]
        public string SourceExt { get; set; }

    }

}
