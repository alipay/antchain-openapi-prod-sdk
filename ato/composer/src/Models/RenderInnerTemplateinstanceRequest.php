<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class RenderInnerTemplateinstanceRequest extends Model
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

    // 模板编码集，数组
    /**
     * @var string[]
     */
    public $templateCodes;

    // 幂等值
    /**
     * @var string
     */
    public $idempotent;

    // 业务方id，唯一
    /**
     * @var string
     */
    public $bizBusinessId;

    // 组件（文本域）的实际值
    /**
     * @var TemplateComponent[]
     */
    public $componentInstDtos;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'templateCodes'     => 'template_codes',
        'idempotent'        => 'idempotent',
        'bizBusinessId'     => 'biz_business_id',
        'componentInstDtos' => 'component_inst_dtos',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCodes', $this->templateCodes, true);
        Model::validateRequired('idempotent', $this->idempotent, true);
        Model::validateRequired('bizBusinessId', $this->bizBusinessId, true);
        Model::validateRequired('componentInstDtos', $this->componentInstDtos, true);
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
        if (null !== $this->templateCodes) {
            $res['template_codes'] = $this->templateCodes;
        }
        if (null !== $this->idempotent) {
            $res['idempotent'] = $this->idempotent;
        }
        if (null !== $this->bizBusinessId) {
            $res['biz_business_id'] = $this->bizBusinessId;
        }
        if (null !== $this->componentInstDtos) {
            $res['component_inst_dtos'] = [];
            if (null !== $this->componentInstDtos && \is_array($this->componentInstDtos)) {
                $n = 0;
                foreach ($this->componentInstDtos as $item) {
                    $res['component_inst_dtos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RenderInnerTemplateinstanceRequest
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
        if (isset($map['template_codes'])) {
            if (!empty($map['template_codes'])) {
                $model->templateCodes = $map['template_codes'];
            }
        }
        if (isset($map['idempotent'])) {
            $model->idempotent = $map['idempotent'];
        }
        if (isset($map['biz_business_id'])) {
            $model->bizBusinessId = $map['biz_business_id'];
        }
        if (isset($map['component_inst_dtos'])) {
            if (!empty($map['component_inst_dtos'])) {
                $model->componentInstDtos = [];
                $n                        = 0;
                foreach ($map['component_inst_dtos'] as $item) {
                    $model->componentInstDtos[$n++] = null !== $item ? TemplateComponent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
