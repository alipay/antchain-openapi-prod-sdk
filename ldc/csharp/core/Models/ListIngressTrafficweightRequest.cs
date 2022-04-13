// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListIngressTrafficweightRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // lks_service_id，antcloud.ldc.opsplan.detail.query 接口返回的 group_collection_list. app_group_list.id，和查询应用服务发布单详情的id一样
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

    }

}
