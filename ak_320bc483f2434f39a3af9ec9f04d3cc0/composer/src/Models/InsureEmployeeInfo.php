<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_320bc483f2434f39a3af9ec9f04d3cc0\Models;

use AlibabaCloud\Tea\Model;

class InsureEmployeeInfo extends Model
{
    // 姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 身份证号
    /**
     * @example 330105XXXXXXXXXXXX
     *
     * @var string
     */
    public $certNo;

    // 手机号
    /**
     * @example 18611111111
     *
     * @var string
     */
    public $mobile;

    // 额外信息
    /**
     * @example -
     *
     * @var string
     */
    public $extraMsg;
    protected $_name = [
        'name'     => 'name',
        'certNo'   => 'cert_no',
        'mobile'   => 'mobile',
        'extraMsg' => 'extra_msg',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('mobile', $this->mobile, true);
        Model::validateRequired('extraMsg', $this->extraMsg, true);
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
        if (null !== $this->extraMsg) {
            $res['extra_msg'] = $this->extraMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InsureEmployeeInfo
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
        if (isset($map['extra_msg'])) {
            $model->extraMsg = $map['extra_msg'];
        }

        return $model;
    }
}
