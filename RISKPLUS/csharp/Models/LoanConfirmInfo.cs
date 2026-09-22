// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 借款确认信息
    public class LoanConfirmInfo : TeaModel {
        // 借款本金
        /// <summary>
        /// <b>Example:</b>
        /// <para>1000.00</para>
        /// </summary>
        [NameInMap("loan_prin")]
        [Validation(Required=true)]
        public string LoanPrin { get; set; }

        // 还款方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

        // 实际年化利率,单位：%，2
        // 位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>15.00</para>
        /// </summary>
        [NameInMap("actual_rate")]
        [Validation(Required=true)]
        public string ActualRate { get; set; }

        // 优惠前年化利率,单位：%，2
        // 位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>15.00</para>
        /// </summary>
        [NameInMap("pre_disc_rate")]
        [Validation(Required=false)]
        public string PreDiscRate { get; set; }

        // 借款期数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("loan_term")]
        [Validation(Required=true)]
        public string LoanTerm { get; set; }

        // 借款总利息,单位：元，
        // 2 位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>213.00</para>
        /// </summary>
        [NameInMap("total_int")]
        [Validation(Required=false)]
        public string TotalInt { get; set; }

        // 借款起始日,整笔借据的
        // 开始时间 格
        // 式：yyyy-
        // MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999-01-01</para>
        /// </summary>
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 借款到期日,格式：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>2000-01-01</para>
        /// </summary>
        [NameInMap("expire_date")]
        [Validation(Required=true)]
        public string ExpireDate { get; set; }

        // 借款总天数，单位：天，不传expire_date时上送
        /// <summary>
        /// <b>Example:</b>
        /// <para>120</para>
        /// </summary>
        [NameInMap("total_days")]
        [Validation(Required=false)]
        public string TotalDays { get; set; }

        // 还款计划列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("repay_plans")]
        [Validation(Required=true)]
        public List<RepayPlan> RepayPlans { get; set; }

        // 客户姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("cust_name")]
        [Validation(Required=true)]
        public string CustName { get; set; }

        // 身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>101101200101011234</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 联系电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>18612341234</para>
        /// </summary>
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 居住地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX省XX市XX区</para>
        /// </summary>
        [NameInMap("home_addr")]
        [Validation(Required=true)]
        public string HomeAddr { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8888888888888888888</para>
        /// </summary>
        [NameInMap("bank_card_no")]
        [Validation(Required=true)]
        public string BankCardNo { get; set; }

        // 开户行
        /// <summary>
        /// <b>Example:</b>
        /// <para>中国工商银行</para>
        /// </summary>
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 银行编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ICBC</para>
        /// </summary>
        [NameInMap("bank_code")]
        [Validation(Required=false)]
        public string BankCode { get; set; }

        // 户籍所在地
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX省XX市XX区</para>
        /// </summary>
        [NameInMap("cert_addr")]
        [Validation(Required=false)]
        public string CertAddr { get; set; }

        // 常用地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>XX省XX市XX区</para>
        /// </summary>
        [NameInMap("comm_addr")]
        [Validation(Required=false)]
        public string CommAddr { get; set; }

        // 优惠前还款计划，有优惠时必填
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("disc_plans")]
        [Validation(Required=false)]
        public List<RepayPlan> DiscPlans { get; set; }

        // 优惠信息，优惠活动说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>首笔利率 8 折</para>
        /// </summary>
        [NameInMap("disc_info")]
        [Validation(Required=false)]
        public string DiscInfo { get; set; }

        // 逾期罚息利率，单位 %，2位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>15.33</para>
        /// </summary>
        [NameInMap("overdue_rate")]
        [Validation(Required=false)]
        public string OverdueRate { get; set; }

        // 挪用罚息利率，单位 %，2位小数
        /// <summary>
        /// <b>Example:</b>
        /// <para>15.00</para>
        /// </summary>
        [NameInMap("misuse_rate")]
        [Validation(Required=false)]
        public string MisuseRate { get; set; }

        // lpr利率，固定一年期,
        // 单位%
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.50</para>
        /// </summary>
        [NameInMap("lpr")]
        [Validation(Required=false)]
        public string Lpr { get; set; }

        // lpr发布时间，格式：yyyy-MM-dd
        /// <summary>
        /// <b>Example:</b>
        /// <para>1999-01-01</para>
        /// </summary>
        [NameInMap("lpr_day")]
        [Validation(Required=false)]
        public string LprDay { get; set; }

        // 上浮基点，100bp=1%
        /// <summary>
        /// <b>Example:</b>
        /// <para>1500</para>
        /// </summary>
        [NameInMap("bp")]
        [Validation(Required=false)]
        public string Bp { get; set; }

        // 手续费利率，增信服务费年利率，单位 %
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.12</para>
        /// </summary>
        [NameInMap("fee_rate")]
        [Validation(Required=false)]
        public string FeeRate { get; set; }

        // 固收利率，固守年利率，单位 %
        /// <summary>
        /// <b>Example:</b>
        /// <para>3.12</para>
        /// </summary>
        [NameInMap("fix_rate")]
        [Validation(Required=false)]
        public string FixRate { get; set; }

        // 固收主体，默认：浙江宁银消费金融股份有限公司
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江宁 银消费金融 股份有限公 司</para>
        /// </summary>
        [NameInMap("fix_company")]
        [Validation(Required=false)]
        public string FixCompany { get; set; }

        // 融担公司主体,若有多家融担公司，以逗号分隔
        /// <summary>
        /// <b>Example:</b>
        /// <para>融担公司1，融担公司2</para>
        /// </summary>
        [NameInMap("fee_company")]
        [Validation(Required=false)]
        public string FeeCompany { get; set; }

    }

}
