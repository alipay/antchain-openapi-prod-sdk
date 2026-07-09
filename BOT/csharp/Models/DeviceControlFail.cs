// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备管控 失败对象
    public class DeviceControlFail : TeaModel {
        // 设备did
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 操作失败code
        /// <summary>
        /// <b>Example:</b>
        /// <para>bad_param</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 操作失败信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>参数错误</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
