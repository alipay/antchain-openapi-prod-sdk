// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 实例续费
    public class Renewal : TeaModel {
        // 实例当前配置
        [NameInMap("components")]
        [Validation(Required=false)]
        public List<Component> Components { get; set; }

        // 续费订单截止时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</para>
        /// </summary>
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 实例Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>A0CSCMAYIBANKPWBATNA4F</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // 续费订单开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>格式为ISO 8601格式，精确到秒，带时区信息，格式为YYYY-MM-DDThh:mm:ssZ</para>
        /// </summary>
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

    }

}
