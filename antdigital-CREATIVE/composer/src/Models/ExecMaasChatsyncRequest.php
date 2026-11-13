<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CREATIVE\Models;

use AlibabaCloud\Tea\Model;

use AntChain\CREATIVE\Models\ChatMessages;

class ExecMaasChatsyncRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'requestId' => 'request_id',
        'model' => 'model',
        'messages' => 'messages',
        'extParams' => 'ext_params',
    ];
    public function validate() {
        Model::validateRequired('requestId', $this->requestId, true);
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('messages', $this->messages, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->requestId) {
            $res['request_id'] = $this->requestId;
        }
        if (null !== $this->model) {
            $res['model'] = $this->model;
        }
        if (null !== $this->messages) {
            $res['messages'] = [];
            if(null !== $this->messages && is_array($this->messages)){
                $n = 0;
                foreach($this->messages as $item){
                    $res['messages'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = $this->extParams;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ExecMaasChatsyncRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['request_id'])){
            $model->requestId = $map['request_id'];
        }
        if(isset($map['model'])){
            $model->model = $map['model'];
        }
        if(isset($map['messages'])){
            if(!empty($map['messages'])){
                $model->messages = [];
                $n = 0;
                foreach($map['messages'] as $item) {
                    $model->messages[$n++] = null !== $item ? ChatMessages::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['ext_params'])){
            $model->extParams = $map['ext_params'];
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

    // 幂等标识，由客户端生成
    /**
     * @var string
     */
    public $requestId;

    // 文本模型编码
    /**
     * @var string
     */
    public $model;

    // 非空消息列表
    /**
     * @var ChatMessages[]
     */
    public $messages;

    // 模型参数 JSON 字符串
    /**
     * @var string
     */
    public $extParams;

}
