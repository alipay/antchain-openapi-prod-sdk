// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 容器基线实例信息
    public class ContainerInstance : TeaModel {
        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 容器名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 容器挂载的阿里云anytunnel的资源id
        [NameInMap("anytunnel_resource_id")]
        [Validation(Required=false)]
        public string AnytunnelResourceId { get; set; }

        // 容器对应的index
        [NameInMap("index")]
        [Validation(Required=true)]
        public string Index { get; set; }

        // 容器ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // 集群节点ip
        [NameInMap("host_ip")]
        [Validation(Required=false)]
        public string HostIp { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 应用镜像名
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

        // cpu
        [NameInMap("cpu")]
        [Validation(Required=true)]
        public string Cpu { get; set; }

        // 内存大小
        [NameInMap("memory")]
        [Validation(Required=true)]
        public string Memory { get; set; }

        // 容器挂载的阿里云anytunnelIp
        [NameInMap("anytunnel_service_ip")]
        [Validation(Required=false)]
        public string AnytunnelServiceIp { get; set; }

        // 部署单元实例id
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitInstanceIdentity { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

    }

}
