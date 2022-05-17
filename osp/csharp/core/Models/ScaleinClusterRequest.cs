// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class ScaleinClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据中心
        [NameInMap("data_center")]
        [Validation(Required=true)]
        public string DataCenter { get; set; }

        // 生效 domain
        [NameInMap("domain")]
        [Validation(Required=true)]
        public string Domain { get; set; }

        // 生效实例 ID，全部生效则为 ALL_INSTANCE_ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 网络类型，无特殊情况填写 CLASSIC
        [NameInMap("network_type")]
        [Validation(Required=true)]
        public string NetworkType { get; set; }

        // 产品名称
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 缩容 IP
        [NameInMap("service_ip")]
        [Validation(Required=true)]
        public string ServiceIp { get; set; }

        // 生效端口
        [NameInMap("service_port")]
        [Validation(Required=true)]
        public long? ServicePort { get; set; }

    }

}
