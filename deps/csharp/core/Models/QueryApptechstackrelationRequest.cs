// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryApptechstackrelationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 一组应用id
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // buildpack_arch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // creation_fime_from
        // 
        [NameInMap("creation_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTimeFrom { get; set; }

        // creation_time_to
        // 
        [NameInMap("creation_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTimeTo { get; set; }

        // current_page
        // 
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 是否降序
        [NameInMap("descend")]
        [Validation(Required=false)]
        public string Descend { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<long?> Ids { get; set; }

        // isProcessed
        [NameInMap("is_processed")]
        [Validation(Required=false)]
        public bool? IsProcessed { get; set; }

        // modification_time_from
        // 
        [NameInMap("modification_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTimeFrom { get; set; }

        // modification_time_to
        // 
        [NameInMap("modification_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTimeTo { get; set; }

        // page_size
        // 
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 分类
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // start_index
        // 
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // techstack_identities
        // 
        [NameInMap("techstack_identities")]
        [Validation(Required=false)]
        public string TechstackIdentities { get; set; }

        // techstack_ids
        // 
        [NameInMap("techstack_ids")]
        [Validation(Required=false)]
        public List<long?> TechstackIds { get; set; }

    }

}
