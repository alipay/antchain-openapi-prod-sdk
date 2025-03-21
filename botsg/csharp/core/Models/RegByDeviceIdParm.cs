// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    // 通过设备ID注册发行时的设备参数
    // 
    public class RegByDeviceIdParm : TeaModel {
        // 一般是业务上唯一的设备ID/资产编码
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 物模型事件ID
        [NameInMap("device_data_model_id")]
        [Validation(Required=false)]
        public string DeviceDataModelId { get; set; }

        // 固定填写RAW_DATA
        [NameInMap("device_feature")]
        [Validation(Required=false)]
        public string DeviceFeature { get; set; }

        // true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
        [NameInMap("with_exist_device_id")]
        [Validation(Required=false)]
        public bool? WithExistDeviceId { get; set; }

        // 设备类型编码，联系蚂蚁侧获取设备类型编码
        [NameInMap("device_type_code")]
        [Validation(Required=true)]
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

        // 额外信息，联系蚂蚁侧获取参数格式
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

        // 设备IMEI
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备名称/设备型号
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 生产厂商名
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

    }

}
