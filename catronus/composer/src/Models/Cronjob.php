<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Cronjob extends Model
{
    // crontab格式表述的cronjob
    /**
     * @example * * * *
     *
     * @var string
     */
    public $crontab;
    protected $_name = [
        'crontab' => 'crontab',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->crontab) {
            $res['crontab'] = $this->crontab;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Cronjob
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['crontab'])) {
            $model->crontab = $map['crontab'];
        }

        return $model;
    }
}
