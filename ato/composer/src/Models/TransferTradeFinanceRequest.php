<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class TransferTradeFinanceRequest extends Model
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

    // 订单id
    /**
     * @var string
     */
    public $orderId;

    // 公司社会信用代码
    /**
     * @var string
     */
    public $merchantId;

    // 待预审资方列表
    /**
     * @var string[]
     */
    public $fundIdList;

    // 融资签署模式
    /**
     * @var string
     */
    public $fundSignMode;

    // 商户分账起始期数
    /**
     * @var int
     */
    public $divideStartTermIndex;

    // 融资模式
    /**
     * @var string
     */
    public $fundMode;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'orderId'              => 'order_id',
        'merchantId'           => 'merchant_id',
        'fundIdList'           => 'fund_id_list',
        'fundSignMode'         => 'fund_sign_mode',
        'divideStartTermIndex' => 'divide_start_term_index',
        'fundMode'             => 'fund_mode',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('merchantId', $this->merchantId, true);
        Model::validateRequired('fundIdList', $this->fundIdList, true);
        Model::validateRequired('fundSignMode', $this->fundSignMode, true);
        Model::validateRequired('divideStartTermIndex', $this->divideStartTermIndex, true);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('merchantId', $this->merchantId, 1);
        Model::validateMinLength('fundSignMode', $this->fundSignMode, 1);
        Model::validateMinimum('divideStartTermIndex', $this->divideStartTermIndex, 1);
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
        if (null !== $this->merchantId) {
            $res['merchant_id'] = $this->merchantId;
        }
        if (null !== $this->fundIdList) {
            $res['fund_id_list'] = $this->fundIdList;
        }
        if (null !== $this->fundSignMode) {
            $res['fund_sign_mode'] = $this->fundSignMode;
        }
        if (null !== $this->divideStartTermIndex) {
            $res['divide_start_term_index'] = $this->divideStartTermIndex;
        }
        if (null !== $this->fundMode) {
            $res['fund_mode'] = $this->fundMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransferTradeFinanceRequest
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
        if (isset($map['merchant_id'])) {
            $model->merchantId = $map['merchant_id'];
        }
        if (isset($map['fund_id_list'])) {
            if (!empty($map['fund_id_list'])) {
                $model->fundIdList = $map['fund_id_list'];
            }
        }
        if (isset($map['fund_sign_mode'])) {
            $model->fundSignMode = $map['fund_sign_mode'];
        }
        if (isset($map['divide_start_term_index'])) {
            $model->divideStartTermIndex = $map['divide_start_term_index'];
        }
        if (isset($map['fund_mode'])) {
            $model->fundMode = $map['fund_mode'];
        }

        return $model;
    }
}
