<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CompanyItems extends Model
{
    // 公司id
    /**
     * @example 20111b9afa08b3a53580e20513933966
     *
     * @var string
     */
    public $companyId;

    // 蚂蚁科技集团股份有限公司
    /**
     * @example 公司名称
     *
     * @var string
     */
    public $companyName;

    // 匹配名称
    /**
     * @example 平台名
     *
     * @var string
     */
    public $matchingName;

    // 匹配类型
    /**
     * @example 平台名匹配
     *
     * @var string
     */
    public $matchingType;

    // 匹配值
    /**
     * @example 蚂蚁金服
     *
     * @var string
     */
    public $matchingValue;

    // 返回标识
    /**
     * @example S
     *
     * @var string
     */
    public $ucCode;
    protected $_name = [
        'companyId'     => 'company_id',
        'companyName'   => 'company_name',
        'matchingName'  => 'matching_name',
        'matchingType'  => 'matching_type',
        'matchingValue' => 'matching_value',
        'ucCode'        => 'uc_code',
    ];

    public function validate()
    {
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('companyName', $this->companyName, true);
        Model::validateRequired('matchingName', $this->matchingName, true);
        Model::validateRequired('matchingType', $this->matchingType, true);
        Model::validateRequired('matchingValue', $this->matchingValue, true);
        Model::validateRequired('ucCode', $this->ucCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->matchingName) {
            $res['matching_name'] = $this->matchingName;
        }
        if (null !== $this->matchingType) {
            $res['matching_type'] = $this->matchingType;
        }
        if (null !== $this->matchingValue) {
            $res['matching_value'] = $this->matchingValue;
        }
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CompanyItems
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['company_name'])) {
            $model->companyName = $map['company_name'];
        }
        if (isset($map['matching_name'])) {
            $model->matchingName = $map['matching_name'];
        }
        if (isset($map['matching_type'])) {
            $model->matchingType = $map['matching_type'];
        }
        if (isset($map['matching_value'])) {
            $model->matchingValue = $map['matching_value'];
        }
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }

        return $model;
    }
}
