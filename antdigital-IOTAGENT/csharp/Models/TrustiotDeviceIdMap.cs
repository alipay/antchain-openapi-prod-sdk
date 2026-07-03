// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 可信设备ID及其关联的设备ID
    public class TrustiotDeviceIdMap : TeaModel {
        // 可信设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006413673662394390</para>
        /// </summary>
        [NameInMap("trustiot_device_id")]
        [Validation(Required=true)]
        public long? TrustiotDeviceId { get; set; }

        // 设备ID	
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 设备注册的上链哈希
        /// <summary>
        /// <b>Example:</b>
        /// <para>ba9de337190b017ea6255bffa226ea5ed91cbb03babb42e5a35d652ca30cdce1</para>
        /// </summary>
        [NameInMap("chain_device_id")]
        [Validation(Required=true)]
        public string ChainDeviceId { get; set; }

    }

}
