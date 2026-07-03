// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iotbasic数控设备信息（不包含出库信息）
    public class IotbasicDigitalKeyDeviceNoShipInfo : TeaModel {
        // 设备id
        /// <summary>
        /// <b>Example:</b>
        /// <para>125839</para>
        /// </summary>
        [NameInMap("devid")]
        [Validation(Required=true)]
        public string Devid { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>9726001010008SC30N96</para>
        /// </summary>
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // ccid
        /// <summary>
        /// <b>Example:</b>
        /// <para>898602B1191870002179</para>
        /// </summary>
        [NameInMap("ccid")]
        [Validation(Required=true)]
        public string Ccid { get; set; }

        // imei
        /// <summary>
        /// <b>Example:</b>
        /// <para>866311069827503</para>
        /// </summary>
        [NameInMap("imei")]
        [Validation(Required=true)]
        public string Imei { get; set; }

        // tbox固件版本号(16进制)
        /// <summary>
        /// <b>Example:</b>
        /// <para>80000109</para>
        /// </summary>
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

        // PEPS系统固件版本号(16进制)
        /// <summary>
        /// <b>Example:</b>
        /// <para>81070205</para>
        /// </summary>
        [NameInMap("peps_ver")]
        [Validation(Required=true)]
        public string PepsVer { get; set; }

        // 蓝牙固件版本号(16进制)
        /// <summary>
        /// <b>Example:</b>
        /// <para>80090204</para>
        /// </summary>
        [NameInMap("ble_ver")]
        [Validation(Required=true)]
        public string BleVer { get; set; }

    }

}
