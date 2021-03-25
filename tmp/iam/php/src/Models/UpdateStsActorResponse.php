<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

use AntChain\IAM\Models\StsActorBinding;

class UpdateStsActorResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'bindings' => 'bindings',
        'description' => 'description',
        'id' => 'id',
        'name' => 'name',
        'tenant' => 'tenant',
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
        if (null !== $this->bindings) {
            $res['bindings'] = [];
            if(null !== $this->bindings && is_array($this->bindings)){
                $n = 0;
                foreach($this->bindings as $item){
                    $res['bindings'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateStsActorResponse
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
        if(isset($map['bindings'])){
            if(!empty($map['bindings'])){
                $model->bindings = [];
                $n = 0;
                foreach($map['bindings'] as $item) {
                    $model->bindings[$n++] = null !== $item ? StsActorBinding::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['description'])){
            $model->description = $map['description'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
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

    // 虚拟身份受信关系集合，通常只包含一个
    /**
     * @var StsActorBinding[]
     */
    public $bindings;

    // 针对虚拟身份的描述
    /**
     * @var string
     */
    public $description;

    // 虚拟身份ID
    /**
     * @var string
     */
    public $id;

    // 虚拟身份名称，租户内唯一
    /**
     * @var string
     */
    public $name;

    // 虚拟身份所在租户
    /**
     * @var string
     */
    public $tenant;

}
