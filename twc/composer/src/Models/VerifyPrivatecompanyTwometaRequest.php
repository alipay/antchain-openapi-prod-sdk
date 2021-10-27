<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class VerifyPrivatecompanyTwometaRequest extends Model
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

    // 私有云实例id
    /**
     * @var string
     */
    public $instanceId;

    // 企业信息
    /**
     * @var CompanyTwoMetaInfo
     */
    public $companyTwoMetaInfo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'instanceId'         => 'instance_id',
        'companyTwoMetaInfo' => 'company_two_meta_info',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('companyTwoMetaInfo', $this->companyTwoMetaInfo, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->companyTwoMetaInfo) {
            $res['company_two_meta_info'] = null !== $this->companyTwoMetaInfo ? $this->companyTwoMetaInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyPrivatecompanyTwometaRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['company_two_meta_info'])) {
            $model->companyTwoMetaInfo = CompanyTwoMetaInfo::fromMap($map['company_two_meta_info']);
        }

        return $model;
    }
}
