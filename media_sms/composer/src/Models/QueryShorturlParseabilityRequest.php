<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class QueryShorturlParseabilityRequest extends Model
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

    // 卡片模板id
    /**
     * @var string
     */
    public $smartTemplateId;

    // 待查询手机号列表
    /**
     * @var ParseQueryParam[]
     */
    public $mobiles;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'smartTemplateId'   => 'smart_template_id',
        'mobiles'           => 'mobiles',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('smartTemplateId', $this->smartTemplateId, true);
        Model::validateRequired('mobiles', $this->mobiles, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
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
        if (null !== $this->smartTemplateId) {
            $res['smart_template_id'] = $this->smartTemplateId;
        }
        if (null !== $this->mobiles) {
            $res['mobiles'] = [];
            if (null !== $this->mobiles && \is_array($this->mobiles)) {
                $n = 0;
                foreach ($this->mobiles as $item) {
                    $res['mobiles'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryShorturlParseabilityRequest
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
        if (isset($map['smart_template_id'])) {
            $model->smartTemplateId = $map['smart_template_id'];
        }
        if (isset($map['mobiles'])) {
            if (!empty($map['mobiles'])) {
                $model->mobiles = [];
                $n              = 0;
                foreach ($map['mobiles'] as $item) {
                    $model->mobiles[$n++] = null !== $item ? ParseQueryParam::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
