// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_3d5ac8b5948b43e7a7b8f62c44a6880f.Models
{
    // 合同
    public class Agreement : TeaModel {
        // 电子合同pdf文件存储路径
        [NameInMap("ar_archive_oss_path")]
        [Validation(Required=false)]
        public string ArArchiveOssPath { get; set; }

        // 合同编号
        [NameInMap("ar_no")]
        [Validation(Required=false)]
        public string ArNo { get; set; }

        // 合同模版
        [NameInMap("ar_template")]
        [Validation(Required=false)]
        public ArTemplate ArTemplate { get; set; }

        // 合同类型，比如：房屋查询授权合同
        [NameInMap("ar_type")]
        [Validation(Required=false)]
        public string ArType { get; set; }

        // 需要签署合同的角色列表，如：BANK,HOUSE_OWNER,BORROWER
        [NameInMap("ar_signer_roles")]
        [Validation(Required=false)]
        public List<string> ArSignerRoles { get; set; }

        // 合同模版需要的变量和值集合,Map<String,String>的json格式
        [NameInMap("ar_var_value_json")]
        [Validation(Required=false)]
        public string ArVarValueJson { get; set; }

        // 区块链智能合同合同文件号
        [NameInMap("myc_file_no")]
        [Validation(Required=false)]
        public string MycFileNo { get; set; }

        // 外部合同编号(银行生成)
        [NameInMap("out_ar_no")]
        [Validation(Required=false)]
        public string OutArNo { get; set; }

        // 合同签署流程编号
        [NameInMap("proc_no")]
        [Validation(Required=false)]
        public string ProcNo { get; set; }

        // 合同签署时间
        [NameInMap("sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SignTime { get; set; }

        // 签署状态，比如：SUCC=签署完成
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 待签署的合同文档oss存储路径，仅当不动产合同才有
        [NameInMap("un_sign_ar_archive_oss_path")]
        [Validation(Required=false)]
        public string UnSignArArchiveOssPath { get; set; }

        // 合同生成方式，AR_TP=模版
        [NameInMap("ar_generate_type")]
        [Validation(Required=false)]
        public string ArGenerateType { get; set; }

        // 智能合同部分的签署区设置
        [NameInMap("ct_sign_configs")]
        [Validation(Required=false)]
        public List<ArSignConfig> CtSignConfigs { get; set; }

        // 机构自主签署部分的签署区设置
        [NameInMap("org_sign_configs")]
        [Validation(Required=false)]
        public List<ArSignConfig> OrgSignConfigs { get; set; }

        // 机构签署状态，SUCC=签署完成
        [NameInMap("org_sign_status")]
        [Validation(Required=false)]
        public string OrgSignStatus { get; set; }

        // 机构签署完成时间
        [NameInMap("org_sign_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string OrgSignTime { get; set; }

        // 机构签署完成后的合同存储路径
        [NameInMap("org_ar_archive_oss_path")]
        [Validation(Required=false)]
        public string OrgArArchiveOssPath { get; set; }

        // 最终签署完成的合同存储路径
        [NameInMap("final_ar_archive_oss_path")]
        [Validation(Required=false)]
        public string FinalArArchiveOssPath { get; set; }

    }

}
