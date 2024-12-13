<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CreateInsureRequest extends Model
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

    // 商户的订单号，后续用作和保单结果交互
    /**
     * @var string
     */
    public $orderId;

    // 风控业务流水号
    /**
     * @var string
     */
    public $riskFlowId;

    // 保险公司枚举，PA：平安保险
    /**
     * @var string
     */
    public $insureCompanyType;

    // 保险类型枚举，PERFORMANCE：履约
    /**
     * @var string
     */
    public $insureProductType;

    // 投保商品信息列表
    /**
     * @var InsureProductInfo[]
     */
    public $productInfoList;

    // 发货方式枚举，可选值：
    // EXPRESS-物流发货
    // OFFLINE-线下交易
    /**
     * @var string
     */
    public $deliveryType;

    // 公司联系人姓名，RSA 加密传输
    /**
     * @var string
     */
    public $contactName;

    // 公司联系人手机号，RSA 加密传输
    /**
     * @var string
     */
    public $contactMobile;

    // 实人认证业务流水号
    /**
     * @var string
     */
    public $facevrfFlowId;

    // 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
    /**
     * @var string
     */
    public $logisticsNumber;

    // 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
    /**
     * @var string
     */
    public $tradeTime;

    // 公司地址信息，此处填写的地址信息为投保时最高优先级地址，其次为公司进件时填写的地址信息。如果取不到明确地址信息，投保会失败。
    /**
     * @var string
     */
    public $address;

    // 保险投保期数
    /**
     * @var int
     */
    public $period;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'orderId'           => 'order_id',
        'riskFlowId'        => 'risk_flow_id',
        'insureCompanyType' => 'insure_company_type',
        'insureProductType' => 'insure_product_type',
        'productInfoList'   => 'product_info_list',
        'deliveryType'      => 'delivery_type',
        'contactName'       => 'contact_name',
        'contactMobile'     => 'contact_mobile',
        'facevrfFlowId'     => 'facevrf_flow_id',
        'logisticsNumber'   => 'logistics_number',
        'tradeTime'         => 'trade_time',
        'address'           => 'address',
        'period'            => 'period',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('riskFlowId', $this->riskFlowId, true);
        Model::validateRequired('insureCompanyType', $this->insureCompanyType, true);
        Model::validateRequired('insureProductType', $this->insureProductType, true);
        Model::validateRequired('productInfoList', $this->productInfoList, true);
        Model::validateRequired('deliveryType', $this->deliveryType, true);
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactMobile', $this->contactMobile, true);
        Model::validateMaxLength('deliveryType', $this->deliveryType, 64);
        Model::validateMaxLength('contactName', $this->contactName, 2000);
        Model::validateMaxLength('contactMobile', $this->contactMobile, 2000);
        Model::validateMaxLength('logisticsNumber', $this->logisticsNumber, 64);
        Model::validateMaxLength('address', $this->address, 512);
        Model::validateMinLength('address', $this->address, 1);
        Model::validateMaximum('period', $this->period, 120);
        Model::validateMinimum('period', $this->period, 1);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->riskFlowId) {
            $res['risk_flow_id'] = $this->riskFlowId;
        }
        if (null !== $this->insureCompanyType) {
            $res['insure_company_type'] = $this->insureCompanyType;
        }
        if (null !== $this->insureProductType) {
            $res['insure_product_type'] = $this->insureProductType;
        }
        if (null !== $this->productInfoList) {
            $res['product_info_list'] = [];
            if (null !== $this->productInfoList && \is_array($this->productInfoList)) {
                $n = 0;
                foreach ($this->productInfoList as $item) {
                    $res['product_info_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->deliveryType) {
            $res['delivery_type'] = $this->deliveryType;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        if (null !== $this->facevrfFlowId) {
            $res['facevrf_flow_id'] = $this->facevrfFlowId;
        }
        if (null !== $this->logisticsNumber) {
            $res['logistics_number'] = $this->logisticsNumber;
        }
        if (null !== $this->tradeTime) {
            $res['trade_time'] = $this->tradeTime;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->period) {
            $res['period'] = $this->period;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateInsureRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['risk_flow_id'])) {
            $model->riskFlowId = $map['risk_flow_id'];
        }
        if (isset($map['insure_company_type'])) {
            $model->insureCompanyType = $map['insure_company_type'];
        }
        if (isset($map['insure_product_type'])) {
            $model->insureProductType = $map['insure_product_type'];
        }
        if (isset($map['product_info_list'])) {
            if (!empty($map['product_info_list'])) {
                $model->productInfoList = [];
                $n                      = 0;
                foreach ($map['product_info_list'] as $item) {
                    $model->productInfoList[$n++] = null !== $item ? InsureProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['delivery_type'])) {
            $model->deliveryType = $map['delivery_type'];
        }
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_mobile'])) {
            $model->contactMobile = $map['contact_mobile'];
        }
        if (isset($map['facevrf_flow_id'])) {
            $model->facevrfFlowId = $map['facevrf_flow_id'];
        }
        if (isset($map['logistics_number'])) {
            $model->logisticsNumber = $map['logistics_number'];
        }
        if (isset($map['trade_time'])) {
            $model->tradeTime = $map['trade_time'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['period'])) {
            $model->period = $map['period'];
        }

        return $model;
    }
}
