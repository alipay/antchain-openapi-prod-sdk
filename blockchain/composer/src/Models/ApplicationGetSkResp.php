<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplicationGetSkResp extends Model
{
    // 应用秘钥
    /**
     * @example ******
     *
     * @var string
     */
    public $sk;
    protected $_name = [
        'sk' => 'sk',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sk) {
            $res['sk'] = $this->sk;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationGetSkResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sk'])) {
            $model->sk = $map['sk'];
        }

        return $model;
    }
}
