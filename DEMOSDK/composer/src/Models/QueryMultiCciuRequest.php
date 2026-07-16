<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMOSDK\Models\TestParams;

class QueryMultiCciuRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'aaaaa' => 'aaaaa',
        'bbbbb' => 'bbbbb',
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
        if (null !== $this->aaaaa) {
            $res['aaaaa'] = null !== $this->aaaaa ? $this->aaaaa->toMap() : null;
        }
        if (null !== $this->bbbbb) {
            $res['bbbbb'] = $this->bbbbb;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryMultiCciuRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['aaaaa'])){
            $model->aaaaa = TestParams::fromMap($map['aaaaa']);
        }
        if(isset($map['bbbbb'])){
            $model->bbbbb = $map['bbbbb'];
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

    // aaa
    /**
     * @var TestParams
     */
    public $aaaaa;

    // bbbbb
    /**
     * @var string
     */
    public $bbbbb;

}
