// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 商户行业资质信息
    public class IndustryQualificationInfo : TeaModel {
        // 商户行业资质类型
        [NameInMap("industry_qualification_type")]
        [Validation(Required=true)]
        public string IndustryQualificationType { get; set; }

        // 商户行业资质图片
        [NameInMap("industry_qualification_image")]
        [Validation(Required=true)]
        public string IndustryQualificationImage { get; set; }

    }

}
