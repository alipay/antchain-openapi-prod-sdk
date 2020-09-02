<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class GetBaasPlusDataserviceTransactioninfoResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bizid' => 'bizid',
        'category' => 'category',
        'createTime' => 'create_time',
        'fromHash' => 'from_hash',
        'hash' => 'hash',
        'height' => 'height',
        'toHash' => 'to_hash',
        'type' => 'type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->bizid) {
            $res['bizid'] = $this->bizid;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->fromHash) {
            $res['from_hash'] = $this->fromHash;
        }
        if (null !== $this->hash) {
            $res['hash'] = $this->hash;
        }
        if (null !== $this->height) {
            $res['height'] = $this->height;
        }
        if (null !== $this->toHash) {
            $res['to_hash'] = $this->toHash;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetBaasPlusDataserviceTransactioninfoResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['bizid'])){
            $model->bizid = $map['bizid'];
        }
        if(isset($map['category'])){
            $model->category = $map['category'];
        }
        if(isset($map['create_time'])){
            $model->createTime = $map['create_time'];
        }
        if(isset($map['from_hash'])){
            $model->fromHash = $map['from_hash'];
        }
        if(isset($map['hash'])){
            $model->hash = $map['hash'];
        }
        if(isset($map['height'])){
            $model->height = $map['height'];
        }
        if(isset($map['to_hash'])){
            $model->toHash = $map['to_hash'];
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 区块链唯一性标识
    /**
     * @var string
     */
    public $bizid;

    // category
    /**
     * @var int
     */
    public $category;

    // 交易发起时间
    /**
     * @var int
     */
    public $createTime;

    // 交易发起方哈希
    /**
     * @var string
     */
    public $fromHash;

    // 交易哈希
    /**
     * @var string
     */
    public $hash;

    // 块高
    /**
     * @var int
     */
    public $height;

    // 交易接收方哈希
    /**
     * @var string
     */
    public $toHash;

    // 交易类型
    /**
     * @var int
     */
    public $type;

}
