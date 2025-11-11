// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_d3c4f09125a14cd587057c405561809a.Models
{
    // 项目基础信息
    public class ProjectBaseInfoVo : TeaModel {
        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 资产项目合约地址
        // （Launch Network/Shares token ）
        [NameInMap("asset_project_address")]
        [Validation(Required=false)]
        public string AssetProjectAddress { get; set; }

        // 项目名称
        [NameInMap("projcet_name")]
        [Validation(Required=false)]
        public string ProjcetName { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 项目状态
        [NameInMap("project_status")]
        [Validation(Required=false)]
        public string ProjectStatus { get; set; }

        // 项目所在链（Launch Network）
        [NameInMap("chain_type")]
        [Validation(Required=false)]
        public string ChainType { get; set; }

    }

}
