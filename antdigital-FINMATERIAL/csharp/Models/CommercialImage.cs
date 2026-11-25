// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    // 图片url和index
    public class CommercialImage : TeaModel {
        // 图片url
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("pic_url")]
        [Validation(Required=false)]
        public string PicUrl { get; set; }

        // 图片index
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("pic_index")]
        [Validation(Required=false)]
        public string PicIndex { get; set; }

    }

}
