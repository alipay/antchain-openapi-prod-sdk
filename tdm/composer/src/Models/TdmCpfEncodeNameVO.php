<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class TdmCpfEncodeNameVO extends Model
{
    // 公积金中心编码
    /**
     * @example 140101
     *
     * @var string
     */
    public $code;

    // 公积金中心名称
    /**
     * @example 省直公积金中心
     *
     * @var string
     */
    public $name;
    protected $_name = [
        'code' => 'code',
        'name' => 'name',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TdmCpfEncodeNameVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
