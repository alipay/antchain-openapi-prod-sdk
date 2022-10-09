// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class BatchcreateIotbasicDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备厂商
        [NameInMap("corp_name")]
        [Validation(Required=true)]
        public string CorpName { get; set; }

        // 设备品类编码
        [NameInMap("device_category_code")]
        [Validation(Required=true)]
        public string DeviceCategoryCode { get; set; }

        // 业务场景码
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 所属租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 注册设备集合
        [NameInMap("device_list")]
        [Validation(Required=true)]
        public List<IotBasicDeviceRegisterInfo> DeviceList { get; set; }

    }

}
