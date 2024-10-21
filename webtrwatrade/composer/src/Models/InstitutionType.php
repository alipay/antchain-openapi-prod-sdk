<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class InstitutionType extends Model
{
    // 机构类型编码
    // ISSUER/PLATFORM/DISTRIBUTOR
    /**
     * @example ISSUER
     *
     * @var string
     */
    public $code;

    // 机构类型名称
    // ISSUER/PLATFORM/DISTRIBUTOR
    /**
     * @example ISSUER
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
     * @return InstitutionType
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
