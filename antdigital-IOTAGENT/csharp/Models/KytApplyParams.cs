// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // kyt 凭证申请参数
    public class KytApplyParams : TeaModel {
        // 设备类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>tw_car</para>
        /// </summary>
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 凭证类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>mcu_dk_cred</para>
        /// </summary>
        [NameInMap("cred_type")]
        [Validation(Required=false)]
        public string CredType { get; set; }

        // 品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>JL</para>
        /// </summary>
        [NameInMap("brand_id")]
        [Validation(Required=true)]
        public string BrandId { get; set; }

        // 凭证内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>[]</para>
        /// </summary>
        [NameInMap("generate_code")]
        [Validation(Required=false)]
        public string GenerateCode { get; set; }

        // 协议类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>ble</para>
        /// </summary>
        [NameInMap("protocol_type")]
        [Validation(Required=true)]
        public string ProtocolType { get; set; }

        // 无感参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("key_less")]
        [Validation(Required=true)]
        public string KeyLess { get; set; }

        // mac
        /// <summary>
        /// <b>Example:</b>
        /// <para>F8:5F:56:F6:05:BC</para>
        /// </summary>
        [NameInMap("mac")]
        [Validation(Required=true)]
        public string Mac { get; set; }

        // ble_name
        /// <summary>
        /// <b>Example:</b>
        /// <para>ble_</para>
        /// </summary>
        [NameInMap("ble_name")]
        [Validation(Required=true)]
        public string BleName { get; set; }

        // 通道
        /// <summary>
        /// <b>Example:</b>
        /// <para>DT</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

    }

}
