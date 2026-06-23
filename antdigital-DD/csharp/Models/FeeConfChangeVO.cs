// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计财配置变更模型
    public class FeeConfChangeVO : TeaModel {
        // 原本的计财配置
        [NameInMap("old_conf_entity")]
        [Validation(Required=false)]
        public FeeConfEntityVO OldConfEntity { get; set; }

        // 新的计财配置实体
        [NameInMap("new_conf_entity")]
        [Validation(Required=false)]
        public FeeConfEntityVO NewConfEntity { get; set; }

        // 变更字段列表
        [NameInMap("change_factor_list")]
        [Validation(Required=false)]
        public List<FeeChangeFactorVO> ChangeFactorList { get; set; }

        // 失败的变更列表
        [NameInMap("fail_chang_factor_list")]
        [Validation(Required=false)]
        public List<FailChangeFactor> FailChangFactorList { get; set; }

    }

}
