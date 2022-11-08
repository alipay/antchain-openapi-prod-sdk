// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class CreateActivitychainrecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部活动ID
        [NameInMap("activity_id")]
        [Validation(Required=true, MaxLength=50)]
        public string ActivityId { get; set; }

        // 支付宝用户UID：,固定16位长度
        [NameInMap("alipay_user_id")]
        [Validation(Required=true, MaxLength=16)]
        public string AlipayUserId { get; set; }

        // 支付宝用户昵称(脱敏)
        [NameInMap("alipay_user_nick_name")]
        [Validation(Required=false, MaxLength=50)]
        public string AlipayUserNickName { get; set; }

        // 捐赠记录ID：(同一租户下需要做幂等)
        [NameInMap("activity_record_id")]
        [Validation(Required=true, MaxLength=50)]
        public string ActivityRecordId { get; set; }

        // 捐赠类型：固定为【point/money】,point为积分兑换捐赠类型，money为购买商品捐钱类型
        [NameInMap("donate_type")]
        [Validation(Required=true)]
        public string DonateType { get; set; }

        // 捐赠数量：积分个数、金额数量，若为金额(单位为分)
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 捐赠流水号
        [NameInMap("proof_data")]
        [Validation(Required=false, MaxLength=50)]
        public string ProofData { get; set; }

        // 捐赠描述（积分,钱等等）
        [NameInMap("donate_goods_name")]
        [Validation(Required=true, MaxLength=200)]
        public string DonateGoodsName { get; set; }

        // 商品名称，如：维他奶
        [NameInMap("goods_name")]
        [Validation(Required=false, MaxLength=100)]
        public string GoodsName { get; set; }

        // 单位：个、CNY
        [NameInMap("unit")]
        [Validation(Required=false, MaxLength=50)]
        public string Unit { get; set; }

        // 支付方式：【wechat/alipay/bank/exchangePoint】
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

        // 固定13位数字
        [NameInMap("donate_time")]
        [Validation(Required=true)]
        public long? DonateTime { get; set; }

    }

}
