// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统RiskData结构体
    public class RiskData : TeaModel {
        // 联系人信息列表
        [NameInMap("contacts")]
        [Validation(Required=true)]
        public List<Contact> Contacts { get; set; }

        // 人脸对比分
        [NameInMap("face_point")]
        [Validation(Required=false)]
        public string FacePoint { get; set; }

        // 活体供应商
        [NameInMap("face_source")]
        [Validation(Required=false)]
        public string FaceSource { get; set; }

    }

}
