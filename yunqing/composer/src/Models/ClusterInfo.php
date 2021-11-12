<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ClusterInfo extends Model
{
    // 产品信息
    /**
     * @example
     *
     * @var ProdInfo[]
     */
    public $prodInfos;
    protected $_name = [
        'prodInfos' => 'prod_infos',
    ];

    public function validate()
    {
        Model::validateRequired('prodInfos', $this->prodInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->prodInfos) {
            $res['prod_infos'] = [];
            if (null !== $this->prodInfos && \is_array($this->prodInfos)) {
                $n = 0;
                foreach ($this->prodInfos as $item) {
                    $res['prod_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClusterInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['prod_infos'])) {
            if (!empty($map['prod_infos'])) {
                $model->prodInfos = [];
                $n                = 0;
                foreach ($map['prod_infos'] as $item) {
                    $model->prodInfos[$n++] = null !== $item ? ProdInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
