<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecAasAntdaoCardQueryResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'card' => 'card',
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
        if (null !== $this->card) {
            $res['card'] = null !== $this->card ? $this->card->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecAasAntdaoCardQueryResponse
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
        if(isset($map['card'])){
            $model->card = Card::fromMap($map['card']);
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

    // 卡密信息对象
    /**
     * @var Card
     */
    public $card;

}
