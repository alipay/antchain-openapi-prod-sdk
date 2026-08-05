// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 管理面连续推送规则响应
    public class ContinuousOtaRuleResponse : TeaModel {
        // 规则 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>649425581309837312</para>
        /// </summary>
        [NameInMap("rule_id")]
        [Validation(Required=false)]
        public string RuleId { get; set; }

        // 规则在请求列表中的位置；非请求校验响应时为空
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("request_index")]
        [Validation(Required=false)]
        public long? RequestIndex { get; set; }

        // 规则乐观锁版本号，以字符串返回
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lock_version")]
        [Validation(Required=false)]
        public string LockVersion { get; set; }

        // 触发连续推送规则的设备上报模块名
        /// <summary>
        /// <b>Example:</b>
        /// <para>BLE</para>
        /// </summary>
        [NameInMap("trigger_module_name")]
        [Validation(Required=false)]
        public string TriggerModuleName { get; set; }

        // 触发版本匹配条件
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("version_predicate")]
        [Validation(Required=false)]
        public ContinuousOtaVersionPredicate VersionPredicate { get; set; }

        // 服务端规范化版本谓词后生成的摘要
        /// <summary>
        /// <b>Example:</b>
        /// <para>ee76b371d0352fc0fbb17a19fdf584b2352eb8948583a620ce8ba3b238956c3c</para>
        /// </summary>
        [NameInMap("predicate_hash")]
        [Validation(Required=false)]
        public string PredicateHash { get; set; }

        // 规则命中后需要升级的目标固件 ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>84a1f449422946d2a4e87c1c23503f6b</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // 目标固件模块名
        /// <summary>
        /// <b>Example:</b>
        /// <para>ble</para>
        /// </summary>
        [NameInMap("target_module_name")]
        [Validation(Required=false)]
        public string TargetModuleName { get; set; }

        // 目标固件版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("target_version_no")]
        [Validation(Required=false)]
        public string TargetVersionNo { get; set; }

        // 目标设备选择类型，管理面固定为 SPECIFIC
        /// <summary>
        /// <b>Example:</b>
        /// <para>SPECIFIC</para>
        /// </summary>
        [NameInMap("target_selection")]
        [Validation(Required=false)]
        public string TargetSelection { get; set; }

        // 规则执行通道
        /// <summary>
        /// <b>Example:</b>
        /// <para>TUYA_4G</para>
        /// </summary>
        [NameInMap("execution_channel")]
        [Validation(Required=false)]
        public string ExecutionChannel { get; set; }

        // OTA 升级模式
        /// <summary>
        /// <b>Example:</b>
        /// <para>SILENT</para>
        /// </summary>
        [NameInMap("upgrade_mode")]
        [Validation(Required=false)]
        public string UpgradeMode { get; set; }

        // 是否主动推送升级
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("need_push")]
        [Validation(Required=false)]
        public bool? NeedPush { get; set; }

        // 是否需要设备确认
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

        // 失败重试次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

        // 重试间隔，单位为分钟
        /// <summary>
        /// <b>Example:</b>
        /// <para>5</para>
        /// </summary>
        [NameInMap("retry_interval")]
        [Validation(Required=false)]
        public long? RetryInterval { get; set; }

        // 单次升级超时时间，单位为分钟
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("timeout_in_minutes")]
        [Validation(Required=false)]
        public long? TimeoutInMinutes { get; set; }

        // 规则命中后的延迟执行时间，单位为秒
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("delay_in_seconds")]
        [Validation(Required=false)]
        public long? DelayInSeconds { get; set; }

        // 规则是否启用
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // 规则设备范围
        /// <summary>
        /// <b>Example:</b>
        /// <para>ALL_DEVICES</para>
        /// </summary>
        [NameInMap("device_scope_type")]
        [Validation(Required=false)]
        public string DeviceScopeType { get; set; }

        // 规则生命周期状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>READY</para>
        /// </summary>
        [NameInMap("lifecycle_status")]
        [Validation(Required=false)]
        public string LifecycleStatus { get; set; }

        // 规则创建来源：MANUAL_CONFIG 或 MODULE_VERSION_JOB。
        /// <summary>
        /// <b>Example:</b>
        /// <para>MANUAL_CONFIG</para>
        /// </summary>
        [NameInMap("creation_source")]
        [Validation(Required=false)]
        public string CreationSource { get; set; }

        // 规则创建来源说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>由连续推送规则配置接口创建</para>
        /// </summary>
        [NameInMap("creation_source_description")]
        [Validation(Required=false)]
        public string CreationSourceDescription { get; set; }

        // 自动建批接口的幂等请求号
        /// <summary>
        /// <b>Example:</b>
        /// <para>自动建批接口的幂等请求号</para>
        /// </summary>
        [NameInMap("create_request_id")]
        [Validation(Required=false)]
        public string CreateRequestId { get; set; }

    }

}
