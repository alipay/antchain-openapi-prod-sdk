// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class AddCertificateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构Id
        [NameInMap("organization_id")]
        [Validation(Required=false)]
        public string OrganizationId { get; set; }

        // 证书内容
        [NameInMap("certificate")]
        [Validation(Required=true)]
        public string Certificate { get; set; }

        // 设备ID
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 主机设备ID
        [NameInMap("host_device_id")]
        [Validation(Required=true)]
        public string HostDeviceId { get; set; }

        // 场景码
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

    }

}
