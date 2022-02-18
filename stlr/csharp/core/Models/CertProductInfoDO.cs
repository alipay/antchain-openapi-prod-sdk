// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 证书产品信息，包括证书详情、授权产品信息
    public class CertProductInfoDO : TeaModel {
        // 同证书信息显示
        [NameInMap("certification_no")]
        [Validation(Required=true)]
        public string CertificationNo { get; set; }

        // 同证书信息显示
        [NameInMap("certification_type")]
        [Validation(Required=true)]
        public string CertificationType { get; set; }

        // 同证书信息显示
        [NameInMap("certification_name")]
        [Validation(Required=true)]
        public string CertificationName { get; set; }

        // 同证书信息显示
        [NameInMap("authentication_name")]
        [Validation(Required=true)]
        public string AuthenticationName { get; set; }

        // 证书颁发时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public string IssueTime { get; set; }

        // 证书到期时间
        [NameInMap("invalid_time")]
        [Validation(Required=true)]
        public string InvalidTime { get; set; }

        // 同证书信息显示
        [NameInMap("certification_agent")]
        [Validation(Required=true)]
        public string CertificationAgent { get; set; }

        // 同证书信息显示
        [NameInMap("manufacturer")]
        [Validation(Required=false)]
        public string Manufacturer { get; set; }

        // 同证书信息显示
        [NameInMap("cproduct_firm")]
        [Validation(Required=false)]
        public string CproductFirm { get; set; }

        // 同证书信息显示
        [NameInMap("certification_level")]
        [Validation(Required=false)]
        public string CertificationLevel { get; set; }

        // 同证书信息显示
        [NameInMap("cproduct_name")]
        [Validation(Required=false)]
        public string CproductName { get; set; }

        // 同证书信息显示
        [NameInMap("cproduct_model")]
        [Validation(Required=false)]
        public string CproductModel { get; set; }

        // 证书文件地址
        [NameInMap("certification_file_address")]
        [Validation(Required=true)]
        public string CertificationFileAddress { get; set; }

        // 证书授权的三方平台产品列表
        [NameInMap("auth_products")]
        [Validation(Required=false)]
        public List<CertProductAuthDO> AuthProducts { get; set; }

    }

}
