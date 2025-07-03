<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_195dff03d395462ea294bafdba69df3f\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainAtoInnerTemplateRequest extends Model
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

    //
    // 商户对应租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 创建的模板名称
    /**
     * @var string
     */
    public $templateName;

    // 文件oss存储的key
    /**
     * @var string
     */
    public $fileKey;

    // 模板文件的名称
    /**
     * @var string
     */
    public $fileName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'templateName'      => 'template_name',
        'fileKey'           => 'file_key',
        'fileName'          => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('templateName', $this->templateName, true);
        Model::validateMaxLength('templateName', $this->templateName, 32);
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
        if (null !== $this->templateName) {
            $res['template_name'] = $this->templateName;
        }
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainAtoInnerTemplateRequest
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
        if (isset($map['template_name'])) {
            $model->templateName = $map['template_name'];
        }
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
