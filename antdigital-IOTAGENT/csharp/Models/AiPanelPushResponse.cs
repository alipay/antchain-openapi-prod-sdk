// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // AI仪表下发请求响应
    public class AiPanelPushResponse : TeaModel {
        // 是否已成功进入设备下发链路
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("accepted")]
        [Validation(Required=false)]
        public bool? Accepted { get; set; }

        // 任务标识，与请求消息标识一致
        /// <summary>
        /// <b>Example:</b>
        /// <para>ac1002c017876357242061390225</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
