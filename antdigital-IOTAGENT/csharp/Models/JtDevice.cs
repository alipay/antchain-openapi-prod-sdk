// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 部标设备信息
    public class JtDevice : TeaModel {
        // 设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>STRING 123ABC</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 场景码
        /// <summary>
        /// <b>Example:</b>
        /// <para>123ABC</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 可信设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575276187649</para>
        /// </summary>
        [NameInMap("trustiot_device_id")]
        [Validation(Required=true)]
        public long? TrustiotDeviceId { get; set; }

        // 设备注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1686497064968</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 设备是否在线
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 设备型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>丰图T8</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 终端型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>型号A</para>
        /// </summary>
        [NameInMap("terminal_type")]
        [Validation(Required=false)]
        public string TerminalType { get; set; }

    }

}
