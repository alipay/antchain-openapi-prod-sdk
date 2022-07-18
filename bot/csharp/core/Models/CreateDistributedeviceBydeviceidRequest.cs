// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDistributedeviceBydeviceidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 厂商名
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 数据模型Id
        [NameInMap("device_data_model_id")]
        [Validation(Required=true)]
        public string DeviceDataModelId { get; set; }

        // 设备Id
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 设备imei号
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
        [NameInMap("device_feature")]
        [Validation(Required=false)]
        public string DeviceFeature { get; set; }

        // 当用已发行设备发行时返回已发行id或返回错误
        [NameInMap("with_exist_device_id")]
        [Validation(Required=false)]
        public bool? WithExistDeviceId { get; set; }

        // 设备类型编码
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

        // 额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 资产所有人标识（统一社会信用代码）
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // 资产所有人名称
        [NameInMap("owner_name")]
        [Validation(Required=true)]
        public string OwnerName { get; set; }

    }

}
