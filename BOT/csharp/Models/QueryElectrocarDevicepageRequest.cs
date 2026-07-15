// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarDevicepageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 可信物联产品唯一标识
        [NameInMap("trust_product_key")]
        [Validation(Required=true)]
        public string TrustProductKey { get; set; }

        // 设备名称/设备备注名称/可信物联唯一设备标识
        [NameInMap("device_query_str")]
        [Validation(Required=false)]
        public string DeviceQueryStr { get; set; }

        // 设备状态过滤: ONLINE/OFFLINE/UNACTIVE
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // OTA模块名称
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // OTA模块版本号（可选，配合moduleName使用）
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

    }

}
