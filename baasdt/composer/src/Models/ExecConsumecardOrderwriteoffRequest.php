<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecConsumecardOrderwriteoffRequest extends Model
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

    // 请求参数
    /**
     * @var BaseRequest
     */
    public $baseRequest;

    // 交易类型(0: 商品兑换单, 1: 账单兑换单)
    /**
     * @var int
     */
    public $instructionType;

    // 账单ID
    /**
     * @var string
     */
    public $orderId;

    // 附言(长度不要超过500个字符)
    /**
     * @var string
     */
    public $remark;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'instructionType'   => 'instruction_type',
        'orderId'           => 'order_id',
        'remark'            => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('instructionType', $this->instructionType, true);
        Model::validateRequired('orderId', $this->orderId, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->instructionType) {
            $res['instruction_type'] = $this->instructionType;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecConsumecardOrderwriteoffRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequest::fromMap($map['base_request']);
        }
        if (isset($map['instruction_type'])) {
            $model->instructionType = $map['instruction_type'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
