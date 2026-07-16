// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 签署链接结果
    public class SignUrlResult : TeaModel {
        // 签署（长）链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx.com">https://xxxx.com</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 签署短链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx.com">https://xxxx.com</a></para>
        /// </summary>
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public string ShortUrl { get; set; }

        // 签署链接提示信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>签署链接创建成功</para>
        /// </summary>
        [NameInMap("sign_msg")]
        [Validation(Required=false)]
        public string SignMsg { get; set; }

    }

}
