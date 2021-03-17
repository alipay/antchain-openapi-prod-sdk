// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 抵押登记权证
    public class MgCert : TeaModel {
        // 房产编号
        [NameInMap("house_no")]
        [Validation(Required=false)]
        public string HouseNo { get; set; }

        // 坐落
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 抵押登记回执编号
        [NameInMap("mg_cert_no")]
        [Validation(Required=false)]
        public string MgCertNo { get; set; }

        // 新他项权证号
        [NameInMap("new_other_right_cert_no")]
        [Validation(Required=false)]
        public string NewOtherRightCertNo { get; set; }

        // 新他项权证电子证照地址
        [NameInMap("new_other_right_cert_path")]
        [Validation(Required=false)]
        public string NewOtherRightCertPath { get; set; }

        // 新他项权证类型，比如：MORTGAGE_REG_CERT=不动产登记证明(抵押权登记)
        [NameInMap("new_other_right_cert_type")]
        [Validation(Required=false)]
        public string NewOtherRightCertType { get; set; }

        // 权利人
        [NameInMap("mortgagee_json")]
        [Validation(Required=false)]
        public string MortgageeJson { get; set; }

        // 抵押义务人
        [NameInMap("mortgagor_json")]
        [Validation(Required=false)]
        public string MortgagorJson { get; set; }

        // 证明权力或事项
        [NameInMap("proof")]
        [Validation(Required=false)]
        public string Proof { get; set; }

        // 不动产返回其他信息
        [NameInMap("other")]
        [Validation(Required=false)]
        public string Other { get; set; }

        // 不动产返回附记信息
        [NameInMap("supplement")]
        [Validation(Required=false)]
        public string Supplement { get; set; }

        // 发证工本号
        [NameInMap("license_number")]
        [Validation(Required=false)]
        public string LicenseNumber { get; set; }

        // 缮证人
        [NameInMap("printer")]
        [Validation(Required=false)]
        public string Printer { get; set; }

        // 缮证时间
        [NameInMap("print_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PrintTime { get; set; }

        // 发证人
        [NameInMap("issuer")]
        [Validation(Required=false)]
        public string Issuer { get; set; }

        // 发证时间
        [NameInMap("issuance_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string IssuanceTime { get; set; }

        // 区县代码
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 省编号
        [NameInMap("province_code")]
        [Validation(Required=false)]
        public string ProvinceCode { get; set; }

        // 不动产单元号
        [NameInMap("house_unit_code")]
        [Validation(Required=false)]
        public string HouseUnitCode { get; set; }

        // 是否在房产链已解抵
        [NameInMap("released")]
        [Validation(Required=false)]
        public string Released { get; set; }

        // 房产链内部解抵押单号
        [NameInMap("mg_release_order_no")]
        [Validation(Required=false)]
        public string MgReleaseOrderNo { get; set; }

        // 登记证明种类,MORTGAGE=抵押权证明
        [NameInMap("reg_cert_type")]
        [Validation(Required=false)]
        public string RegCertType { get; set; }

        // 发证机关
        [NameInMap("issuing_authority")]
        [Validation(Required=false)]
        public string IssuingAuthority { get; set; }

        // 债权金额
        [NameInMap("debt_amt")]
        [Validation(Required=false)]
        public string DebtAmt { get; set; }

        // 抵押权开始时间
        [NameInMap("mg_right_start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string MgRightStartDate { get; set; }

        // 抵押权结束日期
        [NameInMap("mg_right_end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string MgRightEndDate { get; set; }

        // 抵押方式，MAX_AMOUNT_MORT=最高额抵押
        [NameInMap("mortgage_type")]
        [Validation(Required=false)]
        public string MortgageType { get; set; }

    }

}
