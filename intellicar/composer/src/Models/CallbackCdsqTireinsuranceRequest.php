<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class CallbackCdsqTireinsuranceRequest extends Model
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

    // 交易流水号
    /**
     * @var string
     */
    public $transactionNo;

    // 场景码
    /**
     * @var string
     */
    public $sceneCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'transactionNo'     => 'transaction_no',
        'sceneCode'         => 'scene_code',
    ];

    public function validate()
    {
        Model::validateRequired('transactionNo', $this->transactionNo, true);
        Model::validateRequired('sceneCode', $this->sceneCode, true);
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
        if (null !== $this->transactionNo) {
            $res['transaction_no'] = $this->transactionNo;
        }
        if (null !== $this->sceneCode) {
            $res['scene_code'] = $this->sceneCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackCdsqTireinsuranceRequest
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
        if (isset($map['transaction_no'])) {
            $model->transactionNo = $map['transaction_no'];
        }
        if (isset($map['scene_code'])) {
            $model->sceneCode = $map['scene_code'];
        }

        return $model;
    }
}
