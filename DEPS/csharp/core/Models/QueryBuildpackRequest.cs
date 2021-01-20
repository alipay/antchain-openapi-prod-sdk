// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpackRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 技术栈版本号
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // 每页的大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 开始时间
        [NameInMap("publication_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTimeFrom { get; set; }

        // 截至时间
        [NameInMap("publication_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTimeTo { get; set; }

        // 技术栈提供方所在域
        [NameInMap("scopes")]
        [Validation(Required=false)]
        public List<string> Scopes { get; set; }

        // 技术栈版本状态
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // 支持的操作系统ID列表
        [NameInMap("supported_os_ids")]
        [Validation(Required=false)]
        public List<long?> SupportedOsIds { get; set; }

        // 支持的地域名称列表
        [NameInMap("supported_regions")]
        [Validation(Required=false)]
        public List<string> SupportedRegions { get; set; }

        // 技术栈ID列表
        [NameInMap("techstack_ids")]
        [Validation(Required=false)]
        public List<long?> TechstackIds { get; set; }

        // 技术栈名称
        [NameInMap("techstack_names")]
        [Validation(Required=false)]
        public List<string> TechstackNames { get; set; }

        // creatorIds
        [NameInMap("creator_ids")]
        [Validation(Required=false)]
        public List<string> CreatorIds { get; set; }

    }

}
