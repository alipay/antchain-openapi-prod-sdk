<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QuerySecurityPolicyRequest extends Model
{
    // OAuth模式下的授权token
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

    // 风险场景信息
    /**
     * @var SecurityScene
     */
    public $securityScene;

    // 服务上下文
    /**
     * @var ServiceContext
     */
    public $serviceContext;

    // 事件业务属性
    /**
     * @var string
     */
    public $eventInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'riskType'          => 'risk_type',
        'securityScene'     => 'security_scene',
        'serviceContext'    => 'service_context',
        'eventInfo'         => 'event_info',
    ];

    public function validate()
    {
        Model::validateRequired('eventInfo', $this->eventInfo, true);
    }

    public function toMap()
    {
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
        if (null !== $this->eventInfo) {
            $res['event_info'] = $this->eventInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySecurityPolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['security_scene'])) {
            $model->securityScene = SecurityScene::fromMap($map['security_scene']);
        }
        if (isset($map['service_context'])) {
            $model->serviceContext = ServiceContext::fromMap($map['service_context']);
        }
        if (isset($map['event_info'])) {
            $model->eventInfo = $map['event_info'];
        }

        return $model;
    }
}
