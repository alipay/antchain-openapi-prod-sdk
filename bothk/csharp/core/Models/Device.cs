// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTHK.Models
{
    // 设备信息
    public class Device : TeaModel {
        // 设备ID，一般是设备的出厂编码或业务上的资产ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 物模型事件ID
        [NameInMap("device_data_model_id")]
        [Validation(Required=true)]
        public string DeviceDataModelId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // imei号
        [NameInMap("device_imei")]
        [Validation(Required=true)]
        public string DeviceImei { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 设备ICCID
        [NameInMap("device_iccid")]
        [Validation(Required=false)]
        public string DeviceIccid { get; set; }

        // 设备扩展信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 设备类型编码
        [NameInMap("device_type_code")]
        [Validation(Required=true)]
        public string DeviceTypeCode { get; set; }

        // 单价
        [NameInMap("initial_price")]
        [Validation(Required=true)]
        public long? InitialPrice { get; set; }

        // 投放时间
        [NameInMap("release_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

        // 出厂时间
        [NameInMap("factory_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 可信设备ID
        [NameInMap("trustiot_device_id")]
        [Validation(Required=true)]
        public long? TrustiotDeviceId { get; set; }

        // 设备链上Id
        // 
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 上链哈希
        // 
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 上链时间
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

    }

}
