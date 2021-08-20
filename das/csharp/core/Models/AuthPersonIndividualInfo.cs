// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 授权人个人信息
    public class AuthPersonIndividualInfo : TeaModel {
        // 姓名
        [NameInMap("individual_name")]
        [Validation(Required=true)]
        public string IndividualName { get; set; }

        // 身份证号
        [NameInMap("individual_id")]
        [Validation(Required=true)]
        public string IndividualId { get; set; }

        // 电话号码
        [NameInMap("individual_phone_num")]
        [Validation(Required=true)]
        public long? IndividualPhoneNum { get; set; }

    }

}
