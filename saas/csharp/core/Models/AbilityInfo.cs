// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    // 能力信息
    public class AbilityInfo : TeaModel {
        // 能力编号
        [NameInMap("ability_id")]
        [Validation(Required=true)]
        public string AbilityId { get; set; }

        // 能力名称
        [NameInMap("ability_name")]
        [Validation(Required=true)]
        public string AbilityName { get; set; }

        // 研发负责人
        [NameInMap("dev_owner")]
        [Validation(Required=true)]
        public string DevOwner { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 研发负责人邮箱前缀
        [NameInMap("dev_owner_prefix_email")]
        [Validation(Required=true)]
        public string DevOwnerPrefixEmail { get; set; }

        // 产品负责人
        [NameInMap("product_owner")]
        [Validation(Required=true)]
        public string ProductOwner { get; set; }

        // 能力对应商业中台L5Code
        [NameInMap("business_code")]
        [Validation(Required=false)]
        public string BusinessCode { get; set; }

        // apiInfoModels列表
        [NameInMap("api_info_models")]
        [Validation(Required=true)]
        public List<ApiInfoModel> ApiInfoModels { get; set; }

        // 能力sla看板url
        [NameInMap("sla_url")]
        [Validation(Required=false)]
        public string SlaUrl { get; set; }

    }

}
