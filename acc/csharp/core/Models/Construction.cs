// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 企业施工资质
    public class Construction : TeaModel {
        // 证书编号
        // 
        // 
        [NameInMap("cert_num")]
        [Validation(Required=true)]
        public string CertNum { get; set; }

        // 发证机关
        // 
        // 
        [NameInMap("issuing_authority")]
        [Validation(Required=true)]
        public string IssuingAuthority { get; set; }

        // 资质类别
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 等级
        [NameInMap("level")]
        [Validation(Required=true)]
        public string Level { get; set; }

        // 有效期开始日期（yyyy-MM-dd）
        // 
        // 
        [NameInMap("effect_start_date")]
        [Validation(Required=true)]
        public string EffectStartDate { get; set; }

        // 有效期结束日期（yyyy-MM-dd）
        // 
        // 
        [NameInMap("effect_end_date")]
        [Validation(Required=true)]
        public string EffectEndDate { get; set; }

        // 文件
        [NameInMap("file_defines")]
        [Validation(Required=false)]
        public List<FileDefine> FileDefines { get; set; }

        // key
        [NameInMap("construction_id")]
        [Validation(Required=true)]
        public string ConstructionId { get; set; }

        // 证件名称
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

    }

}
