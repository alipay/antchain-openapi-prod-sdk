// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ImportIotplatformMeshidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户的金融云租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 客户的公司名称
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 设备按照MeshAgent后获取的MeshId
        [NameInMap("mesh_id")]
        [Validation(Required=true)]
        public string MeshId { get; set; }

        // 客户自定义的业务上使用的设备标识，需要与租赁业务上使用的ID进行对应
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备类型字段
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
