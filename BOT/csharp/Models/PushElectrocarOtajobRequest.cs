// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PushElectrocarOtajobRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 任务类型：STATIC_UPGRADE-静态升级批次、VERIFY-升级验证任务
        [NameInMap("job_type")]
        [Validation(Required=true)]
        public string JobType { get; set; }

        // 可信物联产品唯一标识
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // OTA固件包ID
        [NameInMap("firmware_id")]
        [Validation(Required=true)]
        public string FirmwareId { get; set; }

        // 升级范围：ALL-全量升级、SPECIFIC-定向升级
        [NameInMap("target_selection")]
        [Validation(Required=true)]
        public string TargetSelection { get; set; }

        // 待升级版本号列表
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public List<string> SrcVersion { get; set; }

        // 升级失败后自动重试间隔
        //      * 0：立即重试、
        //      * 10：10分钟后重试、
        //      * 30：30分钟后重试、
        //      * 60：60分钟（即1小时）后重试、
        //      * 1440：1,440分钟（即24小时）后重试
        //      * 不传入此参数，则表示不重试。
        [NameInMap("retry_interval")]
        [Validation(Required=false)]
        public long? RetryInterval { get; set; }

        // 自动重试次数：1：1次、2：2次、5：5次。如果传入RetryInterval参数，则需传入该参数。
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

        // 升级超时时间
        [NameInMap("timeout_in_minutes")]
        [Validation(Required=false)]
        public long? TimeoutInMinutes { get; set; }

        // 定向升级的deviceName列表（和targetTrustDeviceIds、dnListFileUrl三选一）
        [NameInMap("target_trust_device_ids")]
        [Validation(Required=false)]
        public List<string> TargetTrustDeviceIds { get; set; }

        // 设备列表文件URL，与targetTrustDeviceIds、targetDeviceNames三选一，仅当targetSelection=SPECIFIC时生效。用于大批量设备定向升级场景，文件URL通过GenerateDeviceNameListURL接口获取
        [NameInMap("dn_list_file_url")]
        [Validation(Required=false)]
        public string DnListFileUrl { get; set; }

        // 定向升级的deviceName列表（和targetTrustDeviceIds、dnListFileUrl三选一）
        [NameInMap("target_device_names")]
        [Validation(Required=false)]
        public List<string> TargetDeviceNames { get; set; }

        // 是否需要 APP 确认升级：TUYA_4G 通道：true 表示批次创建后等待 APP/端侧确认，再触发 Hub 下发；false 表示不需要 APP 确认。若 upgradeMode=SILENT，该字段固定为 false，调用方无需传入。
        // BLE 通道：服务端默认按 APP 确认拉取升级材料处理。
        [NameInMap("need_confirm")]
        [Validation(Required=false)]
        public bool? NeedConfirm { get; set; }

        // 升级文案
        [NameInMap("upgrade_copy")]
        [Validation(Required=false)]
        public string UpgradeCopy { get; set; }

        // 本次批次实际执行通道：TUYA_4G，涂鸦 4G/MQTT 通道；EKYT_BLE：数字钥匙 BLE 通道；
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 同设备同模块任务覆盖策略：OVERRIDE-覆盖旧任务，创建新任务前取消同设备同模块可取消的旧任务；REJECT-存在可取消旧任务时拒绝创建；COEXIST-允许并存的预留策略，本期同模块 APP 确认型升级不推荐使用。不传时默认 OVERRIDE。
        [NameInMap("override_mode")]
        [Validation(Required=false)]
        public string OverrideMode { get; set; }

        // 多模块并发策略：ALLOW-允许同一设备多个模块同时存在未完成升级任务；DENY-同一设备已有其他模块未完成升级任务时拒绝创建。
        [NameInMap("multi_module_mode")]
        [Validation(Required=false)]
        public string MultiModuleMode { get; set; }

        // 批次升级方式：CHECK-检测升级；REMIND-提醒升级；FORCE-强制升级；SILENT-静默升级；
        [NameInMap("upgrade_mode")]
        [Validation(Required=false)]
        public string UpgradeMode { get; set; }

        // 4G Hub 是否主动推送：TUYA_4G 通道：true 表示批次创建后由 Hub 主动向设备推送；false 表示不主动推送，通常需要配合 needConfirm=true 由 APP 确认后触发。若 upgradeMode=SILENT，该字段固定为 true，调用方无需传入。BLE 通道：不支持服务端主动推送；传 true 会被拒绝。
        [NameInMap("need_push")]
        [Validation(Required=false)]
        public bool? NeedPush { get; set; }

    }

}
