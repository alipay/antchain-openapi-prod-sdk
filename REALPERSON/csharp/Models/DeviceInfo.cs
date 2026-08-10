// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 风险咨询设备信息
    public class DeviceInfo : TeaModel {
        // 设备指纹
        /// <summary>
        /// <b>Example:</b>
        /// <para>eYOIkkL8SJv0Vr6YxZqaLQ/deHNIc00rQr8zp8Upj6djHBW9oC9RJcdG</para>
        /// </summary>
        [NameInMap("device_fingerprint")]
        [Validation(Required=false)]
        public string DeviceFingerprint { get; set; }

        // 设备制造商
        /// <summary>
        /// <b>Example:</b>
        /// <para>xiaomi</para>
        /// </summary>
        [NameInMap("device_brand")]
        [Validation(Required=false)]
        public string DeviceBrand { get; set; }

        // 设备具体型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>2210132C</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 操作系统类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>android</para>
        /// </summary>
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // 操作系统版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>android 16</para>
        /// </summary>
        [NameInMap("os_version")]
        [Validation(Required=false)]
        public string OsVersion { get; set; }

        // 设备rom版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.0.3.0.WMBCNXM</para>
        /// </summary>
        [NameInMap("rom_model")]
        [Validation(Required=false)]
        public string RomModel { get; set; }

        // 设备硬盘信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>246455967744</para>
        /// </summary>
        [NameInMap("hard_disk")]
        [Validation(Required=false)]
        public string HardDisk { get; set; }

        // 内存容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>7603436</para>
        /// </summary>
        [NameInMap("memory")]
        [Validation(Required=false)]
        public string Memory { get; set; }

        // 设备网络ip
        /// <summary>
        /// <b>Example:</b>
        /// <para>127.0.0.1</para>
        /// </summary>
        [NameInMap("camera_info")]
        [Validation(Required=false)]
        public string CameraInfo { get; set; }

        // 网关入口ip
        /// <summary>
        /// <b>Example:</b>
        /// <para>127.0.0.1</para>
        /// </summary>
        [NameInMap("gateway_ip")]
        [Validation(Required=false)]
        public string GatewayIp { get; set; }

    }

}
