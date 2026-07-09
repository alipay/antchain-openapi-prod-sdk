// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryIotbasicDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 当前登录用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 设备SN
        [NameInMap("device_sn")]
        [Validation(Required=false)]
        public string DeviceSn { get; set; }

        // 设备品类code
        [NameInMap("category_code")]
        [Validation(Required=false)]
        public string CategoryCode { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 厂商名称
        [NameInMap("corp_name")]
        [Validation(Required=false)]
        public string CorpName { get; set; }

        // 安装位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备状态，在线/离线、故障
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 指定显示返回结果中的第几页。
        // 
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 指定返回结果中每页显示的产品数量，最大值是200。
        // 
        // 
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
