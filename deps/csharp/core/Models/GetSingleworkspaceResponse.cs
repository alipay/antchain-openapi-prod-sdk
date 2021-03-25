// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetSingleworkspaceResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 创建时间。
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

        // workspace工作空间的显示名称
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // workspace名称。
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 最近修改时间。
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModifiedTime { get; set; }

        // workspace显示名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 网络类型。
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // region id
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 所属租户信息。
        [NameInMap("tenant")]
        [Validation(Required=false)]
        public string Tenant { get; set; }

        // 工作空间类型：标准工作空间；单元化工作空间
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // vpc iaas id
        [NameInMap("vpc_iaas_id")]
        [Validation(Required=false)]
        public string VpcIaasId { get; set; }

        // workspace所属环境名称[可能不存在]。
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

        // workspace对应的zoneId列表。
        [NameInMap("zones")]
        [Validation(Required=false)]
        public List<string> Zones { get; set; }

    }

}
