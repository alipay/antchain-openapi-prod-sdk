// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA 任务永久取消结果项
    public class IotxOtaTaskPermanentCancelResult : TeaModel {
        // 通道
        /// <summary>
        /// <b>Example:</b>
        /// <para>EKYT_BLE</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // OTA批次id
        /// <summary>
        /// <b>Example:</b>
        /// <para>7d715afe5a374179892078a9a11f16ab</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // OTA任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>11117c96d904415fa1570736703d3f0c</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // OTA固件包ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>25c3f69752244678a84f663e4d48a56a</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=true)]
        public string FirmwareId { get; set; }

        // 是否成功
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 失败错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>SYSTEM_ERROR</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>错误信息</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

    }

}
