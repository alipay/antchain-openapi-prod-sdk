// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic设备升级列表信息
    public class IotbasicReleaseDeviceInfo : TeaModel {
        // 应用名称
        [NameInMap("apk_name")]
        [Validation(Required=true)]
        public string ApkName { get; set; }

        // 应用版本号
        [NameInMap("apk_version")]
        [Validation(Required=true)]
        public string ApkVersion { get; set; }

        // 工单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 工单名称
        [NameInMap("order_name")]
        [Validation(Required=true)]
        public string OrderName { get; set; }

        // 任务id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 设备升级任务唯一id
        [NameInMap("order_detail_id")]
        [Validation(Required=true)]
        public string OrderDetailId { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备id
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 设备升级状态
        // 待确认：CONFIRM
        // 待推送：QUEUED
        // 已推送：NOTIFIED
        // 升级中：IN_PROGRESS
        // 升级成功：SUCCEEDED
        // 升级失败：FAILED
        // 已取消：CANCELED
        // 升级超时：TIMEOUT
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发布时间
        [NameInMap("release_time")]
        [Validation(Required=false)]
        public string ReleaseTime { get; set; }

        // 升级完成时间
        [NameInMap("upgrade_time")]
        [Validation(Required=false)]
        public string UpgradeTime { get; set; }

    }

}
