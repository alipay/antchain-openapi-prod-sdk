<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RESOLVEAGENT\Models;

use AlibabaCloud\Tea\Model;

class ImportCommonCustomerRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'batchId' => 'batch_id',
        'list' => 'list',
    ];
    public function validate() {
        Model::validateRequired('batchId', $this->batchId, true);
        Model::validateRequired('list', $this->list, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->batchId) {
            $res['batch_id'] = $this->batchId;
        }
        if (null !== $this->list) {
            $res['list'] = $this->list;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ImportCommonCustomerRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['batch_id'])){
            $model->batchId = $map['batch_id'];
        }
        if(isset($map['list'])){
            if(!empty($map['list'])){
                $model->list = $map['list'];
            }
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

    // 批次号
    /**
     * @var string
     */
    public $batchId;

    // 导入名单
    /**
     * @var string[]
     */
    public $list;

}
