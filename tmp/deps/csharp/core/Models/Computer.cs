// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 计算资源信息
    public class Computer : TeaModel {
        // 服务实例列表
        [NameInMap("app_services")]
        [Validation(Required=false)]
        public List<AppService> AppServices { get; set; }

        // 服务器所属的cell ID
        [NameInMap("cell_id")]
        [Validation(Required=false)]
        public string CellId { get; set; }

        // 类型:POD/DOCKER_VM
        [NameInMap("computer_type")]
        [Validation(Required=false)]
        public string ComputerType { get; set; }

        // CPU核数
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 弹性ip地址
        [NameInMap("elastic_ip")]
        [Validation(Required=false)]
        public string ElasticIp { get; set; }

        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 计算资源唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 内网ip地址
        [NameInMap("inner_ip")]
        [Validation(Required=false)]
        public string InnerIp { get; set; }

        // 内存大小，单位：MB
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 公网ip地址
        [NameInMap("public_ip")]
        [Validation(Required=false)]
        public string PublicIp { get; set; }

        // 资源所属的地域id
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 资源状态，取值：
        //                     CREATING：创建中；
        //                     CREATE_FAILED：创建失败；
        //                     CREATED：已创建；
        //                     STARTING：开机中；
        //                     START_FAILED：开机失败；
        //                     UNALLOCATED：待分配；
        //                     INITIALIZING：初始化中；
        //                     INITIALIZE_FAILED：初始化失败；
        //                     OFFLINE：已下线；
        //                     READY：待部署；
        //                     DEPLOYING：部署中；
        //                     DEPLOY_FAILED：部署失败；
        //                     DEPLOYED：已部署；
        //                     RELEASING：释放中；
        //                     RELEASE_FAILED：释放失败；
        //                     STOPPING：关机中；
        //                     STOP_FAILED：关机失败；
        //                     STOPPED：已关机；
        //                     REBOOTING：重启中；
        //                     REBOOT_FAILED：重启失败；
        //                     DISK_INITIALIZING：初始化磁盘中；
        //                     SPEC_CHANGING：变配中；
        //                     LOCKED：被锁定；
        //                     EXPIRED：已过期；
        //                     TO_EXPIR：即将过期；
        //                     DELETING：删除中；
        //                     DELETE_FAILED：删除失败；
        //                     DELETED：删除成功
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资源所属的可用区id
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 机器是否镜像化
        [NameInMap("deploy_mode")]
        [Validation(Required=false)]
        public string DeployMode { get; set; }

    }

}
