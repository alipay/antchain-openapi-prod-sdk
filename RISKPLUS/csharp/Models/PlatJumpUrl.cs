// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回跳平台方地址
    public class PlatJumpUrl : TeaModel {
        // 确认跳转URL，确认后回跳平台地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://platform.com/confirm/ca">http://platform.com/confirm/ca</a></para>
        /// </summary>
        [NameInMap("confirm_url")]
        [Validation(Required=true)]
        public string ConfirmUrl { get; set; }

        // 取消跳转URL，取消后回跳平台地址，失效也是这个链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://platform.com/confirm/ca">http://platform.com/confirm/ca</a></para>
        /// </summary>
        [NameInMap("cancel_url")]
        [Validation(Required=true)]
        public string CancelUrl { get; set; }

    }

}
