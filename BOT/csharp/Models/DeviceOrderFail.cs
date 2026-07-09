// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 订单同步失败结果
    public class DeviceOrderFail : TeaModel {
        // 订单id
        /// <summary>
        /// <b>Example:</b>
        /// <para>90</para>
        /// </summary>
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 设备did
        /// <summary>
        /// <b>Example:</b>
        /// <para>asdfg</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 返回code
        /// <summary>
        /// <b>Example:</b>
        /// <para>Fail</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 失败
        /// <summary>
        /// <b>Example:</b>
        /// <para>返回信息</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
