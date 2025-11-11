<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class UploadAuthAgreementRequest extends Model
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

    // 文件类型
    /**
     * @var string
     */
    public $fileType;

    // 被授权方企业信用代码
    /**
     * @var string
     */
    public $authEnterpriseCode;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'fileType'           => 'file_type',
        'authEnterpriseCode' => 'auth_enterprise_code',
    ];

    public function validate()
    {
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('authEnterpriseCode', $this->authEnterpriseCode, true);
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
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->authEnterpriseCode) {
            $res['auth_enterprise_code'] = $this->authEnterpriseCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadAuthAgreementRequest
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
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['auth_enterprise_code'])) {
            $model->authEnterpriseCode = $map['auth_enterprise_code'];
        }

        return $model;
    }
}
