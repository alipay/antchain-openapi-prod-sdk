<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UnireleaseSolutionExtInfo extends Model
{
    // Linke配置信息
    /**
     * @example
     *
     * @var UnireleaseSolutionExtInfoLinkeInfo
     */
    public $linkeInfo;
    protected $_name = [
        'linkeInfo' => 'linke_info',
    ];

    public function validate()
    {
        Model::validateRequired('linkeInfo', $this->linkeInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->linkeInfo) {
            $res['linke_info'] = null !== $this->linkeInfo ? $this->linkeInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UnireleaseSolutionExtInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['linke_info'])) {
            $model->linkeInfo = UnireleaseSolutionExtInfoLinkeInfo::fromMap($map['linke_info']);
        }

        return $model;
    }
}
