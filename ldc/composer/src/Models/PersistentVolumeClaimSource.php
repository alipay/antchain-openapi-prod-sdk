<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class PersistentVolumeClaimSource extends Model
{
    // 引用的PVC名称。
    /**
     * @example testpvc
     *
     * @var string
     */
    public $pvcName;
    protected $_name = [
        'pvcName' => 'pvc_name',
    ];

    public function validate()
    {
        Model::validateRequired('pvcName', $this->pvcName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pvcName) {
            $res['pvc_name'] = $this->pvcName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersistentVolumeClaimSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['pvc_name'])) {
            $model->pvcName = $map['pvc_name'];
        }

        return $model;
    }
}
