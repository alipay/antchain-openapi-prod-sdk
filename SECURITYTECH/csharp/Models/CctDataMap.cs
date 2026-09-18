// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 内容安全请求体datamap
    public class CctDataMap : TeaModel {
        // text
        /// <summary>
        /// <b>Example:</b>
        /// <para>text</para>
        /// </summary>
        [NameInMap("text")]
        [Validation(Required=false)]
        public List<string> Text { get; set; }

        // PICTURE
        /// <summary>
        /// <b>Example:</b>
        /// <para>PICTURE</para>
        /// </summary>
        [NameInMap("picture")]
        [Validation(Required=false)]
        public List<string> Picture { get; set; }

    }

}
