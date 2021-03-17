// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 个人签署信息
    public class PersonalSigning : TeaModel {
        // 数字房产账户 ID
        // 
        [NameInMap("personal_id")]
        [Validation(Required=true)]
        public string PersonalId { get; set; }

        // 个人印章 ID，如不填写则使用个人默认印章，如果无默认印章则报错
        [NameInMap("personal_seal_id")]
        [Validation(Required=false)]
        public string PersonalSealId { get; set; }

        // 个人签署页码，本签名最终签署到协议哪一页
        [NameInMap("personal_sign_page_no")]
        [Validation(Required=true)]
        public long? PersonalSignPageNo { get; set; }

        // 个人签署页位置的X坐标，为距离左侧边界的位置，单位为PX
        [NameInMap("personal_sign_coordinate_x")]
        [Validation(Required=true)]
        public string PersonalSignCoordinateX { get; set; }

        // 个人签署页位置的Y坐标，为距离下边界的位置，单位为PX，计算方法同上。关于签署位置 XY 坐标的计算方法请参考文档：https://antchain.antgroup.com/docs/11/155164，注意XY为签署区中心的点的坐标，需要考虑前后距离防止遮挡文字。
        [NameInMap("personal_sign_coordinate_y")]
        [Validation(Required=true)]
        public string PersonalSignCoordinateY { get; set; }

    }

}
