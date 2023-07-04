<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class PersistentVolumeSource extends Model
{
    // READWRITEONCE("ReadWriteOnce"),
    // READONLYMANY("ReadOnlyMany"),
    // READWRITEMANY("ReadWriteMany");
    /**
     * @example ["ReadWriteOnce"]
     *
     * @var string[]
     */
    public $accessModes;
    protected $_name = [
        'accessModes' => 'access_modes',
    ];

    public function validate()
    {
        Model::validateRequired('accessModes', $this->accessModes, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accessModes) {
            $res['access_modes'] = $this->accessModes;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PersistentVolumeSource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access_modes'])) {
            if (!empty($map['access_modes'])) {
                $model->accessModes = $map['access_modes'];
            }
        }

        return $model;
    }
}
