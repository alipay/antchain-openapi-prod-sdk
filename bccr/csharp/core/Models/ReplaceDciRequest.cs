// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class ReplaceDciRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // id
        [NameInMap("dci_content_id")]
        [Validation(Required=true)]
        public string DciContentId { get; set; }

        // 作品名称
        [NameInMap("work_name")]
        [Validation(Required=false)]
        public string WorkName { get; set; }

        // 作品类别
        [NameInMap("work_category")]
        [Validation(Required=false)]
        public string WorkCategory { get; set; }

        // 创作信息
        [NameInMap("creation_info")]
        [Validation(Required=false)]
        public DciCreationInfo CreationInfo { get; set; }

        // 发表信息
        [NameInMap("publication_info")]
        [Validation(Required=false)]
        public DciPublicationInfo PublicationInfo { get; set; }

        // 申领人id
        [NameInMap("dci_user_id")]
        [Validation(Required=false)]
        public string DciUserId { get; set; }

        // 著作权人
        [NameInMap("copyright_owner_ids")]
        [Validation(Required=false)]
        public List<string> CopyrightOwnerIds { get; set; }

        // 作者姓名
        [NameInMap("author_name")]
        [Validation(Required=false)]
        public string AuthorName { get; set; }

        // 作者署名
        [NameInMap("author_signature")]
        [Validation(Required=false)]
        public string AuthorSignature { get; set; }

        // 权利信息
        [NameInMap("right_info")]
        [Validation(Required=false)]
        public DciRightInfo RightInfo { get; set; }

        // 幂等字段
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 代理信息
        [NameInMap("proxy_data")]
        [Validation(Required=false)]
        public ProxyData ProxyData { get; set; }

    }

}
