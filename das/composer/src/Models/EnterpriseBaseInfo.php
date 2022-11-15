<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class EnterpriseBaseInfo extends Model
{
    // 机构名称
    /**
     * @example 机构名称
     *
     * @var string
     */
    public $orgName;

    // 统一社会信用代码
    /**
     * @example 统一社会信用代码
     *
     * @var string
     */
    public $creditCode;

    // 企业公司注册证号
    /**
     * @example 企业公司注册证号
     *
     * @var string
     */
    public $regNumber;

    // 持股比例
    /**
     * @example 持股比例
     *
     * @var string
     */
    public $investRate;

    // 查询人与这家企业的关联
    /**
     * @example sh;lp;tm
     *
     * @var string
     */
    public $relationship;
    protected $_name = [
        'orgName'      => 'org_name',
        'creditCode'   => 'credit_code',
        'regNumber'    => 'reg_number',
        'investRate'   => 'invest_rate',
        'relationship' => 'relationship',
    ];

    public function validate()
    {
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validateRequired('creditCode', $this->creditCode, true);
        Model::validateRequired('regNumber', $this->regNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->creditCode) {
            $res['credit_code'] = $this->creditCode;
        }
        if (null !== $this->regNumber) {
            $res['reg_number'] = $this->regNumber;
        }
        if (null !== $this->investRate) {
            $res['invest_rate'] = $this->investRate;
        }
        if (null !== $this->relationship) {
            $res['relationship'] = $this->relationship;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EnterpriseBaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['credit_code'])) {
            $model->creditCode = $map['credit_code'];
        }
        if (isset($map['reg_number'])) {
            $model->regNumber = $map['reg_number'];
        }
        if (isset($map['invest_rate'])) {
            $model->investRate = $map['invest_rate'];
        }
        if (isset($map['relationship'])) {
            $model->relationship = $map['relationship'];
        }

        return $model;
    }
}
