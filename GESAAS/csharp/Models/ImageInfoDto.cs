// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    // 图片素材
    public class ImageInfoDto : TeaModel {
        // 图片url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxx.alipay.com/paths/xx.png">https://xxx.alipay.com/paths/xx.png</a></para>
        /// </summary>
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 角色/用途   首帧:first_frame、尾帧:last_frame 、参考图：reference_image
        /// <summary>
        /// <b>Example:</b>
        /// <para>first_frame</para>
        /// </summary>
        [NameInMap("role")]
        [Validation(Required=false)]
        public string Role { get; set; }

    }

}
