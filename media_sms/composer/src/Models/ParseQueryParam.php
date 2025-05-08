<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MEDIA_SMS\Models;

use AlibabaCloud\Tea\Model;

class ParseQueryParam extends Model
{
    // 手机号
    /**
     * @example 132XXXXXXXX
     *
     * @var string
     */
    public $mobile;
    protected $_name = [
        'mobile' => 'mobile',
    ];

    public function validate()
    {
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ParseQueryParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }

        return $model;
    }
}
