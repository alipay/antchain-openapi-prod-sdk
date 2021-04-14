// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateLeaseOrderinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
        [NameInMap("acutal_pre_auth_free")]
        [Validation(Required=true)]
        public long? AcutalPreAuthFree { get; set; }

        // 融资租赁业务id，由资方控制台创建返回
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 是否启动异步处理订单
        [NameInMap("async")]
        [Validation(Required=false)]
        public long? Async { get; set; }

        // 采购发票地址
        [NameInMap("bill_url")]
        [Validation(Required=false)]
        public string BillUrl { get; set; }

        // 到期买断价 精确到毫厘，即123400表示12.34元
        [NameInMap("buy_out_price")]
        [Validation(Required=true)]
        public long? BuyOutPrice { get; set; }

        // 市编码
        [NameInMap("city_code")]
        [Validation(Required=false)]
        public string CityCode { get; set; }

        // 免押金额 精确到毫厘，即123400表示12.34元
        [NameInMap("deposit_free")]
        [Validation(Required=true)]
        public long? DepositFree { get; set; }

        // 区编码
        [NameInMap("district_code")]
        [Validation(Required=false)]
        public string DistrictCode { get; set; }

        // 融资租赁额外字段
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 安装服务记录哈希
        [NameInMap("install_hash")]
        [Validation(Required=false)]
        public string InstallHash { get; set; }

        // 安装拆卸费 精确到毫厘，即123400表示12.34元
        [NameInMap("install_price")]
        [Validation(Required=false)]
        public long? InstallPrice { get; set; }

        // 安装服务记录链上存证交易哈希
        [NameInMap("install_tx_hash")]
        [Validation(Required=false)]
        public string InstallTxHash { get; set; }

        // 保险单号
        [NameInMap("insurance_number")]
        [Validation(Required=false)]
        public string InsuranceNumber { get; set; }

        // 保险链接
        [NameInMap("insurance_url")]
        [Validation(Required=false)]
        public string InsuranceUrl { get; set; }

        // 租赁物入库日  格式为2019-8-31 12:00:00
        [NameInMap("in_store_time")]
        [Validation(Required=false)]
        public string InStoreTime { get; set; }

        // 订单额外信息
        [NameInMap("lease_order_extra")]
        [Validation(Required=false)]
        public List<LeaseOrderExtra> LeaseOrderExtra { get; set; }

        // 融资租赁及服务协议之补充协议文件
        [NameInMap("lease_service_additional_file_hash")]
        [Validation(Required=false)]
        public string LeaseServiceAdditionalFileHash { get; set; }

        // 融资租赁及服务协议之补充协议文件链上存证交易哈希
        [NameInMap("lease_service_additional_file_tx_hash")]
        [Validation(Required=false)]
        public string LeaseServiceAdditionalFileTxHash { get; set; }

        // 融资租赁及服务协议文件hash，三方协议
        [NameInMap("lease_service_file_hash")]
        [Validation(Required=true)]
        public string LeaseServiceFileHash { get; set; }

        // 融资租赁及服务协议文件链上存证交易哈希
        [NameInMap("lease_service_file_tx_hash")]
        [Validation(Required=true)]
        public string LeaseServiceFileTxHash { get; set; }

        // 订单创建时间 格式为2019-8-31 12:00:00
        [NameInMap("order_create_time")]
        [Validation(Required=true)]
        public string OrderCreateTime { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 支付订单ID
        [NameInMap("order_pay_id")]
        [Validation(Required=false)]
        public string OrderPayId { get; set; }

        // 订单支付时间 格式为2019-8-31 12:00:00
        [NameInMap("order_pay_time")]
        [Validation(Required=true)]
        public string OrderPayTime { get; set; }

        // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他
        [NameInMap("order_pay_type")]
        [Validation(Required=false)]
        public long? OrderPayType { get; set; }

        // 租赁物出库物流编号
        [NameInMap("out_store_deliver_number")]
        [Validation(Required=false)]
        public string OutStoreDeliverNumber { get; set; }

        // 租赁物出库日  格式为2019-8-31 12:00:00
        [NameInMap("out_store_time")]
        [Validation(Required=false)]
        public string OutStoreTime { get; set; }

        // 支付凭证地址
        [NameInMap("pay_proof_url")]
        [Validation(Required=false)]
        public string PayProofUrl { get; set; }

        // 预授权支付订单ID
        [NameInMap("pre_auth_pay_order_id")]
        [Validation(Required=false)]
        public string PreAuthPayOrderId { get; set; }

        // 产品详细信息
        [NameInMap("product_info")]
        [Validation(Required=true)]
        public List<ProductInfo> ProductInfo { get; set; }

        // 省编码
        [NameInMap("province_code")]
        [Validation(Required=false)]
        public string ProvinceCode { get; set; }

        // 采购发票文件哈希
        [NameInMap("purchase_contract_bill_hash")]
        [Validation(Required=false)]
        public string PurchaseContractBillHash { get; set; }

        // 采购发票文件链上存证交易哈希
        [NameInMap("purchase_contract_bill_tx_hash")]
        [Validation(Required=false)]
        public string PurchaseContractBillTxHash { get; set; }

        // 采购合同文件哈希
        [NameInMap("purchase_contract_hash")]
        [Validation(Required=false)]
        public string PurchaseContractHash { get; set; }

        // 采购合同文件链上存证交易哈希
        [NameInMap("purchase_contract_tx_hash")]
        [Validation(Required=false)]
        public string PurchaseContractTxHash { get; set; }

        // 采购合同地址
        [NameInMap("purchase_contract_url")]
        [Validation(Required=false)]
        public string PurchaseContractUrl { get; set; }

        // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方	
        // 
        [NameInMap("related_notify")]
        [Validation(Required=false)]
        public List<string> RelatedNotify { get; set; }

        // 租赁合同地址
        [NameInMap("rent_contract_url")]
        [Validation(Required=false)]
        public string RentContractUrl { get; set; }

        // 月租金 精确到毫厘，即123400表示12.34元
        [NameInMap("rent_price_per_month")]
        [Validation(Required=true)]
        public long? RentPricePerMonth { get; set; }

        // 租期
        [NameInMap("rent_term")]
        [Validation(Required=true)]
        public long? RentTerm { get; set; }

        // 承租人签收记录哈希
        [NameInMap("sign_hash")]
        [Validation(Required=false)]
        public string SignHash { get; set; }

        // 承租人签收时间  格式为2019-8-31 12:00:00
        [NameInMap("sign_time")]
        [Validation(Required=false)]
        public string SignTime { get; set; }

        // 承租人签收记录链上存证哈希
        [NameInMap("sign_tx_hash")]
        [Validation(Required=false)]
        public string SignTxHash { get; set; }

        // 仓库类型 1实体仓 2虚拟仓
        [NameInMap("store_type")]
        [Validation(Required=false)]
        public long? StoreType { get; set; }

        // 补充协议地址
        [NameInMap("supplement_protocol_url")]
        [Validation(Required=false)]
        public string SupplementProtocolUrl { get; set; }

        // 供应商对应的金融科技租户id，若有此字段，则会授权相应的供应商上传采购等相关信息
        [NameInMap("supplier_isv_account")]
        [Validation(Required=false)]
        public string SupplierIsvAccount { get; set; }

        // 承租人收货地址
        [NameInMap("user_address")]
        [Validation(Required=true)]
        public string UserAddress { get; set; }

        // 智能合同的合同id
        [NameInMap("lease_service_contract_id")]
        [Validation(Required=false)]
        public string LeaseServiceContractId { get; set; }

        // 网商直付通模式的代扣协议号
        [NameInMap("agreement_no")]
        [Validation(Required=false)]
        public string AgreementNo { get; set; }

        // 直付通代扣受理订单号
        [NameInMap("agreement_order_id")]
        [Validation(Required=false)]
        public string AgreementOrderId { get; set; }

        // 单位是毫厘，123400
        [NameInMap("down_payment")]
        [Validation(Required=false)]
        public long? DownPayment { get; set; }

    }

}
