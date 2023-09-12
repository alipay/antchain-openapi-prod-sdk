<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_55afdde95cc7448bad87a98d904c1f44\Models;

use AlibabaCloud\Tea\Model;

class QueryUniversalsaasDigitalhumanRobotRequest extends Model
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

    // targetMethod；数字人目标方法调用
    /**
     * @var string
     */
    public $targetMethod;

    //
    // 租户code&租户id，对于子部门客户需要上传子部门id
    /**
     * @var string
     */
    public $tenantCode;

    // method_params:对应target_method请求方法的具体传参值k-v map
    /**
     * @var string
     */
    public $methodParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'targetMethod'      => 'target_method',
        'tenantCode'        => 'tenant_code',
        'methodParams'      => 'method_params',
    ];

    public function validate()
    {
        Model::validateRequired('targetMethod', $this->targetMethod, true);
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
        if (null !== $this->targetMethod) {
            $res['target_method'] = $this->targetMethod;
        }
        if (null !== $this->tenantCode) {
            $res['tenant_code'] = $this->tenantCode;
        }
        if (null !== $this->methodParams) {
            $res['method_params'] = $this->methodParams;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUniversalsaasDigitalhumanRobotRequest
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
        if (isset($map['target_method'])) {
            $model->targetMethod = $map['target_method'];
        }
        if (isset($map['tenant_code'])) {
            $model->tenantCode = $map['tenant_code'];
        }
        if (isset($map['method_params'])) {
            $model->methodParams = $map['method_params'];
        }

        return $model;
    }
}
