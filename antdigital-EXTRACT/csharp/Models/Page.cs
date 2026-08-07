// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.EXTRACT.Models
{
    // Page
    public class Page : TeaModel {
        // 边界框坐标[x1,y1,x2,y2]
        /// <summary>
        /// <b>Example:</b>
        /// <para>[0,0,999,999]</para>
        /// </summary>
        [NameInMap("bbox")]
        [Validation(Required=false)]
        public List<long?> Bbox { get; set; }

        // 图片文件名
        /// <summary>
        /// <b>Example:</b>
        /// <para>检验报告.jpg</para>
        /// </summary>
        [NameInMap("image")]
        [Validation(Required=false)]
        public string Image { get; set; }

        // 页面索引
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

    }

}
