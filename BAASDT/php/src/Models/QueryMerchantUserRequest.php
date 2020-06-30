<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class QueryMerchantUserRequest extends Model {
    protected $_name = [
        'chainId' => 'chain_id',
        'localId' => 'local_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->chainId) {
            $res['chain_id'] = $this->chainId;
        }
        if (null !== $this->localId) {
            $res['local_id'] = $this->localId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMerchantUserRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['chain_id'])){
            $model->chainId = $map['chain_id'];
        }
        if(isset($map['local_id'])){
            $model->localId = $map['local_id'];
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
     * @description 商户管理下的用户ID
     * @example user01
     * @var string
     */
    public $localId;

}
