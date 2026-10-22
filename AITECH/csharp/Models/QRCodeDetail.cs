// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 二维码详情
    public class QRCodeDetail : TeaModel {
        // 位置，Top、Left、Width、Height
        [NameInMap("location")]
        [Validation(Required=true)]
        public List<long?> Location { get; set; }

        // 二维码类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>二维码类型</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 二维码内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>二维码内容</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 置信度
        /// <summary>
        /// <b>Example:</b>
        /// <para>置信度</para>
        /// </summary>
        [NameInMap("probability")]
        [Validation(Required=true)]
        public string Probability { get; set; }

    }

}
