<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\SecurityScene;
use AntChain\RISKPLUS\Models\ServiceContext;

class QuerySecurityPolicyRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'riskType' => 'risk_type',
        'securityScene' => 'security_scene',
        'serviceContext' => 'service_context',
    ];
    public function validate() {
        Model::validateRequired('riskType', $this->riskType, true);
        Model::validateRequired('securityScene', $this->securityScene, true);
        Model::validateRequired('serviceContext', $this->serviceContext, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->securityScene) {
            $res['security_scene'] = null !== $this->securityScene ? $this->securityScene->toMap() : null;
        }
        if (null !== $this->serviceContext) {
            $res['service_context'] = null !== $this->serviceContext ? $this->serviceContext->toMap() : null;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QuerySecurityPolicyRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['risk_type'])){
            $model->riskType = $map['risk_type'];
        }
        if(isset($map['security_scene'])){
            $model->securityScene = SecurityScene::fromMap($map['security_scene']);
        }
        if(isset($map['service_context'])){
            $model->serviceContext = ServiceContext::fromMap($map['service_context']);
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

    // 风险类型：表示风险处理或风险咨询——process/advice
    /**
     * @var string
     */
    public $riskType;

    /**
     * @var SecurityScene
     */
    public $securityScene;

    /**
     * @var ServiceContext
     */
    public $serviceContext;

}
