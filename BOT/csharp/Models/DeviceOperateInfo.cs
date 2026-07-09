// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备远程操作对象
    public class DeviceOperateInfo : TeaModel {
        // 蚂蚁链iot平台设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>213</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>sua8e</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
