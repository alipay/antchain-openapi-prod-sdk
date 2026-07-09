// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 上链数据
    public class CollectInfo : TeaModel {
        // 资产ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>56165431</para>
        /// </summary>
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 数据资产类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>LOCK</para>
        /// </summary>
        [NameInMap("data_scene")]
        [Validation(Required=true)]
        public string DataScene { get; set; }

        // 资产数据内容，业务要上链的数据JSON格式
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;a&quot;:xx,&quot;b&quot;:xx}</para>
        /// </summary>
        [NameInMap("asset_data")]
        [Validation(Required=true)]
        public string AssetData { get; set; }

        // 上链数据采集id
        /// <summary>
        /// <b>Example:</b>
        /// <para>289hj98u</para>
        /// </summary>
        [NameInMap("collect_id")]
        [Validation(Required=true)]
        public string CollectId { get; set; }

    }

}
