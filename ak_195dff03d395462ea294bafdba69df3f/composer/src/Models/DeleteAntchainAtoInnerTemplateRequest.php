<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class DeleteAntchainAtoInnerTemplateRequest extends Model
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

    // 魔法库模板code
    /**
     * @var string
     */
    public $templateCode;

    // 魔法库模板版本
    /**
     * @var string
     */
    public $templateVersion;

    // 魔法库模板版本id
    /**
     * @var string
     */
    public $templateVersionId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'templateCode'      => 'template_code',
        'templateVersion'   => 'template_version',
        'templateVersionId' => 'template_version_id',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateCode', $this->templateCode, true);
        Model::validateRequired('templateVersion', $this->templateVersion, true);
        Model::validateRequired('templateVersionId', $this->templateVersionId, true);
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
        if (null !== $this->templateVersion) {
            $res['template_version'] = $this->templateVersion;
        }
        if (null !== $this->templateVersionId) {
            $res['template_version_id'] = $this->templateVersionId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteAntchainAtoInnerTemplateRequest
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
        if (isset($map['template_version'])) {
            $model->templateVersion = $map['template_version'];
        }
        if (isset($map['template_version_id'])) {
            $model->templateVersionId = $map['template_version_id'];
        }

        return $model;
    }
}
