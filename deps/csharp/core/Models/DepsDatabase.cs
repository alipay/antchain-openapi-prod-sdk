// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 数据库资源信息
    public class DepsDatabase : TeaModel {
        // 服务实例列表
        [NameInMap("app_services")]
        [Validation(Required=false)]
        public List<AppService> AppServices { get; set; }

        // 连接地址
        [NameInMap("connection_address")]
        [Validation(Required=false)]
        public string ConnectionAddress { get; set; }

        // CPU
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // 数据库类型，取值 MYSQL, OCEANBASE
        [NameInMap("engine")]
        [Validation(Required=false)]
        public string Engine { get; set; }

        // 数据库版本，取值 MYSQL5, MYSQL6, MYSQL7, OCEANBASE1_4, 分别对应Mysql5.5, 5.6, 5.7, Ocea
        [NameInMap("engine_version")]
        [Validation(Required=false)]
        public string EngineVersion { get; set; }

        // iaaS在创建该资源时为其分配的唯一标示，创建中或创建失败时为空
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 资源唯一标识
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 最大连接数
        [NameInMap("max_connections")]
        [Validation(Required=false)]
        public long? MaxConnections { get; set; }

        // 最大IOPS
        [NameInMap("max_iops")]
        [Validation(Required=false)]
        public long? MaxIops { get; set; }

        // 内存大小，单位：MB
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型，Classic或VPC
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // 网络连接类型，取值 Internet：外网，Intranet：内网
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public string NetType { get; set; }

        // 连接端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 资源所属的地域id
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 数据库实例规格
        [NameInMap("spec_iaas_id")]
        [Validation(Required=false)]
        public string SpecIaasId { get; set; }

        // 
        //                     
        //               资源状态，取值 CREATING：正在创建，CREATEFAILED：创建失败，RUNNING: 运行中，REBOOTING: 重启，REBOOT_FAILED: 重启失败，
        //               DELETING：正在删除，DELETED：删除成功，DELETE_FAILED：删除失败，RESOURCE_IMPORTING：资源导入中，RESOURCE_IMPORT_FAILED：资源导入失败，
        //               RESOURCE_REMOVING：资源删除中，RESOURCE_REMOVE_FAILED：资源删除失败，DBINSTANCECLASSCHANGING：修改规格中，
        //               MODIFY_SPEC_FAILED：修改规格失败
        //                 
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 存储空间GB
        [NameInMap("storage")]
        [Validation(Required=false)]
        public long? Storage { get; set; }

    }

}
