// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci作品创作信息
    public class DciCreationInfo : TeaModel {
        // 作品创作性质
        [NameInMap("creation_nature")]
        [Validation(Required=true)]
        public string CreationNature { get; set; }

        // 创作完成日期
        [NameInMap("creation_completion_date")]
        [Validation(Required=true)]
        public string CreationCompletionDate { get; set; }

        // 创作完成地点
        [NameInMap("creation_completion_place")]
        [Validation(Required=false)]
        public string CreationCompletionPlace { get; set; }

        // 作品创作地点地区编码
        [NameInMap("creation_completion_code")]
        [Validation(Required=true)]
        public string CreationCompletionCode { get; set; }

    }

}
