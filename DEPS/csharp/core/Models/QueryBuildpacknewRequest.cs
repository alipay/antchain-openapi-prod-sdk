// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryBuildpacknewRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // buildCommand
        [NameInMap("build_command")]
        [Validation(Required=false)]
        public string BuildCommand { get; set; }

        // createdFroms
        [NameInMap("created_froms")]
        [Validation(Required=false)]
        public List<string> CreatedFroms { get; set; }

        // creationTimeFrom
        [NameInMap("creation_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTimeFrom { get; set; }

        // creationTimeTo
        [NameInMap("creation_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreationTimeTo { get; set; }

        // creatorIds
        [NameInMap("creator_ids")]
        [Validation(Required=false)]
        public List<string> CreatorIds { get; set; }

        // currentPage
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // descend
        [NameInMap("descend")]
        [Validation(Required=false)]
        public bool? Descend { get; set; }

        // fullVersion
        [NameInMap("full_version")]
        [Validation(Required=false)]
        public string FullVersion { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // isProcessed
        [NameInMap("is_processed")]
        [Validation(Required=false)]
        public bool? IsProcessed { get; set; }

        // modificationTimeFrom
        [NameInMap("modification_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTimeFrom { get; set; }

        // modificationTimeTo
        [NameInMap("modification_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string ModificationTimeTo { get; set; }

        // pageSize
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // publicationTimeFrom
        [NameInMap("publication_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTimeFrom { get; set; }

        // publicationTimeTo
        [NameInMap("publication_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string PublicationTimeTo { get; set; }

        // publisherIds
        [NameInMap("publisher_ids")]
        [Validation(Required=false)]
        public List<string> PublisherIds { get; set; }

        // scopes
        [NameInMap("scopes")]
        [Validation(Required=false)]
        public List<string> Scopes { get; set; }

        // sortField
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // supportedOsIds
        [NameInMap("supported_os_ids")]
        [Validation(Required=false)]
        public List<long?> SupportedOsIds { get; set; }

        // supported_region_ids
        [NameInMap("supported_region_ids")]
        [Validation(Required=false)]
        public List<string> SupportedRegionIds { get; set; }

        // techstackIds
        [NameInMap("techstack_ids")]
        [Validation(Required=false)]
        public List<long?> TechstackIds { get; set; }

        // techstackNames
        [NameInMap("techstack_names")]
        [Validation(Required=false)]
        public List<string> TechstackNames { get; set; }

    }

}
