// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 上链数据结果集
    public class ChainModelResult : TeaModel {
        // 所属业务
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_LEASE</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 资产类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>LOCK_RECORD</para>
        /// </summary>
        [NameInMap("data_scene")]
        [Validation(Required=true)]
        public string DataScene { get; set; }

        // 资产id
        /// <summary>
        /// <b>Example:</b>
        /// <para>资产id</para>
        /// </summary>
        [NameInMap("asset_id")]
        [Validation(Required=true)]
        public string AssetId { get; set; }

        // 资产数据内容json
        /// <summary>
        /// <b>Example:</b>
        /// <para>{}</para>
        /// </summary>
        [NameInMap("asset_data")]
        [Validation(Required=true)]
        public string AssetData { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SDFJAG</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-02 09:10:09</para>
        /// </summary>
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public string TxTime { get; set; }

        // 业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务ID</para>
        /// </summary>
        [NameInMap("business_id")]
        [Validation(Required=true)]
        public string BusinessId { get; set; }

        // 上链id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("antchain_id")]
        [Validation(Required=true)]
        public string AntchainId { get; set; }

    }

}
