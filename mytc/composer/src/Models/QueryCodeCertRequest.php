<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;

class QueryCodeCertRequest extends Model
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

    // 业务类型，客户自定义标签，做code数据隔离使用
    /**
     * @var string
     */
    public $bizType;

    // 区块链上交易哈希
    /**
     * @var string
     */
    public $txHash;

    // 是否展示交易具体内容，默认false
    /**
     * @var bool
     */
    public $contentFlag;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizType'           => 'biz_type',
        'txHash'            => 'tx_hash',
        'contentFlag'       => 'content_flag',
    ];

    public function validate()
    {
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateMaxLength('bizType', $this->bizType, 32);
        Model::validateMaxLength('txHash', $this->txHash, 64);
        Model::validateMinLength('bizType', $this->bizType, 1);
        Model::validateMinLength('txHash', $this->txHash, 1);
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
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->contentFlag) {
            $res['content_flag'] = $this->contentFlag;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryCodeCertRequest
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
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['tx_hash'])) {
            $model->txHash = $map['tx_hash'];
        }
        if (isset($map['content_flag'])) {
            $model->contentFlag = $map['content_flag'];
        }

        return $model;
    }
}
