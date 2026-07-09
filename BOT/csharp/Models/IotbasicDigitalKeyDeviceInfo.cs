// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic数控设备信息
    public class IotbasicDigitalKeyDeviceInfo : TeaModel {
        // 设备id
        /// <summary>
        /// <b>Example:</b>
        /// <para>125839</para>
        /// </summary>
        [NameInMap("devid")]
        [Validation(Required=true)]
        public string Devid { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>867186033894659</para>
        /// </summary>
        [NameInMap("dev_name")]
        [Validation(Required=true)]
        public string DevName { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>9726001010008SC30N96</para>
        /// </summary>
        [NameInMap("sn")]
        [Validation(Required=true)]
        public string Sn { get; set; }

        // Ccid
        /// <summary>
        /// <b>Example:</b>
        /// <para>898602B1191870002179</para>
        /// </summary>
        [NameInMap("ccid")]
        [Validation(Required=true)]
        public string Ccid { get; set; }

        // Msisdn
        /// <summary>
        /// <b>Example:</b>
        /// <para>1064818313682</para>
        /// </summary>
        [NameInMap("msisdn")]
        [Validation(Required=true)]
        public string Msisdn { get; set; }

        // tbox固件版本号(16进制)
        /// <summary>
        /// <b>Example:</b>
        /// <para>80000109</para>
        /// </summary>
        [NameInMap("ver")]
        [Validation(Required=true)]
        public string Ver { get; set; }

    }

}
