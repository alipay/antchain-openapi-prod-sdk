// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDistributedeviceBydeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备Id
        // 
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 设备数据模型Id
        // 
        // 
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // 场景码 
        // 
        // 
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 设备注册信息
        // 
        // 
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 签名
        // 
        // 
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // sdk版本号
        // 
        // 
        [NameInMap("sdk_id")]
        [Validation(Required=true)]
        public string SdkId { get; set; }

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
        // 
        // 通用计算设备	                6000
        // 	移动设备		        6001
        // 		智能手机	        6002
        // 		工业掌机	        6003
        // 		平板电脑	        6004
        // 	云设备		        6011
        // 		云计算服务器	6012
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
        [Validation(Required=true)]
        public string DeviceName { get; set; }

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
