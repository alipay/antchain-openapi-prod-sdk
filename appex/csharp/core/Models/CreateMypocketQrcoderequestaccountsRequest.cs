// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    public class CreateMypocketQrcoderequestaccountsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部业务号
        [NameInMap("out_biz_no")]
        [Validation(Required=true, MaxLength=64)]
        public string OutBizNo { get; set; }

        // 应用唯一标识
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=false, MaxLength=64)]
        public string ChainId { get; set; }

        // 账户类型，枚举值，  MYCHAIN|ETH
        [NameInMap("account_type")]
        [Validation(Required=false)]
        public string AccountType { get; set; }

        // 小程序码颜色，枚举，  ALIPAY_BLUE|BLACK|WHITE
        [NameInMap("color")]
        [Validation(Required=false)]
        public string Color { get; set; }

        // 小程序码大小，枚举，SMALL|MEDIUM|LARGE
        [NameInMap("size")]
        [Validation(Required=false)]
        public string Size { get; set; }

    }

}
