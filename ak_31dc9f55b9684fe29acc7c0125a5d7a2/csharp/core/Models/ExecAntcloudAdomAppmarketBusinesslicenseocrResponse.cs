// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_31dc9f55b9684fe29acc7c0125a5d7a2.Models
{
    public class ExecAntcloudAdomAppmarketBusinesslicenseocrResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 经营范围
        [NameInMap("business")]
        [Validation(Required=false)]
        public string Business { get; set; }

        // 注册资本
        [NameInMap("captial")]
        [Validation(Required=false)]
        public string Captial { get; set; }

        // 企业成立日期
        [NameInMap("establish_date")]
        [Validation(Required=false)]
        public string EstablishDate { get; set; }

        // 名称，控股股东名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 法定代表人
        [NameInMap("person")]
        [Validation(Required=false)]
        public string Person { get; set; }

        // 统一社会信用代码，控股股东证件号码
        [NameInMap("reg_num")]
        [Validation(Required=false)]
        public string RegNum { get; set; }

        // 印章
        [NameInMap("stamp")]
        [Validation(Required=false)]
        public string Stamp { get; set; }

        // 类型，如：有限责任公司(自然人独资)
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 营业期限，营业执照有效期，控股股东证件有效期
        [NameInMap("valid_period")]
        [Validation(Required=false)]
        public string ValidPeriod { get; set; }

        // 标题，如"营业执照"
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 颁发日期
        [NameInMap("date")]
        [Validation(Required=false)]
        public string Date { get; set; }

        // 编号
        [NameInMap("num")]
        [Validation(Required=false)]
        public string Num { get; set; }

        // 投资人
        [NameInMap("investors")]
        [Validation(Required=false)]
        public string Investors { get; set; }

        // 组成形式
        [NameInMap("formation")]
        [Validation(Required=false)]
        public string Formation { get; set; }

        // 注册日期
        [NameInMap("date_of_registration")]
        [Validation(Required=false)]
        public string DateOfRegistration { get; set; }

        // 经营者
        [NameInMap("operators")]
        [Validation(Required=false)]
        public string Operators { get; set; }

    }

}
