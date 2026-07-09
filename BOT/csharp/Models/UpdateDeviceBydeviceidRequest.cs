// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateDeviceBydeviceidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 设备imei号
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备数据模型Id
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 设备ICCID
        [NameInMap("device_iccid")]
        [Validation(Required=false)]
        public string DeviceIccid { get; set; }

        // 设备类型码
        [NameInMap("device_type_code")]
        [Validation(Required=false)]
        public long? DeviceTypeCode { get; set; }

        // 设备单价 单位：分
        [NameInMap("initial_price")]
        [Validation(Required=false)]
        public long? InitialPrice { get; set; }

        // 出厂时间
        [NameInMap("factory_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 投放时间
        [NameInMap("release_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

        // 设备型号
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 拓展信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 资产所有人标识（统一社会信用代码）
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 资产所有人名称
        [NameInMap("owner_name")]
        [Validation(Required=false)]
        public string OwnerName { get; set; }

    }

}
