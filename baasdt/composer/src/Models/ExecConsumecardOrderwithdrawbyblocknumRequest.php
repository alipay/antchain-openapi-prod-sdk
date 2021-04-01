<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecConsumecardOrderwithdrawbyblocknumRequest extends Model
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

    // 需要提现的订单分布的区块结束高度
    /**
     * @var int
     */
    public $endBlockNumber;

    // 需要提现的订单分布的区块起始高度
    /**
     * @var int
     */
    public $startBlockNumber;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'endBlockNumber'    => 'end_block_number',
        'startBlockNumber'  => 'start_block_number',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('endBlockNumber', $this->endBlockNumber, true);
        Model::validateRequired('startBlockNumber', $this->startBlockNumber, true);
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
        if (null !== $this->endBlockNumber) {
            $res['end_block_number'] = $this->endBlockNumber;
        }
        if (null !== $this->startBlockNumber) {
            $res['start_block_number'] = $this->startBlockNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecConsumecardOrderwithdrawbyblocknumRequest
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
        if (isset($map['end_block_number'])) {
            $model->endBlockNumber = $map['end_block_number'];
        }
        if (isset($map['start_block_number'])) {
            $model->startBlockNumber = $map['start_block_number'];
        }

        return $model;
    }
}
