// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b3196fa612148cd8407b20f4e5ed132.Models
{
    // 合同模版
    public class ArTemplate : TeaModel {
        // 合同模版号
        [NameInMap("ar_tp_no")]
        [Validation(Required=false)]
        public string ArTpNo { get; set; }

        // 合同版本
        [NameInMap("ar_tp_version")]
        [Validation(Required=false)]
        public long? ArTpVersion { get; set; }

        // 合同模版类型，比如：CT_AUTH_HOUSE_QUERY=房屋查询授权合同
        [NameInMap("ar_type")]
        [Validation(Required=false)]
        public string ArType { get; set; }

        // 区块链智能合同的合同模版号
        [NameInMap("myc_tp_id")]
        [Validation(Required=false)]
        public string MycTpId { get; set; }

        // 合同名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 合同模版归属机构编号
        [NameInMap("org_no")]
        [Validation(Required=false)]
        public string OrgNo { get; set; }

        // 合同模版归属机构类型，比如：BANK=银行
        [NameInMap("org_type")]
        [Validation(Required=false)]
        public string OrgType { get; set; }

        // 合同模版OSS存储路径
        [NameInMap("pdf_oss_key")]
        [Validation(Required=false)]
        public string PdfOssKey { get; set; }

        // 合同变量,Map<String,String>的json格式
        [NameInMap("var_json")]
        [Validation(Required=false)]
        public string VarJson { get; set; }

        // 签署区设置
        [NameInMap("sign_area_json")]
        [Validation(Required=false)]
        public string SignAreaJson { get; set; }

    }

}
