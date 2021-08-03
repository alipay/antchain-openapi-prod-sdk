<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class TdmCpfCitysVO extends Model
{
    // 城市编码
    /**
     * @example 0101
     *
     * @var string
     */
    public $code;

    // 城市名称
    /**
     * @example 杭州市
     *
     * @var string
     */
    public $name;

    // 公积金中心城市列表
    /**
     * @example {}
     *
     * @var TdmCpfEncodeNameVO[]
     */
    public $cpfs;
    protected $_name = [
        'code' => 'code',
        'name' => 'name',
        'cpfs' => 'cpfs',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('cpfs', $this->cpfs, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->cpfs) {
            $res['cpfs'] = [];
            if (null !== $this->cpfs && \is_array($this->cpfs)) {
                $n = 0;
                foreach ($this->cpfs as $item) {
                    $res['cpfs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TdmCpfCitysVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cpfs'])) {
            if (!empty($map['cpfs'])) {
                $model->cpfs = [];
                $n           = 0;
                foreach ($map['cpfs'] as $item) {
                    $model->cpfs[$n++] = null !== $item ? TdmCpfEncodeNameVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
