<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class ConfirmSecurityPolicyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'confirmParams' => 'confirm_params',
        'securityId' => 'security_id',
    ];
    public function validate() {
        Model::validateRequired('confirmParams', $this->confirmParams, true);
        Model::validateRequired('securityId', $this->securityId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->confirmParams) {
            $res['confirm_params'] = $this->confirmParams;
        }
        if (null !== $this->securityId) {
            $res['security_id'] = $this->securityId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConfirmSecurityPolicyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['confirm_params'])){
            $model->confirmParams = $map['confirm_params'];
        }
        if(isset($map['security_id'])){
            $model->securityId = $map['security_id'];
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

    // 二次确认参数，防止篡改
    /**
     * @var string
     */
    public $confirmParams;

    // 代码发送给安全核心的事件编码
    /**
     * @var string
     */
    public $securityId;

}
