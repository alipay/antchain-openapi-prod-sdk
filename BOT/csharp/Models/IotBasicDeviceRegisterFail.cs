// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备注册失败对象
    public class IotBasicDeviceRegisterFail : TeaModel {
        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088xx</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 错误编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>code</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 错误描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>message</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
