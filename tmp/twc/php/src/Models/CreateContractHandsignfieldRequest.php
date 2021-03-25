<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

use AntChain\TWC\Models\ContractHandSignFieldApplication;

class CreateContractHandsignfieldRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId' => 'flow_id',
        'signFields' => 'sign_fields',
    ];
    public function validate() {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('signFields', $this->signFields, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->signFields) {
            $res['sign_fields'] = [];
            if(null !== $this->signFields && is_array($this->signFields)){
                $n = 0;
                foreach($this->signFields as $item){
                    $res['sign_fields'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateContractHandsignfieldRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['flow_id'])){
            $model->flowId = $map['flow_id'];
        }
        if(isset($map['sign_fields'])){
            if(!empty($map['sign_fields'])){
                $model->signFields = [];
                $n = 0;
                foreach($map['sign_fields'] as $item) {
                    $model->signFields[$n++] = null !== $item ? ContractHandSignFieldApplication::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 流程id
    /**
     * @var string
     */
    public $flowId;

    // 签署区列表数据
    /**
     * @var ContractHandSignFieldApplication[]
     */
    public $signFields;

}
