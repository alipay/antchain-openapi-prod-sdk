// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceYzbreportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
        // yyyyMMdd请传递当前时间。 
        // 身份标识可自定义。
        // 其他编码建议为随机值。
        // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 保司编码，PAIC---平安、CPIC---太保
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码，05-驿站宝
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 保单号，申请理赔的保单号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=200)]
        public string PolicyNo { get; set; }

        // 报案号，用于报案材料更新
        [NameInMap("report_no")]
        [Validation(Required=false)]
        public string ReportNo { get; set; }

        // 报案唯一标识，申请理赔所关联的订单号，如一个订单会存在多次理赔，请用唯一标识
        [NameInMap("report_unique_key")]
        [Validation(Required=true, MaxLength=200)]
        public string ReportUniqueKey { get; set; }

        // 理赔申请人
        [NameInMap("claim_apply_person")]
        [Validation(Required=true, MaxLength=100)]
        public string ClaimApplyPerson { get; set; }

        // 报案人名称
        [NameInMap("reporter_name")]
        [Validation(Required=true, MaxLength=100)]
        public string ReporterName { get; set; }

        // 报案人联系方式
        [NameInMap("reporter_contact")]
        [Validation(Required=true, MaxLength=20)]
        public string ReporterContact { get; set; }

        // 出险时间，发生损失的时间 yyyy-mm-dd hh:mm:ss
        [NameInMap("accident_time")]
        [Validation(Required=true)]
        public string AccidentTime { get; set; }

        // 出险城市编码，国家地理位置编码6位城市编码
        [NameInMap("accident_city_code")]
        [Validation(Required=true, MaxLength=10)]
        public string AccidentCityCode { get; set; }

        // 出险区县编码，国家地理位置编码6位城市编码
        [NameInMap("accident_district_code")]
        [Validation(Required=true, MaxLength=10)]
        public string AccidentDistrictCode { get; set; }

        // 出险详细地址，事发出险地的详细地址
        [NameInMap("accident_address")]
        [Validation(Required=true, MaxLength=500)]
        public string AccidentAddress { get; set; }

        // 出险原因代码，包裹破损丢失-R3028，火灾-R3025，爆炸-R3026，水湿-R3036，自燃-R3038，其他意外-R3039
        [NameInMap("accident_cause_code")]
        [Validation(Required=true, MaxLength=10)]
        public string AccidentCauseCode { get; set; }

        // 出险详细经过
        [NameInMap("accident_detail")]
        [Validation(Required=true, MaxLength=500)]
        public string AccidentDetail { get; set; }

        // 损失预估总金额，单位（元），最多支持2位小数
        [NameInMap("loss_estimate_total_amount")]
        [Validation(Required=true)]
        public string LossEstimateTotalAmount { get; set; }

        // 损失类型，1-人伤，2-车损,，3-物损，6-其它损失，多种损失以英文逗号分隔
        [NameInMap("loss_type")]
        [Validation(Required=true, MaxLength=50)]
        public string LossType { get; set; }

        // 快递公司，申请理赔所关联的快递公司名称，包裹出险可填
        [NameInMap("courier_company")]
        [Validation(Required=false, MaxLength=200)]
        public string CourierCompany { get; set; }

        // 投诉工单号，申请理赔所关联的投诉工单号，包裹出险可填
        [NameInMap("complaint_job_no")]
        [Validation(Required=false, MaxLength=100)]
        public string ComplaintJobNo { get; set; }

        // 运单号，申请理赔所关联的运单号，包裹出险可填
        [NameInMap("way_bill_no")]
        [Validation(Required=false, MaxLength=100)]
        public string WayBillNo { get; set; }

        // 支付信息
        [NameInMap("payment_info")]
        [Validation(Required=false)]
        public PaymentInfo PaymentInfo { get; set; }

        // 人员伤残情况
        [NameInMap("person_loss")]
        [Validation(Required=false)]
        public PersonLoss PersonLoss { get; set; }

        // 车辆损失详情
        [NameInMap("car_loss")]
        [Validation(Required=false)]
        public CarLoss CarLoss { get; set; }

        // 货物损失详情
        [NameInMap("cargo_loss")]
        [Validation(Required=false)]
        public CargoLoss CargoLoss { get; set; }

        // 文档信息
        [NameInMap("documents")]
        [Validation(Required=false)]
        public List<Document> Documents { get; set; }

        // 判责工单号
        [NameInMap("duty_work_no")]
        [Validation(Required=false, MaxLength=100)]
        public string DutyWorkNo { get; set; }

        // 快递或包裹进入驿站仓储时间，yyyy-mm-dd hh:mm:ss
        [NameInMap("pkg_in_date")]
        [Validation(Required=false, MaxLength=20)]
        public string PkgInDate { get; set; }

        // 驿站针对快递或包裹的出库时间（配送上门传送待签收时间），yyyy-mm-dd hh:mm:ss
        [NameInMap("pkg_out_date")]
        [Validation(Required=false, MaxLength=20)]
        public string PkgOutDate { get; set; }

        // 发票工单投诉时间，yyyy-mm-dd hh:mm:ss
        [NameInMap("gen_work_date")]
        [Validation(Required=false, MaxLength=20)]
        public string GenWorkDate { get; set; }

        // 工单类型
        [NameInMap("work_type")]
        [Validation(Required=false, MaxLength=20)]
        public string WorkType { get; set; }

        // 是否星级站点，0是，1否
        [NameInMap("is_star_station")]
        [Validation(Required=false)]
        public string IsStarStation { get; set; }

        // 被保人姓名，实际的保险被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=false)]
        public string BbrName { get; set; }

        // 被保人证件类型，01--居民身份证、03--营业执照
        [NameInMap("bbr_id_type")]
        [Validation(Required=false)]
        public string BbrIdType { get; set; }

        // 被保人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=false)]
        public string BbrIdNo { get; set; }

        // 保险起期，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_start")]
        [Validation(Required=false)]
        public string InsureStart { get; set; }

        // 保险止期，格式：yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_end")]
        [Validation(Required=false)]
        public string InsureEnd { get; set; }

        // 套餐编码， 平安（PK00053022、PK00053025、PK00053026、PK00125463、PK00125467） 太保（xjbdbnd01、pssmyd02、xnfayd03、xnfayd04、xnfayd05）
        [NameInMap("product_package_type")]
        [Validation(Required=false)]
        public string ProductPackageType { get; set; }

    }

}
