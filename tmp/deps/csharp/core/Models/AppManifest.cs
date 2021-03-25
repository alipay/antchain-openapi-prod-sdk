// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // AppManifest
    public class AppManifest : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // version
        [NameInMap("app_version")]
        [Validation(Required=false)]
        public string AppVersion { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // storeLocation
        [NameInMap("store_location")]
        [Validation(Required=false)]
        public string StoreLocation { get; set; }

        // location
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // etag
        [NameInMap("etag")]
        [Validation(Required=false)]
        public string Etag { get; set; }

        // remark
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 代码提交
        [NameInMap("code_commit")]
        [Validation(Required=false)]
        public CodeCommit CodeCommit { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

    }

}
