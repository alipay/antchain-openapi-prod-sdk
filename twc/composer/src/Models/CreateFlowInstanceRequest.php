<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateFlowInstanceRequest extends Model
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

    // 全流程模板id，需要提前创建好模板才能获取
    /**
     * @var string
     */
    public $templateId;

    // 流程名称，同一个租户下同一个模板，建议唯一不重复
    /**
     * @var string
     */
    public $flowName;

    // 存证关联实体（个人/企业）的身份识别信息
    /**
     * @var NotaryUser
     */
    public $notaryUser;

    // 扩展属性
    /**
     * @var string
     */
    public $properties;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'templateId'        => 'template_id',
        'flowName'          => 'flow_name',
        'notaryUser'        => 'notary_user',
        'properties'        => 'properties',
    ];

    public function validate()
    {
        Model::validateRequired('templateId', $this->templateId, true);
        Model::validateRequired('flowName', $this->flowName, true);
        Model::validateRequired('notaryUser', $this->notaryUser, true);
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
        if (null !== $this->templateId) {
            $res['template_id'] = $this->templateId;
        }
        if (null !== $this->flowName) {
            $res['flow_name'] = $this->flowName;
        }
        if (null !== $this->notaryUser) {
            $res['notary_user'] = null !== $this->notaryUser ? $this->notaryUser->toMap() : null;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFlowInstanceRequest
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
        if (isset($map['template_id'])) {
            $model->templateId = $map['template_id'];
        }
        if (isset($map['flow_name'])) {
            $model->flowName = $map['flow_name'];
        }
        if (isset($map['notary_user'])) {
            $model->notaryUser = NotaryUser::fromMap($map['notary_user']);
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }

        return $model;
    }
}
