// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 查询设备列表结构体
    public class IotBasicDeviceQueryResponse : TeaModel {
        // 设备名称	
        // 
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备序列号
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备品类名称	
        [NameInMap("device_category_name")]
        [Validation(Required=true)]
        public string DeviceCategoryName { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // 设备状态
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 设备安装位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备注册时间
        [NameInMap("register_time")]
        [Validation(Required=true)]
        public string RegisterTime { get; set; }

        // 设备厂商
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 异常错误码
        [NameInMap("abnormal_code")]
        [Validation(Required=false)]
        public string AbnormalCode { get; set; }

        // 设备唯一身份id
        [NameInMap("device_did")]
        [Validation(Required=false)]
        public string DeviceDid { get; set; }

    }

}
