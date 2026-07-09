// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA 任务永久取消项
    public class IotxOtaTaskPermanentCancelItem : TeaModel {
        // OTA 执行通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
        /// <summary>
        /// <b>Example:</b>
        /// <para>TUYA_4G</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // OTA 批次 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>HudGu1xGv6n69AD3bWt8020200</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // OTA 任务 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>11117c96d904415fa1570736703d3f0c</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 固件包 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>c5755816b95e4bc9b67c49a6a03eefc8</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=true)]
        public string FirmwareId { get; set; }

        // OTA 模块名，用于日志和取消标记补充
        /// <summary>
        /// <b>Example:</b>
        /// <para>BLE</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

    }

}
