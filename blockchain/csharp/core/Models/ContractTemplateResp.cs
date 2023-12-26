// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 合约市场列表
    public class ContractTemplateResp : TeaModel {
        // 模板标识
        [NameInMap("template_id")]
        [Validation(Required=false)]
        public string TemplateId { get; set; }

        // 产品码
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 合约名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 缩略图url
        [NameInMap("thumb_url")]
        [Validation(Required=false)]
        public string ThumbUrl { get; set; }

        // 合约描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 文档地址
        [NameInMap("detail_url")]
        [Validation(Required=false)]
        public string DetailUrl { get; set; }

        // 是否已开通合约
        [NameInMap("open")]
        [Validation(Required=false)]
        public bool? Open { get; set; }

        // 后续展示：购买用户头像
        [NameInMap("avatar_logo_list")]
        [Validation(Required=false)]
        public List<string> AvatarLogoList { get; set; }

        // 定制合约价格
        [NameInMap("price_message")]
        [Validation(Required=false)]
        public string PriceMessage { get; set; }

    }

}
