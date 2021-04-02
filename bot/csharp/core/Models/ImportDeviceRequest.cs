// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备Id
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 数据模型id
        [NameInMap("device_data_model_id")]
        [Validation(Required=true)]
        public string DeviceDataModelId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备imei
        [NameInMap("device_imei")]
        [Validation(Required=true)]
        public string DeviceImei { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 枚举值： SIGNED_DATA 、RAW_DATA ，默认填写 SIGNED_DATA（需要验签的设备）
        [NameInMap("device_feature")]
        [Validation(Required=true)]
        public string DeviceFeature { get; set; }

        // 设备类型编码，必填，对应资管平台中的设备类型 
        // 
        // 枚举值：
        // 
        // 车辆 1000 
        // 车辆 四轮车 1001 
        // 车辆 四轮车 纯电四轮车 1002 
        // 车辆 四轮车 混动四轮车 1003 
        // 车辆 四轮车 燃油四轮车 1004 
        // 车辆 两轮车 1011 
        // 车辆 两轮车 两轮单车 1012 
        // 车辆 两轮车 两轮助力车 1013 
        // 
        // 换电柜 2000 
        // 换电柜 二轮车换电柜 2001 
        // 
        // 电池 3000 
        // 电池 磷酸铁电池 3001 
        // 电池 三元锂电池 3002 
        // 
        // 回收设备 4000 
        // 
        // 垃圾分类回收 4001 
        // 
        // 洗车机 5000
        [NameInMap("device_type_code")]
        [Validation(Required=true)]
        public long? DeviceTypeCode { get; set; }

        // 设备单价 单位：分
        [NameInMap("initial_price")]
        [Validation(Required=true)]
        public long? InitialPrice { get; set; }

        // 出厂时间
        [NameInMap("factory_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string FactoryTime { get; set; }

        // 投放时间
        [NameInMap("release_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ReleaseTime { get; set; }

    }

}
