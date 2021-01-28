// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateContractAccountsealRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 电子合同用户ID（在twc.notary.contract.account.create接口中创建）
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 印章别名
        [NameInMap("alias")]
        [Validation(Required=false)]
        public string Alias { get; set; }

        // 印章颜色，RED-红色， BLUE-蓝色，BLACK-黑色
        [NameInMap("color")]
        [Validation(Required=true)]
        public string Color { get; set; }

        // 印章高度, 默认95px
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 印章宽度, 默认95px
        [NameInMap("width")]
        [Validation(Required=false)]
        public long? Width { get; set; }

        // 模板类型, 详见个人印章样式说明 SQUARE, BORDERLESS, FZKC, HWLS, HWXK, HWXKBORDER, HYLSF, RECTANGLE, YGYJFCS, YGYMBXS, YYGXSF
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
