// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVerifyCarinspectRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型，通常需要与授权宝服务沟通确定，业务类型可能影响此接口内部实现逻辑，长度不超过32字符。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 车牌号，内容大写，不带空格。
        [NameInMap("plate_no")]
        [Validation(Required=true)]
        public string PlateNo { get; set; }

        // 非必填参数，号牌种类说明，比如"01"代表大型汽车，具体类型入参说明参考文档枚举。
        [NameInMap("plate_type")]
        [Validation(Required=false)]
        public string PlateType { get; set; }

    }

}
