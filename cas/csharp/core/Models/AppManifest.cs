// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // AppManifest
    public class AppManifest : TeaModel {
        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // app_version
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // code_commit
        [NameInMap("code_commit")]
        [Validation(Required=false)]
        public CodeCommit CodeCommit { get; set; }

        // etag
        [NameInMap("etag")]
        [Validation(Required=false)]
        public string Etag { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // location
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // remark
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // store_location
        [NameInMap("store_location")]
        [Validation(Required=false)]
        public string StoreLocation { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // utc_modified
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcModified { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
