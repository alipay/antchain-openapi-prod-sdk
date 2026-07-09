// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 菜鸟设备监控信息获取请求体
    public class ScfLeaseEqpInfoQueryRequest : TeaModel {
        // 设备识别号
        /// <summary>
        /// <b>Example:</b>
        /// <para>10010100101</para>
        /// </summary>
        [NameInMap("device_no")]
        [Validation(Required=true)]
        public string DeviceNo { get; set; }

        // 运营日期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2021-07-20 11:34:00</para>
        /// </summary>
        [NameInMap("operation_date")]
        [Validation(Required=true)]
        public string OperationDate { get; set; }

    }

}
