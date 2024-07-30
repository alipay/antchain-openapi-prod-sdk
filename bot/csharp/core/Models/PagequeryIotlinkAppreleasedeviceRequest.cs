// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PagequeryIotlinkAppreleasedeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用名称
        [NameInMap("apk_name")]
        [Validation(Required=false)]
        public string ApkName { get; set; }

        // 应用版本号
        [NameInMap("apk_version")]
        [Validation(Required=false)]
        public string ApkVersion { get; set; }

        // 工单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

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
        [Validation(Required=false)]
        public string Status { get; set; }

        // 当前页
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
