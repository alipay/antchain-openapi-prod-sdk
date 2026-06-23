// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 用于传输附件链接
    public class Attachment : TeaModel {
        // 文件唯一标识，作为幂等字段
        /// <summary>
        /// <b>Example:</b>
        /// <para>10100000219487</para>
        /// </summary>
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 文件名称，用作展示
        /// <summary>
        /// <b>Example:</b>
        /// <para>exmaple.pdf</para>
        /// </summary>
        [NameInMap("filename")]
        [Validation(Required=false)]
        public string Filename { get; set; }

        // 访问地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>文件链接</para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

    }

}
