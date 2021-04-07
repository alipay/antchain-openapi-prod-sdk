// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListComputerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // appserviceIds
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // current page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // current page
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // CMP模式下使用的token，一般场景勿用
        [NameInMap("cloud_manage_token")]
        [Validation(Required=false)]
        public string CloudManageToken { get; set; }

        // vpc_iaas_id
        [NameInMap("vpc_iaas_id")]
        [Validation(Required=false)]
        public string VpcIaasId { get; set; }

    }

}
