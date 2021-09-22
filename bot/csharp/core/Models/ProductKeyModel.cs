// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // ProductKey信息
    public class ProductKeyModel : TeaModel {
        // 主键id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 设备端ProductKey
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 租户Id 
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 数据模型id 
        [NameInMap("data_model_id")]
        [Validation(Required=true)]
        public string DataModelId { get; set; }

        // sdk前缀
        [NameInMap("sdk_version_prefix")]
        [Validation(Required=true)]
        public string SdkVersionPrefix { get; set; }

        // 制造商
        [NameInMap("manufacturer")]
        [Validation(Required=false)]
        public string Manufacturer { get; set; }

        // 顾客
        [NameInMap("customer")]
        [Validation(Required=false)]
        public string Customer { get; set; }

    }

}
