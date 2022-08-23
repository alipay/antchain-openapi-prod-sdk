// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 云游站点基本信息
    public class EnvInfo : TeaModel {
        // 站点名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 站点展示名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // IAM租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 站点类型：DEV、PROD、SIT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 站点环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 云环境站点类型
        [NameInMap("cloud_stack")]
        [Validation(Required=true)]
        public string CloudStack { get; set; }

        // 客户名
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 站点客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 站点资源前缀，云环境名称
        [NameInMap("cloud_name")]
        [Validation(Required=true)]
        public string CloudName { get; set; }

        // global云环境id
        [NameInMap("cloud_id")]
        [Validation(Required=true)]
        public string CloudId { get; set; }

        // global云环境中文名称
        [NameInMap("real_cloud_name")]
        [Validation(Required=true)]
        public string RealCloudName { get; set; }

        // rdb资源池名称
        [NameInMap("rdb_pool_name")]
        [Validation(Required=true)]
        public string RdbPoolName { get; set; }

        // 容器资源池ID
        [NameInMap("container_pool_name")]
        [Validation(Required=true)]
        public string ContainerPoolName { get; set; }

        // lb资源池名称
        [NameInMap("lb_pool_name")]
        [Validation(Required=true)]
        public string LbPoolName { get; set; }

        // 对象资源池名称
        [NameInMap("storage_pool_name")]
        [Validation(Required=false)]
        public string StoragePoolName { get; set; }

        // ecs资源池名称
        [NameInMap("ecs_pool_name")]
        [Validation(Required=true)]
        public string EcsPoolName { get; set; }

        // vpc资源池名称
        [NameInMap("vpc_pool_name")]
        [Validation(Required=true)]
        public string VpcPoolName { get; set; }

        // dns资源池名称
        [NameInMap("dns_pool_name")]
        [Validation(Required=true)]
        public string DnsPoolName { get; set; }

        // keystone资源池名称
        [NameInMap("keystone_pool_name")]
        [Validation(Required=true)]
        public string KeystonePoolName { get; set; }

        // 底座配置
        [NameInMap("cloud_stack_config")]
        [Validation(Required=true)]
        public CloudStackConfig CloudStackConfig { get; set; }

    }

}
