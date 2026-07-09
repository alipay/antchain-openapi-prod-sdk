// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA 未完成升级任务展示对象
    public class UnfinishedUpgradeTaskVO : TeaModel {
        // OTA 任务所属通道：TUYA_4G / EKYT_BLE / IOT_AGENT_BLE
        /// <summary>
        /// <b>Example:</b>
        /// <para>TUYA_4G</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // OTA 任务 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>fc5068e629284b3a8c4424b109583705</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // 任务对应的设备展示标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("device_identity")]
        [Validation(Required=false)]
        public DeviceIdentity DeviceIdentity { get; set; }

        // 任务对应的 OTA 模块定位信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("module_locator")]
        [Validation(Required=false)]
        public ModuleLocator ModuleLocator { get; set; }

        // 任务源版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public string SrcVersion { get; set; }

        // 任务目标版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // 设备当前模块版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("cur_version")]
        [Validation(Required=false)]
        public string CurVersion { get; set; }

        // 固件包 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>25c3f69752244678a84f663e4d48a56a</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // OTA 批次 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>3a1fd361e7984e15afca3450d9b0df8b</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // 升级提示文案
        /// <summary>
        /// <b>Example:</b>
        /// <para>升级提示文案</para>
        /// </summary>
        [NameInMap("upgrade_desc")]
        [Validation(Required=false)]
        public string UpgradeDesc { get; set; }

        // 升级模式：CHECK -检测升级 / REMIND - 提醒升级/ FORCE - 强制升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>CHECK</para>
        /// </summary>
        [NameInMap("upgrade_mode")]
        [Validation(Required=false)]
        public string UpgradeMode { get; set; }

        // 任务状态：CONFIRM / QUEUED / NOTIFIED / IN_PROGRESS / FAILED / CANCELED 等
        /// <summary>
        /// <b>Example:</b>
        /// <para>CONFIRM</para>
        /// </summary>
        [NameInMap("task_status")]
        [Validation(Required=false)]
        public string TaskStatus { get; set; }

        // 任务创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1782973123964</para>
        /// </summary>
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // 任务最后更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1782973123964</para>
        /// </summary>
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

    }

}
