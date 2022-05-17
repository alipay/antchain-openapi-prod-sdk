// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 获取应用详情信息包括对应workspace下的appservices
    public class AppPortraitAppGet : TeaModel {
        // 应用id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 应用名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用分组名称
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

        // 应用所属分组id
        [NameInMap("app_group_id")]
        [Validation(Required=false)]
        public string AppGroupId { get; set; }

        // 应用负责人
        [NameInMap("owner_display_name")]
        [Validation(Required=false)]
        public string OwnerDisplayName { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 技术栈名称
        [NameInMap("buildpack_name")]
        [Validation(Required=false)]
        public string BuildpackName { get; set; }

        // 技术栈版本
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // workspace下应用所关联的应用服务列表
        [NameInMap("appservices")]
        [Validation(Required=false)]
        public List<string> Appservices { get; set; }

    }

}
