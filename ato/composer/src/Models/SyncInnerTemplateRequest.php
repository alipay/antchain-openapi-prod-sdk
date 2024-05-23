<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SyncInnerTemplateRequest extends Model
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

    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 来源魔法库模板code
    /**
     * @var string
     */
    public $sourceTemplateCode;

    // 目标模板名称
    /**
     * @var string
     */
    public $targetTemplateName;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'tenantId'           => 'tenant_id',
        'sourceTemplateCode' => 'source_template_code',
        'targetTemplateName' => 'target_template_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('sourceTemplateCode', $this->sourceTemplateCode, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->sourceTemplateCode) {
            $res['source_template_code'] = $this->sourceTemplateCode;
        }
        if (null !== $this->targetTemplateName) {
            $res['target_template_name'] = $this->targetTemplateName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SyncInnerTemplateRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['source_template_code'])) {
            $model->sourceTemplateCode = $map['source_template_code'];
        }
        if (isset($map['target_template_name'])) {
            $model->targetTemplateName = $map['target_template_name'];
        }

        return $model;
    }
}
