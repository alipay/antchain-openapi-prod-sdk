// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 合同及签署信息
    public class ContractSigning : TeaModel {
        // 本合同文件的名称
        [NameInMap("contract_name")]
        [Validation(Required=true)]
        public string ContractName { get; set; }

        // 待签署文件存放在的可读取路径，参数具体内容根据调用方约定，比如内容为OSS路径时，数字房产访问OSS下载文件。
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 机构签署记录列表，可设置多个机构的签署区
        [NameInMap("org_sign_list")]
        [Validation(Required=true)]
        public List<OrgSigning> OrgSignList { get; set; }

        // 个人签署记录的列表形式，可设置多个个人的签署区
        [NameInMap("personal_sign_list")]
        [Validation(Required=true)]
        public List<PersonalSigning> PersonalSignList { get; set; }

    }

}
