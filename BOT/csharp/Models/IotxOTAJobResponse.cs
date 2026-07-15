// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 统一物联OTA任务查询响应
    public class IotxOTAJobResponse : TeaModel {
        // 批次id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2c692f39bbaf43b08590d6daede5895f</para>
        /// </summary>
        [NameInMap("job_id")]
        [Validation(Required=false)]
        public string JobId { get; set; }

        // 任务状态：PLANNED：计划中；IN_PROGRESS：执行中；COMPLETED：已完成；CANCELED：已取消；
        /// <summary>
        /// <b>Example:</b>
        /// <para>PLANNED</para>
        /// </summary>
        [NameInMap("job_status")]
        [Validation(Required=false)]
        public string JobStatus { get; set; }

        // 任务类型：VERIFY：升级包验证批次。 STATIC_UPGRADE：批量升级批次。
        /// <summary>
        /// <b>Example:</b>
        /// <para>STATIC_UPGRADE</para>
        /// </summary>
        [NameInMap("job_type")]
        [Validation(Required=false)]
        public string JobType { get; set; }

        // 产品唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>FuPsO4bwFbyLSrQIiL</para>
        /// </summary>
        [NameInMap("trust_oroduct_key")]
        [Validation(Required=false)]
        public string TrustOroductKey { get; set; }

        // OTA固件包ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>563785f86a6144e2838b3bd1f077f652</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // 升级目标版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // 下载协议
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("download_protocol")]
        [Validation(Required=false)]
        public string DownloadProtocol { get; set; }

        // 升级批次描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>升级批次描述</para>
        /// </summary>
        [NameInMap("job_desc")]
        [Validation(Required=false)]
        public string JobDesc { get; set; }

        // 升级策略：VERIFY、STATIC
        /// <summary>
        /// <b>Example:</b>
        /// <para>STATIC</para>
        /// </summary>
        [NameInMap("selection_type")]
        [Validation(Required=false)]
        public string SelectionType { get; set; }

        // 升级范围 ALL：全量升级、SPECIFIC：定向升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALL</para>
        /// </summary>
        [NameInMap("target_selection")]
        [Validation(Required=false)]
        public string TargetSelection { get; set; }

        // 待升级版本号列表
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public List<string> SrcVersion { get; set; }

        // 升级失败后自动重试间隔：0：立即重试、10：10分钟后重试、30：30分钟后重试、60：60分钟（即1小时）后重试、1440：1,440分钟（即24小时）后重试。不传入此参数，则表示不重试。
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("retry_interval")]
        [Validation(Required=false)]
        public long? RetryInterval { get; set; }

        // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

        // 升级超时时间：0-1440
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("timeout_in_minutes")]
        [Validation(Required=false)]
        public long? TimeoutInMinutes { get; set; }

        // 定向升级的设备名称列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("target_device_name")]
        [Validation(Required=false)]
        public List<string> TargetDeviceName { get; set; }

        // 是否需App确认升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783948258716</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783948258716</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 批次实际执行通道：TUYA_4G、EKYT_BLE
        /// <summary>
        /// <b>Example:</b>
        /// <para>TUYA_4G</para>
        /// </summary>
        [NameInMap("channel")]
        [Validation(Required=false)]
        public string Channel { get; set; }

        // 同设备同模块覆盖策略
        /// <summary>
        /// <b>Example:</b>
        /// <para>OVERRIDE</para>
        /// </summary>
        [NameInMap("override_mode")]
        [Validation(Required=false)]
        public string OverrideMode { get; set; }

        // 多模块并发策略
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALLOW</para>
        /// </summary>
        [NameInMap("multi_module_mode")]
        [Validation(Required=false)]
        public string MultiModuleMode { get; set; }

        // 批次升级方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>REMIND</para>
        /// </summary>
        [NameInMap("upgrade_mode")]
        [Validation(Required=false)]
        public string UpgradeMode { get; set; }

    }

}
