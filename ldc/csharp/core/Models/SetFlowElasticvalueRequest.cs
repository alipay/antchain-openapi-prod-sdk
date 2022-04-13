// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class SetFlowElasticvalueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 弹性值，对应zdal里的弹性位，比如52，53等
        [NameInMap("elastic_values")]
        [Validation(Required=true)]
        public List<string> ElasticValues { get; set; }

        // 是否灰度（默认 false）
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 是否弹性（默认 false）
        [NameInMap("press")]
        [Validation(Required=false)]
        public bool? Press { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
