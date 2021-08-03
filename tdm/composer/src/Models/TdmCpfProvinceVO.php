<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class TdmCpfProvinceVO extends Model
{
    // 省编码
    /**
     * @example 14
     *
     * @var string
     */
    public $code;

    // 省名称
    /**
     * @example 浙江省
     *
     * @var string
     */
    public $name;

    // 公积金中心列表
    /**
     * @example
     *
     * @var TdmCpfCitysVO[]
     */
    public $areas;
    protected $_name = [
        'code'  => 'code',
        'name'  => 'name',
        'areas' => 'areas',
    ];

    public function validate()
    {
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('areas', $this->areas, true);
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
        if (null !== $this->areas) {
            $res['areas'] = [];
            if (null !== $this->areas && \is_array($this->areas)) {
                $n = 0;
                foreach ($this->areas as $item) {
                    $res['areas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TdmCpfProvinceVO
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
        if (isset($map['areas'])) {
            if (!empty($map['areas'])) {
                $model->areas = [];
                $n            = 0;
                foreach ($map['areas'] as $item) {
                    $model->areas[$n++] = null !== $item ? TdmCpfCitysVO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
