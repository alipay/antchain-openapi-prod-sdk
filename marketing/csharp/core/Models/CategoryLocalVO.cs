// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MARKETING.Models
{
    // CategoryLocalVO
    public class CategoryLocalVO : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // siteId
        [NameInMap("site_id")]
        [Validation(Required=false)]
        public long? SiteId { get; set; }

        // title
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // sort
        [NameInMap("sort")]
        [Validation(Required=false)]
        public long? Sort { get; set; }

        // level
        [NameInMap("level")]
        [Validation(Required=false)]
        public long? Level { get; set; }

        // parent_id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // sourceType
        [NameInMap("source_type")]
        [Validation(Required=false)]
        public long? SourceType { get; set; }

        // show_type
        [NameInMap("show_type")]
        [Validation(Required=false)]
        public long? ShowType { get; set; }

        // ext_id
        [NameInMap("ext_id")]
        [Validation(Required=false)]
        public string ExtId { get; set; }

        // shield
        [NameInMap("shie_id")]
        [Validation(Required=false)]
        public long? ShieId { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // deleted
        [NameInMap("deleted")]
        [Validation(Required=false)]
        public long? Deleted { get; set; }

        // tree
        [NameInMap("tree")]
        [Validation(Required=false)]
        public string Tree { get; set; }

        // green
        [NameInMap("green")]
        [Validation(Required=false)]
        public long? Green { get; set; }

        // site_code
        [NameInMap("site_code")]
        [Validation(Required=false)]
        public string SiteCode { get; set; }

        // created_time
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // modified_time
        [NameInMap("modified_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ModifiedTime { get; set; }

        // isCatalogue
        [NameInMap("is_catalogue")]
        [Validation(Required=false)]
        public bool? IsCatalogue { get; set; }

    }

}
