<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class RecognizeOcrFileRequest extends Model
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

    // 文件id
    /**
     * @var string
     */
    public $fileId;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'fileType'          => 'file_type',
        'certType'          => 'cert_type',
        'tenantId'          => 'tenant_id',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('certType', $this->certType, true);
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
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RecognizeOcrFileRequest
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
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }

        return $model;
    }
}
