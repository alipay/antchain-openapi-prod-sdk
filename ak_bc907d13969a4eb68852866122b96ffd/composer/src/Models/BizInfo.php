<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_bc907d13969a4eb68852866122b96ffd\Models;

use AlibabaCloud\Tea\Model;

class BizInfo extends Model
{
    // 业务码
    /**
     * @example MMC-MAX
     *
     * @var string
     */
    public $bizcode;

    // 可使用时间戳来防止重复
    /**
     * @example 1646967459684
     *
     * @var int
     */
    public $bizno;
    protected $_name = [
        'bizcode' => 'bizcode',
        'bizno'   => 'bizno',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizcode) {
            $res['bizcode'] = $this->bizcode;
        }
        if (null !== $this->bizno) {
            $res['bizno'] = $this->bizno;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['bizcode'])) {
            $model->bizcode = $map['bizcode'];
        }
        if (isset($map['bizno'])) {
            $model->bizno = $map['bizno'];
        }

        return $model;
    }
}
