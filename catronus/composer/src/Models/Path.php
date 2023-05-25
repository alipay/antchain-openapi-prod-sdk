<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class Path extends Model
{
    // fixpath
    /**
     * @example
     *
     * @var FixPath
     */
    public $fixPath;

    // shibai lujing
    /**
     * @example failedpath
     *
     * @var string
     */
    public $failedPath;
    protected $_name = [
        'fixPath'    => 'fix_path',
        'failedPath' => 'failed_path',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->fixPath) {
            $res['fix_path'] = null !== $this->fixPath ? $this->fixPath->toMap() : null;
        }
        if (null !== $this->failedPath) {
            $res['failed_path'] = $this->failedPath;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Path
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['fix_path'])) {
            $model->fixPath = FixPath::fromMap($map['fix_path']);
        }
        if (isset($map['failed_path'])) {
            $model->failedPath = $map['failed_path'];
        }

        return $model;
    }
}
