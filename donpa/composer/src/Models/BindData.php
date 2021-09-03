<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DONPA\Models;

use AlibabaCloud\Tea\Model;

class BindData extends Model
{
    // 虚拟小号（实际拨打以返回的 telX 为主）
    /**
     * @example 17718750001
     *
     * @var string
     */
    public $telX;

    // 该次绑定唯一 id
    /**
     * @example 5a0a52d01fa9304e8dba7170
     *
     * @var string
     */
    public $bindId;
    protected $_name = [
        'telX'   => 'tel_x',
        'bindId' => 'bind_id',
    ];

    public function validate()
    {
        Model::validateRequired('telX', $this->telX, true);
        Model::validateRequired('bindId', $this->bindId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->telX) {
            $res['tel_x'] = $this->telX;
        }
        if (null !== $this->bindId) {
            $res['bind_id'] = $this->bindId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tel_x'])) {
            $model->telX = $map['tel_x'];
        }
        if (isset($map['bind_id'])) {
            $model->bindId = $map['bind_id'];
        }

        return $model;
    }
}
