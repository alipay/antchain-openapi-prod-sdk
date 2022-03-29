<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmHistoryStatsVO extends Model
{
    // trends
    /**
     * @example trends
     *
     * @var AlarmHistoryStatsDTOsKeySet[]
     */
    public $trends;
    protected $_name = [
        'trends' => 'trends',
    ];

    public function validate()
    {
        Model::validateRequired('trends', $this->trends, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->trends) {
            $res['trends'] = [];
            if (null !== $this->trends && \is_array($this->trends)) {
                $n = 0;
                foreach ($this->trends as $item) {
                    $res['trends'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmHistoryStatsVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trends'])) {
            if (!empty($map['trends'])) {
                $model->trends = [];
                $n             = 0;
                foreach ($map['trends'] as $item) {
                    $model->trends[$n++] = null !== $item ? AlarmHistoryStatsDTOsKeySet::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
