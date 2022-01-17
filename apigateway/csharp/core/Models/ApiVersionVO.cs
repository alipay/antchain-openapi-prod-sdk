// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiVersionVO
    public class ApiVersionVO : TeaModel {
        // API标识
        [NameInMap("api_id")]
        [Validation(Required=false)]
        public string ApiId { get; set; }

        // editOperator
        [NameInMap("edit_operator")]
        [Validation(Required=false)]
        public string EditOperator { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 编辑时间
        [NameInMap("gmt_edit")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtEdit { get; set; }

        // 更改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // gmtOffline
        [NameInMap("gmt_offline")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtOffline { get; set; }

        // gmtOnline
        [NameInMap("gmt_online")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtOnline { get; set; }

        // offlineDesc
        [NameInMap("offline_desc")]
        [Validation(Required=false)]
        public string OfflineDesc { get; set; }

        // offlineOperator
        [NameInMap("offline_operator")]
        [Validation(Required=false)]
        public string OfflineOperator { get; set; }

        // onlineDesc
        [NameInMap("online_desc")]
        [Validation(Required=false)]
        public string OnlineDesc { get; set; }

        // onlineOperator
        [NameInMap("online_operator")]
        [Validation(Required=false)]
        public string OnlineOperator { get; set; }

        // versionId
        [NameInMap("version_id")]
        [Validation(Required=false)]
        public string VersionId { get; set; }

        // 版本号
        [NameInMap("version_no")]
        [Validation(Required=false)]
        public string VersionNo { get; set; }

        // versionStatus
        [NameInMap("version_status")]
        [Validation(Required=false)]
        public string VersionStatus { get; set; }

        // 能否发布
        [NameInMap("can_online")]
        [Validation(Required=false)]
        public bool? CanOnline { get; set; }

    }

}
