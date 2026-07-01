<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateLeaseOrderinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $acutalPreAuthFree;

    // 融资租赁业务id，由资方控制台创建返回
    /**
     * @var string
     */
    public $applicationId;

    // 是否启动异步处理订单
    /**
     * @var int
     */
    public $async;

    // 采购发票地址
    /**
     * @var string
     */
    public $billUrl;

    // 到期买断价 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $buyOutPrice;

    // 市编码
    /**
     * @var string
     */
    public $cityCode;

    // 免押金额 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $depositFree;

    // 区编码
    /**
     * @var string
     */
    public $districtCode;

    // 融资租赁额外字段
    /**
     * @var string
     */
    public $extraInfo;

    // 安装服务记录哈希
    /**
     * @var string
     */
    public $installHash;

    // 安装拆卸费 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $installPrice;

    // 安装服务记录链上存证交易哈希
    /**
     * @var string
     */
    public $installTxHash;

    // 保险单号
    /**
     * @var string
     */
    public $insuranceNumber;

    // 保险链接
    /**
     * @var string
     */
    public $insuranceUrl;

    // 租赁物入库日  格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $inStoreTime;

    // 订单额外信息
    /**
     * @var LeaseOrderExtra[]
     */
    public $leaseOrderExtra;

    // 融资租赁及服务协议之补充协议文件
    /**
     * @var string
     */
    public $leaseServiceAdditionalFileHash;

    // 融资租赁及服务协议之补充协议文件链上存证交易哈希
    /**
     * @var string
     */
    public $leaseServiceAdditionalFileTxHash;

    // 融资租赁及服务协议文件hash，三方协议
    /**
     * @var string
     */
    public $leaseServiceFileHash;

    // 融资租赁及服务协议文件链上存证交易哈希
    /**
     * @var string
     */
    public $leaseServiceFileTxHash;

    // 订单创建时间 格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $orderCreateTime;

    // 订单id 长度不可超过50
    /**
     * @var string
     */
    public $orderId;

    // 支付订单ID
    /**
     * @var string
     */
    public $orderPayId;

    // 订单支付时间 格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $orderPayTime;

    // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他
    /**
     * @var int
     */
    public $orderPayType;

    // 租赁物出库物流编号
    /**
     * @var string
     */
    public $outStoreDeliverNumber;

    // 租赁物出库日  格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $outStoreTime;

    // 支付凭证地址
    /**
     * @var string
     */
    public $payProofUrl;

    // 预授权支付订单ID
    /**
     * @var string
     */
    public $preAuthPayOrderId;

    // 产品详细信息
    /**
     * @var ProductInfo[]
     */
    public $productInfo;

    // 省编码
    /**
     * @var string
     */
    public $provinceCode;

    // 采购发票文件哈希
    /**
     * @var string
     */
    public $purchaseContractBillHash;

    // 采购发票文件链上存证交易哈希
    /**
     * @var string
     */
    public $purchaseContractBillTxHash;

    // 采购合同文件哈希
    /**
     * @var string
     */
    public $purchaseContractHash;

    // 采购合同文件链上存证交易哈希
    /**
     * @var string
     */
    public $purchaseContractTxHash;

    // 采购合同地址
    /**
     * @var string
     */
    public $purchaseContractUrl;

    // 额外通知第三方，如果需要通知相关方外的第三方，需要在此设置关联方的租户id，若不设置则只通知资方
    //
    /**
     * @var string[]
     */
    public $relatedNotify;

    // 租赁合同地址
    /**
     * @var string
     */
    public $rentContractUrl;

    // 月租金 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $rentPricePerMonth;

    // 租期
    /**
     * @var int
     */
    public $rentTerm;

    // 承租人签收记录哈希
    /**
     * @var string
     */
    public $signHash;

    // 承租人签收时间  格式为2019-8-31 12:00:00
    /**
     * @var string
     */
    public $signTime;

    // 承租人签收记录链上存证哈希
    /**
     * @var string
     */
    public $signTxHash;

    // 仓库类型 1实体仓 2虚拟仓
    /**
     * @var int
     */
    public $storeType;

    // 补充协议地址
    /**
     * @var string
     */
    public $supplementProtocolUrl;

    // 供应商对应的金融科技租户id，若有此字段，则会授权相应的供应商上传采购等相关信息
    /**
     * @var string
     */
    public $supplierIsvAccount;

    // 承租人收货地址
    /**
     * @var string
     */
    public $userAddress;

    // 智能合同的合同id
    /**
     * @var string
     */
    public $leaseServiceContractId;

    // 网商直付通模式的代扣协议号
    /**
     * @var string
     */
    public $agreementNo;

    // 直付通代扣受理订单号
    /**
     * @var string
     */
    public $agreementOrderId;

    // 单位是毫厘，123400
    /**
     * @var int
     */
    public $downPayment;
    protected $_name = [
        'authToken'                        => 'auth_token',
        'productInstanceId'                => 'product_instance_id',
        'acutalPreAuthFree'                => 'acutal_pre_auth_free',
        'applicationId'                    => 'application_id',
        'async'                            => 'async',
        'billUrl'                          => 'bill_url',
        'buyOutPrice'                      => 'buy_out_price',
        'cityCode'                         => 'city_code',
        'depositFree'                      => 'deposit_free',
        'districtCode'                     => 'district_code',
        'extraInfo'                        => 'extra_info',
        'installHash'                      => 'install_hash',
        'installPrice'                     => 'install_price',
        'installTxHash'                    => 'install_tx_hash',
        'insuranceNumber'                  => 'insurance_number',
        'insuranceUrl'                     => 'insurance_url',
        'inStoreTime'                      => 'in_store_time',
        'leaseOrderExtra'                  => 'lease_order_extra',
        'leaseServiceAdditionalFileHash'   => 'lease_service_additional_file_hash',
        'leaseServiceAdditionalFileTxHash' => 'lease_service_additional_file_tx_hash',
        'leaseServiceFileHash'             => 'lease_service_file_hash',
        'leaseServiceFileTxHash'           => 'lease_service_file_tx_hash',
        'orderCreateTime'                  => 'order_create_time',
        'orderId'                          => 'order_id',
        'orderPayId'                       => 'order_pay_id',
        'orderPayTime'                     => 'order_pay_time',
        'orderPayType'                     => 'order_pay_type',
        'outStoreDeliverNumber'            => 'out_store_deliver_number',
        'outStoreTime'                     => 'out_store_time',
        'payProofUrl'                      => 'pay_proof_url',
        'preAuthPayOrderId'                => 'pre_auth_pay_order_id',
        'productInfo'                      => 'product_info',
        'provinceCode'                     => 'province_code',
        'purchaseContractBillHash'         => 'purchase_contract_bill_hash',
        'purchaseContractBillTxHash'       => 'purchase_contract_bill_tx_hash',
        'purchaseContractHash'             => 'purchase_contract_hash',
        'purchaseContractTxHash'           => 'purchase_contract_tx_hash',
        'purchaseContractUrl'              => 'purchase_contract_url',
        'relatedNotify'                    => 'related_notify',
        'rentContractUrl'                  => 'rent_contract_url',
        'rentPricePerMonth'                => 'rent_price_per_month',
        'rentTerm'                         => 'rent_term',
        'signHash'                         => 'sign_hash',
        'signTime'                         => 'sign_time',
        'signTxHash'                       => 'sign_tx_hash',
        'storeType'                        => 'store_type',
        'supplementProtocolUrl'            => 'supplement_protocol_url',
        'supplierIsvAccount'               => 'supplier_isv_account',
        'userAddress'                      => 'user_address',
        'leaseServiceContractId'           => 'lease_service_contract_id',
        'agreementNo'                      => 'agreement_no',
        'agreementOrderId'                 => 'agreement_order_id',
        'downPayment'                      => 'down_payment',
    ];

    public function validate()
    {
        Model::validateRequired('acutalPreAuthFree', $this->acutalPreAuthFree, true);
        Model::validateRequired('buyOutPrice', $this->buyOutPrice, true);
        Model::validateRequired('depositFree', $this->depositFree, true);
        Model::validateRequired('leaseServiceFileHash', $this->leaseServiceFileHash, true);
        Model::validateRequired('leaseServiceFileTxHash', $this->leaseServiceFileTxHash, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderPayTime', $this->orderPayTime, true);
        Model::validateRequired('productInfo', $this->productInfo, true);
        Model::validateRequired('rentPricePerMonth', $this->rentPricePerMonth, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('userAddress', $this->userAddress, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->acutalPreAuthFree) {
            $res['acutal_pre_auth_free'] = $this->acutalPreAuthFree;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }
        if (null !== $this->async) {
            $res['async'] = $this->async;
        }
        if (null !== $this->billUrl) {
            $res['bill_url'] = $this->billUrl;
        }
        if (null !== $this->buyOutPrice) {
            $res['buy_out_price'] = $this->buyOutPrice;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->depositFree) {
            $res['deposit_free'] = $this->depositFree;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->installHash) {
            $res['install_hash'] = $this->installHash;
        }
        if (null !== $this->installPrice) {
            $res['install_price'] = $this->installPrice;
        }
        if (null !== $this->installTxHash) {
            $res['install_tx_hash'] = $this->installTxHash;
        }
        if (null !== $this->insuranceNumber) {
            $res['insurance_number'] = $this->insuranceNumber;
        }
        if (null !== $this->insuranceUrl) {
            $res['insurance_url'] = $this->insuranceUrl;
        }
        if (null !== $this->inStoreTime) {
            $res['in_store_time'] = $this->inStoreTime;
        }
        if (null !== $this->leaseOrderExtra) {
            $res['lease_order_extra'] = [];
            if (null !== $this->leaseOrderExtra && \is_array($this->leaseOrderExtra)) {
                $n = 0;
                foreach ($this->leaseOrderExtra as $item) {
                    $res['lease_order_extra'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->leaseServiceAdditionalFileHash) {
            $res['lease_service_additional_file_hash'] = $this->leaseServiceAdditionalFileHash;
        }
        if (null !== $this->leaseServiceAdditionalFileTxHash) {
            $res['lease_service_additional_file_tx_hash'] = $this->leaseServiceAdditionalFileTxHash;
        }
        if (null !== $this->leaseServiceFileHash) {
            $res['lease_service_file_hash'] = $this->leaseServiceFileHash;
        }
        if (null !== $this->leaseServiceFileTxHash) {
            $res['lease_service_file_tx_hash'] = $this->leaseServiceFileTxHash;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderPayId) {
            $res['order_pay_id'] = $this->orderPayId;
        }
        if (null !== $this->orderPayTime) {
            $res['order_pay_time'] = $this->orderPayTime;
        }
        if (null !== $this->orderPayType) {
            $res['order_pay_type'] = $this->orderPayType;
        }
        if (null !== $this->outStoreDeliverNumber) {
            $res['out_store_deliver_number'] = $this->outStoreDeliverNumber;
        }
        if (null !== $this->outStoreTime) {
            $res['out_store_time'] = $this->outStoreTime;
        }
        if (null !== $this->payProofUrl) {
            $res['pay_proof_url'] = $this->payProofUrl;
        }
        if (null !== $this->preAuthPayOrderId) {
            $res['pre_auth_pay_order_id'] = $this->preAuthPayOrderId;
        }
        if (null !== $this->productInfo) {
            $res['product_info'] = [];
            if (null !== $this->productInfo && \is_array($this->productInfo)) {
                $n = 0;
                foreach ($this->productInfo as $item) {
                    $res['product_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->purchaseContractBillHash) {
            $res['purchase_contract_bill_hash'] = $this->purchaseContractBillHash;
        }
        if (null !== $this->purchaseContractBillTxHash) {
            $res['purchase_contract_bill_tx_hash'] = $this->purchaseContractBillTxHash;
        }
        if (null !== $this->purchaseContractHash) {
            $res['purchase_contract_hash'] = $this->purchaseContractHash;
        }
        if (null !== $this->purchaseContractTxHash) {
            $res['purchase_contract_tx_hash'] = $this->purchaseContractTxHash;
        }
        if (null !== $this->purchaseContractUrl) {
            $res['purchase_contract_url'] = $this->purchaseContractUrl;
        }
        if (null !== $this->relatedNotify) {
            $res['related_notify'] = $this->relatedNotify;
        }
        if (null !== $this->rentContractUrl) {
            $res['rent_contract_url'] = $this->rentContractUrl;
        }
        if (null !== $this->rentPricePerMonth) {
            $res['rent_price_per_month'] = $this->rentPricePerMonth;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->signHash) {
            $res['sign_hash'] = $this->signHash;
        }
        if (null !== $this->signTime) {
            $res['sign_time'] = $this->signTime;
        }
        if (null !== $this->signTxHash) {
            $res['sign_tx_hash'] = $this->signTxHash;
        }
        if (null !== $this->storeType) {
            $res['store_type'] = $this->storeType;
        }
        if (null !== $this->supplementProtocolUrl) {
            $res['supplement_protocol_url'] = $this->supplementProtocolUrl;
        }
        if (null !== $this->supplierIsvAccount) {
            $res['supplier_isv_account'] = $this->supplierIsvAccount;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->leaseServiceContractId) {
            $res['lease_service_contract_id'] = $this->leaseServiceContractId;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->agreementOrderId) {
            $res['agreement_order_id'] = $this->agreementOrderId;
        }
        if (null !== $this->downPayment) {
            $res['down_payment'] = $this->downPayment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateLeaseOrderinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['acutal_pre_auth_free'])) {
            $model->acutalPreAuthFree = $map['acutal_pre_auth_free'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }
        if (isset($map['async'])) {
            $model->async = $map['async'];
        }
        if (isset($map['bill_url'])) {
            $model->billUrl = $map['bill_url'];
        }
        if (isset($map['buy_out_price'])) {
            $model->buyOutPrice = $map['buy_out_price'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['deposit_free'])) {
            $model->depositFree = $map['deposit_free'];
        }
        if (isset($map['district_code'])) {
            $model->districtCode = $map['district_code'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }
        if (isset($map['install_hash'])) {
            $model->installHash = $map['install_hash'];
        }
        if (isset($map['install_price'])) {
            $model->installPrice = $map['install_price'];
        }
        if (isset($map['install_tx_hash'])) {
            $model->installTxHash = $map['install_tx_hash'];
        }
        if (isset($map['insurance_number'])) {
            $model->insuranceNumber = $map['insurance_number'];
        }
        if (isset($map['insurance_url'])) {
            $model->insuranceUrl = $map['insurance_url'];
        }
        if (isset($map['in_store_time'])) {
            $model->inStoreTime = $map['in_store_time'];
        }
        if (isset($map['lease_order_extra'])) {
            if (!empty($map['lease_order_extra'])) {
                $model->leaseOrderExtra = [];
                $n                      = 0;
                foreach ($map['lease_order_extra'] as $item) {
                    $model->leaseOrderExtra[$n++] = null !== $item ? LeaseOrderExtra::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['lease_service_additional_file_hash'])) {
            $model->leaseServiceAdditionalFileHash = $map['lease_service_additional_file_hash'];
        }
        if (isset($map['lease_service_additional_file_tx_hash'])) {
            $model->leaseServiceAdditionalFileTxHash = $map['lease_service_additional_file_tx_hash'];
        }
        if (isset($map['lease_service_file_hash'])) {
            $model->leaseServiceFileHash = $map['lease_service_file_hash'];
        }
        if (isset($map['lease_service_file_tx_hash'])) {
            $model->leaseServiceFileTxHash = $map['lease_service_file_tx_hash'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_pay_id'])) {
            $model->orderPayId = $map['order_pay_id'];
        }
        if (isset($map['order_pay_time'])) {
            $model->orderPayTime = $map['order_pay_time'];
        }
        if (isset($map['order_pay_type'])) {
            $model->orderPayType = $map['order_pay_type'];
        }
        if (isset($map['out_store_deliver_number'])) {
            $model->outStoreDeliverNumber = $map['out_store_deliver_number'];
        }
        if (isset($map['out_store_time'])) {
            $model->outStoreTime = $map['out_store_time'];
        }
        if (isset($map['pay_proof_url'])) {
            $model->payProofUrl = $map['pay_proof_url'];
        }
        if (isset($map['pre_auth_pay_order_id'])) {
            $model->preAuthPayOrderId = $map['pre_auth_pay_order_id'];
        }
        if (isset($map['product_info'])) {
            if (!empty($map['product_info'])) {
                $model->productInfo = [];
                $n                  = 0;
                foreach ($map['product_info'] as $item) {
                    $model->productInfo[$n++] = null !== $item ? ProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['purchase_contract_bill_hash'])) {
            $model->purchaseContractBillHash = $map['purchase_contract_bill_hash'];
        }
        if (isset($map['purchase_contract_bill_tx_hash'])) {
            $model->purchaseContractBillTxHash = $map['purchase_contract_bill_tx_hash'];
        }
        if (isset($map['purchase_contract_hash'])) {
            $model->purchaseContractHash = $map['purchase_contract_hash'];
        }
        if (isset($map['purchase_contract_tx_hash'])) {
            $model->purchaseContractTxHash = $map['purchase_contract_tx_hash'];
        }
        if (isset($map['purchase_contract_url'])) {
            $model->purchaseContractUrl = $map['purchase_contract_url'];
        }
        if (isset($map['related_notify'])) {
            if (!empty($map['related_notify'])) {
                $model->relatedNotify = $map['related_notify'];
            }
        }
        if (isset($map['rent_contract_url'])) {
            $model->rentContractUrl = $map['rent_contract_url'];
        }
        if (isset($map['rent_price_per_month'])) {
            $model->rentPricePerMonth = $map['rent_price_per_month'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['sign_hash'])) {
            $model->signHash = $map['sign_hash'];
        }
        if (isset($map['sign_time'])) {
            $model->signTime = $map['sign_time'];
        }
        if (isset($map['sign_tx_hash'])) {
            $model->signTxHash = $map['sign_tx_hash'];
        }
        if (isset($map['store_type'])) {
            $model->storeType = $map['store_type'];
        }
        if (isset($map['supplement_protocol_url'])) {
            $model->supplementProtocolUrl = $map['supplement_protocol_url'];
        }
        if (isset($map['supplier_isv_account'])) {
            $model->supplierIsvAccount = $map['supplier_isv_account'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['lease_service_contract_id'])) {
            $model->leaseServiceContractId = $map['lease_service_contract_id'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['agreement_order_id'])) {
            $model->agreementOrderId = $map['agreement_order_id'];
        }
        if (isset($map['down_payment'])) {
            $model->downPayment = $map['down_payment'];
        }

        return $model;
    }
}
