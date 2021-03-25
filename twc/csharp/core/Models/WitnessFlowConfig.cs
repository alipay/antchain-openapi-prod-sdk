// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程创建响应数据
    public class WitnessFlowConfig : TeaModel {
        // 企业实名认证方式,对公打款：1；企业芝麻认证：3；法定代表授权：4；
        [NameInMap("organ_realname_types")]
        [Validation(Required=false)]
        public List<long?> OrganRealnameTypes { get; set; }

        // 个人实名认证方式, 银行四要素：2；芝麻认证-人脸识别：3；微众-人脸识别：4；
        [NameInMap("person_realname_types")]
        [Validation(Required=false)]
        public List<long?> PersonRealnameTypes { get; set; }

        // 是否需要实名认证
        [NameInMap("real_name_cert")]
        [Validation(Required=false)]
        public bool? RealNameCert { get; set; }

        // 意愿认证方式, 芝麻认证-人脸识别：2；短信验证码：3；微众-人脸识别：4；ukey认证：5；签署密码认证：6；
        [NameInMap("willingness_types")]
        [Validation(Required=false)]
        public List<long?> WillingnessTypes { get; set; }

    }

}
