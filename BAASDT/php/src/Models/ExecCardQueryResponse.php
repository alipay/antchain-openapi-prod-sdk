<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecCardQueryResponse extends Model {
    protected $_name = [
        'card' => 'card',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->card) {
            $res['card'] = null !== $this->card ? $this->card->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecCardQueryResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['card'])){
            $model->card = Card::fromMap($map['card']);
        }
        return $model;
    }
    /**
     * @description 卡密信息对象
     * @example {"card_id":""...}
     * @var Card
     */
    public $card;

}
