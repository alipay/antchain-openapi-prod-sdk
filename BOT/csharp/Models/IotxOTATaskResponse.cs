// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 统一物联OTA升级任务响应
    public class IotxOTATaskResponse : TeaModel {
        // 任务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>785c56486ff14f72aa53c0aff20b1760</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF10202603252F71EC54393</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // OTA批次ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>cef4fc962ee7456985d011d30d3f448f</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // 固件ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>84a1f449422946d2a4e87c1c23503f6b</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // 可信物联唯一产品标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>A7njznJkBrCCDdeIKl</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 源版本
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public string SrcVersion { get; set; }

        // 目标版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // 任务状态：CONFIRM, QUEUED, NOTIFIED, IN_PROGRESS, SUCCEEDED, FAILED, CANCELED
        /// <summary>
        /// <b>Example:</b>
        /// <para>CONFIRM</para>
        /// </summary>
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 升级进度
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("progress")]
        [Validation(Required=false)]
        public string Progress { get; set; }

        // 任务描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>任务描述</para>
        /// </summary>
        [NameInMap("task_desc")]
        [Validation(Required=false)]
        public string TaskDesc { get; set; }

        // 超时时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("timeout")]
        [Validation(Required=false)]
        public string Timeout { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783948258774</para>
        /// </summary>
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783948258774</para>
        /// </summary>
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
