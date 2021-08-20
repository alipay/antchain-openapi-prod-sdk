<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class AuthPersonIndividualInfo extends Model
{
    // 姓名
    /**
     * @example 张**
     *
     * @var string
     */
    public $individualName;

    // 身份证号
    /**
     * @example 110*****
     *
     * @var string
     */
    public $individualId;

    // 电话号码
    /**
     * @example 138********
     *
     * @var int
     */
    public $individualPhoneNum;
    protected $_name = [
        'individualName'     => 'individual_name',
        'individualId'       => 'individual_id',
        'individualPhoneNum' => 'individual_phone_num',
    ];

    public function validate()
    {
        Model::validateRequired('individualName', $this->individualName, true);
        Model::validateRequired('individualId', $this->individualId, true);
        Model::validateRequired('individualPhoneNum', $this->individualPhoneNum, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->individualName) {
            $res['individual_name'] = $this->individualName;
        }
        if (null !== $this->individualId) {
            $res['individual_id'] = $this->individualId;
        }
        if (null !== $this->individualPhoneNum) {
            $res['individual_phone_num'] = $this->individualPhoneNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthPersonIndividualInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['individual_name'])) {
            $model->individualName = $map['individual_name'];
        }
        if (isset($map['individual_id'])) {
            $model->individualId = $map['individual_id'];
        }
        if (isset($map['individual_phone_num'])) {
            $model->individualPhoneNum = $map['individual_phone_num'];
        }

        return $model;
    }
}
