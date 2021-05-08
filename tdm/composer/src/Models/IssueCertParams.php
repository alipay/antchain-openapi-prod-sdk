<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class IssueCertParams extends Model
{
    // 贷款合同编号
    /**
     * @example 11410000005184603J
     *
     * @var string
     */
    public $dkhtbh;
    protected $_name = [
        'dkhtbh' => 'dkhtbh',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->dkhtbh) {
            $res['dkhtbh'] = $this->dkhtbh;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IssueCertParams
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['dkhtbh'])) {
            $model->dkhtbh = $map['dkhtbh'];
        }

        return $model;
    }
}
