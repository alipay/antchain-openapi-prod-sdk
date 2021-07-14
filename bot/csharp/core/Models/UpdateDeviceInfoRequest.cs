// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateDeviceInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链上设备Id
        [NameInMap("chain_device_id")]
        [Validation(Required=true)]
        public string ChainDeviceId { get; set; }

        // 设备imei号
        [NameInMap("device_imei")]
        [Validation(Required=false)]
        public string DeviceImei { get; set; }

        // 设备数据模型Id
        // 
        // 
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

        // 设备ICCID
        // 
        // 
        [NameInMap("device_iccid")]
        [Validation(Required=false)]
        public string DeviceIccid { get; set; }

        // deviceTypeCode 枚举 
        // 
        // 车辆: 1000
        // 四轮车: 1001
        // 纯电四轮车:1002
        // 混动四轮车 1003
        // 燃油四轮车 : 1004
        // 
        // 两轮车:1011
        // 两轮单车:1012
        // 两轮助力车:1013
        // 
        // 换电柜 :2000
        // 二轮车换电柜:2001
        // 
        // 电池 :3000
        // 磷酸铁电池:3001
        // 三元锂电池:3002
        // 
        // 回收设备:4000
        // 垃圾分类回收:4001
        // 
        // 洗车机 :5000
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
        [Validation(Required=false)]
        public string DeviceName { get; set; }

    }

}
