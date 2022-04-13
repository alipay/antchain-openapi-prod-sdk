<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class RollingUpdateDeployment extends Model
{
    // The maximum number of pods that can be scheduled above the desired number of pods.
    /**
     * @example 5
     *
     * @var string
     */
    public $maxSurge;

    // The maximum number of pods that can be unavailable during the update.
    /**
     * @example 5
     *
     * @var string
     */
    public $maxUnavailable;
    protected $_name = [
        'maxSurge'       => 'max_surge',
        'maxUnavailable' => 'max_unavailable',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->maxSurge) {
            $res['max_surge'] = $this->maxSurge;
        }
        if (null !== $this->maxUnavailable) {
            $res['max_unavailable'] = $this->maxUnavailable;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RollingUpdateDeployment
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['max_surge'])) {
            $model->maxSurge = $map['max_surge'];
        }
        if (isset($map['max_unavailable'])) {
            $model->maxUnavailable = $map['max_unavailable'];
        }

        return $model;
    }
}
