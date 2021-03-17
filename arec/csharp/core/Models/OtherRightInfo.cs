// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 他项权证信息
    public class OtherRightInfo : TeaModel {
        // 权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
        [NameInMap("realty_cert_type")]
        [Validation(Required=true)]
        public string RealtyCertType { get; set; }

        // 权证号码
        [NameInMap("realty_cert_no")]
        [Validation(Required=true)]
        public string RealtyCertNo { get; set; }

        // 权利人
        [NameInMap("obligee")]
        [Validation(Required=true)]
        public EntityBasicInfo Obligee { get; set; }

        // 原他项权证号
        [NameInMap("old_other_realty_cert_no")]
        [Validation(Required=false)]
        public string OldOtherRealtyCertNo { get; set; }

        // 坐落
        [NameInMap("location")]
        [Validation(Required=true)]
        public string Location { get; set; }

        // 新他项权证类型，可选值：PROP_RIGHT_CERT("房地产权证")、HOUSE_PROP_RIGHT_CERT("房屋所有权证")、HOUSE_OWNERSHIP_CERT("房屋所有权证")、 OTHER_RIGHT_CERT("房屋他项权证")、REALTY_OWNERSHIP_CERT("不动产权证")、 MORTGAGE_REG_CERT("不动产登记证明(抵押权登记)")
        [NameInMap("new_other_right_cert_type")]
        [Validation(Required=true)]
        public string NewOtherRightCertType { get; set; }

        // 新他项权证号
        [NameInMap("new_other_right_cert_no")]
        [Validation(Required=true)]
        public string NewOtherRightCertNo { get; set; }

        // 新他项权证电子证照地址，他项权证电子证照上传到房产链的路径
        [NameInMap("new_other_right_cert_path")]
        [Validation(Required=true)]
        public string NewOtherRightCertPath { get; set; }

    }

}
