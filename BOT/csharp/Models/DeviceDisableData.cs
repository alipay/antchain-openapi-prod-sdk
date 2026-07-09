// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备不可操作标识类
    public class DeviceDisableData : TeaModel {
        // 设备sn号
        /// <summary>
        /// <b>Example:</b>
        /// <para>sn123</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 厂商
        /// <summary>
        /// <b>Example:</b>
        /// <para>telpo</para>
        /// </summary>
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

    }

}
