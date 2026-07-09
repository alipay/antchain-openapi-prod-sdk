// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备概览统计信息
    public class DeviceOverViewResponse : TeaModel {
        // 设备品类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test_category</para>
        /// </summary>
        [NameInMap("device_category_name")]
        [Validation(Required=true)]
        public string DeviceCategoryName { get; set; }

        // 设备总数
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000</para>
        /// </summary>
        [NameInMap("device_total")]
        [Validation(Required=true)]
        public long? DeviceTotal { get; set; }

    }

}
