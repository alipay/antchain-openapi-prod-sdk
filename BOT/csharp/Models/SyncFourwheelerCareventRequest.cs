// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class SyncFourwheelerCareventRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 注册到蚂蚁IoT返回的唯一ID
        // 注：deviceDid有值时，deviceSn 和 cordeviceCorp 可以为空
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

        // 设备序列号
        // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // 设备厂商
        // 注:当deviceSn 和 cordeviceCorp有值时，deviceDid 可以为空。
        [NameInMap("device_corp")]
        [Validation(Required=false)]
        public string DeviceCorp { get; set; }

        // 车辆事件集合
        [NameInMap("items")]
        [Validation(Required=true)]
        public List<FourWheelerCarEvent> Items { get; set; }

    }

}
