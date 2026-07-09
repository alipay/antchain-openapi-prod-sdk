// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA 对外设备展示标识
    public class DeviceIdentity : TeaModel {
        // EKYT 全局唯一设备 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF1020260610262F9D641B9</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 可信唯一产品标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>5C7ku13XSCK1a7AKzR</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 可信唯一设备标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>device_7480821483460534272</para>
        /// </summary>
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>02:27:06:a6:10:ae</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

    }

}
