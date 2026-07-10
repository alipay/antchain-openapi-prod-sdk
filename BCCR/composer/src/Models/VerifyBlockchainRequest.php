<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class VerifyBlockchainRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'txHash' => 'tx_hash',
        'fileHash' => 'file_hash',
    ];
    public function validate() {
        Model::validateRequired('txHash', $this->txHash, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->fileHash) {
            $res['file_hash'] = $this->fileHash;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifyBlockchainRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['file_hash'])){
            $model->fileHash = $map['file_hash'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 统一证据编号（存证交易HASH）
    /**
     * @var string
     */
    public $txHash;

    // 文件HASH，使用HEX的完整表示，如 6460c949f8a347eb...
    // 
    // (和fileId 二选一，必传一个，都传按fileHash为准)
    /**
     * @var string
     */
    public $fileHash;

}
