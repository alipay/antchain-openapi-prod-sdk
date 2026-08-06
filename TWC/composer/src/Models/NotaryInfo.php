<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class NotaryInfo extends Model {
    protected $_name = [
        'contentHash' => 'content_hash',
        'cooperation' => 'cooperation',
        'creationType' => 'creation_type',
        'fileName' => 'file_name',
        'hashAlgorithm' => 'hash_algorithm',
        'platform' => 'platform',
        'size' => 'size',
        'txHash' => 'tx_hash',
        'transactionId' => 'transaction_id',
    ];
    public function validate() {
        Model::validateRequired('contentHash', $this->contentHash, true);
        Model::validateRequired('txHash', $this->txHash, true);
        Model::validateRequired('transactionId', $this->transactionId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->contentHash) {
            $res['content_hash'] = $this->contentHash;
        }
        if (null !== $this->cooperation) {
            $res['cooperation'] = $this->cooperation;
        }
        if (null !== $this->creationType) {
            $res['creation_type'] = $this->creationType;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->hashAlgorithm) {
            $res['hash_algorithm'] = $this->hashAlgorithm;
        }
        if (null !== $this->platform) {
            $res['platform'] = $this->platform;
        }
        if (null !== $this->size) {
            $res['size'] = $this->size;
        }
        if (null !== $this->txHash) {
            $res['tx_hash'] = $this->txHash;
        }
        if (null !== $this->transactionId) {
            $res['transaction_id'] = $this->transactionId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return NotaryInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['content_hash'])){
            $model->contentHash = $map['content_hash'];
        }
        if(isset($map['cooperation'])){
            $model->cooperation = $map['cooperation'];
        }
        if(isset($map['creation_type'])){
            $model->creationType = $map['creation_type'];
        }
        if(isset($map['file_name'])){
            $model->fileName = $map['file_name'];
        }
        if(isset($map['hash_algorithm'])){
            $model->hashAlgorithm = $map['hash_algorithm'];
        }
        if(isset($map['platform'])){
            $model->platform = $map['platform'];
        }
        if(isset($map['size'])){
            $model->size = $map['size'];
        }
        if(isset($map['tx_hash'])){
            $model->txHash = $map['tx_hash'];
        }
        if(isset($map['transaction_id'])){
            $model->transactionId = $map['transaction_id'];
        }
        return $model;
    }
    // 存证内容的哈希值，默认采用SHA256算法
    /**
     * @example 6b7966f4a30a7fec43a6b5ca8e4610f63d320f03ee698945014c0bbc13c6beba
     * @var string
     */
    public $contentHash;

    // 合作人（版权存证函专用），会展示在存证证明中
    /**
     * @example 合作人
     * @var string
     */
    public $cooperation;

    // 作品名称类型（版权存证函使用），会展示在存证证明中
    /**
     * @example 音乐/视频/小说等
     * @var string
     */
    public $creationType;

    // 如果是文件存证，可填写文件名称
    /**
     * @example name
     * @var string
     */
    public $fileName;

    // 计算content_hash的哈希算法，目前只支持SHA256
    /**
     * @example SHA256
     * @var string
     */
    public $hashAlgorithm;

    // 申请平台名，用于在存证函上显示用名称
    /**
     * @example 某某平台
     * @var string
     */
    public $platform;

    // 文件容量，默认为0
    /**
     * @example 1024
     * @var int
     */
    public $size;

    // 发起存证成功后，返回的存证凭据
    /**
     * @example a89495ddd334870a58686afe48a8eb83efe2dd51e4c06da7220eb1cde0f995e2
     * @var string
     */
    public $txHash;

    // 存证事务ID
    /**
     * @example 7bc888d8-1384-425c-9355-630cef0f4120
     * @var string
     */
    public $transactionId;

}
