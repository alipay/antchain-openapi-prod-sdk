// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class PagequeryTraasmetaHostmachineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // currentPage
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // workspace_name
        [NameInMap("workspace_name")]
        [Validation(Required=false)]
        public string WorkspaceName { get; set; }

        // workspace_uuid
        [NameInMap("workspace_uuid")]
        [Validation(Required=false)]
        public string WorkspaceUuid { get; set; }

        // hostname
        [NameInMap("hostname")]
        [Validation(Required=false)]
        public string Hostname { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

    }

}
