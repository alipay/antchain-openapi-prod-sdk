<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\QQQ\Models;

use AlibabaCloud\Tea\Model;

use AntChain\QQQ\Models\AbcDemoStruct;

class ImportAntchainAbcOneLimitRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout' => 'timeout',
        'idcard' => 'idcard',
    ];
    public function validate() {
        Model::validateRequired('timeout', $this->timeout, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->idcard) {
            $res['idcard'] = null !== $this->idcard ? $this->idcard->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportAntchainAbcOneLimitRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        if(isset($map['idcard'])){
            $model->idcard = AbcDemoStruct::fromMap($map['idcard']);
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

    // 超时时间
    /**
     * @var string
     */
    public $timeout;

    // 123
    /**
     * @var AbcDemoStruct
     */
    public $idcard;

}
