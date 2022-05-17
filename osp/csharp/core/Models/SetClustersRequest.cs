// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class SetClustersRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 生效域名
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 开启/关闭
        [NameInMap("enable")]
        [Validation(Required=true)]
        public bool? Enable { get; set; }

        // 生效实例 ID，如果全部则为 ALL_INSTANCE_ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 作用 IP
        [NameInMap("service_ip")]
        [Validation(Required=true)]
        public string ServiceIp { get; set; }

        // 网络类型，如果无特殊需求 CLASSIC
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // 产品名称
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

    }

}
