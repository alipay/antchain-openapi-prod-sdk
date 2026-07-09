// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备定位信息
    public class DeviceLocator : TeaModel {
        // 设备唯一标识定位方式：TUID / TRUST_DEVICE_ID / TRUST_PRODUCT_DEVICE
        /// <summary>
        /// <b>Example:</b>
        /// <para>TUID</para>
        /// </summary>
        [NameInMap("locator_type")]
        [Validation(Required=true)]
        public string LocatorType { get; set; }

        // EKYT 全局唯一设备 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF1020260610262F9D641B9</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 可信物联设备唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>device_7470008018051342336</para>
        /// </summary>
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // 可信物联产品唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>5C7ku13XSCK1a7AKzR</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>863091061327685</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

    }

}
