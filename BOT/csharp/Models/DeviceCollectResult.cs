// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 数据上链成功结果数据
    public class DeviceCollectResult : TeaModel {
        // 上链数据采集ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>j8o12u38</para>
        /// </summary>
        [NameInMap("collect_id")]
        [Validation(Required=true)]
        public string CollectId { get; set; }

        // 上链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>auit98</para>
        /// </summary>
        [NameInMap("antchain_id")]
        [Validation(Required=false)]
        public string AntchainId { get; set; }

    }

}
