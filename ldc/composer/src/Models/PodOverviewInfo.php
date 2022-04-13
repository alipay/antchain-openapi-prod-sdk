<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PodOverviewInfo extends Model
{
    // pod number
    /**
     * @example 100
     *
     * @var int
     */
    public $podNumber;

    // unhealthy pod number
    /**
     * @example
     *
     * @var int
     */
    public $unhealthyPodNumber;
    protected $_name = [
        'podNumber'          => 'pod_number',
        'unhealthyPodNumber' => 'unhealthy_pod_number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->podNumber) {
            $res['pod_number'] = $this->podNumber;
        }
        if (null !== $this->unhealthyPodNumber) {
            $res['unhealthy_pod_number'] = $this->unhealthyPodNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PodOverviewInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pod_number'])) {
            $model->podNumber = $map['pod_number'];
        }
        if (isset($map['unhealthy_pod_number'])) {
            $model->unhealthyPodNumber = $map['unhealthy_pod_number'];
        }

        return $model;
    }
}
