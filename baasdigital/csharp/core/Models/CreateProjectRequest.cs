// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    public class CreateProjectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("bizid")]
        [Validation(Required=true)]
        public string Bizid { get; set; }

        // 项目名称
        [NameInMap("name")]
        [Validation(Required=true, MaxLength=100)]
        public string Name { get; set; }

        // 数字合约symbol
        [NameInMap("symbol")]
        [Validation(Required=true)]
        public string Symbol { get; set; }

        // 数字权证项目描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模版类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public long? BizType { get; set; }

        // 项目发行权证数量上限
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 数字权证链接，共享时必须传入
        [NameInMap("asset_uri")]
        [Validation(Required=false)]
        public string AssetUri { get; set; }

        // 是否可增发
        [NameInMap("limited_amount")]
        [Validation(Required=true)]
        public bool? LimitedAmount { get; set; }

        // 是否可核销
        [NameInMap("write_offable")]
        [Validation(Required=true)]
        public bool? WriteOffable { get; set; }

        // 是否可销毁
        [NameInMap("burnable")]
        [Validation(Required=true)]
        public bool? Burnable { get; set; }

        // 项目管理者，必须是链上已存在的账户，只有管理者可以修改项目信息
        [NameInMap("owner_account")]
        [Validation(Required=true)]
        public string OwnerAccount { get; set; }

        // 发行者列表，必须是链上已经存在的账户，只有发行者具备权证发行权限。
        [NameInMap("issuer_list")]
        [Validation(Required=true)]
        public List<string> IssuerList { get; set; }

        // 核销者列表，必须是链上已经存在的账户，只有核销者才可以核销权证
        [NameInMap("writeoff_list")]
        [Validation(Required=false)]
        public List<string> WriteoffList { get; set; }

    }

}
