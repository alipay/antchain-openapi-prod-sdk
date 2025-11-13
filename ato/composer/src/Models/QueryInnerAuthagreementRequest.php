<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerAuthagreementRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 主体类型,如MERCHNAT/USER
    /**
     * @var string
     */
    public $subjectType;

    // 协议code
    /**
     * @var string
     */
    public $agreementCode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'subjectType'       => 'subject_type',
        'agreementCode'     => 'agreement_code',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('subjectType', $this->subjectType, true);
        Model::validateRequired('agreementCode', $this->agreementCode, true);
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
        if (null !== $this->subjectType) {
            $res['subject_type'] = $this->subjectType;
        }
        if (null !== $this->agreementCode) {
            $res['agreement_code'] = $this->agreementCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerAuthagreementRequest
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
        if (isset($map['subject_type'])) {
            $model->subjectType = $map['subject_type'];
        }
        if (isset($map['agreement_code'])) {
            $model->agreementCode = $map['agreement_code'];
        }

        return $model;
    }
}
