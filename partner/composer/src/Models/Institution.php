<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class Institution extends Model
{
    // 机构id
    /**
     * @example ICBC
     *
     * @var string
     */
    public $instId;

    // 机构名称
    /**
     * @example 中国工商银行
     *
     * @var string
     */
    public $instName;

    // 机构code
    /**
     * @example 102
     *
     * @var string
     */
    public $instCode;
    protected $_name = [
        'instId'   => 'inst_id',
        'instName' => 'inst_name',
        'instCode' => 'inst_code',
    ];

    public function validate()
    {
        Model::validateRequired('instId', $this->instId, true);
        Model::validateRequired('instName', $this->instName, true);
        Model::validateRequired('instCode', $this->instCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instId) {
            $res['inst_id'] = $this->instId;
        }
        if (null !== $this->instName) {
            $res['inst_name'] = $this->instName;
        }
        if (null !== $this->instCode) {
            $res['inst_code'] = $this->instCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Institution
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['inst_id'])) {
            $model->instId = $map['inst_id'];
        }
        if (isset($map['inst_name'])) {
            $model->instName = $map['inst_name'];
        }
        if (isset($map['inst_code'])) {
            $model->instCode = $map['inst_code'];
        }

        return $model;
    }
}
