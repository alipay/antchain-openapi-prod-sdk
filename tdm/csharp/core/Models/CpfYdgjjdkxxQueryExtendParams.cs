// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 异地公积金贷款信息查询接口参数
    public class CpfYdgjjdkxxQueryExtendParams : TeaModel {
        // 住建部中心编码
        [NameInMap("zjbzxbm")]
        [Validation(Required=true)]
        public string Zjbzxbm { get; set; }

        // 姓名
        [NameInMap("xingming")]
        [Validation(Required=true)]
        public string Xingming { get; set; }

        // 证件号码
        [NameInMap("zjhm")]
        [Validation(Required=true)]
        public string Zjhm { get; set; }

        // 贷款合同编号
        [NameInMap("dkhtbh")]
        [Validation(Required=true)]
        public string Dkhtbh { get; set; }

    }

}
