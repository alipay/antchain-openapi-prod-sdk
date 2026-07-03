// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // BAI提供的OCR接口返回值
    public class BaiOcrResponse : TeaModel {
        // 返回的结果体
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;backResult&quot;:{&quot;issue&quot;:&quot;XXXX&quot;,&quot;endDate&quot;:&quot;20231010&quot;,&quot;startDate&quot;:&quot;20131010&quot;}}</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=true)]
        public string Data { get; set; }

    }

}
