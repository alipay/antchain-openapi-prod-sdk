// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDIGITAL.Models
{
    // 数字权证项目信息类
    public class DigitalProject : TeaModel {
        // 数字权证项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 模版类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public long? BizType { get; set; }

        // 数字权证项目名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 合约symbol
        [NameInMap("symbol")]
        [Validation(Required=true)]
        public string Symbol { get; set; }

        // 数字权证项目描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 项目状态：
        // deploy：已部署(可更新)
        // issue：已发布(不可更新)
        [NameInMap("project_status")]
        [Validation(Required=true)]
        public string ProjectStatus { get; set; }

        // 项目发行权证的总数
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 权证的uri信息（共享tokenuri模式有该字段）
        [NameInMap("asset_uri")]
        [Validation(Required=false)]
        public string AssetUri { get; set; }

        // 项目发行后权证数量是否可增发
        // 
        [NameInMap("limited_amount")]
        [Validation(Required=true)]
        public bool? LimitedAmount { get; set; }

        // 项目权证是否可核销
        [NameInMap("write_offable")]
        [Validation(Required=true)]
        public bool? WriteOffable { get; set; }

        // 项目权证是否可销毁
        [NameInMap("burnable")]
        [Validation(Required=true)]
        public bool? Burnable { get; set; }

        // 项目管理员账户地址
        [NameInMap("owner_account")]
        [Validation(Required=true)]
        public string OwnerAccount { get; set; }

        // 项目核销员账户地址列表
        [NameInMap("issuer_list")]
        [Validation(Required=false)]
        public List<string> IssuerList { get; set; }

        // 项目核销员账户地址列表
        [NameInMap("writeoff_list")]
        [Validation(Required=false)]
        public List<string> WriteoffList { get; set; }

        // 合约创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

    }

}
