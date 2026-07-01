<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class LesseePerson extends Model
{
    // 承租人姓名
    /**
     * @example 王一
     *
     * @var string
     */
    public $name;

    // 承租人身份证号
    /**
     * @example 11000000XXX
     *
     * @var string
     */
    public $certNo;

    // 承租人手机号
    /**
     * @example 130XXXX0123
     *
     * @var string
     */
    public $mobile;
    protected $_name = [
        'name'   => 'name',
        'certNo' => 'cert_no',
        'mobile' => 'mobile',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LesseePerson
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
