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
        /// <summary>
        /// <b>Example:</b>
        /// <para>208834525645xxxx</para>
        /// </summary>
        [NameInMap("opposing_userid")]
        [Validation(Required=false, MaxLength=128)]
        public string OpposingUserid { get; set; }

        // 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
        /// <summary>
        /// <b>Example:</b>
        /// <para>021uU206oUtUsckXA1rpUpiWpFwNTOFzX00gV0PIrkWxxxx</para>
        /// </summary>
        [NameInMap("opposing_open_id")]
        [Validation(Required=false, MaxLength=128)]
        public string OpposingOpenId { get; set; }

        // 服务二级分类
        /// <summary>
        /// <b>Example:</b>
        /// <para>category1</para>
        /// </summary>
        [NameInMap("service_category")]
        [Validation(Required=false, MaxLength=128)]
        public string ServiceCategory { get; set; }

        // 服务商 pid
        /// <summary>
        /// <b>Example:</b>
        /// <para>208834525645xxxx</para>
        /// </summary>
        [NameInMap("isv_pid")]
        [Validation(Required=false, MaxLength=128)]
        public string IsvPid { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6228xxxxxxxxxxxxx13</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=false, MaxLength=128)]
        public string BankCardNo { get; set; }

        // 手机序列号
        /// <summary>
        /// <b>Example:</b>
        /// <para>86573603141xxxx</para>
        /// </summary>
        [NameInMap("imei")]
        [Validation(Required=false, MaxLength=128)]
        public string Imei { get; set; }

        // 国际移动用户识别码
        /// <summary>
        /// <b>Example:</b>
        /// <para>46000123456xxxx</para>
        /// </summary>
        [NameInMap("imsi")]
        [Validation(Required=false, MaxLength=128)]
        public string Imsi { get; set; }

        // 金额，用户购买或使用服务时产生的具体金额，单位：分
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000</para>
        /// </summary>
        [NameInMap("sales_amount")]
        [Validation(Required=false)]
        public long? SalesAmount { get; set; }

        // 用户姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false, MaxLength=128)]
        public string UserName { get; set; }

        // 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        /// <summary>
        /// <b>Example:</b>
        /// <para>CATERING</para>
        /// </summary>
        [NameInMap("store_mcc_desc")]
        [Validation(Required=false, MaxLength=30)]
        public string StoreMccDesc { get; set; }

        // 消费者 id，外部会员账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1232xxxx</para>
        /// </summary>
        [NameInMap("customer_id")]
        [Validation(Required=true, MaxLength=128)]
        public string CustomerId { get; set; }

        // 填入想要咨询风控的二维码值，需为唯一值
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://xxxxxx/b/26acfacxxxxxx">http://xxxxxx/b/26acfacxxxxxx</a></para>
        /// </summary>
        [NameInMap("qr_code")]
        [Validation(Required=false, MaxLength=256)]
        public string QrCode { get; set; }

    }

}
