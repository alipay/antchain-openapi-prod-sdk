// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // routeCondition
    public class RouteCondition : TeaModel {
        // 渠道编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>HZZKZTKJ</para>
        /// </summary>
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

    }

}
