// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 客户对应设备
    public class CustomerDeviceItem : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 账号id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        //  设备品类-型号-规格  
        [NameInMap("device_type")]
        [Validation(Required=true)]
        public string DeviceType { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 服务有效期
        [NameInMap("valide_time")]
        [Validation(Required=true)]
        public string ValideTime { get; set; }

        // 设备状态
        [NameInMap("device_status")]
        [Validation(Required=true)]
        public string DeviceStatus { get; set; }

        // 服务状态
        [NameInMap("service_status")]
        [Validation(Required=true)]
        public string ServiceStatus { get; set; }

        // 屏幕状态 开屏、锁屏
        [NameInMap("screen_status")]
        [Validation(Required=false)]
        public string ScreenStatus { get; set; }

    }

}
