<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class BatchcreateInnerTemplatetextareaRequest extends Model
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

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 批量常创建文本域列表
    /**
     * @var TemplateTextAreaComponent[]
     */
    public $templatetextareaComponent;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'tenantId'                  => 'tenant_id',
        'templatetextareaComponent' => 'templatetextarea_component',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templatetextareaComponent', $this->templatetextareaComponent, true);
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
        if (null !== $this->templatetextareaComponent) {
            $res['templatetextarea_component'] = [];
            if (null !== $this->templatetextareaComponent && \is_array($this->templatetextareaComponent)) {
                $n = 0;
                foreach ($this->templatetextareaComponent as $item) {
                    $res['templatetextarea_component'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BatchcreateInnerTemplatetextareaRequest
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
        if (isset($map['templatetextarea_component'])) {
            if (!empty($map['templatetextarea_component'])) {
                $model->templatetextareaComponent = [];
                $n                                = 0;
                foreach ($map['templatetextarea_component'] as $item) {
                    $model->templatetextareaComponent[$n++] = null !== $item ? TemplateTextAreaComponent::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
