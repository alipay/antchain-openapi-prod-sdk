// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    // content 内 type 为 image_url﻿、audio_url、video_url﻿ 所需要的 url
    public class ContentUrl : TeaModel {
        // url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://www.test.com/123">www.test.com/123</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
