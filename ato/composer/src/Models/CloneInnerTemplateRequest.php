<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class CloneInnerTemplateRequest extends Model
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

    // 模板code
    /**
     * @var string
     */
    public $templateCode;

    // 魔法库对应模板的模板复制id
    /**
     * @var string
     */
    public $voucherId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'templateCode'      => 'template_code',
        'voucherId'         => 'voucher_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('voucherId', $this->voucherId, true);
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
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->voucherId) {
            $res['voucher_id'] = $this->voucherId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CloneInnerTemplateRequest
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
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['voucher_id'])) {
            $model->voucherId = $map['voucher_id'];
        }

        return $model;
    }
}
