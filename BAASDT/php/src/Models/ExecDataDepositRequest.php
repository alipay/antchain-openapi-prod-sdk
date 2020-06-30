<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ExecDataDepositRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'data' => 'data',
        'to' => 'to',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->to) {
            $res['to'] = $this->to;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecDataDepositRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        if(isset($map['to'])){
            $model->to = $map['to'];
        }
        return $model;
    }
    /**
     * @description 链ID
     * @example antdao
     * @var string
     */
    public $chainId;

    /**
     * @description 存证信息，根据业务场景确定内容
     * @example 存证信息
     * @var string
     */
    public $data;

    /**
     * @description 存证目标账户（区块链账户地址），该账户可以通过拉块获取到存证信息
     * @example 288ca9e665e93dc47fb424412eb...39b8866f32b45242363a1a16fb4
     * @var string
     */
    public $to;

}
