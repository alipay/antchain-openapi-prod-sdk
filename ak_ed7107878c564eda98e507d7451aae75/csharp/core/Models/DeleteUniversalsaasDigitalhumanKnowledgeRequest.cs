// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_ed7107878c564eda98e507d7451aae75.Models
{
    public class DeleteUniversalsaasDigitalhumanKnowledgeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户编码
        [NameInMap("tenant_code")]
        [Validation(Required=true)]
        public string TenantCode { get; set; }

        // 知识点id列表
        [NameInMap("ids")]
        [Validation(Required=true)]
        public List<long?> Ids { get; set; }

        // 知识库id
        [NameInMap("library_id")]
        [Validation(Required=true)]
        public long? LibraryId { get; set; }

    }

}
