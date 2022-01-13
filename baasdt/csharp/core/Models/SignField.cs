// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 区块链合同签署区信息
    public class SignField : TeaModel {
        // 签署操作人个人账号标识，即操作本次签署的个人
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 签署所在页码，必须是整数数字
        [NameInMap("pos_page")]
        [Validation(Required=true)]
        public string PosPage { get; set; }

        // x坐标，必须是数字
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // y坐标，必须是数字
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

    }

}
