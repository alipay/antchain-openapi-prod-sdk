// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 文件结构
    public class FileNode : TeaModel {
        // 可访问的文件链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://xxxx">http://xxxx</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx.pdf</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
