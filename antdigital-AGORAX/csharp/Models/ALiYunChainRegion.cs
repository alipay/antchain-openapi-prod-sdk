// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云售卖区信息
    public class ALiYunChainRegion : TeaModel {
        // region_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>region_id</para>
        /// </summary>
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // region_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>region_name</para>
        /// </summary>
        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

    }

}
