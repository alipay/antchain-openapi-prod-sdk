// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 证明开具参数，填入证明开具接口的 extendParams 部分
    public class IssueCertParams : TeaModel {
        // 贷款合同编号
        [NameInMap("dkhtbh")]
        [Validation(Required=false)]
        public string Dkhtbh { get; set; }

        // 公积金中心个人账户
        [NameInMap("grzh")]
        [Validation(Required=false)]
        public string Grzh { get; set; }

        // 查询开始日期
        [NameInMap("ksrq")]
        [Validation(Required=false)]
        public string Ksrq { get; set; }

        // 查询结束日期
        [NameInMap("jsrq")]
        [Validation(Required=false)]
        public string Jsrq { get; set; }

        // 公积金贷款中心
        [NameInMap("gjjdkzx")]
        [Validation(Required=false)]
        public string Gjjdkzx { get; set; }

    }

}
