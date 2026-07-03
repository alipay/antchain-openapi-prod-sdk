// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 授权返回实体
    public class GrantDeviceInfo : TeaModel {
        // 授权ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>00000001</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 授权ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>m6XFxJeTpllXZQ3BEZCyhovWZjoiCqqW</para>
        /// </summary>
        [NameInMap("auth_record_id")]
        [Validation(Required=true)]
        public string AuthRecordId { get; set; }

    }

}
