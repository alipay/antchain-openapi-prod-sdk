<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QuerypushstatusIotagentMessageRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'receiptId' => 'receipt_id',
        'messageId' => 'message_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->receiptId) {
            $res['receipt_id'] = $this->receiptId;
        }
        if (null !== $this->messageId) {
            $res['message_id'] = $this->messageId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerypushstatusIotagentMessageRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['receipt_id'])){
            $model->receiptId = $map['receipt_id'];
        }
        if(isset($map['message_id'])){
            $model->messageId = $map['message_id'];
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

    // push接口返回的受理标识，与message_id至少填一个
    /**
     * @var string
     */
    public $receiptId;

    // 消息ID，与receipt_id至少填一个
    /**
     * @var string
     */
    public $messageId;

}
