// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryIcmInvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ISV名称，用于标识合作的企业
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // 授权类型
        // 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        //  数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
        // 
        [NameInMap("callback_url")]
        [Validation(Required=false)]
        public string CallbackUrl { get; set; }

        // java long型
        // 起始金额，当type=03（报销查询）时必填
        [NameInMap("end_amount")]
        [Validation(Required=false)]
        public long? EndAmount { get; set; }

        // 查询起始时间(当auth_type=02或者03时必填)
        // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        // 最大查询范围为6.1-6.30
        [NameInMap("end_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndDate { get; set; }

        // 非必填，不填则查询所有类型发票
        // "01": "增值税专用发票"
        // "04": "增值税普通发票"
        // "10": "增值税电子普通发票"
        [NameInMap("invoice_type")]
        [Validation(Required=false)]
        public string InvoiceType { get; set; }

        // 查询的企业纳税人识别号
        [NameInMap("nsrsbh")]
        [Validation(Required=true)]
        public string Nsrsbh { get; set; }

        // 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // java long型
        // 起始金额，当type=03（报销查询）时必填
        [NameInMap("start_amount")]
        [Validation(Required=false)]
        public long? StartAmount { get; set; }

        // 查询起始时间(当auth_type=02或者03时必填)
        // 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        // 最大查询范围为6.1-6.30
        [NameInMap("start_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartDate { get; set; }

        // 地区编码
        [NameInMap("city_code")]
        [Validation(Required=true)]
        public string CityCode { get; set; }

    }

}
