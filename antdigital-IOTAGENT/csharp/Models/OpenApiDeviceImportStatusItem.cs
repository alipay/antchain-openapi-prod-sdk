// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 设备注册状态项（I-0133）
    public class OpenApiDeviceImportStatusItem : TeaModel {
        // MAC输入
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // 现有设备记录业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // NOT_FOUND是查询未找到记录；其他三态原样映射AiDeviceStatusEnum；枚举:NOT_FOUND,REGISTERING,REGISTERED,REGISTER_FAILED
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 设备绑定的智能体ID；可用于对话等后续操作；NOT_FOUND时为null
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("agent_id")]
        [Validation(Required=true)]
        public string AgentId { get; set; }

        // 设备别名（若已设置）；NOT_FOUND时为null
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("alias")]
        [Validation(Required=true)]
        public string Alias { get; set; }

    }

}
