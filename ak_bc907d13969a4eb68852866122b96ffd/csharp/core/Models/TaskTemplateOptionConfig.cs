// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    // TaskTemplateOptionConfig
    public class TaskTemplateOptionConfig : TeaModel {
        // defaultresult
        [NameInMap("defaultresult")]
        [Validation(Required=true)]
        public string Defaultresult { get; set; }

        // rule
        [NameInMap("rule")]
        [Validation(Required=false)]
        public string Rule { get; set; }

        // 预制选项，针对填空题的输入题目
        [NameInMap("preoptions")]
        [Validation(Required=false)]
        public List<string> Preoptions { get; set; }

    }

}
