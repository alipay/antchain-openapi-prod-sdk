<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBmpbrowserTransactionqrcodeRequest extends Model
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

    // 蚂蚁区块链的唯一链id
    /**
     * @var string
     */
    public $bizid;

    // 链上合约id
    /**
     * @var string
     */
    public $contractId;

    // 蚂蚁区块链的链上交易hash值
    /**
     * @var string
     */
    public $hash;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizid'             => 'bizid',
        'contractId'        => 'contract_id',
        'hash'              => 'hash',
    ];

    public function validate()
    {
        Model::validateRequired('bizid', $this->bizid, true);
        Model::validateRequired('hash', $this->hash, true);
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
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBmpbrowserTransactionqrcodeRequest
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
        if (isset($map['bizid'])) {
            $model->bizid = $map['bizid'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['hash'])) {
            $model->hash = $map['hash'];
        }

        return $model;
    }
}
