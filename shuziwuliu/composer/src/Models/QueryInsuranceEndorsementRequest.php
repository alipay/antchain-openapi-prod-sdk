<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class QueryInsuranceEndorsementRequest extends Model
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

    // 批单申请号
    /**
     * @var string
     */
    public $endorsementApplyNo;

    // 批单申请编码
    /**
     * @var string
     */
    public $endorsementApplyCode;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'endorsementApplyNo'   => 'endorsement_apply_no',
        'endorsementApplyCode' => 'endorsement_apply_code',
    ];

    public function validate()
    {
        Model::validateRequired('endorsementApplyNo', $this->endorsementApplyNo, true);
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
        if (null !== $this->endorsementApplyNo) {
            $res['endorsement_apply_no'] = $this->endorsementApplyNo;
        }
        if (null !== $this->endorsementApplyCode) {
            $res['endorsement_apply_code'] = $this->endorsementApplyCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInsuranceEndorsementRequest
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
        if (isset($map['endorsement_apply_no'])) {
            $model->endorsementApplyNo = $map['endorsement_apply_no'];
        }
        if (isset($map['endorsement_apply_code'])) {
            $model->endorsementApplyCode = $map['endorsement_apply_code'];
        }

        return $model;
    }
}
