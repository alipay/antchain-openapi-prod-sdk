// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 支付芯白名单条目
    public class SnWhiteListItem : TeaModel {
        // 场景码（APPID)
        /// <summary>
        /// <b>Example:</b>
        /// <para>TEST-0001</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备 SN
        /// <summary>
        /// <b>Example:</b>
        /// <para>9912191</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

    }

}
