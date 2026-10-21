// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGENT.Models
{
    public class KbUploadFileItem : TeaModel {
        // document ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>D1</para>
        /// </summary>
        [NameInMap("document_id")]
        [Validation(Required=true)]
        public string DocumentId { get; set; }

        // file名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>a.pdf</para>
        /// </summary>
        [NameInMap("file_name")]
        [Validation(Required=true)]
        public string FileName { get; set; }

        // original名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>a.pdf</para>
        /// </summary>
        [NameInMap("original_name")]
        [Validation(Required=true)]
        public string OriginalName { get; set; }

        // file类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>pdf</para>
        /// </summary>
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // file md5
        /// <summary>
        /// <b>Example:</b>
        /// <para>m1</para>
        /// </summary>
        [NameInMap("file_md5")]
        [Validation(Required=true)]
        public string FileMd5 { get; set; }

        // oss url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://oss.example/a.pdf">https://oss.example/a.pdf</a></para>
        /// </summary>
        [NameInMap("oss_url")]
        [Validation(Required=true)]
        public string OssUrl { get; set; }

        // oss provider
        /// <summary>
        /// <b>Example:</b>
        /// <para>antUpload</para>
        /// </summary>
        [NameInMap("oss_provider")]
        [Validation(Required=true)]
        public string OssProvider { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // source ext
        [NameInMap("source_ext")]
        [Validation(Required=true)]
        public string SourceExt { get; set; }

    }

}
