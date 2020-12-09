<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class TxDto extends Model {
    protected $_name = [
        'txCode' => 'tx_code',
        'dataType' => 'data_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->txCode) {
            $res['tx_code'] = $this->txCode;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return TxDto
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['tx_code'])){
            $model->txCode = $map['tx_code'];
        }
        if(isset($map['data_type'])){
            $model->dataType = $map['data_type'];
        }
        return $model;
    }
    // 链上凭证
    /**
     * @example d4648b331839616b6ad76ed74b5fabf9c188add347da55aef3caccfa471d9f66 
     * @var string
     */
    public $txCode;

    // 链上存储结构对应类型
    /**
     * @example ORDER
     * @var string
     */
    public $dataType;

}
