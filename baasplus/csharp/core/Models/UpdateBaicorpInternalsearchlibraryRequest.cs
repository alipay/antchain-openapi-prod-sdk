// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class UpdateBaicorpInternalsearchlibraryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 账户ID，账户粒度ID。
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 产品ID，[BANQUAN, PAIPAI]
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 商户ID，即平台用户ID。
        [NameInMap("company_id")]
        [Validation(Required=true)]
        public string CompanyId { get; set; }

        // 内容ID
        [NameInMap("content_id")]
        [Validation(Required=true)]
        public string ContentId { get; set; }

        // 	
        // 基于安全考虑，填充NonceId。
        [NameInMap("custom_id")]
        [Validation(Required=true)]
        public string CustomId { get; set; }

        // 待检测内容的raw data，这期暂不使用
        [NameInMap("entity_data")]
        [Validation(Required=true)]
        public string EntityData { get; set; }

        // 待检测字段的描述信息，包括标题、描述或关键词，json格式字符串。
        [NameInMap("entity_desc")]
        [Validation(Required=true)]
        public string EntityDesc { get; set; }

        // 待检测内容类型，[TEXT, PICTURE, VIDEO, HTML]
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public string EntityType { get; set; }

        // 1.待检测内容oss url（后续可以扩展为非oss的文件url）。
        // 2.假如使用AK访问，此处填写fileid。
        [NameInMap("entity_url")]
        [Validation(Required=true)]
        public string EntityUrl { get; set; }

    }

}
