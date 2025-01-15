// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销发奖风险识别入参模型
    public class AwardingQueryModel : TeaModel {
        // 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
        [NameInMap("opposing_userid")]
        [Validation(Required=false, MaxLength=128)]
        public string OpposingUserid { get; set; }

        // 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
        [NameInMap("opposing_open_id")]
        [Validation(Required=false, MaxLength=128)]
        public string OpposingOpenId { get; set; }

        // 服务二级分类
        [NameInMap("service_category")]
        [Validation(Required=false, MaxLength=128)]
        public string ServiceCategory { get; set; }

        // 服务商 pid
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 银行卡号
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=128)]
        public string BankCardNo { get; set; }

        // 手机序列号
        [NameInMap("imei")]
        [Validation(Required=false, MaxLength=128)]
        public string Imei { get; set; }

        // 国际移动用户识别码
        [NameInMap("imsi")]
        [Validation(Required=false, MaxLength=128)]
        public string Imsi { get; set; }

        // 金额，用户购买或使用服务时产生的具体金额，单位：分
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=false, MaxLength=128)]
        public string UserName { get; set; }

        // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        [NameInMap("store_mcc_desc")]
        [Validation(Required=false, MaxLength=30)]
        public string StoreMccDesc { get; set; }

        // 消费者 id，外部会员账号
        [NameInMap("customer_id")]
        [Validation(Required=true, MaxLength=128)]
        public string CustomerId { get; set; }

        // 填入想要咨询风控的二维码值，需为唯一值
        [NameInMap("qr_code")]
        [Validation(Required=false, MaxLength=256)]
        public string QrCode { get; set; }

    }

}
