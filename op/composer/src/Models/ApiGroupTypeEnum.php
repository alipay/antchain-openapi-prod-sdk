<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OP\Models;

use AlibabaCloud\Tea\Model;

class ApiGroupTypeEnum extends Model
{
    // API分组类型
    /**
     * @example APP
     *
     * @var string
     */
    public $code;

    // api分组描述
    /**
     * @example test
     *
     * @var string
     */
    public $ddescription;
    protected $_name = [
        'code'         => 'code',
        'ddescription' => 'ddescription',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->ddescription) {
            $res['ddescription'] = $this->ddescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApiGroupTypeEnum
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['ddescription'])) {
            $model->ddescription = $map['ddescription'];
        }

        return $model;
    }
}
