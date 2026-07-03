// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 原始数据包
    public class RawData : TeaModel {
        // 链上设备id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 数据内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;a&quot;,&quot;11&quot;}</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 设备id
        /// <summary>
        /// <b>Example:</b>
        /// <para>433</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=false)]
        public string DeviceId { get; set; }

        // 上链哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>5533</para>
        /// </summary>
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=true)]
        public long? TxTime { get; set; }

        // 链上外围设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("chain_peripheral_id")]
        [Validation(Required=false)]
        public string ChainPeripheralId { get; set; }

        // 外围设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("peripheral_id")]
        [Validation(Required=false)]
        public string PeripheralId { get; set; }

    }

}
