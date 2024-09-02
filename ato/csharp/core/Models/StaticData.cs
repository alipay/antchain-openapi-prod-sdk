// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 静态数据
    public class StaticData : TeaModel {
        // 商户类型
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // 静态数据详情
        [NameInMap("module_detail_list")]
        [Validation(Required=true)]
        public List<StaticDataModuleDetail> ModuleDetailList { get; set; }

    }

}
