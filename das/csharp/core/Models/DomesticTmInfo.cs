// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 国内商标信息
    public class DomesticTmInfo : TeaModel {
        // 商标名称
        [NameInMap("tm_name")]
        [Validation(Required=false)]
        public string TmName { get; set; }

        // 注册证号
        [NameInMap("tm_reg_num")]
        [Validation(Required=false)]
        public string TmRegNum { get; set; }

        // 国际分类
        [NameInMap("int_cls")]
        [Validation(Required=false)]
        public string IntCls { get; set; }

        // 商标状态
        [NameInMap("tm_status")]
        [Validation(Required=false)]
        public string TmStatus { get; set; }

        // 专用期开始时间
        [NameInMap("property_bgn_date")]
        [Validation(Required=false)]
        public string PropertyBgnDate { get; set; }

        // 注册日期
        // 
        [NameInMap("reg_date")]
        [Validation(Required=false)]
        public string RegDate { get; set; }

        // 是否共有商标
        [NameInMap("is_share")]
        [Validation(Required=false)]
        public bool? IsShare { get; set; }

        // 商标共有人信息(共有商标才有该数据)
        [NameInMap("coowner_infos")]
        [Validation(Required=false)]
        public List<TmCoownerInfo> CoownerInfos { get; set; }

        // 专用期结束时间
        [NameInMap("property_end_date")]
        [Validation(Required=false)]
        public string PropertyEndDate { get; set; }

        // 商标类别
        [NameInMap("form_type")]
        [Validation(Required=false)]
        public string FormType { get; set; }

        // 权利人中文名称
        [NameInMap("owner_name_cn")]
        [Validation(Required=false)]
        public string OwnerNameCn { get; set; }

        // 权利人中文地址
        [NameInMap("owner_addr_cn")]
        [Validation(Required=false)]
        public string OwnerAddrCn { get; set; }

        // 权利人英文名称
        [NameInMap("owner_name_en")]
        [Validation(Required=false)]
        public string OwnerNameEn { get; set; }

        // 权利人英文地址
        [NameInMap("owner_addr_en")]
        [Validation(Required=false)]
        public string OwnerAddrEn { get; set; }

        // 申请人中文名称
        [NameInMap("applicant_name_cn")]
        [Validation(Required=false)]
        public string ApplicantNameCn { get; set; }

        // 申请人中文地址
        [NameInMap("applicant_addr_cn")]
        [Validation(Required=false)]
        public string ApplicantAddrCn { get; set; }

        // 申请人外文名称
        [NameInMap("applicant_name_en")]
        [Validation(Required=false)]
        public string ApplicantNameEn { get; set; }

        // 申请人英文地址
        [NameInMap("applicant_addr_en")]
        [Validation(Required=false)]
        public string ApplicantAddrEn { get; set; }

        // 权利人社会信用统一代码
        [NameInMap("owner_uscc")]
        [Validation(Required=false)]
        public string OwnerUscc { get; set; }

    }

}
