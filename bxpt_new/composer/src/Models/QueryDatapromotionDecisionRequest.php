<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BXPT_NEW\Models;

use AlibabaCloud\Tea\Model;

class QueryDatapromotionDecisionRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 保司编码
    /**
     * @var string
     */
    public $insurerCode;

    // 保险险种
    /**
     * @var string
     */
    public $insuranceType;

    // 业务参数内容JSON字符串
    /**
     * @var string
     */
    public $bizContent;
    protected $_name = [
        'authToken'     => 'auth_token',
        'insurerCode'   => 'insurer_code',
        'insuranceType' => 'insurance_type',
        'bizContent'    => 'biz_content',
    ];

    public function validate()
    {
        Model::validateRequired('insurerCode', $this->insurerCode, true);
        Model::validateRequired('insuranceType', $this->insuranceType, true);
        Model::validateRequired('bizContent', $this->bizContent, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->insurerCode) {
            $res['insurer_code'] = $this->insurerCode;
        }
        if (null !== $this->insuranceType) {
            $res['insurance_type'] = $this->insuranceType;
        }
        if (null !== $this->bizContent) {
            $res['biz_content'] = $this->bizContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatapromotionDecisionRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['insurer_code'])) {
            $model->insurerCode = $map['insurer_code'];
        }
        if (isset($map['insurance_type'])) {
            $model->insuranceType = $map['insurance_type'];
        }
        if (isset($map['biz_content'])) {
            $model->bizContent = $map['biz_content'];
        }

        return $model;
    }
}
