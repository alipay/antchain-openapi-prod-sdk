// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateApplicationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // appDomainId
        [NameInMap("app_domain_id")]
        [Validation(Required=false)]
        public string AppDomainId { get; set; }

        // appExtraInfos
        [NameInMap("app_extra_infos")]
        [Validation(Required=false)]
        public List<AppExtraInfo> AppExtraInfos { get; set; }

        // 应用等级
        [NameInMap("app_level")]
        [Validation(Required=false)]
        public AppLevel AppLevel { get; set; }

        // appOwner
        [NameInMap("app_owner")]
        [Validation(Required=false)]
        public AppOwner AppOwner { get; set; }

        // archetype
        [NameInMap("archetype")]
        [Validation(Required=false)]
        public ScmSofaArchetype Archetype { get; set; }

        // buildpackVersion
        [NameInMap("buildpack_version")]
        [Validation(Required=false)]
        public string BuildpackVersion { get; set; }

        // 中文名称
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // 代码库
        [NameInMap("code_repository")]
        [Validation(Required=false)]
        public CodeRepository CodeRepository { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 额外信息
        [NameInMap("extra_params")]
        [Validation(Required=false)]
        public string ExtraParams { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // isService
        [NameInMap("is_service")]
        [Validation(Required=false)]
        public bool? IsService { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // ownerId
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // stack_id
        [NameInMap("stack_id")]
        [Validation(Required=false)]
        public string StackId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // tags
        [NameInMap("tags")]
        [Validation(Required=false)]
        public string Tags { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
