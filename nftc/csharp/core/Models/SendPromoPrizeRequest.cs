// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class SendPromoPrizeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 鲸探用户唯一标识
        [NameInMap("open_user_id")]
        [Validation(Required=true)]
        public string OpenUserId { get; set; }

        // 海豚活动ID，鲸探运营在海豚创建的活动ID
        [NameInMap("camp_id")]
        [Validation(Required=true)]
        public string CampId { get; set; }

        // 海豚奖品ID，鲸探运营在海豚创建的奖品ID
        [NameInMap("prize_id")]
        [Validation(Required=true)]
        public string PrizeId { get; set; }

        // 调用方唯一幂等号
        [NameInMap("biz_no")]
        [Validation(Required=true)]
        public string BizNo { get; set; }

    }

}
