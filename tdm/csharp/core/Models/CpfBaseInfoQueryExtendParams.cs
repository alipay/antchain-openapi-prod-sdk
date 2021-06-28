// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 公积金基本信息查询接口参数
    public class CpfBaseInfoQueryExtendParams : TeaModel {
        // 住建部中心编码
        [NameInMap("zjbzxbm")]
        [Validation(Required=true)]
        public string Zjbzxbm { get; set; }

        // 业务流水号
        [NameInMap("yhlsh")]
        [Validation(Required=true)]
        public string Yhlsh { get; set; }

        // 姓名
        [NameInMap("xingming")]
        [Validation(Required=true)]
        public string Xingming { get; set; }

        // 证件号码
        [NameInMap("zjhm")]
        [Validation(Required=true)]
        public string Zjhm { get; set; }

        // 银行程序标志
        [NameInMap("appid")]
        [Validation(Required=true)]
        public string Appid { get; set; }

    }

}
