<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ConsumerGetConnectionDTO extends Model
{
    // 指定 Group ID 的连接信息
    //
    //
    /**
     * @example
     *
     * @var ConnectionDTO[]
     */
    public $connectionList;
    protected $_name = [
        'connectionList' => 'connection_list',
    ];

    public function validate()
    {
        Model::validateRequired('connectionList', $this->connectionList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->connectionList) {
            $res['connection_list'] = [];
            if (null !== $this->connectionList && \is_array($this->connectionList)) {
                $n = 0;
                foreach ($this->connectionList as $item) {
                    $res['connection_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConsumerGetConnectionDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['connection_list'])) {
            if (!empty($map['connection_list'])) {
                $model->connectionList = [];
                $n                     = 0;
                foreach ($map['connection_list'] as $item) {
                    $model->connectionList[$n++] = null !== $item ? ConnectionDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
