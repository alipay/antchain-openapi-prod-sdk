<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class InvoiceEmail extends Model
{
    // 电子邮箱
    /**
     * @example receiver@163.com
     *
     * @var string
     */
    public $email;

    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 唯一id
    /**
     * @example 20211216192140IE0800000001
     *
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'email'    => 'email',
        'id'       => 'id',
        'uniqueId' => 'unique_id',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InvoiceEmail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
