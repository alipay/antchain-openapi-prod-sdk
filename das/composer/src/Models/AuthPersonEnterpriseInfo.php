<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthPersonEnterpriseInfo extends Model
{
    // 企业名称
    /**
     * @example ***有限公司
     *
     * @var string
     */
    public $enterpriseName;

    // 企业统一社会信用码
    /**
     * @example 9144*****
     *
     * @var string
     */
    public $enterpriseCreditNum;

    // 企业法人姓名
    /**
     * @example 张**
     *
     * @var string
     */
    public $enterpriseLegalPersonName;

    // 企业法人身份证号
    /**
     * @example 110*****
     *
     * @var string
     */
    public $enterpriseLegalPersonId;

    // 企业法人电话号码
    /**
     * @example 138********
     *
     * @var int
     */
    public $enterpriseLegalPersonPhoneNum;
    protected $_name = [
        'enterpriseName'                => 'enterprise_name',
        'enterpriseCreditNum'           => 'enterprise_credit_num',
        'enterpriseLegalPersonName'     => 'enterprise_legal_person_name',
        'enterpriseLegalPersonId'       => 'enterprise_legal_person_id',
        'enterpriseLegalPersonPhoneNum' => 'enterprise_legal_person_phone_num',
    ];

    public function validate()
    {
        Model::validateRequired('enterpriseName', $this->enterpriseName, true);
        Model::validateRequired('enterpriseCreditNum', $this->enterpriseCreditNum, true);
        Model::validateRequired('enterpriseLegalPersonName', $this->enterpriseLegalPersonName, true);
        Model::validateRequired('enterpriseLegalPersonId', $this->enterpriseLegalPersonId, true);
        Model::validateRequired('enterpriseLegalPersonPhoneNum', $this->enterpriseLegalPersonPhoneNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->enterpriseName) {
            $res['enterprise_name'] = $this->enterpriseName;
        }
        if (null !== $this->enterpriseCreditNum) {
            $res['enterprise_credit_num'] = $this->enterpriseCreditNum;
        }
        if (null !== $this->enterpriseLegalPersonName) {
            $res['enterprise_legal_person_name'] = $this->enterpriseLegalPersonName;
        }
        if (null !== $this->enterpriseLegalPersonId) {
            $res['enterprise_legal_person_id'] = $this->enterpriseLegalPersonId;
        }
        if (null !== $this->enterpriseLegalPersonPhoneNum) {
            $res['enterprise_legal_person_phone_num'] = $this->enterpriseLegalPersonPhoneNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthPersonEnterpriseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['enterprise_name'])) {
            $model->enterpriseName = $map['enterprise_name'];
        }
        if (isset($map['enterprise_credit_num'])) {
            $model->enterpriseCreditNum = $map['enterprise_credit_num'];
        }
        if (isset($map['enterprise_legal_person_name'])) {
            $model->enterpriseLegalPersonName = $map['enterprise_legal_person_name'];
        }
        if (isset($map['enterprise_legal_person_id'])) {
            $model->enterpriseLegalPersonId = $map['enterprise_legal_person_id'];
        }
        if (isset($map['enterprise_legal_person_phone_num'])) {
            $model->enterpriseLegalPersonPhoneNum = $map['enterprise_legal_person_phone_num'];
        }

        return $model;
    }
}
