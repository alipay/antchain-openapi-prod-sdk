// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 专有网络
    public class VPC : TeaModel {
        // VPC的IPv4网段
        [NameInMap("cidr_block")]
        [Validation(Required=true)]
        public string CidrBlock { get; set; }

        // VPC的创建时间
        [NameInMap("creation_time")]
        [Validation(Required=true)]
        public string CreationTime { get; set; }

        // VPC的描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // VPC所在的地域
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 路由表ID
        [NameInMap("router_table_ids")]
        [Validation(Required=true)]
        public List<string> RouterTableIds { get; set; }

        // VPC的状态，取值：
        // 
        // Pending：配置中。
        // Available：可用。
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用户侧网段的列表
        [NameInMap("user_cidrs")]
        [Validation(Required=false)]
        public string UserCidrs { get; set; }

        // VPC的id
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // VPC的名称
        [NameInMap("vpc_name")]
        [Validation(Required=true)]
        public string VpcName { get; set; }

        // VPC路由器的ID
        [NameInMap("v_router_id")]
        [Validation(Required=true)]
        public string VRouterId { get; set; }

        // 关联的workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // vpc是否已导入workspace
        [NameInMap("import_info")]
        [Validation(Required=false)]
        public ImportInfo ImportInfo { get; set; }

        // vpc在CAFE测的唯一ID
        [NameInMap("vpc_paas_id")]
        [Validation(Required=false)]
        public string VpcPaasId { get; set; }

    }

}
