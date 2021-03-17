// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 机构签署信息
    public class OrgSigning : TeaModel {
        // 企业印章ID，如不填写则使用企业默认印章，如果无默认印章则报错
        [NameInMap("org_seal_id")]
        [Validation(Required=false)]
        public string OrgSealId { get; set; }

        // 机构签署页码，从第1页开始
        // 
        // 
        [NameInMap("org_sign_page_no")]
        [Validation(Required=true)]
        public long? OrgSignPageNo { get; set; }

        // 机构签署页位置的X坐标，企业盖章页位置的X坐标值，为距离左边边界的位置，单位为PX
        // 
        // 
        [NameInMap("org_sign_coordinate_x")]
        [Validation(Required=true)]
        public string OrgSignCoordinateX { get; set; }

        // 机构签署页位置的Y坐标，企业盖章页位置的Y坐标值，为距离下边界的位置，单位为PX。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
        [NameInMap("org_sign_coordinate_y")]
        [Validation(Required=true)]
        public string OrgSignCoordinateY { get; set; }

    }

}
