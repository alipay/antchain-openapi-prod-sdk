<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BBP\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceChainRequest extends Model
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

    // 第三方Id，此处为天猫uid
    /**
     * @var string
     */
    public $sourceUid;

    // 保单号
    /**
     * @var string
     */
    public $policyNo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'sourceUid'         => 'source_uid',
        'policyNo'          => 'policy_no',
    ];

    public function validate()
    {
        Model::validateRequired('sourceUid', $this->sourceUid, true);
        Model::validateRequired('policyNo', $this->policyNo, true);
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
        if (null !== $this->sourceUid) {
            $res['source_uid'] = $this->sourceUid;
        }
        if (null !== $this->policyNo) {
            $res['policy_no'] = $this->policyNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceChainRequest
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
        if (isset($map['source_uid'])) {
            $model->sourceUid = $map['source_uid'];
        }
        if (isset($map['policy_no'])) {
            $model->policyNo = $map['policy_no'];
        }

        return $model;
    }
}
